package com.company.tictactoe;

import com.company.tictactoe.model.*;

public class MoveManager {

    public MoveManager()
    {

    }

    public boolean checkCurrentGameStatus(User userTurn, int size, MoveType[][] board)
    {
        boolean win = false;
        int i,j,countX = 0,countO = 0;
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if((i==j) && (board[i][j] == MoveType.X))
                {
                    countX++;
                }
                else if((i==j) && (board[i][j] == MoveType.O))
                {
                    countO++;
                }
            }
        }
        if(countX == size)
        {
            System.out.println(userTurn.getUserName()+" won the game");
            return true;
        }
        else if(countO == size)
        {
            System.out.println(userTurn.getUserName()+" won the game");
            return false;
        }

        for(i=0;i<size;i++)
        {
            countX = 0; countO = 0;
            for(j=0;j<size;j++)
            {
                if((board[i][j] == MoveType.X))
                {
                    countX++;
                }
                else if((board[i][j] == MoveType.O))
                {
                    countO++;
                }
            }
            if(countX == size)
            {
                System.out.println(userTurn.getUserName()+" won the game");
                win = true;
                return win;
            }
            else if(countO == size)
            {
                System.out.println(userTurn.getUserName()+" won the game");
                win = true;
                return win;
            }
        }

        for(i=0;i<size;i++)
        {
            countX = 0; countO = 0;
            for(j=0;j<size;j++)
            {
                if((board[j][i] == MoveType.X))
                {
                    countX++;
                }
                else if((board[j][i] == MoveType.O))
                {
                    countO++;
                }
            }
            if(countX == size)
            {
                System.out.println(userTurn.getUserName()+" won the game");
                win = true;
                return win;
            }
            else if(countO == size)
            {
                System.out.println(userTurn.getUserName()+" won the game");
                win = true;
                return win;
            }
        }
        return win;
    }

    public void printBoard(int size, MoveType[][] board)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
