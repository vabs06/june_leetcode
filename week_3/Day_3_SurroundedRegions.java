//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3363/
//  Time Complexity: O(m * n)
//  Space Complexity: O(1)

//  Solved this problem using DFS (more specific Flood-Fill Algorithm).

public void solve(char[][] board) {
    if(board.length == 0) return;
    for(int i = 0; i < board[0].length; i++){
        if(board[0][i] == 'O')
            DFS(board, 0, i);
        if(board[board.length - 1][i] == 'O')
            DFS(board, board.length - 1, i);
    }
    
    for(int i = 0; i < board.length; i++){
        if(board[i][0] == 'O')
            DFS(board, i, 0);
        if(board[i][board[0].length - 1] == 'O')
            DFS(board, i, board[0].length - 1);
    }
    
   for(int i =0; i <board.length; i++){
       for(int j =0; j <board[0].length; j++){
           if(board[i][j] == '-')
               board[i][j] = 'O';
           else if(board[i][j] == 'O')
               board[i][j] = 'X';
       }
   }
   
    return; 
}

private static void DFS(char A[][], int i, int j) {
    if(i < 0 || i >= A.length || j < 0 || j >= A[0].length || A[i][j] != 'O')
        return;
    A[i][j] = '-';
    DFS(A, i + 1, j);
    DFS(A, i - 1, j);
    DFS(A, i, j + 1);
    DFS(A, i, j - 1);
}