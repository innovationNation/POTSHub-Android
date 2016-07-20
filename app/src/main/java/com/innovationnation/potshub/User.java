package com.innovationnation.potshub;

import java.util.Date;

/**
 * Created by kisaayano on 20/07/16.
 */
public class User {
    private String name, nickname, username, potsType;
    private int y, m, d;
    private Date birthDate;

    public User(String newName, String newNickname, String newUsername, String newPotsType, Date newBDate) {
        name = newName;
        nickname = newNickname;
        username = newUsername;
        potsType = newPotsType;
        birthDate = newBDate;

    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPotsType() {
        return potsType;
    }

    public void setPotsType(String potsType) {
        this.potsType = potsType;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}
