package pro.patterns.creation.factory.on_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pro.patterns.creation.factory.viewers.ViewerType;
import pro.patterns.creation.factory.viewers.Viewer;

import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.Optional;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class ViewerFactoryOnSpring {
    private static Map<ViewerType, Viewer> cache = new EnumMap<>(ViewerType.class);

    @Autowired
    public ViewerFactoryOnSpring(List<Viewer> viewerList) {
        cache = viewerList.stream().collect(Collectors.toUnmodifiableMap(Viewer::getType, Function.identity()));
    }

    public static Viewer getViewer(ViewerType viewerType) {
        return Optional.ofNullable(cache.get(viewerType)).orElseThrow(IllegalAccessError::new);
    }
}
