package springapp.webservice;

import javax.jws.WebService;
@WebService
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return  a - b;
    }

    @Override
    public int mul(int a, int b) {
        return  a * b;
    }

    @Override
    public int div(int a, int b) {
        if(b==0)
            return 0;
        return a/b;
    }

    @Override
    public int pow(int a, int b) {
        return  (int) Math.pow(a,b);
    }
}