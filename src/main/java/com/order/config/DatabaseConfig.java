//package com.order.config;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DatabaseConfig {
//    @Bean(name = "pgsqlDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource getDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    public LocalContainerEntityManagerFactoryBean getFactoryBean(EntityManagerFactoryBuilder builder) {
//        return builder.dataSource(getDataSource()).packages("com.~~~.model.postgre").build();
//    }
//
//
//}
