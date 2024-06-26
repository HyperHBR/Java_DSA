import java.util.ArrayList;

public class _02_Undirect_Detect_Cycle {
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

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean Visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!Visited[i]){
                if(detectCycleUtil(graph, i, -1, Visited)) {
                    //Cycle Exists In One Of The Parts
                    return true;
                }
            }
        }

        return false;
    }
    
    public static int count = 0; 

    public static boolean detectCycleUtil(ArrayList<Edge> graph[],int curr,int par,boolean Visited[]){
        Visited[curr] = true;
        count++;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!Visited[e.dest]){
                //Case - 3
                if(detectCycleUtil(graph,e.dest,curr,Visited)){
                    System.out.println(count);
                    return true;
                }
            }
            //Case - 1
            else if(Visited[e.dest] && e.dest != par){
                return true;
            }

            //Case - 2 Eat 5 Star Do Nothing
        }

        return false;
    }
    public static void main(String[] args) {
            /* 
             *          (1)-------------(3)
             *         /                 |  \
             *       /                   |    \
             *     /                     |      \
             *   (0)                     |       (5)----------(6)
             *     \                     |      /
             *       \                   |    /
             *         \                 |  /
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
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));
    
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));
    
            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));
    
            graph[6].add(new Edge(6, 5, 1));
    
            System.out.println(detectCycle(graph));
        }
}