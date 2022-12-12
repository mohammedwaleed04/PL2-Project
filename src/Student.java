/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms;

/**
 *
 * @author Mohammed
 */
public class Student extends Teacher {
    private int semester;
    public Student(String n, String e, String p, String g, int s){
        super(n, e, p, g);
        semester = s;
    }
    public int getSemester(){
        return semester;
    }
}
