import java.util.ArrayList;

public class _02_BellManFord_Storing_Edges{
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

    public static void bellManFord(ArrayList<Edge> graph,int src,int Vertices){
        int allDis[] = new int[Vertices];

        for(int i=0;i<allDis.length;i++){
            if(src!=i){
                allDis[i] = Integer.MAX_VALUE;
            }
        }

        int V = Vertices;

        //Algorithm - O(V*E)
        for(int i=0;i<V-1;i++){ //O(V)
            //O(E) - All Edges
            for(int j=0;j<V;j++){
                    Edge e = graph.get(j);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    //Relaxation
                    if(allDis[u]!=Integer.MAX_VALUE  && allDis[u] + wt < allDis[v]){
                        allDis[v] = allDis[u] + wt;
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
        ArrayList<Edge> graph = new ArrayList<>();

        //Creating Graph
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));

        //BellMan Ford
        bellManFord(graph,0,V);
    }
}