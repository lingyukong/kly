package thinking_in_java.io_10.example1;

import java.io.File;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/10 18:12
 * @see
 */
public class DirList {

    public static void main(String[] args) {
        try{
             File path = new File(File.separator + "F:" + File.separator);
             String[] list;
             if (args.length == 0) {
                 list = path.list();
             } else {
                 list = path.list(new DirFilter(args[0]));
             }
             for (String temp : list) {
                 System.out.println(temp);
             }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
