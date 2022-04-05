package io.github.csk.spring4shell;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;

@SpringBootApplication
public class Spring4shellPocApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Spring4shellPocApplication.class);
	}

	public static void main(String[] args) throws IOException {
		//System.out.println(new String(Runtime.getRuntime().exec("ls").getInputStream().readAllBytes()));
		SpringApplication.run(Spring4shellPocApplication.class, args);
		BeanWrapperImpl
		CachedIntrospectionResults
	}

	@Bean
	public ViewResolver viewResolver() {
		final InternalResourceViewResolver r = new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/jsp/");
		r.setSuffix(".jsp");
		return r;
	}

}
