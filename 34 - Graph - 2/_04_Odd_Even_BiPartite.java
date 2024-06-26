import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _04_Odd_Even_BiPartite {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

        // Method to detect cycles and find their lengths
        public static void findAllCycles(ArrayList<Edge>[] graph) {
            boolean[] visited = new boolean[graph.length];
            ArrayList<Integer> path = new ArrayList<>();
            ArrayList<Integer> cycleLengths = new ArrayList<>();
    
            for (int i = 0; i < graph.length; i++) {
                if (!visited[i]) {
                    findCyclesUtil(graph, i, -1, visited, path, cycleLengths);
                }
            }
    
            if (cycleLengths.isEmpty()) {
                System.out.println("No cycles found.");
            } else {
                System.out.println("Cycle lengths: " + cycleLengths);
            }
        }
    
        // Util method to find cycles and their lengths
        private static void findCyclesUtil(ArrayList<Edge>[] graph, int curr, int parent, boolean[] visited, ArrayList<Integer> path, ArrayList<Integer> cycleLengths) {
            visited[curr] = true;
            path.add(curr);
    
            for (Edge edge : graph[curr]) {
                int neighbor = edge.dest;
    
                if (!visited[neighbor]) {
                    findCyclesUtil(graph, neighbor, curr, visited, path, cycleLengths);
                } else if (neighbor != parent) {
                    // Found a cycle
                    int cycleLength = calculateCycleLength(path, neighbor);
                    cycleLengths.add(cycleLength);
                }
            }
            path.remove(path.size() - 1);
        }
    
        // Calculate the length of the cycle
        private static int calculateCycleLength(ArrayList<Integer> path, int cycleStart) {
            int cycleLength = 0;
            for (int i = path.size() - 1; i >= 0; i--) {
                cycleLength++;
                if (path.get(i) == cycleStart) {
                    break;
                }
            }
            return cycleLength;
        }

    public static void main(String[] args) {
            /* 
             *          (1)-------------(3)
             *         /                 |  
             *       /                   |    
             *     /                     |      
             *   (0)                     |    
             *     \                     |      
             *       \                   |    
             *         \                 |  
             *          (2)-------------(4)
             */
    
            //Initialization
            int V = 7;
            ArrayList<Edge> graph[] = new ArrayList[V];
    
            for (int i = 0; i < V; i++) {
                graph[i] = new ArrayList<>();
            }
    
            //Adding Vertices
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
    
            graph[1].add(new Edge(1, 3, 1));
    
            graph[2].add(new Edge(2, 4, 1));
    
            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
    
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
    
    
            findAllCycles(graph);
        }
}