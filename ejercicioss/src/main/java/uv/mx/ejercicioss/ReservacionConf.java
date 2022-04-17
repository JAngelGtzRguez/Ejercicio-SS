package uv.mx.ejercicioss;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class ReservacionConf {
    @Bean
    public XsdSchema reservacionesSchema(){
        return new SimpleXsdSchema(new ClassPathResource("ejercicioss.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "reservaciones")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema reservacionesSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("reservacionesPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://uv.mx/ejercicioss");
        wsdl.setSchema(reservacionesSchema);
        return wsdl;
    }
    
}
