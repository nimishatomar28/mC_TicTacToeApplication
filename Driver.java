package com.company.tictactoe;
import com.company.tictactoe.model.*;

public class Driver {

    public static void main(String[] args) {
	    int size = 3;
        int numMoves = 0;
        MoveType[][] boardMatrix = new MoveType[size][size];
        User user1,user2,user;
        boolean evenTurn = true;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                boardMatrix[i][j] = MoveType.E;
            }
        }

        Board board = new Board(3,boardMatrix);
        MoveManager moveManager = new MoveManager();

        moveManager.printBoard(size,boardMatrix);

        String input1 = "X Gaurav\n" +
                "O Sagar\n";

        String lines1[] = input1.split("\n");
        String commands1[] = lines1[0].split(" ");
        user1 = new User(commands1[1],MoveType.valueOf(commands1[0]));
        String commands2[] = lines1[1].split(" ");
        user2 = new User(commands2[1],MoveType.valueOf(commands2[0]));

         String input = "exit";

        String lines[] = input.split("\n");

        for(String line: lines)
        {
            String commands[] = line.split(" ");
            String commandType;
            boolean win;
            //User user,user1,user2;
            if(numMoves == (size*size))
            {
                System.out.println("Game Over");
                break;
            }
            if(commands[0] == "exit")
                break;

                if(evenTurn)
                {
                    if((boardMatrix[(Integer.parseInt(commands[0]))-1][(Integer.parseInt(commands[1]))-1]) == MoveType.E)
                    {
                        boardMatrix[(Integer.parseInt(commands[0]))-1][(Integer.parseInt(commands[1]))-1] = MoveType.X;
                        evenTurn = false;
                        numMoves++;
                        moveManager.printBoard(size,boardMatrix);
                        win = moveManager.checkCurrentGameStatus(user1,size,boardMatrix);

                        if(win)
                            break;
                    }
                    else
                    {
                        System.out.println("Invalid move");
                        continue;
                    }
                }
                else
                {
                    if((boardMatrix[(Integer.parseInt(commands[0]))-1][(Integer.parseInt(commands[1]))-1]) == MoveType.E)
                    {
                        boardMatrix[(Integer.parseInt(commands[0]))-1][(Integer.parseInt(commands[1]))-1] = MoveType.O;
                        evenTurn = true;
                        numMoves++;
                        moveManager.printBoard(size,boardMatrix);
                        win = moveManager.checkCurrentGameStatus(user2,size,boardMatrix);

                        if(win)
                            break;
                    }
                    else
                    {
                        System.out.println("Invalid move");
                        continue;
                    }
                }
        }


    }
}
