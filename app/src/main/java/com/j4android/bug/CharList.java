package com.j4android.bug;

import java.io.Serializable;

public class CharList implements Serializable {
    private String num;
    private String name;
    private int src;

    public CharList(String num, String name, int src) {
        this.num = num;
        this.name = name;
        this.src = src;
    }

    @Override
    public String toString() {
        return "CharList{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", src=" + src +
                '}';
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getSrc() {
        return src;
    }
}
