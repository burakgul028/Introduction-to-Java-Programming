/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author burak
 */
public class JavaLevel {
    private Student javaStudent;
    private int level;

    public JavaLevel(){
        javaStudent = new Student();
        level = 0;
    }

    public JavaLevel(Student s, int l) {
        this.javaStudent = s;
        this.level = l;
    }

    public Student getJavaStudent() {
        return this.javaStudent;
    }

    public void setJavaStudent(Student s) {
        this.javaStudent = s;
    }

    public int getLevel() {
        return this.level;
    }

    public void increaseLevel() {
        this.level++;
    }

    public String toString() {
        return this.javaStudent.getName() + " is at level: " + this.level + " in Java.";
    }
}