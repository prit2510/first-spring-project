package com.example;

public class student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    public int getstudentId(int studentId){
        return studentId;
    }
    public void setstudentId(int studentId){
        this.studentId=studentId;
    }
    public String getstudentName(){
        return studentName;
    }
    public void setstudentName(String studentName){
        this.studentName=studentName;
    }
    public String getstudentAddress(){
        return studentAddress;
    }
    public void setstudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }
    public student(int studentId,String studentName,String studentAddress){
        super();
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }
    public student(){
        super();
        
    }
    @Override
    public String toString(){
        return "Student[studentId="+studentId+", studentName="+studentName+",studentAddress="+studentAddress+"]";
    }
}
