package java_thread_core_tech.mythread.chapter1.doc1_2.test3;


public class MyThread extends Thread{
    private int i;

    public MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
