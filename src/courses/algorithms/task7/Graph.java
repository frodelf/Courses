package courses.algorithms.task7;

public class Graph {
    //size = 17
    public int index = 0;
    public Vertex[] vertexArr;
    public int[][] adjacencyMatrices;

    Graph(int size) {
        vertexArr = new Vertex[size];
        adjacencyMatrices = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjacencyMatrices[i][j] = 0;
            }
        }
    }

    public void addVertex(String distance) {
        Vertex vertex = new Vertex(distance);
        vertexArr[index++] = vertex;
    }

    public int getIndex(String name) {
        int i = 0;
        for (; i < index; i++) {
            if (name.equals(vertexArr[i].getName())) break;
        }
        return i;
    }

    public void addEdge(String vertexFrom, String vertexTo, int distance) {
        int vertexOne = getIndex(vertexFrom);
        int vertexTwo = getIndex(vertexTo);

        adjacencyMatrices[vertexOne][vertexTwo] = distance;
    }


    public void deykstri(String name) {
        for (int i = 0; i < adjacencyMatrices.length; i++) {
            for (int j = 0; j < adjacencyMatrices.length; j++) {
                if (adjacencyMatrices[i][j] == 0) adjacencyMatrices[i][j] = Integer.MAX_VALUE;
            }
        }
        int maxValue = Integer.MAX_VALUE;

        int begin = getIndex(name);

        int[] delayTimeArr = new int[index];
        for (int i = 0; i < index; i++) {
            delayTimeArr[i] = adjacencyMatrices[begin][i];
        }

        delayTimeArr[begin] = 0;
        int index1 = 0;
        for (int i = 0; i < index; i++) {
            int min = maxValue;
            for (int j = 0; j < index; j++) {
                if (!vertexArr[j].getVisited() && min > delayTimeArr[j]) {
                    min = delayTimeArr[j];
                    index1 = j;
                }
            }

            vertexArr[index1].setVisited(true);
            for (int j = 0; j < index; j++) {
                if (!vertexArr[j].getVisited() && adjacencyMatrices[index1][j] != maxValue && delayTimeArr[index1] != maxValue && (delayTimeArr[index1] + adjacencyMatrices[index1][j] < delayTimeArr[j])) {
                    delayTimeArr[j] = delayTimeArr[index1] + adjacencyMatrices[index1][j];
                }
            }
        }

        for (int i = 0; i < index; i++) {
            if (delayTimeArr[i] != maxValue) {
                System.out.println(vertexArr[begin].getName() + " -> " + vertexArr[i].getName() + " = " + delayTimeArr[i]);
            } else {
                System.out.println(vertexArr[begin].getName() + " -> " + vertexArr[i].getName() + " - isolated");
            }
        }

        for (int i = 0; i < index; i++) {
            vertexArr[i].setVisited(false);
        }
        System.out.println();
    }
}
