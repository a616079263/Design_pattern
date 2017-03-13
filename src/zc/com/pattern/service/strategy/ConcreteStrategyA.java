package zc.com.pattern.service.strategy;

import zc.com.pattern.model.strategy.Strategy;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteStrategyA extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A的实现");
    }
}
