package pro.patterns.creation.factory.viewers;

public interface Viewer {

    void view(Object object);

    ViewerType getType();
}
