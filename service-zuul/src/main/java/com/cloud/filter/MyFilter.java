package com.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by UI03 on 2017/8/23.
 */
@Component
public class MyFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("method:%s||url:%s",request.getMethod(),request.getRequestURI().toString()));
        if(request.getRequestURI().contains("api-b")){
            return true ;
        }else{
            return  false ;
        }
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("method:%s||url:%s",request.getMethod(),request.getRequestURI().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        logger.info("ok");

        return null;
    }
}
