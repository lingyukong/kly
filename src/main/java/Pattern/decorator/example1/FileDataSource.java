package Pattern.decorator.example1;

import java.io.*;

/**
 * <p>Description: </p>
 *  具体构件ConcreteComponent
 *  在被装饰器装饰之前抽象组件的具体形态
 * @author kly
 * @Date 2018/4/21 20:57
 * @see
 */
public class FileDataSource implements DataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try{
            OutputStream out = new FileOutputStream(file);
            out.write(data.getBytes(),0,data.length());
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String readData() {
        char[] buff = null;
        File file  = new File(name);
        try{
            FileReader reader = new FileReader(file);
            buff = new char[(int)file.length()];
            reader.read(buff);
        }catch(Exception e) {
            e.printStackTrace();
        }

        return new String(buff);
    }
}
