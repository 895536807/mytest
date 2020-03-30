package cn.thread;

public class Demo1 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for (int i = 0;i<10;i++){
            System.out.println("main线程"+i);
        }
    }
}
