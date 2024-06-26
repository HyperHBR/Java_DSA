import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _03_BiPartite_Graph {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static boolean isBiPartiteGraph(ArrayList<Edge> graph[]){
        int color[] = new int[graph.length];

        for(int i=0;i<graph.length;i++){
            color[i] = -1;
            //Initially No Colour
        }

        for(int i=0;i<graph.length;i++){
            if(color[i]== -1){
                //0 Is The First Color We Will Be Doing
                if(!isBiPartiteGraphUtil(graph,i,color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBiPartiteGraphUtil(ArrayList<Edge> graph[],int start,int color[]){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;

        while(!q.isEmpty()){
            int curr = q.remove();
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if (color[e.dest] == -1) {
                    int nextCol = color[curr] == 0 ? 1 : 0; 
                    color[e.dest] = nextCol;
                    q.add(e.dest);
                }
                else if(color[e.dest] == color[curr]){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
            /* 
             *          (1)-------------(3)
             *         /                 |  
             *       /                   |    
             *     /                     |      
             *   (0)                     |    
             *     \                     |      
             *       \                   |    
             *         \                 |  
             *          (2)-------------(4)
             */
    
            //Initialization
            int V = 7;
            ArrayList<Edge> graph[] = new ArrayList[V];
    
            for (int i = 0; i < V; i++) {
                graph[i] = new ArrayList<>();
            }
    
            //Adding Vertices
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
    
            graph[1].add(new Edge(1, 3, 1));
    
            graph[2].add(new Edge(2, 4, 1));
    
            graph[3].add(new Edge(3, 1, 1));
            //graph[3].add(new Edge(3, 4, 1));
    
            graph[4].add(new Edge(4, 2, 1));
            //graph[4].add(new Edge(4, 3, 1));
    
    
            System.out.println(isBiPartiteGraph(graph));
        }
}