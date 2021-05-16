import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int N = board.length;
        int answer = 0;
        
        Stack<Integer> basket = new Stack<Integer>();
        
        for(int n : moves) {
            for(int i = 0; i < N; i++) {
                int top = board[i][n-1];

                // 맨 위에 위치한 인형 확인됐을 경우 
                if(top != 0) {
                    // 꺼낸 인형 자리 0 표시
                    board[i][n-1] = 0;
                    
                    // Basket이 0

                    if(basket.peek() == top) {
                    	while(!basket.isEmpty() && basket.peek() == top) {
                    		answer += 2;
                        	top = basket.pop();           
                    	}
                    } else {
                        basket.push(top);
                    }
                    break;
                }
            }            
        }
    

        return answer;
    }
}
