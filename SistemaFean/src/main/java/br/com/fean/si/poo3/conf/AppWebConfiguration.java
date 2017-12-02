package br.com.fean.si.poo3.conf;

import br.com.fean.si.poo3.conversor.materia.CategoriaConverter;
import br.com.fean.si.poo3.conversor.usuario.PerfilConverter;
import br.com.fean.si.poo3.conversor.usuario.TipoSexoConverter;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = {"br.com.fean.si.poo3.controller", "br.com.fean.si.poo3.dao", "br.com.fean.si.poo3.service", "br.com.fean.si.poo3.facade"})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new TipoSexoConverter());
//        registry.addConverter(new PerfilConverter());
        registry.addConverter(new CategoriaConverter());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/assets/**")
                .addResourceLocations("/assets/");
    }

    public MessageSource messageSource(){
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages");
        return source;
    }

}
