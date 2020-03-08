package org.casadocodigo.loja.config;

import org.casadocodigo.loja.controllers.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**  
 * @author Rodrigo
 * @implNote Classe apenas para expor para a Servlet do Spring MVC quais são as classes
 * que devem ser lidas e carregadas. A anotação ComponentScan indica quais pacotes devem ser lidos. 
 * Já a anotação EnableWebMvc habilita várias funcionalidades que serão usadas na nossa aplicação web 
 * como por exemplo: conversão de objetos para XML, conversão de objetos para JSON, validação usando a especificação, 
 * suporte a geração de RSS, etc.  
 */
@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class})
public class AppWebConfiguration {
	
	/**
	 * Método que define as configurações da pasta base e do sufixo que devem ser adicionados 
	 * para criar o caminho completo (URL) de qualquer view associada ao projeto. 
	 * @implNote A annotation Bean indica para o Spring que o retorno desse método deve ser registrado 
	 * como um objeto gerenciado pelo container do Spring. Em geral, no Spring, esses objetos são chamados 
	 * de Beans. 
	 * @return
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		/**
		 * Method that set the prefix that gets prepended to view names when building a URL.
		 */
		resolver.setPrefix("/WEB-INF/views/");
		/**
		 * Method that set the suffix that gets appended to view names when building a URL.
		 */
		resolver.setSuffix(".jsp");		
		
		return resolver;		
	}

}
