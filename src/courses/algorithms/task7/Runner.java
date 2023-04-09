package courses.algorithms.task7;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        Graph graph = new Graph(18);

        File file1 = new File("vertex.txt");
        FileReader fileReader1 = new FileReader(file1);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

        while (true) {
            String name = bufferedReader1.readLine();
            if (name == null) break;
            graph.addVertex(name);
        }

        File file2 = new File("edge.txt");
        FileReader fileReader2 = new FileReader(file2);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

        String cityFrom;
        String cityTo;
        int distance;
        while (true) {
            cityFrom = bufferedReader2.readLine();
            if (cityFrom == null) break;
            cityTo = bufferedReader2.readLine();
            distance = Integer.parseInt(bufferedReader2.readLine());
            graph.addEdge(cityFrom, cityTo, distance);
        }

        graph.deykstri("Одеса");
    }
}
