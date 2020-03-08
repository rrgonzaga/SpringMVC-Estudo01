package org.casadocodigo.loja.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * 
 * @author Rodrigo
 * @implNote O objetivo dessa classe é não fazer o registro do DispatcherServlet na mão.
 *
 */
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * @implNote Método responsável por identificar quais controllers devem ser mapeadas e quais outras classes 
	 * devem ser carregadas pelo container do próprio Spring 
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}
	
	/**
	 * @implNote Método responsável por definir o padrão de endereço que vai ser delegado 
	 * para o Servlet do Spring MVC
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
