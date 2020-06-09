package datastructure.graph;

public interface Graph<T> {

    void addVertex(T vertex);

    void addEdge(T sourceVertex, T destinationVertex);

    int getEdgeCount();

    int getVertexCount();

    boolean isVertexExist(T vertex);

    boolean isEdgeExistBetween(T sourceVertex, T destinationVertex);
}
