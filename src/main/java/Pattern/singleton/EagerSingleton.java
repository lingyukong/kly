package Pattern.singleton;

/**
 * <p>Description: 饿汉式单例模式,是线程安全的</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/11 18:17
 * @see
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton () {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }


}
