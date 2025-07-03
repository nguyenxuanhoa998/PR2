package Assignment09;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOFile {
    private String fileName;
    public IOFile(String fileName){
        this.fileName=fileName;
    }
    // đếm số dòng trong file
    public int countLines(){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
        int lines = 0 ;
        while (br.readLine() != null){
            lines++;
        }
        return lines;
    }catch (IOException E){
            throw new RuntimeException("lỗi khi đếm dòng" + E.getMessage());
    }
}
}
