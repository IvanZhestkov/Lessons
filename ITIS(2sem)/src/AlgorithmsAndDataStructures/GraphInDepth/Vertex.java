package AlgorithmsAndDataStructures.GraphInDepth;

/**
 * Created by User on 26.02.2017.
 */
public class Vertex {
    private int label;
    private boolean isVisited;

    public Vertex(int label) {
        this.label = label;
        isVisited = false;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
