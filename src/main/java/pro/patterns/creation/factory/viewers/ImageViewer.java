package pro.patterns.creation.factory.viewers;

import org.springframework.stereotype.Component;

@Component
public class ImageViewer implements Viewer {

    @Override
    public void view(Object object) {
        System.out.println("ImageViewer is work");
    }

    @Override
    public ViewerType getType() {
        return ViewerType.IMAGE;
    }
}
