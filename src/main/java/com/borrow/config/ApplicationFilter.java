package com.borrow.config;

import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangbicong
 * Created Date 20/01/2016
 * Created Time 14:07
 * Created Version 1.1
 * 功能描述：字符串过滤器
 */
@Configuration
public class ApplicationFilter {

    @Bean
    public FilterRegistrationBean encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        FilterRegistrationBean mappingEncodingFilter = new FilterRegistrationBean(encodingFilter);

        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        mappingEncodingFilter.setUrlPatterns(urlPatterns);
        mappingEncodingFilter.setOrder(2);

        return mappingEncodingFilter;
    }

    @Bean
    public FilterRegistrationBean webStatFilter() {

        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean mappingDruid = new FilterRegistrationBean(webStatFilter);

        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        mappingDruid.setUrlPatterns(urlPatterns);
        mappingDruid.setOrder(3);

        return mappingDruid;
    }


}