package datastructure.graph;

import datastructure.linkedlist.LinkedList;
import datastructure.linkedlist.LinkedListImpl;

import java.util.HashMap;
import java.util.Map;

public class GraphImpl<T> implements Graph<T> {

    private Map<T, LinkedList<T>> vertexMap = new HashMap<T, LinkedList<T>>();
    private boolean isBiDirectional;

    public GraphImpl(boolean isBiDirectional) {
        this.isBiDirectional = isBiDirectional;
    }

    @Override
    public void addVertex(T vertex) {
        if (!vertexMap.containsKey(vertex)) vertexMap.put(vertex, new LinkedListImpl<T>());
    }

    @Override
    public void addEdge(T sourceVertex, T destinationVertex) {
        if (!vertexMap.containsKey(sourceVertex)) vertexMap.put(sourceVertex, new LinkedListImpl<T>());
        if (!vertexMap.containsKey(destinationVertex)) vertexMap.put(destinationVertex, new LinkedListImpl<T>());

        vertexMap.get(sourceVertex).addLast(destinationVertex);
        if (isBiDirectional) vertexMap.get(destinationVertex).addLast(sourceVertex);
    }

    @Override
    public int getEdgeCount() {
        int count = 0;
        for (T key : vertexMap.keySet()) {
            count += vertexMap.get(key).size();
        }
        if (isBiDirectional) count=count/2;
        return count;
    }

    @Override
    public int getVertexCount() {
        return vertexMap.keySet().size();
    }

    @Override
    public boolean isVertexExist(T vertex) {
        return vertexMap.containsKey(vertex);
    }

    @Override
    public boolean isEdgeExistBetween(T sourceVertex, T destinationVertex) {
        return vertexMap.get(sourceVertex).contains(destinationVertex);
    }
}
