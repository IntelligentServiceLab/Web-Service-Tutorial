package springapp.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface Calculator {
    @WebMethod
    int add(int a, int b);
    @WebMethod
    int sub(int a, int b);
    @WebMethod
    int mul(int a, int b);
    @WebMethod
    int div(int a, int b);
    @WebMethod
    int pow(int a, int b);
}