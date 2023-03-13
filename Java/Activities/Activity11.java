package Acivities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Blue");
        hash_map.put(4,"White");
        hash_map.put(5,"Black");
        System.out.printf("the original map:" +  hash_map);
        hash_map.remove(4);
        System.out.printf("after removing white:" + hash_map);
        if (hash_map.containsValue("Green")){
            System.out.printf("Green exits in the map");
        }else{
            System.out.printf("Green does not exists in the map");
            System.out.printf("Number of pairs in the map is:" + hash_map.size());
        }
    }
}
