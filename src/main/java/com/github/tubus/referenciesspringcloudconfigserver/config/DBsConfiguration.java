package com.github.tubus.referenciesspringcloudconfigserver.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DBsConfiguration {

    @Primary
    @Bean(name = "infodbds")
    @ConfigurationProperties(prefix = "spring.databases.postgres.infodb")
    public DataSource infodbDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "infodb")
    public JdbcTemplate infodbJdbcTemplate(@Qualifier("infodbds") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
