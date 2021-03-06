/**
 * Created by ethan on 29/04/2017.
 * 设计模式
 *
 * 软件开发的一个不变的真理：CHANGE
 * 不管当初软件设计的多好，一段实践之后，总是需要成长和改变，
 * 否则软件就会"死亡"。
 * 代码应该如同晚霞中的莲花一样地关闭（免于改变），如同晨曦中的莲花一样地开放（能够扩展）。
 *
 * 设计原则：
 * 1、找出应用中可能需要变化指出，把它们独立出来，不要和那些不需要变化的代码混在一起。
 * 2、针对接口编程，而不是针对实现编程。（"针对接口编程"真正的意思是"针对超类型(supertype)编程"）
 * 3、多用组合，少用继承。"有一个"可能比"是一个"更好。
 * 4、为了交互对象之间的松耦合设计而努力。（松耦合设计能让我们建立有弹性的OO系统，能够应对变化，是因为对象之间的互相依赖降到了最低）
 * 5、类应该对扩展开放，对修改关闭。
 * 6、Dependency Inversion Principle. 要依赖抽象，不要依赖具体类。
 */
package com.primeco.ethanxx.pattern;
