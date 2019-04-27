package programmers.topofhannoi;

import java.util.*;

public class Solution {

	public int[][] solution(int n) {
		List <int[]> list = new LinkedList();
		hannoi(list, n, 1, 3);
		
		int answer[][] = new int[list.size()][2];
		
		while(!list.isEmpty()) {
			answer[answer.length - list.size()] = list.remove(0);
		}
			
		return answer;
	}
	
	public void hannoi(List<int[]> list, int n, int start,int dest) {
		if (n == 1) {
			System.out.println(start + " -> " + dest);
			int[] answer = {start, dest};
			list.add(answer);
			
			return;
		}
	
		
		hannoi(list,n - 1, start, 6 - start - dest);
		hannoi(list,1, start, dest);
		hannoi(list,n - 1, 6 - start - dest, dest);
	}
	public static void main(String args[]) {
		new Solution().solution(3);
	}
}
