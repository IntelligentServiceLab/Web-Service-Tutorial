package com.example.demo;
import org.springframework.stereotype.Service;

import com.example.generated.Calculator;
import com.example.generated.CalculatorService;
import java.net.URL;
public class SoapClientService {
    public int callSoapService(int num1, int num2) {
        try {
            // 1. 定义 WSDL 的 URL
            URL wsdlURL = new URL("http://localhost:7070/calculator?wsdl"); // Web 服务的 WSDL 地址
            // 2. 创建 Web 服务的实现类
            CalculatorService service = new CalculatorService(wsdlURL);
            // 3. 获取 Web 服务端口
            Calculator port = service.getCalculatorPort();
            // 4. 调用 Web 服务方法
            return port.add(num1, num2);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;  // 错误处理
        }
    }
}
