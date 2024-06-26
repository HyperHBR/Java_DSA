import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class _02_BFS{
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

    public static void BFS(ArrayList<Edge> graph[],int start){

        //Add Queue
        Queue<Integer> q = new LinkedList<>();

        //Visited List
        boolean Visited[] = new boolean[graph.length];

        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!Visited[curr]){
                System.out.print(curr+" ");
                Visited[curr] = true;
                for(int j=0;j<graph[curr].size();j++){
                    q.add(graph[curr].get(j).dest);
                }
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
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[7];

        for(int i=0;i<7;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        
        graph[1].add(new Edge(1, 3, 1));
        
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4,3, 1));
        graph[4].add(new Edge(4, 5, 1));
        
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

        BFS(graph, 0);
    }
}