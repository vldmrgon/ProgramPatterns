package pro.patterns.creation.factory.viewers;

import org.springframework.stereotype.Component;

@Component
public class DocumentViewer implements Viewer {

    @Override
    public void view(Object object) {
        System.out.println("DocumentViewer is work");
    }

    @Override
    public ViewerType getType() {
        return ViewerType.DOCUMENT;
    }
}
