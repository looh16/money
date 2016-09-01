package org.money.config;

import org.money.controllers.TesteController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc 
@EnableSpringDataWebSupport
@ComponentScan(basePackageClasses = {TesteController.class}) 
@EnableJpaRepositories
public class AppWebConfigurations {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	/*@Bean
    public SimpleMappingExceptionResolver createSimpleMappingExceptionResolver() {
      SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
      Properties errorMaps = new Properties();
      errorMaps.setProperty("Excessoes", "error");
      errorMaps.setProperty("NullPointerException", "error");
      resolver.setExceptionMappings(errorMaps);
      resolver.setDefaultErrorView("globalerror");
      resolver.setExceptionAttribute("exc");
      return resolver;
   }*/
	

}
