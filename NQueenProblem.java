class NQueenProblem
{
   int n;
   int board[][];


   NQueenProblem(int n)
    {
        this.n=n;
        board=new int[n][n];
    }


   public void displayBoard()
   {
      for(int i=0;i<n;i++)
         {

           for(int j=0;j<n;j++)     
              {
                    
                  if(board[i][j]==1)
                  System.out.print(" Q ");
                  else
                  System.out.print(" _ ");
               


              }
 System.out.println();


        }

   }

  public void solveNQueens()
   {
      if(placeQueens(0))
        this.displayBoard();
      else
        System.out.println("Sol do not Exist");


   }
    
  public boolean placeQueens(int column)
  {
     
   if(column>=n)
     return true;

    for(int row=0;row<n;row++)
    {
         if(isSafe(row,column))
          {
             board[row][column]=1;

             if(placeQueens(column+1))
                return true;


            board[row][column]=0;


          }

    }
return false;

  }


  public boolean isSafe(int row, int column)
   {
      for(int i=0;i<column;i++)
      {
           if(board[row][i]==1)
            return false;


      }

      for(int i=row, j=column; i>=0 && j>=0 ;i-- ,j--)
      {
           if(board[i][j]==1)
            return false;


      }
      for(int i=row, j=column; i<n && j>=0 ;i++ ,j--)
      {
           if(board[i][j]==1)
            return false;
       }



return true;
   }


  public static void main(String args[])
   {
      int n=4;
      NQueenProblem obj=new NQueenProblem(n);
      obj.solveNQueens();
     // obj.displayBoard();
     
   }

}