package thinking_in_java.thread_14.example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>Description:
 * </p>
 *
 * @author kly
 * @Date 2018/1/28 15:11
 * @see
 */
public class Daemons {
    public static void main(String[] args) {
        Thread d = new Daemon();
        System.out.println(
                "d.isDaemon() = " + d.isDaemon());
        BufferedReader stdin =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Waiting for CR");
        try {
            stdin.readLine();
        } catch(IOException e) {}

    }
}
