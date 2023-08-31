package pro.patterns.creation.factory.classic;

import pro.patterns.creation.factory.viewers.*;

import java.util.EnumMap;
import java.util.Map;

public class ViewerFactoryOnJava {

    private static final Map<ViewerType, Viewer> cache = new EnumMap<>(ViewerType.class);

    static {
        cache.put(ViewerType.DOCUMENT, new DocumentViewer());
        cache.put(ViewerType.VIDEO, new VideoViewer());
        cache.put(ViewerType.IMAGE, new ImageViewer());
    }

    public static Viewer getViewerByType(ViewerType viewerType) {
        if (cache.containsKey(viewerType)) {
            return cache.get(viewerType);
        }
        throw new IllegalArgumentException();
    }
}
