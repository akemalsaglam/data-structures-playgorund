package datastructure.graph;

import org.junit.Assert;
import org.junit.Test;

public class GraphTest {

    @Test
    public void test1() {
        FriendshipGraph friendshipGraph = new FriendshipGraph();
        friendshipGraph.addVertex("Ezgi");
        friendshipGraph.addVertex("Ali");
        friendshipGraph.addVertex("Seda");
        friendshipGraph.addVertex("Emre");
        friendshipGraph.addVertex("Semiha");
        friendshipGraph.addVertex("Ahmet");

        friendshipGraph.addEdge("Ali","Ezgi");
        friendshipGraph.addEdge("Emre","Seda");
        friendshipGraph.addEdge("Semiha","Ahmet");
        friendshipGraph.addEdge("Ahmet","Ali");
        friendshipGraph.addEdge("Emre","Ahmet");

        Assert.assertEquals(6, friendshipGraph.getVertexCount());
        Assert.assertEquals(5, friendshipGraph.getEdgeCount());
        Assert.assertTrue(friendshipGraph.isEdgeExistBetween("Ali", "Ahmet"));
        Assert.assertFalse(friendshipGraph.isEdgeExistBetween("Semiha", "Seda"));

    }

}
