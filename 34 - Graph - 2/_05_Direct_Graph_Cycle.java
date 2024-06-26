import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _05_Direct_Graph_Cycle {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean directedDetectCycle(ArrayList<Edge> graph[]){
        boolean Visited[] = new boolean[graph.length];
        boolean recStack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!Visited[i]){
                if(directedDetectCycleUtil(graph, i, Visited,recStack)) {
                    //Cycle Exists In One Of The Parts
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean directedDetectCycleUtil(ArrayList<Edge> graph[],int curr,boolean Visited[],boolean recStack[]){

        Visited[curr] = true;
        recStack[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(recStack[e.dest]){
                return true;
            }

            if(!Visited[e.dest]){
                if(directedDetectCycleUtil(graph, e.dest, Visited,recStack)){
                    return true;
                }
            }
        }

        recStack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        //Initialization
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //Adding Vertices
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));

        //For Cycle
        System.out.println(directedDetectCycle(graph));
    }
}