package pro.patterns.structural.proxy;

import java.util.List;

public interface File {
    List<String[]> getListFromDataBase();

    String[] getTimeTrain(int id);

}
