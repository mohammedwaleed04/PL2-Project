/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms;

/**
 *
 * @author Mohammed
 */
public class Teacher {
    private String name, email, password, gender;
    public Teacher(String n, String e, String p, String g){
        name = n;
        email = e;
        password = p;
        gender = g;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getGender(){
        return gender;
    }
}
