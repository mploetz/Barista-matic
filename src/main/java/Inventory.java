import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Integer> ingredientsInventory = new HashMap<String, Integer>();
    public Inventory(String filePath) throws IOException {
        ReadAndSetInventory(filePath);
    }

    private void ReadAndSetInventory(String filePath) throws IOException {
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader(filePath));
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                this.ingredientsInventory.put(line[0], Integer.valueOf(line[1].trim()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public HashMap<String, Integer> GetInventory() {
        return this.ingredientsInventory;
    }
}
