# borrow
初始化




controller 分前后台
    admin   后台
    web     前台

权限连接拦截路径
    web/ 路劲下面的全部不拦截
    静态资源全部不拦截
    其他全部拦截,拦截后跳转到登陆页面
    具体配置在ShiroConfiguration.java 的 ShiroFilterFactoryBean 方法