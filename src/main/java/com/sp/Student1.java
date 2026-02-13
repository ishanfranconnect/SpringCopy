package com.sp;

import java.util.List;
import java.util.Map;

public class Student1 {
    private int roll;
    private String name;
    private List<String> skills;
    private Map<String,String> courses;

    public void setRoll(String Roll){
        this.roll=roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSkills(List<String> skills){
        this.skills=skills;
    }
    public List<String> getSkills(){
        return skills;
    }
    public void setCourses(Map<String,String> courses){
        this.courses=courses;
    }
    public Map<String,String> getCourses(){
        return courses;
    }
    public String toString(){
        return "Stundent1 [roll="+roll+",name="+name+",skills="+skills+",courses="+courses+ "]";
    }

    public Student1(){
        super();
    }
    public Student1(int roll,String name,List<String> skills,Map<String,String> courses){
        super();
        this.roll=roll;
        this.name=name;
        this.skills=skills;
        this.courses=courses;

    }
}
