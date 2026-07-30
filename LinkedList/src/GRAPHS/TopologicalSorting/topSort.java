import java.util.*;

public class topSort{
    static class Edge{
        int src; 
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }

    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
            graph[2].add(new Edge(2, 3));

            graph[3].add(new Edge(3, 1));

            graph[4].add(new Edge(4, 0));
            graph[4].add(new Edge(4, 1));

            graph[5].add(new Edge(5, 0));
            graph[5].add(new Edge(5, 2));
    }

    public static void TopSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                TopSortUtil(graph, e.dest, vis, stack);

            }
        }
        stack.push(curr);
    }
    public static void TopSort(ArrayList<Edge> graph[], int V){
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i = 0; i<V; i++){
            if(!vis[i]){
                TopSortUtil(graph, i, vis, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        TopSort(graph, V);
    }
}
