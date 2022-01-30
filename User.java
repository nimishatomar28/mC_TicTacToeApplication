package com.company.tictactoe.model;

public class User {
    private String userName;
    private MoveType moveTypeCharacter;

    public User(String userName, MoveType moveTypeCharacter)
    {
        this.userName          = userName;
        this.moveTypeCharacter = moveTypeCharacter;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MoveType getMoveTypeCharacter()
    {
        return moveTypeCharacter;
    }

    public void setMoveTypeCharacter(MoveType moveTypeCharacter) {
        this.moveTypeCharacter = moveTypeCharacter;
    }
}
