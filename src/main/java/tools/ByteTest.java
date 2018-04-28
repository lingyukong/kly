package tools;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/24 11:03
 * @see
 */
public class ByteTest {
    public static void main(String[] args) {
        byte[] result = "eJzzS8xN1QlOzEksquTyys/IUwjOzSzJ0DE0AAGu4JLUstQ8Ba/8pGIdS0MjoBAAfpEOqg==".getBytes();
        System.out.println(new String(result));
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
            result[i] += (byte)1;
        }
        System.out.println(new String(result));
    }
}
