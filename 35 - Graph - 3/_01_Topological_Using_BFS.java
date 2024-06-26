//Using InDegree ANd OutDegree Concept

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _01_Topological_Using_BFS{
    public static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void TopologicalSortBFS(ArrayList<Edge> graph[]){
        int inDegree[] = new int[graph.length];

        //Calculating Indegree
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                inDegree[e.dest]++;
            }
        }

        //For BFS
        Queue<Integer> q = new LinkedList<>();

        //Adding Vertices With Indegree 0 
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");//Topological Sort
            
            inDegree[curr] = -1;
            
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;

                if(inDegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
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
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 1));
        
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        //For Cycle
        TopologicalSortBFS(graph);
    }
}