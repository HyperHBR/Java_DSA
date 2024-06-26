import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Second Pahela Puro Karvo Pade

class _011_Practice {
    public static class Edge{
        int src;
        int dest;

        public Edge(int dest,int src){
            this.dest = dest;
            this.src = src;
        }
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            graph[src].add(new Edge(dest,src));
        }

        return TopologicalSortBFS(graph);
    }

    public static int[] TopologicalSortBFS(ArrayList<Edge> graph[]){
        int inDegree[] = new int[graph.length];
        int currIdx = 0;
        int Arr[] = new int[graph.length];

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
            Arr[currIdx++] = curr;
            
            inDegree[curr] = -1;
            
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;

                if(inDegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }

        return Arr;
    }


    public static void main(String[] args) {
        int[][] prerequisites = {{1,0}};

        int Arr[] = findOrder(2,prerequisites);
        
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
}