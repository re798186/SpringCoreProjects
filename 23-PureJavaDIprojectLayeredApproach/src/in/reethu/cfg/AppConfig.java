package in.reethu.cfg;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "in.reethu")
@PropertySource(value = "in/reethu/commons/application.properties")
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created:: Zero param constructor...");
	}

	@Autowired
	Environment environment;

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		HikariDataSource dataSource = new HikariDataSource();

		dataSource.setDriverClassName(environment.getProperty("dao.info.driverClassName"));
		dataSource.setUsername(environment.getProperty("dao.info.username"));
		dataSource.setPassword(environment.getProperty("dao.info.password"));
		dataSource.setJdbcUrl(environment.getProperty("dao.info.jdbcUrl"));
		dataSource.setMinimumIdle(Integer.parseInt(environment.getProperty("dao.info.minidle")));
		dataSource.setMaximumPoolSize(Integer.parseInt(environment.getProperty("dao.info.maxpoolsize")));
		dataSource.setConnectionTimeout(Integer.parseInt(environment.getProperty("dao.info.connectiontimeout")));
		return dataSource;
	}

}
