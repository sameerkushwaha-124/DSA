package Graph._1_Basics;
import java.util.*;
public class BasicImpOfGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> AL , int u , int v){
        AL.get(u).add(v);
        AL.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 4;
        //create Adjacency List
        ArrayList<ArrayList<Integer>> AL = new ArrayList<>(V);


        for(int i=0 ; i<V ; i++){
            AL.add(new ArrayList<Integer>());
        }


        //Add edges
        addEdge(AL,0,1);
        addEdge(AL,0,2);
        addEdge(AL,1,3);
        addEdge(AL,2,3);


        System.out.println(AL);
    }

}
