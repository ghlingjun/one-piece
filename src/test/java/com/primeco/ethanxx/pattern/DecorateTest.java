package com.primeco.ethanxx.pattern;

import com.primeco.ethanxx.pattern.decorate.Beverage;
import com.primeco.ethanxx.pattern.decorate.impl.*;
import junit.framework.TestCase;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ethan on 30/04/2017.
 * 装饰者模式测试
 */
public class DecorateTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testBeverage() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

    public void testFileInput() throws IOException {
        int c;
        try {
            String path = this.getClass().getResource("").getPath();
            System.out.println(path);
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream(path + "/dec.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
