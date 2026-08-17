package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class allPosiblePathOfUndirectedGraph {
    public static void main(String[] args) {
        char[][] graph={{'a','b'},{'a','c'}
                ,{'b','a'},{'b','c'},{'b','d'},{'b','e'},
                {'c','a'}, {'c','b'}, {'c','d'}, {'c','e'},
                {'d','b'},{'d','c'},{'d','e'},{'d','f'},
                {'e','b'},{'e','c'},{'e','d'},{'e','f'}
        };
        HashSet<Character> vis=new HashSet<>();
        HashMap<Character, ArrayList<Character>> map=new HashMap<>();
        for(char[] edge:graph){
            char u=edge[0];char v=edge[1];
            map.put(u,map.getOrDefault(u,new ArrayList<>()));
            map.get(u).add(v);
        }

        dfs('a',map,'f',""+'a',vis);
    }
    public static void dfs(char src,HashMap<Character,ArrayList<Character>>map,char des,String s,HashSet<Character> vis){
        vis.add(src);
        if(src==des){
            System.out.println(s);
            return;
        }
        ArrayList<Character> list=map.get(src);
        for(char chr:list){
            if(!(vis.contains(chr))){
                dfs(chr,map,des,s+"-->"+chr,vis);
                vis.remove(chr);
            }
        }
    }

}
