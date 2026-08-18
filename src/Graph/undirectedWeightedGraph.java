package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class undirectedWeightedGraph {
    public static void main(String[] args) {
        char[][] graph={{'a','b','9'},{'a','c','5'}
                ,{'b','a','4'},{'b','c','3'},{'b','d','7'},{'b','e','6'},
                {'c','a','3'}, {'c','b','4'}, {'c','d','5'}, {'c','e','8'},
                {'d','b','2'},{'d','c','3'},{'d','e','8'},{'d','f','7'},
                {'e','b','6'},{'e','c','9'},{'e','d','4'},{'e','f','5'}
        };
        HashMap<Character, ArrayList<char[]>> map=new HashMap<>();
        for(char[] edge:graph){
            char u=edge[0];char v=edge[1];char w=edge[2];
            if(map.containsKey(u)){
                map.get(u).add(new char[]{v,w});
            }
            else{
                ArrayList<char[]> list=new ArrayList<>();
                char[] c=new char[]{v,w};
                list.add(c);
                map.put(u,list);
            }
        }

    }
}
