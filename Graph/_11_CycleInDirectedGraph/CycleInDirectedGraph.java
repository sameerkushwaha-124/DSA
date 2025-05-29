package Graph._11_CycleInDirectedGraph;
import java.util.*;
// iterative will become more difficult because of backtracking.
// so that we use recursive approach to backtrack.

public class CycleInDirectedGraph {

    public boolean isCyclic(ArrayList<ArrayList<Integer>> graph) {
        int n = graph.size();
        int[] visited = new int[n];
        int[] path_visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                if (DFS(graph, i, visited, path_visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean DFS(ArrayList<ArrayList<Integer>> graph, int node, int[] visited, int[] path_visited) {

        visited[node] = 1;
        path_visited[node] = 1;

        for (int nbr : graph.get(node)) {
            if (visited[nbr] == 0) {
                if (DFS(graph, nbr, visited, path_visited)) {
                    return true;
                }
                
            } else if (path_visited[nbr] == 1) {
                return true;
            }
        }

        path_visited[node] = 0; // Backtrack
        return false;
    }
}



