package com.primeco.ethanxx.thread;

/**
 * Created by ethan on 30/04/2017.
 * 代码锁测试——junit不支持测试多线程
 */
public class SynchronizedTest {
    public static void testSynchronizedBlock() {
        new Thread(() -> new Synchronized().synchronizedBlock(), "block").start();
        new Thread(() -> new Synchronized().synchronizedMethod(), "method").start();
    }

    public static void testSynchronizedObject() {
        Synchronized syn = new Synchronized();
        new Thread(() -> syn.synchronizedBlock(), "block").start();
        new Thread(() -> syn.synchronizedMethod(), "method").start();
    }

    public static void main(String[] args) {
//        testSynchronizedBlock();
        testSynchronizedObject();
    }
}
