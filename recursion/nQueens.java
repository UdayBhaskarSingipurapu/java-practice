package recursion;

import java.util.*;

public class nQueens {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board,ans,0);
        return ans;
    }
    public static void helper(char[][] board,List<List<String>> ans, int col){
        if(col==board.length){
            saveBoard(board,ans);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,ans,col+1);
                board[row][col]='.';
            }
        }
    }
    public static boolean isSafe(int row, int col, char[][] board){

        for(int r=0;r<board.length;r++){
            if(board[r][col]=='Q')
                return false;
        }
        for(int c=0;c<board[0].length;c++){
            if(board[row][c]=='Q')
                return false;
        }
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q')
                return false;
        }
        r=row;
        for(int c=col;c<board[0].length && r>=0; c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        r=row;
        for(int c=col;c>=0 && r<board.length; c--,r++){
            if(board[r][c]=='Q')
                return false;
        }
        r=row;
        for(int c=col;c<board[0].length && r<board.length; c++,r++){
             if(board[r][c]=='Q')
                return false;
        }
        return true;
    }
    
    public static void saveBoard(char[][] board,List<List<String>> ans){
        String r="";
        List<String>ansboard=new ArrayList<>();
        for (char[] board1 : board) {
            r="";
            for (int j = 0; j<board[0].length; j++) {
                if (board1[j] == 'Q') {
                    r=r+'Q';
                } else {
                    r=r+'.';
                }
            }
            ansboard.add(r);
        }
        ans.add(ansboard);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            List<List<String>> res=new ArrayList<>();
            res=solveNQueens(n);
            System.out.println(res);
            System.out.println(res.size());
        }
    }
}
