package thinking_in_java.io_10.example3;

import java.io.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/12 14:32
 * @see
 */
public class InFile extends DataInputStream {

    public InFile(String filename) throws FileNotFoundException {
        super(new BufferedInputStream(new FileInputStream(filename)));
    }
    public InFile(File file) throws FileNotFoundException {
        this(file.getPath());
    }
}
