package com.easyshop.test;

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class InverseTest {
	
	@Test
	public void testGenerator() {
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(false) 
				.setAuthor("liuqi") 
				.setOutputDir("D:\\eclipse\\eclipseworkplace\\easyshop\\src\\main\\java") 
				.setFileOverride(true) 
				.setIdType(IdType.AUTO) 
				.setServiceName("%sService") 
				.setBaseResultMap(true)
				.setBaseColumnList(true);
		
		
	    DataSourceConfig  dsConfig  = new DataSourceConfig();
		dsConfig.setDbType(DbType.MYSQL)  
						.setDriverName("com.mysql.jdbc.Driver")
						.setUrl("jdbc:mysql://127.0.0.1:3306/easyshop?useUnicode=true&characterEncoding=utf8")
						.setUsername("root")
						.setPassword("root");
		
		
		StrategyConfig stConfig = new StrategyConfig();
				stConfig.setCapitalMode(true) 
								.setDbColumnUnderline(true)  
								.setNaming(NamingStrategy.underline_to_camel) 
								.setTablePrefix("tb_")
								.setInclude("tb_item");  
				
				
				
				PackageConfig pkConfig = new PackageConfig();
				pkConfig.setParent("com.easyshop")
								.setMapper("mapper")
								.setService("service")
								.setController("web")
								.setEntity("bean")
								.setXml("mapper");
				
				
				AutoGenerator  ag = new AutoGenerator();
				ag.setGlobalConfig(config)
						  .setDataSource(dsConfig)
						  .setStrategy(stConfig)
						  .setPackageInfo(pkConfig);
				
				ag.execute();

	}

}
