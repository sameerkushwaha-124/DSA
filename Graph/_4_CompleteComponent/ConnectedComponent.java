package Graph._4_CompleteComponent;
import java.util.*;
public class ConnectedComponent {
    public static int countCompleteComponents(int n, int[][] edges) {
        // i know this is disconnected graph.. so i will use visited
        // array to traverse each of the following of the graph
        int visited[] = new int[n];


        //you have given edges then you need to create graph.
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            graph.put(i,new ArrayList<>());
        }
        for(int edge[] : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // successfully created graph now i will try to
        // traverse each of the following starting node
        int count = 0;
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == 0){
                List<Integer> component = new ArrayList<>();
                dfs(graph,i,visited,component);

                if(isCompleteComponent(component, graph)){
                    count++;
                }
            }
        }
        return count;
    }
    // DFS to find all nodes in the component
    // you can use recursion as well as stack
    private static void dfs(Map<Integer, List<Integer>> graph, int src, int[] visited,
                     List<Integer> component) {
        visited[src] = 1;
        component.add(src);

        for (int nbr : graph.get(src)) {
            if (visited[nbr] == 0) {
                dfs(graph, nbr, visited, component);
            }
        }
    }

    // Check if the given component is complete
    private static boolean isCompleteComponent(List<Integer> component, Map<Integer, List<Integer>> graph) {
        int size = component.size();
        int expectedEdges = size * (size - 1) / 2;

        int actualEdges = 0;
        for (int node : component) {
            for (int neighbor : graph.get(node)){
                if (component.contains(neighbor)){
                    actualEdges++;
                }
            }
        }

        actualEdges /= 2;
        return actualEdges == expectedEdges;
    }

    public static void main(String[] args) {
        int n = 6;
        int [][]edges = {{0,1},{0,2}, {1,2},{3,4},{3,5}};
        countCompleteComponents(n,edges);
    }
}
