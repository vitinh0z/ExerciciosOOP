package Construtores.ConstrutoresEncadeados;

public class Student {

   
    private String studentName;
     private int studentID;
    private String grade;


    public Student () {
        this("Desconhecido");
    }

    public Student (String studentName){
        this(studentName, 10787);
    }


    public Student (String studentName, int studentiD){
        this(studentName, studentiD, "Matematica | Ingles | Informatica");
    } 

    public Student (String studentName, int studentID, String grade){
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;

    }
    
    public String getStudentName (){
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String toString (){
        return " Nome: " + getStudentName() + " ID: " + getStudentID() + " Grade: " + getGrade();
    }

    
    
    
}
