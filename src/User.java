package lms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class User {

    protected String name, email, gender;
    protected String password;
    
    public User(String name, String email, String password, String gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
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
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
