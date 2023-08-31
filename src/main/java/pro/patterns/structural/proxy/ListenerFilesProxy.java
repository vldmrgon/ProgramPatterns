package pro.patterns.structural.proxy;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

@RequiredArgsConstructor
public class ListenerFilesProxy implements File, InvocationHandler {
    private final ListenerFiles listenerFiles;


    @Override
    public List<String[]> getListFromDataBase() {

        // business logic before method
        List<String[]> listFromDataBase = listenerFiles.getListFromDataBase();
        // business logic after method
        return listFromDataBase;

    }

    @Override
    public String[] getTimeTrain(int id) {

        // business logic before method
        String[] timeTrain = listenerFiles.getTimeTrain(id);
        // business logic after method
        return timeTrain;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
