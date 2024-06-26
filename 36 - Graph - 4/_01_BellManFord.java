import java.util.ArrayList;

public class _01_BellManFord{
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

    public static void bellManFord(ArrayList<Edge> graph[],int src){
        int allDis[] = new int[graph.length];

        for(int i=0;i<allDis.length;i++){
            if(src!=i){
                allDis[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;

        //Algorithm - O(V*E)
        for(int i=0;i<V-1;i++){ //O(V)
            //O(E) - All Edges
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    //Relaxation
                    if(allDis[u]!=Integer.MAX_VALUE  && allDis[u] + wt < allDis[v]){
                        allDis[v] = allDis[u] + wt;
                    }
                }
            }
        }

        for(int i=0;i<allDis.length;i++){
            System.out.print(allDis[i] + " ");
        }
    }

    public static void main(String[] args) {

        //Initialization
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        //Creating Graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

        //BellMan Ford
        bellManFord(graph,0);
    }
}