import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _01_BFS_DFS_For_Connected_Components {
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

    //Main BFS
    public static void BFS(ArrayList<Edge> graph[]){
        boolean Visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!Visited[i]){
                BFSUtil(graph,i,Visited);;
            }
        }
    }

    //BFS Util
    public static void BFSUtil(ArrayList<Edge> graph[],int src,boolean Visited[]){
        //Creating Q
        Queue<Integer> q = new LinkedList<>();

        q.add(src);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!Visited[curr]){
                Visited[curr] = true;
                System.out.print(curr + " ");

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    if(!Visited[e.dest]){
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    //Main DFS
    public static void DFS(ArrayList<Edge> graph[]){
        boolean Visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!Visited[i]){
                DFSUtil(graph,i,Visited);;
            }
        }
    }

    //DFSUtil
    public static void DFSUtil(ArrayList<Edge> graph[],int curr,boolean Visited[]){
        System.out.print(curr + " ");
        Visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!Visited[e.dest]){
                DFSUtil(graph, e.dest, Visited);
            }
        }
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

        BFS(graph);
        System.out.println();
        DFS(graph);
    }

}