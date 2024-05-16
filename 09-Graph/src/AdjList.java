import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedMap;

public class AdjList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int v = in.nextInt();
        int e = in.nextInt();
        LinkedList<Integer>[] list = new LinkedList[v];

        for(int i = 0; i < v; i++){
            list[i] =  new LinkedList<>();
        }

        for(int i = 0; i < e; i++){
            int source = in.nextInt();
            int destination = in.nextInt();
            list[source].add(destination);
            list[destination].add(source);
        }

        for(int i = 0; i < v; i++){
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : list[i]){
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }
}
