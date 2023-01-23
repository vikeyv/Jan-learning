package org.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesOfArray {
	
	public static void main(String[] args) {
		String s = "ddtttsssggga";
        Map<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(!mp.containsKey(c)) {
                mp.put(c,1);
            } else {
                mp.put(c,mp.get(c)+1);
            }
            }
            System.out.println(mp);
		
	}
}
