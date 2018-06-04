package cn.imcompany.test;

import cn.imcompany.lazy.LazyOne;
import cn.imcompany.lazy.LazyThree;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Created by tomyli on 2018/6/2.
 * Github: https://github.com/peng051410
 */
public class LazyTest {

    public static void main(String[] args) throws Exception {

        // testThreadSafeGetInstance();
        testThreadSafe();
/*

        LazyThree lazyThree = LazyThree.getInstance();

        // LazyThree lazyThree1 = constructor.newInstance(null);
        File file = new File(LazyTest.class.getResource("").getPath() + "/serializable.txt");
        FileOutputStream fps = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fps);
        oos.writeObject(lazyThree);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        LazyThree lazyThreeSerializable = (LazyThree) ois.readObject();
        fis.close();
        ois.close();

        System.out.println(lazyThree == lazyThreeSerializable);

        Constructor<LazyThree> constructor = LazyThree.class.getDeclaredConstructor(null);
        // constructor.setAccessible(true);
        // LazyThree lazyThree = constructor.newInstance(null)
        PropertyDescriptor descriptor = new PropertyDescriptor("inintial", LazyThree.class);
        descriptor.getWriteMethod().invoke(LazyThree.class, false);
        LazyThree lazyThree2 = constructor.newInstance();
        System.out.println(lazyThree == lazyThree2);

        LazyOne instance = LazyOne.getInstance();

        // IntStream.range(1, 100).forEach(
        //          i -> new Thread(() -> System.out.println(LazyOne.getInstance())).start()
        // );

        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000000; i++) {

            // new Thread(()-> System.out.println(LazyOne.getInstance())).start();
            LazyOne.getInstance();
        }
        System.out.println("LazyOne use: " + (System.currentTimeMillis() - start) + "ms");
        // System.out.println(instance);


        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 200000000; i++) {

            // new Thread(()-> System.out.println(LazyOne.getInstance())).start();
            LazyTwo lazyTwo = LazyTwo.getInstance();
        }
        System.out.println("LazyTwo use: " + (System.currentTimeMillis() - start2) + "ms");
        // System.out.println(instance);
*/

    }

    private static void testThreadSafe() {

        CountDownLatch countDownLatch = new CountDownLatch(100);
        IntStream.range(0, 100).forEach(
                i -> {
                    new Thread(() -> {
                        try {
                            countDownLatch.await(10000, TimeUnit.MILLISECONDS);
                            System.out.println(LazyThree.getInstance());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();
                    countDownLatch.countDown();
                });
    }

    private static void testThreadSafeGetInstance() {
        //在线程可以通过await（）之前必须调用countDown（）的次数
        //具有计数1的 CountdownLatch 可以用作”启动大门”，来立即启动一组线程；
        final CountDownLatch begin = new CountDownLatch(1);  //为0时开始执行
        final ExecutorService exec = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            Runnable runnable = () -> {
                try {
                    //如果当前计数为零，则此方法立即返回。
                    //如果当前计数大于零，则当前线程将被禁用以进行线程调度，并处于休眠状态，直至发生两件事情之一：
                    //或调用countDown（）方法，计数达到零;
                    //或一些其他线程中断当前线程。

                    //等待直到 CountDownLatch减到1
                    begin.await();

                    System.out.println(LazyOne.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            exec.submit(runnable);
        }
        System.out.println("开始执行");
        //减少锁存器的计数，如果计数达到零，释放所有等待的线程。
        // begin减一，开始并发执行
        begin.countDown();
        //此方法不等待先前提交的任务完成执行
        //exec.shutdown();
        //为了保证先前提交的任务完成执行 使用此方法
        try {
            exec.awaitTermination(4000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
