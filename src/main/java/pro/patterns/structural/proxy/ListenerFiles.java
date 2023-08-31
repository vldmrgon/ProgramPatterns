package pro.patterns.structural.proxy;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ListenerFiles implements File {

    @SneakyThrows
    @Override
    public List<String[]> getListFromDataBase() {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("pro/patterns/structural/proxy/table.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(values);
            }
        }
        return records;
    }

    @Override
    public String[] getTimeTrain(int id) {
        List<String[]> listFromDataBase = getListFromDataBase();
        for (String[] strings : listFromDataBase) {
            if (strings[0].equals(id)) return strings;
        }
        return new String[1];
    }
}
