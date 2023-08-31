package pro.patterns.creation.factory.classic;

import pro.patterns.creation.factory.viewers.Viewer;
import pro.patterns.creation.factory.viewers.ViewerType;

public class TestFactoryOnJava {
    public static void main(String[] args) {

        Viewer viewerDoc = ViewerFactoryOnJava.getViewerByType(ViewerType.DOCUMENT);
        viewerDoc.view(new Object());

        Viewer viewerImg = ViewerFactoryOnJava.getViewerByType(ViewerType.IMAGE);
        viewerImg.view(new Object());
    }
}
