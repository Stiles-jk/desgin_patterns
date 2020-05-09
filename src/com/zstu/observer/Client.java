package com.zstu.observer;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:07
 */
public class Client {

    public static void main(String[] args) {
        Observer baidu = new BaiDuSite();
        Observer current = new CurrentConditions();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(baidu);
        weatherData.registerObserver(current);

        weatherData.setWeatherData(10f, 100f, 30.3f);
        weatherData.remove(current);
        //测试
        System.out.println();
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setWeatherData(10f, 100f, 30.3f);
    }
}
