package Graph._2_PathBetweenTwoVertices;
import java.util.*;

public class PathExistOrNot {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // pahli baat is question me edges given hain toh graph banani hogi.. (best practice)
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int  i = 0 ; i < n; i++){
            graph.put(i,new ArrayList<>());
        }
        for(int edge[] : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return hasPath(graph, source, destination, new HashSet<>());
    }

    public boolean hasPath(HashMap<Integer,List<Integer>> graph, int src, int dest, HashSet<Integer> visited) {
        if (src == dest) {
            return true;
        }

        visited.add(src);

        for (int nbrs : graph.get(src)) {
            if (!visited.contains(nbrs)) {
                boolean bool = hasPath(graph, nbrs, dest, visited);
                if (bool) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        int [][]edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int source = 0, destination = 5;

        PathExistOrNot obj = new PathExistOrNot();
        System.out.println(obj.validPath(n,edges,source,destination));
    }
}
