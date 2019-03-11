package com.easyshop;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

/**
 * @author waterinthebottle
 * 2018年11月30日
 * 下午4:22:11
 */
//表示该类时配置文件
@SpringBootConfiguration
public class MybatisConfig {
	
	@Bean
	@ConditionalOnMissingBean   // sqlsession 不存在则创建
	public MybatisSqlSessionFactoryBean getSqlSessionFactory(DataSource ds) {
		
		//SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
		
		//设置数据源
		mybatisSqlSessionFactoryBean.setDataSource(ds);
		
		//设置mybatis的主配置文件，当项目中有mybatis配置文件时，使用这种方法加载配置文件
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    	Resource resource = resolver.getResource("classpath:mybatis-config.xml");
		mybatisSqlSessionFactoryBean.setConfigLocation(resource);
		
		
		//设置实体类的别名
		mybatisSqlSessionFactoryBean.setTypeAliasesPackage("com.easyshop.bean");
		return mybatisSqlSessionFactoryBean;
		
	}

}
