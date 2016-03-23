package com.borrow.controller.web;

import com.borrow.exception.ErrorCodeEnum;
import com.borrow.util.JSonUtil;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lbc on 16/3/23.
 */
public class BaseController {
    // header 常量定义
    private static final String ENCODING_PREFIX = "encoding";
    public static final String NOCACHE_PREFIX = "no-cache";
    private static final String ENCODING_DEFAULT = "UTF-8";
    private static final boolean NOCACHE_DEFAULT = true;
    private static int Expires = 100;
    private static final int SUCCESS = 1000; // 成功


    private static void render(HttpServletResponse response,final String contentType, final String content, final String... headers) {
        render(response,200,contentType,content,headers);
    }
    public static void render(HttpServletResponse response,int status,final String contentType, final String content,final String... headers) {

        try {
            // 分析headers参数
            String encoding = ENCODING_DEFAULT;
            boolean noCache = NOCACHE_DEFAULT;
            for (String header : headers) {
                String headerName = StringUtils.substringBefore(header, ":");
                String headerValue = StringUtils.substringAfter(header, ":");

                if (StringUtils.equalsIgnoreCase(headerName, ENCODING_PREFIX)) {
                    encoding = headerValue;
                } else if (StringUtils.equalsIgnoreCase(headerName, NOCACHE_PREFIX)) {
                    noCache = Boolean.parseBoolean(headerValue);
                } else
                    throw new IllegalArgumentException(headerName
                            + "不是一个合法的header类型");
            }

            // 设置headers参数
            String fullContentType = contentType + ";charset=" + encoding;
            response.setContentType(fullContentType);
            if (noCache) {
                response.setHeader("Pragma", "No-cache");
                response.setHeader("Cache-Control", "no-cache");
                response.setDateHeader("Expires", 0);
            }
            response.setStatus(status);
            response.getWriter().write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回数据 输出JSON
     * @param response
     * @param code  状态码
     * @param tip   提示语
     * @param data  数据(必须json格式)
     */
    public static void renderSuccessJson(HttpServletResponse response,String code ,final String tip,final Object data) {
        Map<String,Object> retMap = Maps.<String, Object>newLinkedHashMap();
        retMap.put("code", code);
        retMap.put("timestamp", new Date().getTime());

        if(data!=null){
            retMap.put("data",data);
        }
        if(tip != null){
            retMap.put("tip",tip);
        }
        render(response, "application/json", JSonUtil.toJson(retMap), "no-cache:false");
    }

}
