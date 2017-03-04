package AlgorithmsAndDataStructures.GraphInDepth;

/**
 * Created by User on 26.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph();
        for (int i = 0; i < 16; i++) {
            graph.addVertex(i);
        }
        graph.addEdge(0,9);
        graph.addEdge(9,2);
        graph.addEdge(9,3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(7,8);
        graph.addEdge(0,1);
        graph.addEdge(1,10);
        graph.addEdge(10,11);
        graph.addEdge(11,12);
        graph.addEdge(13,11);
        graph.addEdge(13,14);
        graph.addEdge(14,15);

        graph.dfs(0);
    }
}
