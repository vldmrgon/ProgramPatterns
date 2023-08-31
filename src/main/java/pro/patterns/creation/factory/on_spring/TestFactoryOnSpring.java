package pro.patterns.creation.factory.on_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pro.patterns.creation.factory.viewers.Viewer;
import pro.patterns.creation.factory.viewers.ViewerType;

@ComponentScan
public class TestFactoryOnSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(TestFactoryOnSpring.class);

        Viewer viewer = ViewerFactoryOnSpring.getViewer(ViewerType.VIDEO);
        viewer.view(new Object());

        Viewer viewer1 = ViewerFactoryOnSpring.getViewer(ViewerType.IMAGE);
        viewer1.view(new Object());
    }
}
