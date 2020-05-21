
package filereader.and.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferedReader {
    
        
    public static void main(String[] args) {
        
        String path = "c:\\intel\\in.txt";
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            
            while (line != null ) {
                System.out.println(line);
                br.readLine();
            }
            
            
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        

        
        
        
    }
    
}
