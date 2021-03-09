package com.cx.dada.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author ww
 */
public class AppConfig {

    private String appKey;

    private String appSecret;

    private String host;

    private String sourceId;

    @Value("${env}")
    private String env;

    public AppConfig(){
        this.appKey = AppConstant.APP_KEY;
        this.appSecret = AppConstant.APP_SECRET;
        this.host = "prod".equals(env)? AppConstant.ONLINE_HOST : AppConstant.QA_HOST;
        this.sourceId = "prod".equals(env) ? AppConstant.SOURCE_ID : AppConstant.QA_SOURCE_ID;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getHost() {
        return host;
    }

    public String getSourceId() {
        return sourceId;
    }
}
