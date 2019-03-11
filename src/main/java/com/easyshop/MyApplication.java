package com.easyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author waterinthebottle
 * 2018年11月30日
 * 下午5:45:11
 */
@SpringBootApplication  //启动程序的核心类
public class MyApplication {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MyApplication.class);
		app.run(args); //启动
	}
	
}
