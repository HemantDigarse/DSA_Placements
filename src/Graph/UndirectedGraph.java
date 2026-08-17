package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class UndirectedGraph {
    public static void main(String[] args) {
        char[][] graph={{'a','b'},{'a','c'}
                ,{'b','a'},{'b','c'},{'b','d'},{'b','e'},
                {'c','a'}, {'c','b'}, {'c','d'}, {'c','e'},
                {'d','b'},{'d','c'},{'d','e'},{'d','f'},
                {'e','b'},{'e','c'},{'e','d'},{'e','f'}
        };
        HashMap<Character, ArrayList<Character>> map=new HashMap<>();
        for(char[] edge:graph){
            char u=edge[0];char v=edge[1];
            map.put(u,map.getOrDefault(u,new ArrayList<>()));
            map.get(u).add(v);
        }
        System.out.println(map);
    }
}
