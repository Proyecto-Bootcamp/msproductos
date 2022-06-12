package com.bl.bootcamp.msproductos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@EnableFeignClients
@EnableCaching
@SpringBootApplication
@ComponentScan(basePackages = {"com.bl"})
@MapperScan("com.bl.bootcamp.msproductos.persistencia.mapper")
@OpenAPIDefinition(info = @Info(title = "msproductos", version = "${springdoc.version}", description = ""))
public class MsproductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsproductosApplication.class, args);
	}

}
