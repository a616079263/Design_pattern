package zc.com.pattern.model.staticfactory;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Operation {
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    public double GetResult(){
        double result = 0;
        return result;
    }
}
