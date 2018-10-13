package com.cristianruizblog.propertiesProject.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource({"classpath:miarchivo.properties","classpath:segundo.properties"})
@PropertySources({
	@PropertySource("classpath:miarchivo.properties"),
	@PropertySource("classpath:segundo.properties")
})
public class PropertiesSource {

}
