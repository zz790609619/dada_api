package com.cx.dada;
import com.cx.dada.common.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author ww
 */
@SpringBootApplication
@ServletComponentScan
@EnableAsync
@EnableFeignClients
public class AppMain {
    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors","false");
        ApplicationContext applicationContext = SpringApplication.run(AppMain.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);

    }
}