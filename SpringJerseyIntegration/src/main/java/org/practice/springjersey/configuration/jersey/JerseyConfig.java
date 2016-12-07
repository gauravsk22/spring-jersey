package org.practice.springjersey.configuration.jersey;

import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.config.ScannerFactory;
import com.wordnik.swagger.config.SwaggerConfig;
import com.wordnik.swagger.jaxrs.config.ReflectiveJaxrsScanner;
import com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider;
import com.wordnik.swagger.jaxrs.listing.ApiListingResource;
import com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON;
import com.wordnik.swagger.jaxrs.listing.ResourceListingProvider;
import com.wordnik.swagger.jaxrs.reader.DefaultJaxrsApiReader;
import com.wordnik.swagger.reader.ClassReaders;
import org.glassfish.jersey.server.ResourceConfig;
import org.practice.springjersey.interaction.UserService;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
//		register(HelloService.class);
		register(UserService.class);
//		configureSwagger();
	}
	
	private void configureSwagger(){
		
		register(ApiListingResource.class);
		register(ApiDeclarationProvider.class);
		register(ApiListingResourceJSON.class);
		register(ResourceListingProvider.class);
		
		final ReflectiveJaxrsScanner scanner = new ReflectiveJaxrsScanner();
        scanner.setResourcePackage("org.practice.springjersey.interaction");
        ScannerFactory.setScanner(scanner);
        
        
        final SwaggerConfig config = ConfigFactory.config();
        config.setApiVersion("1.0");
        
        // absolute base path
//      config.setBasePath("http://localhost:8080/SpringJerseyIntegration-1.0-SNAPSHOT/rest");
        
        // relative base path
        config.setBasePath("/");
        
        ClassReaders.setReader(new DefaultJaxrsApiReader());
	}
	
}
