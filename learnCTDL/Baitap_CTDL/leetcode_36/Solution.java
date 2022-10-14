class Solution {
    
    public static boolean isValid(char[][] board , int row , int col){
        Character curr = board[row][col];
        
        board[row][col]='.';
        for(int i=0 ;i<9 ;i++){
            
            if(board[i][col]==curr){
                board[row][col]= curr;
                return false;
            }
            
            if(board[row][i]==curr){
                board[row][col]= curr;
                return false;
            }
        
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == curr ){
                  board[row][col]= curr;
                  return false;
            } 
        }
        return true;
        
    }
    
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                
                if(board[i][j]=='.') continue;
                if(!isValid(board , i , j)) return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        char board [][]= {{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}