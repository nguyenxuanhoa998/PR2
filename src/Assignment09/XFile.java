package Assignment09;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class XFile {
    // đọc dữu liệu ừ file nhị phân
    public static byte[] read (String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            int n= fis.available();
            byte[] data= new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e ){
            throw new RuntimeException(e);
        }
    }
    public static void write (String path , byte[] data){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static Object readObject(String path ){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            return ois.readObject();
        }catch (Exception e ){
            throw new RuntimeException("Lỗi khi đọc từ file"+ e.getMessage());
        }
    }
    public static void writeObject(String path , Object object){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            System.out.println("Ghi file thành công: " + path);
        }catch(IOException e ){
            throw new RuntimeException("Lỗi khi ghi Object vào File"+e.getMessage());
        }
    }
}