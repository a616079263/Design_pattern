package zc.com.pattern.model.staticfactory;

/**
 * Created by Administrator on 2017/3/6.
 */
public class OperationFactory {
    public static Operation createOperate(string operate) {
        Operation oper= null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                oper = new OperationAdd();
                break;
        }
        return oper;
    }
}
