import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _01_Cheapest_Flight_With_K_Stops {
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

    public static void createGraph(int flight[][],ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<flight.length;i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    public static class Info{
        int vertexIdx;
        int cost;
        int stops;

        public Info(int vertexIdx, int cost, int stops) {
            this.vertexIdx = vertexIdx;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static int cheapestFlight(int N,int src,int dest,int k,int flight[][]){
        //Creating Graph
        ArrayList<Edge> graph[] = new ArrayList[N];
        createGraph(flight, graph);

        //Initialization
        int allDis[] = new int[N];

        for(int i=0;i<allDis.length;i++){
            if(i!=src){
                allDis[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q =new LinkedList<>();

        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();

            //More Than Required Stops
            if(curr.stops>k){
                break;
            }

            for(int i=0;i<graph[curr.vertexIdx].size();i++){
                Edge e = graph[curr.vertexIdx].get(i);

                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost + wt < allDis[v] && curr.stops<=k){ // = Because We Are Including End Too
                    allDis[v] = curr.cost + wt;
                    q.add(new Info(v,allDis[v],curr.stops+1));
                }
            }
        }

        //Destination
        if(allDis[dest] == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return allDis[dest];
        }

    }
    public static void main(String[] args) {
        //No Of Vertices
        int N = 4;

        // Vertex,Cost,No Of Stops
        int flight[][] = {  {0,1,100},
                            {1,2,100},
                            {2,0,100},
                            {1,3,600},
                            {2,3,200}};

        int src=0, dest=3, k=1;

        System.out.println(cheapestFlight(N, 0, 3, 1, flight));
    }
}
