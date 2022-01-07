package com.arvin.mapleforestbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author arvin
 */
@SpringBootApplication
@MapperScan("com.arvin.mapleforestbackend.mapper")
public class MapleForestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapleForestBackendApplication.class, args);
	}

}
