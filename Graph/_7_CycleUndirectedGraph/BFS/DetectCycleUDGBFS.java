package Graph._7_CycleUndirectedGraph.BFS;
import java.util.*;

public class DetectCycleUDGBFS {
    static class Pair {
        int node;
        int parent;
        Pair(int node, int parent) {
            this.parent = parent;
            this.node = node;
        }
    }

    public static void cycleDetect(int[][] adjList, int v) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph from adjacency list
        for (int i = 0; i < adjList.length; i++) {
            for (int j : adjList[i]) {
                // To avoid duplicate edges, we can add only when i < j
                // But since we're using adjacency list, duplicates won't affect correctness
                graph.get(i).add(j);
                graph.get(j).add(i);
            }
        }

        if (BFS(graph, v)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
    }

    public static boolean BFS(List<List<Integer>> graph, int v) {
        int[] visited = new int[v];

        for (int i = 0; i < v ; i++) {
            if (visited[i] == 0) {
                if (bfsCycleCheck(graph, i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean bfsCycleCheck(List<List<Integer>> graph, int start, int[] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,-1));
        while(!q.isEmpty()){
            Pair p = q.remove();
            int parent = p.parent;
            int node = p.node;

            visited[node] = 1;
            for(int nbr : graph.get(node)){
                if(nbr != parent){
                    if(visited[nbr] != 1){
                        q.add(new Pair(nbr,node));
                    }else{
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // Test case 1: Graph with cycle
        int[][] grid1 = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}};
        cycleDetect(grid1, 5);  // Should print "Cycle detected"

        // Test case 2: Graph without cycle
        int[][] grid2 = {{}, {2}, {1,3}, {2}};
        cycleDetect(grid2, 4);  // Should print "No cycle detected"
    }
}