import java.util.*;

public class _04_Kruskals_Algorithm{

    public static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge n2){
            return this.wt - n2.wt;
        }
    }

    public static int N = 7;
    public static int parent[] = new int[N]; //Leaders
    public static int rank[] = new int[N]; //Already Initialized To 0

    public static void init(){
        for(int i=0;i<N;i++){
            parent[i] = i;
        }
    }

    public static int find(int x){
        if(parent[x] == x){
            return x;
        }

        //Optimization Mate
        return parent[x] = find(parent[x]);
    }

    public static void union(int u,int v){
        //Finding Leaders 
        int x = find(u);
        int y = find(v);

        if(rank[x] == rank[y]){
            parent[y] = x;
            rank[x]++;
        }
        else if(rank[x]<rank[y]){
            parent[x] = y;
        }
        else{
            parent[y] = x;
        }
    }

    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }

    public static int kruskalsAlgo(int vertices,ArrayList<Edge> edges){
        init();
        Collections.sort(edges);
        int finalCost = 0;
        int mstVertexCount=0;

        for(int i=0;mstVertexCount<vertices-1;i++){
            Edge e = edges.get(i);

            //To Detect Cycle
            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA!=parB){
                union(e.src, e.dest);
                finalCost+=e.wt;
                mstVertexCount++;
            }
        }

        return finalCost;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        System.out.println(kruskalsAlgo(V, edges));
    }
}