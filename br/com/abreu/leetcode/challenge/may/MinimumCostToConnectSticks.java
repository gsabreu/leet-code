package br.com.abreu.leetcode.challenge.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumCostToConnectSticks {
    
    public static void main(String[] args) {
	
	int[] sticks = {3354,4316,3259,4904,4598,474,3166,6322,8080,9009};
	System.out.println(connectSticks(sticks));
	
    }
    
    public static int connectSticks(int[] sticks) {
	int sum = 0;
	
	if (sticks == null || sticks.length <= 1) {
	    return sum;
	}
	
	List<Integer> listAux = new ArrayList<>(sticks.length);
	Arrays.sort(sticks);
	
	for (int i = 0; i < sticks.length; i++) {
	    if (sum == 0) {
		sum  = sticks[i] + sticks[i +1];
		listAux.add(sum);
		i++;
	    }
	    else {
		sum = sum + sticks[i];
		listAux.add(sum);
	    }
	    
	}
	
	return listAux.stream().mapToInt(Integer:: intValue).sum();
	
    }

}
