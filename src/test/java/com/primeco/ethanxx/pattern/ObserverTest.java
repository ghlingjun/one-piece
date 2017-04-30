package com.primeco.ethanxx.pattern;

import com.primeco.ethanxx.pattern.observer.impl.CurrentConditionsDisplay;
import com.primeco.ethanxx.pattern.observer.impl.WeatherData;
import junit.framework.TestCase;

/**
 * Created by ethan on 30/04/2017.
 * 观察者模式测试
 */
public class ObserverTest extends TestCase {
    private WeatherData weatherData;

    public void setUp() throws Exception {
        super.setUp();
        weatherData = new WeatherData();
    }

    public void testObserver() {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 30.4f);
    }
}
