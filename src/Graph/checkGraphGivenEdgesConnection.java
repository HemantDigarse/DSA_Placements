package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class checkGraphGivenEdgesConnection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] graph={{'a','b'},{'a','c'}
                ,{'b','a'},{'b','c'},{'b','d'},
                {'c','a'}, {'c','b'}, {'c','d'}, {'c','e'},
                {'d','b'},{'d','c'},{'d','e'},
                {'e','c'},{'e','d'},
                {'f','g'},{'f','h'},
                {'g','f'},{'g','h'},
                {'h','f'},{'h','g'}
        };
        HashSet<Character> vis=new HashSet<>();
        HashMap<Character, ArrayList<Character>> map=new HashMap<>();
        for(char[] edge:graph){
            char u=edge[0];char v=edge[1];
            map.put(u,map.getOrDefault(u,new ArrayList<>()));
            map.get(u).add(v);
        }
        char src=sc.next().charAt(0);
        char des=sc.next().charAt(0);
        boolean isConnected=dfs(src,des,map,vis);
        System.out.println(isConnected);
    }
    public static boolean dfs(char src, char des, HashMap<Character, ArrayList<Character>> map,HashSet<Character> vis){
        vis.add(src);
        if(src==des){
            return true;
        }
        ArrayList<Character> list=map.get(src);
        for(char nEdge:list){
            if(!vis.contains(nEdge)){
                boolean a=dfs(nEdge,des,map,vis);
                vis.remove(nEdge);
                if(a){
                    return true;
                }
            }
        }
        return false;
    }
}
