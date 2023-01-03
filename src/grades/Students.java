package grades;

import java.util.ArrayList;

public class Students {

    private String name;
    private ArrayList<Integer> grades;

    public Students(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }


    // returns the student's name
    public String getName() {
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    };

    public double getGrades() {

        for(int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
        return 0;
    };
    public static void main(String[] args) {
        Students matt = new Students("Martin", new ArrayList<>());
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(90);
        matt.getGrades();
        System.out.println(matt.getGradeAverage());
    }
}