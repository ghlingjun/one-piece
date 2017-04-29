package com.primeco.ethanxx.pattern;

import com.primeco.ethanxx.pattern.strategy.Duck;
import com.primeco.ethanxx.pattern.strategy.impl.FlyRocketPowered;
import com.primeco.ethanxx.pattern.strategy.impl.MallardDuck;
import com.primeco.ethanxx.pattern.strategy.impl.ModelDuck;
import junit.framework.TestCase;

/**
 * Created by ethan on 29/04/2017.
 * 策略模式测试
 */
public class StrategyTest extends TestCase {
    private Duck duck;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * 绿头鸭测试
     */
    public void testDuck() {
        duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        System.out.println("-------------------");

        duck = new ModelDuck();
        duck.performQuack();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        System.out.println("-------------------");
    }

}

