package com.zstu.factory_pattern.abstract_factory.order;

import com.zstu.factory_pattern.abstract_factory.pizza.Pizza;

/**
 * an abstract factory pattern's abstract later
 *
 * @auther Stiles-JKY
 * @date 2020/4/30-6:33
 */
public interface AbsFactory {

    //由该接口的实现类来具体实现该方法
    Pizza createPizza(String orderType);
}
