package courses.algorithms.task7;

public class Vertex {
    private boolean visited;
    private String name;

    public Vertex(String name) {
        this.name = name;
        visited = false;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean state) {
        visited = state;
    }

    public String getName() {
        return name;
    }
}
