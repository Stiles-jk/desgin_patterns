package com.zstu.observer;

import java.util.ArrayList;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:19
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    //数据如果改变
    private void dataChange() {
        notifyObservers();
    }

    public void setWeatherData(float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update(this.temperature,this.pressure,this.humidity);

        }
    }
}
