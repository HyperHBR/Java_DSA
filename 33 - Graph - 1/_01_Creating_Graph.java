import java.util.ArrayList;

public class _01_Creating_Graph{
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

        public static void main(String[] args) {
            /*
             *          5
             * (1) ---------- (3) \
             *                 |    \ 
             *                 |      \ 8
             *                 | 6      \
             *                 |          \ 
             *                 |      4     \ 
             *                (2) --------- (0)
             */
            int V = 4; //Our Number Of Vertices

            //Creating an array of ArrayLists where each ArrayList
            // represents a vertex and stores all its edges
            ArrayList<Edge> graph[] = new ArrayList[V];

            //Empty Initialization
            for(int i=0;i<V;i++){
                graph[i] = new ArrayList<>();
            }

            //For O
            graph[0].add(new Edge(0, 2, 4));
            graph[0].add(new Edge(0, 3, 8));

            //For 1
            graph[1].add(new Edge(1, 3, 5));
            
            //For 2
            graph[2].add(new Edge(2, 0, 4));
            graph[2].add(new Edge(2, 3, 6));
            
            //For 3
            graph[3].add(new Edge(3, 0, 8));
            graph[3].add(new Edge(3, 1, 5));
            graph[3].add(new Edge(3,2, 6));

            //Printing Neighbours Of 3
            for(int i=0;i<graph[2].size();i++){
                System.out.println(graph[2].get(i).dest);
            }
        }
}