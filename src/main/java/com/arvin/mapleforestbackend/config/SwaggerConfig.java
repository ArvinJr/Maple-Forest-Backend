package com.arvin.mapleforestbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger的配置类，配置swagger的显示内容
 *
 * @author arvin
 * @date 2022/01/08
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				// 加载配置信息
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.arvin.mapleforestbackend.controller"))
				.paths(PathSelectors.any())
				.build();

	}

	/**
	 * Swagger-UI作者信息
	 */
	private ApiInfo apiInfo(){

		//作者信息
		Contact contact = new Contact("Arvin", "", "arvinjunior@163.com");

		return new ApiInfoBuilder()
				.title("Arvin Product Api Document")
				.description("Maple Forest Api Document")
				.contact(contact)
				.version("1.0")
				.build();

	}

}
