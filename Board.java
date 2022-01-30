package com.company.tictactoe.model;

public class Board {
   private int size;
   private int numMoves;
   MoveType board[][];

   public Board(int size, MoveType board[][])
   {
       this.size     = size;
       this.numMoves = 0;
       this.board    = board;
   }

   public int getSize()
   {
       return size;
   }
    public void setSize(int size) {
        this.size = size;
    }

    public int getNumMoves() {
        return numMoves;
    }

    public void setNumMoves(int numMoves) {
        this.numMoves = numMoves;
    }

    public MoveType[][] getBoard()
    {
        return board;
    }

    public void setBoard(MoveType[][] board) {
        this.board = board;
    }
}
