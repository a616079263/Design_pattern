package zc.com.pattern.model.staticfactory;

/**
 * Created by Administrator on 2017/3/6.
 */
public class OperationDiv extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        if(numberB==0){
            throw new RuntimeException(e,"除数不能为零");
        }
        result = numebrA / numberB;
        return result;
    }
}
