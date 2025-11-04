import java.util.*;

public class Student {
    private String studentId;
    private String name;
    private Map<String,Double> grades;

    public Student(String studentId, String name){
        this.studentId = studentId;
        this.name = name;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, double grade){
        grades.put(subject, grade);
    }

    public void ViewGrades(){
        System.out.println("\n Grades For"+ name + ":");
        System.out.println("-----------------------");
        if (grades.isEmpty()){
            System.out.println("No Grades Available");
            return;
        }
        for (Map.Entry<String, Double> entry : grades.entrySet()){
            System.out.println(" " + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Average " + String.format("%.2f", calculateAverage()));

    
    }
    public Double calculateAverage(){
        if(grades.isEmpty()){
            System.out.println("No Grades Available to Calculate Average");
            return 0.0;
        }
        double sum = 0.0;
        for(double grade : grades.values()){
            sum += grade;
        }
        return sum / grades.size();
    }
    public String getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    
}
