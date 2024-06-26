import java.util.ArrayList;
import java.util.PriorityQueue;

public class _03_Dijkstras_Algorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int vertexValue;
        int pathDistance;

        public Pair(int vertexValue, int pathDistance) {
            this.vertexValue = vertexValue;
            this.pathDistance = pathDistance;
        }

        public int compareTo(Pair p2){
            return this.pathDistance - p2.pathDistance;
        }
    }

    public static void DjikstraAlgo(ArrayList<Edge> graph[],int src){
        //For Visited
        boolean Visited[] = new boolean[graph.length];
        //Storing ALl Distance
        int allDis[] = new int[graph.length];

        //Initializing Distance
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                allDis[i] = Integer.MAX_VALUE;
            }
        }

        //Creating A PQ Which Will Store Info Based On Min Distance
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            System.out.print(curr.vertexValue + " :  " + curr.pathDistance);
            System.out.println();

            if(!Visited[curr.vertexValue]){
                //Neighbours
                for(int i=0;i<graph[curr.vertexValue].size();i++){
                    Edge e =graph[curr.vertexValue].get(i);
                    int u = e.src; //Current Node
                    int v = e.dest; //Neighbour

                    //Updating Distance
                    if(allDis[u] + e.wt < allDis[v]){
                        allDis[v] = allDis[u] + e.wt ;
                        pq.add(new Pair(v, allDis[v]));
                    }
                }
            }
        }

        for(int i=0;i<graph.length;i++){
            System.out.print(allDis[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Initialization
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1, 2,1));
        graph[1].add(new Edge(1, 3,7));

        graph[2].add(new Edge(2, 4,3));

        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));

        DjikstraAlgo(graph,0);
    }
}
