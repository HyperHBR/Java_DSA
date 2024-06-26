import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _06_Topological_Sorting {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void TopologicalSort(ArrayList<Edge> graph[]){

        boolean Visited[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!Visited[i]){
                TopologicalSortUtil(graph,i,Visited,stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void TopologicalSortUtil(ArrayList<Edge> graph[],int curr, boolean Visited[],Stack<Integer> stack){
        Visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!Visited[e.dest]){
                TopologicalSortUtil(graph, e.dest, Visited, stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String[] args) {
        //Initialization
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //Adding Vertices
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 1));
        
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        //For Cycle
        TopologicalSort(graph);
    }
}