package com.example.simplifyAnti;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wuwei
 * @createTime 25 17:13
 * @description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

////    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
//                .select()//启动用于api选择的构建器
//                .apis(RequestHandlerSelectors.basePackage("com.example.simplifyAnti.api"))//扫描接口的包
//                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
//                .build();
//    }
}
