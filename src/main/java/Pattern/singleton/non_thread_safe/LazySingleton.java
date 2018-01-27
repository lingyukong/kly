package Pattern.singleton.non_thread_safe;

/**
 * <p>Description:懒汉式单例模式，线程不安全的
 * 如果有两个线程同时访问getInstance，那么instance会被判为null，进而初始化两个LazySingleton类
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/11 18:27
 * @see
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance() {
        if (instance == null ) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
