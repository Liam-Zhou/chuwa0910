package com.pattern.factory.factory_method;

/*
从以上的编写的代码可以看到，要增加产品类时也要相应地增加工厂类的子实现类，不需要修改工厂类的代码了，
这样就解决了简单工厂模式的缺点。

工厂方法模式是简单工厂模式的进一步抽象。由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，而且克服了它的缺点。

优点：
用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；

缺点：
每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 */
public interface CoffeeFactory {
    Coffee createCoffee();
}