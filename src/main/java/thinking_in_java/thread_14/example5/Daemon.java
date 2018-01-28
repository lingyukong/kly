package thinking_in_java.thread_14.example5;

/**
 * <p>Description:
 * 1:如果是一个 Daemon 线程，那么它创建的任何线程也会自动具备Daemon属性
 * 2:“Daemon”线程的作用是在程序的运行期间于后台提供一种“常规”服务，但它并不属于程序的一个基本部分,
 * 因此，一旦所有非 Daemon线程完成，程序也会中止运行
 * </p>
 *
 * @author kly
 * @Date 2018/1/28 14:57
 * @see
 */
public class Daemon extends Thread {
    private static final int SIZE = 10;
    private Thread[] t = new Thread[SIZE];
    public Daemon() {
        setDaemon(true);
        start();
    }

    public void run() {
        for (int i=0;i<SIZE;i++) {
            t[i] = new DaemonSpawn(i);
        }
        for (int i=0;i<SIZE;i++) {
            System.out.println(
                    "t[" + i + "].isDaemon() = "
                            + t[i].isDaemon());
        }

        while(true) {
            yield();
        }

    }
}
