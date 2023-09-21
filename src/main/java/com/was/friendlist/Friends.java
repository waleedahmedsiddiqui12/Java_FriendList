package com.was.friendlist;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Friends {

    private String _name;
    private String _profession;
    private int _age;


    public Friends(String name,String profession, int age)
    {


        this._name = name;
        this._profession = profession;
        this._age = age;
    }
    public String getName()
    {
        return this._name;
    }

}
