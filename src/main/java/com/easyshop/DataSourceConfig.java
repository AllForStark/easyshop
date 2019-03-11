package com.easyshop;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author waterinthebottle
 * 2018年11月30日
 * 下午5:31:21
 */
@SpringBootConfiguration   //表示是个配置文件
//加载数据库连接属性文件，找不到就忽略
@PropertySource(value= {"classpath:jdbc.properties"},ignoreResourceNotFound=true)
public class DataSourceConfig {
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	//创建数据源对象，放入spring容器，一定要加bean注解
	@Bean
	public DataSource dataSource() {
		
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl(url);
		ds.setDriverClassName(driverClassName);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
		
	}

}
