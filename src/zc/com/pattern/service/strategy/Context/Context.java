package zc.com.pattern.service.strategy.Context;

import zc.com.pattern.model.strategy.Strategy;
import zc.com.pattern.service.strategy.ConcreteStrategyA;
import zc.com.pattern.service.strategy.ConcreteStrategyB;
import zc.com.pattern.service.strategy.ConcreteStrategyC;
import zc.com.pattern.service.strategy.ConcreteStrategyD;

/**
 * Created by Administrator on 2017/3/13.
 * 策略模式上下文
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }

    public static void main(String[] args) {

        Context context = null;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyD());
        context.ContextInterface();

    }

}
