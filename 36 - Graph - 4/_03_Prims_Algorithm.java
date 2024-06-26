import java.util.ArrayList;
import java.util.PriorityQueue;

public class _03_Prims_Algorithm{
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

    public static class Pair implements Comparable<Pair>{
        int idx;
        int disn;
        int parent;

        public Pair(int idx, int disn,int parent) {
            this.idx = idx;
            this.disn = disn;
            this.parent = parent;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.disn - p2.disn;
        }
    }

    public static void primsAlgorithm(ArrayList<Edge> graph[],int src){
        int Cost = 0;
        int V = graph.length;
        boolean Visited[] = new boolean[graph.length];
        ArrayList<Edge> selectedEdges = new ArrayList<>();

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0,-1));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!Visited[curr.idx]){
                Visited[curr.idx] = true;
                Cost += curr.disn;

                if(curr.parent!=-1){
                    selectedEdges.add(new Edge(curr.parent,curr.idx,curr.disn));
                }

                for(int i=0;i<graph[curr.idx].size();i++){
                    Edge e = graph[curr.idx].get(i);
                    pq.add(new Pair(e.dest, e.wt,curr.idx));
                }
            }
        }

        System.out.println("Cost OF MST : " + Cost);
        for(int i=0;i<selectedEdges.size();i++){
            Edge e = selectedEdges.get(i);
            System.out.println(e.src + "--->" + e.dest + " : " + e.wt);
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));


        //Prims Algorithm
        primsAlgorithm(graph,0);
    }
}