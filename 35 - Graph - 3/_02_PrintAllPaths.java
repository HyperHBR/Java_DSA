import java.util.ArrayList;

public class _02_PrintAllPaths {

    public static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void printAllPaths(ArrayList<Edge> graph[],int src,int target,String path){
        if(src==target){
            System.out.println(path+target);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            printAllPaths(graph, e.dest, target, path+src);
        }
    }
    public static void main(String[] args) {
        //Initialization
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //Adding Vertices
        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 1));
        
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        //For Cycle
        printAllPaths(graph,4,1,"");
    }
}
