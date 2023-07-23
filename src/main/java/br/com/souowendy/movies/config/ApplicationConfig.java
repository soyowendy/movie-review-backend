package br.com.souowendy.movies.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@Configuration
public class ApplicationConfig {
	@Bean
	public Jackson2RepositoryPopulatorFactoryBean getRepositoryPopulator() {
		Resource sourceData = new ClassPathResource("data.json");

		Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
		factory.setResources(new Resource[]{sourceData});
		return factory;
	}
}
