package AlgorithmsAndDataStructures.GraphInDepth;

import AlgorithmsAndDataStructures.Stack.ArrayStack;
import AlgorithmsAndDataStructures.Stack.Stack;

/**
 * Created by User on 26.02.2017.
 */
public class Graph {
    private final int VERTEX_MAX = 100;
    private Vertex[] vertexList;
    private int vertexCount;
    private int[][] matrix;
    private Stack stack;

    public Graph() {
        matrix = new int[VERTEX_MAX][VERTEX_MAX];

        for (int i = 0; i < VERTEX_MAX; i++) {
            for (int j = 0; j < VERTEX_MAX; j++) {
                matrix[i][j] = 0;
            }
        }

        vertexCount = 0;
        vertexList = new Vertex[VERTEX_MAX];

        stack = new ArrayStack(100);

    }

    public void addVertex(int label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int begin, int end) {
        matrix[begin][end] = 1;
    }

    public int getSuccessor(int v) {
        for (int i = 0; i < vertexCount; i++) {
            if (matrix[v][i] == 1 && !vertexList[i].isVisited()) {
                return i;
            }
        }
        return -1;
    }

    public void dfs(int v) {
        vertexList[v].setVisited(true);
        stack.push(v);

        System.out.println(vertexList[v].getLabel());

        while (!stack.isEmpty()) {
            int current = (int) stack.top();
            int vertex = getSuccessor(current);
            if (vertex == -1) {
                stack.pop();
            } else {
                vertexList[vertex].setVisited(true);
                System.out.println(vertexList[vertex].getLabel());
                stack.push(vertex);
            }
        }

        for (int i = 0; i < vertexCount; i++) {
            vertexList[i].setVisited(false);
        }
    }
}
