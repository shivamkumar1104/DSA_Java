import java.util.*;
public class Dijkastra {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));2



    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dest;

        public Pair(int n, int d){
            this.node = n;
            this.dest = d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dest - p2.dest; //ascending order sorting
        }
    }

 
    public static void dijkastra(ArrayList<Edge> graph[], int src){
        PriorityQueue<Pair> pq = new PriorityQueue<>();

    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
    }
}
