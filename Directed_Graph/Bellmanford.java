package Directed_Graph;
import java.util.ArrayList;
import java.util.*;
public class Bellmanford {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    Bellmanford(int val){
        map= new HashMap<>();
        for(int i=1;i<=val;i++){
            map.put(i,new HashMap<Integer,Integer>());
        }
    }
    public void add(int e1,int e2,int cost){
        map.get(e1).put(e2,cost);
    }

    public class Pair {
        int e1;
        int e2;
        int cost;
        Pair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;

        }

    }
    public List<Pair> getAllEdges(){
        List<Pair> l = new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                int cost=map.get(e1).get(e2);
                l.add(new Pair(e1, e2, cost));
            }
        }
        return l;
    }

    public void BellmanfordAlgo(int src){
        int v= map.size();
        int [] dist = new int [v+1];
        for(int i=1;i<=v;i++){
            dist[i]=10_000_000;
        }
        dist[src]=0;

        List<Pair> ll = getAllEdges();
        for(int i=1;i<=v;i++){
            for(Pair e:ll){
                if(i==v && dist[e.e2]>dist[e.e1]+e.cost){
                    System.out.println("contains negative edge cycle");
                }
                else if(dist[e.e2]>dist[e.e1]+e.cost){
                    dist[e.e2]=dist[e.e1]+e.cost;
                }
            }
        }
        for(int i=0;i<v+1;i++){
            System.out.println(dist[i]);
        }
    }
}