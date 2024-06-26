import java.util.*;

public class _01_Strongly_Connected_Graph{
    public static class Edge{
        int src;
        int dest;


        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        //Empty AL
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topoSort(int curr,boolean visited[],Stack<Integer> s,ArrayList<Edge> graph[]){
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topoSort(e.dest, visited, s, graph);
            }
        }

        s.push(curr);
    }

    public static void DFS(int curr,ArrayList<Edge> graph[],boolean visited[]){
        visited[curr] = true;
        System.out.print(curr + " ");

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                DFS(e.dest, graph, visited);
            }
        }
    }

    public static void kasoraju(int V,ArrayList<Edge> graph[]){
        // Storing In STACK (Topological)
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[graph.length];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topoSort(i,visited,s,graph);
            }
        }

        //Creating Transpose Graph
        ArrayList<Edge> transGraph[] = new ArrayList[V];

        for(int i=0;i<transGraph.length;i++){
            visited[i] = false; //Reinitialize
            transGraph[i] = new ArrayList<>();
        }

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                int src = e.src;
                int dest = e.dest;
                transGraph[dest].add(new Edge(dest,src)); //Reverse Edge
            }
        }

        //Step 3
        while(!s.isEmpty()){
            int curr = s.pop();
            if (!visited[curr]) { 
                System.out.print("SCC: ");
                DFS(curr, transGraph, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V=5;
        //Initialization
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        kasoraju(V,graph);
    }
}