package zc.com.pattern.model.staticfactory;

/**
 * Created by Administrator on 2017/3/6.
 */
public class OperationSub extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
