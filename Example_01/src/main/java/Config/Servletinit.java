package Config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class Servletinit extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 简化开发板
     */
    //配置Spring
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //配置SpringMVC
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringmvcConfig.class};
    }

    //配置映射
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext=new AnnotationConfigWebApplicationContext();
//        annotationConfigWebApplicationContext.register(SpringmvcConfig.class);
//
//        return annotationConfigWebApplicationContext;
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
}

