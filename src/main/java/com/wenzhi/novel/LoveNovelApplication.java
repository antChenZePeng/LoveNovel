package com.wenzhi.novel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.shenqi.chatcs.mysql")
public class LoveNovelApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LoveNovelApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LoveNovelApplication.class);
	}
}
