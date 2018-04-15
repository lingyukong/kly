package thinking_in_java.io_10.example3;

import java.io.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/12 14:36
 * @see
 */
public class PrintFile extends PrintStream {

    public PrintFile(String filename)
            throws IOException {
        super(new BufferedOutputStream(new FileOutputStream(filename)));
    }
    public PrintFile(File file)
            throws IOException {
        this(file.getPath());
    }
}
