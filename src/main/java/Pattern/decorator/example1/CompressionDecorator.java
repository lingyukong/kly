package Pattern.decorator.example1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

/**
 * <p>Description: </p>
 *  ConcreteDecorator2
 * @author kly
 * @Date 2018/4/22 11:36
 * @see
 */
public class CompressionDecorator extends DataSourceDecorator {
    private int comlevel = 6;

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {

        super.writeData(compressData(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    public String compressData(String StringData) {
        byte[] data= StringData.getBytes();
        try{
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout,new Deflater(comlevel));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String decompress(String StringData) {
        byte[] data = Base64.getDecoder().decode(StringData.getBytes());
        try{
            InputStream in = new ByteArrayInputStream(data);
            DeflaterInputStream iin = new DeflaterInputStream(in);
            ByteArrayOutputStream out = new ByteArrayOutputStream(512);
            int b;
            while((b = iin.read()) != -1) {
                out.write(b);
            }

            in.close();
            iin.close();
            out.close();
            return new String(out.toByteArray());
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
