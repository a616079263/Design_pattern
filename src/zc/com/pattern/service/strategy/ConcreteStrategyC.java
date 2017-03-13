package zc.com.pattern.service.strategy;

import zc.com.pattern.model.strategy.Strategy;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteStrategyC extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C");
    }
}
