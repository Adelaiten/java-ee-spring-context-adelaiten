import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String[]> readData(String file) {
        BufferedReader bfr = null;
        String line = "";
        String regex = "[,;/|\\s]";
        List<String[]> dataList = new ArrayList<String[]>();
        
        try {
            bfr = new BufferedReader(new java.io.FileReader(file));
            while((line = bfr.readLine()) != null) {
                String[] data = line.split(regex);
                dataList.add(data);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException d) {
            d.printStackTrace();
        }
        return dataList;
    }
}
