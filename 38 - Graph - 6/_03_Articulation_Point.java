import java.util.*;

public class _03_Articulation_Point{
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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        
        graph[4].add(new Edge(4, 3));
    }

    public static void dfs( int vertices,ArrayList<Edge> graph[],int curr,int par,int dt[],int lt[],boolean visited[],int time,boolean ap[]){
        visited[curr] = true;
        dt[curr] = lt[curr] = ++time;
        int children = 0;//No Of Diconnected Childrens

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if(neigh == par){
                continue;
            }
            else if(visited[neigh]){
                lt[curr] = Math.min(lt[curr], dt[neigh]);
            }
            else if(!visited[neigh]){
                dfs(vertices, graph, neigh, curr, dt, lt, visited, time,ap);
                lt[curr] = Math.min(lt[curr], lt[neigh]);

                if(par!=-1 && dt[curr]<=lt[neigh]){
                    ap[curr] = true;
                }
                children++;
            }
        }

        if(par==-1 && children>1){
            ap[curr] = true;
        }
    }

    public static void tarjanArticulation(int V,ArrayList<Edge> graph[]){
        int dt[] = new int[V];
        int lt[] = new int[V];
        boolean visited[] = new boolean[V];
        boolean ap[] = new boolean[V];
        int time = 0;

        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(V,graph,i,-1,dt,lt,visited,time,ap);;
            }
        }

        for(int i=0;i<V;i++){
            if(ap[i]){
                System.out.println("AP : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int V=6;
        //Initialization
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        tarjanArticulation(V,graph);

    }
}