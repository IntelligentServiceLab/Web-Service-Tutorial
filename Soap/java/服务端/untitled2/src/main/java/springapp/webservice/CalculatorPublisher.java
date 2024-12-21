package springapp.webservice;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import javax.xml.namespace.QName;
public class CalculatorPublisher {
    public static void main(String[] args) {
        // 创建服务对象
        Calculator calculator = new CalculatorImpl();
        // 创建服务器工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(Calculator.class);
        factory.setAddress("http://localhost:7070/calculator?wsdl");
        factory.setServiceBean(calculator);
        // 设置QName
        factory.setServiceName(new QName("http://webservice.example.com/", "CalculatorService"));
        factory.setEndpointName(new QName("http://webservice.example.com/", "CalculatorPort"));
        // 发布服务
        factory.create();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Calculator service is running at http://localhost:7070/calculator?wsdl");
        System.out.println("---------------------------------------------------------------------------");
    }
}