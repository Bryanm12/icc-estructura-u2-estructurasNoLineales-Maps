package controllers;

import java.util.HashMap;

public class Ejercicios {
    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length()){
     return false;
     }
     HashMap<Character, Integer> anagrama1 = new HashMap<>();

     for(char c: str1.toCharArray()){
        anagrama1.put(c, anagrama1.getOrDefault(c, 0)+1);
     }

     for(char c: str2.toCharArray()){
        if(!anagrama1.containsKey(c) || anagrama1.get(c)==0){
            return false;
        }
        anagrama1.put(c, anagrama1.get(c)-1);
     }

     for(int count : anagrama1.values()){
        if(count != 0){
            return false;
        }
     }
     return true;
    }

    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> suma = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = objetivo-nums[i];

            if(suma.containsKey(comp)){
                return new int[]{suma.get(comp),i};
            }
            suma.put(nums[i], i);
        }
        return new int[0];
    }
}
