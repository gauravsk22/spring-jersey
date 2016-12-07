package org.practice.springjersey.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="org.practice.springjersey.*")
//@EnableJpaRepositories( basePackages = "org.practice.springjersey.repository")
//@EntityScan(basePackageClasses = {Old_User.class, User.class})
//@EnableJpaAuditing(auditorAwareRef = "userNameAuditor")
public class AppInitializer extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppInitializer.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(AppInitializer.class, args);
	}

	@Bean
	ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;

		/*registration.addUrlMappings("/h2*//**//*");
		registration.addInitParameter("webAllowOthers", "");
		registration.addInitParameter("trace", "");
		*/

	}

	/*@Bean
	AuditorAware<String> userNameAuditor(){
		return new UserNameAuditor();
	}*/

}
