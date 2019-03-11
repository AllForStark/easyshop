package com.easyshop;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;

/**
 * @author waterinthebottle
 * 2018年11月30日
 * 下午5:55:58
 */
@SpringBootConfiguration  //表示是配置文件
@AutoConfigureAfter(MybatisConfig.class)  //表示在MybatisConfig这个配置类加载完成之后（拿到sqlsession之后）再运行
public class MapperScanerConfig {
	
	@Bean    //一定要加bean，表示创建mapperscannerconfigurer这个对象，这个对象负责扫描mapper层的包
	public MapperScannerConfigurer mapperScannerConfigurer() {
		
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.easyshop.mapper");
		return mapperScannerConfigurer;
		
	}

}
