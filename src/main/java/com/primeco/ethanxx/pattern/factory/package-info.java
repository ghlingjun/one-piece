/**
 * Created by ethan on 01/05/2017.
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 * 工厂方法模式（Factory Method Pattern）通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。
 * 工厂方法，可以把你的客户代码从需要实例化的具体类中解耦。或者如果目前还不知道将来需要实例化哪些具体类时，也可以使用。使用方法很简单，
 * 只要把工厂方法继承成子类，并实现工厂方法就可以。
 * <p>
 * 抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
 * 抽象工厂，当需要创建产品家族和想让制造的相关产品集合起来时使用。
 */
package com.primeco.ethanxx.pattern.factory;