class Solution {
    public boolean isValidSudoku(char[][] board){
        for(int i=0;i<board.length;i++)
        {   
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')continue;
                if(map.containsKey(board[i][j]))return false;
                map.put(board[i][j],1);
            }
        }
        for(int i=0;i<board[0].length;i++)
        {   
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<board.length;j++)
            {
                if(board[j][i]=='.')continue;
                if(map.containsKey(board[j][i]))return false;
                map.put(board[j][i],1);
            }
        }
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                HashMap<Character,Integer> map=new HashMap<>();
                for(int k=i;k<i+3;k++)
                for(int l=j;l<j+3;l++)
                {
                    if(board[k][l]=='.')continue;
                    if(map.containsKey(board[k][l]))return false;
                    map.put(board[k][l],1);
                }
            }
        }
        return true;
    }
}