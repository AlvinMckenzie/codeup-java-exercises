package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Students students1 = new Students("Tom", new ArrayList<>());
        Students students2 = new Students("Dick", new ArrayList<>());
        Students students3 = new Students("Harry", new ArrayList<>());
        students1.addGrade(50);
        students1.addGrade(60);
        students1.addGrade(45);
        students2.addGrade(67);
        students2.addGrade(60);
        students2.addGrade(67);
        students3.addGrade(50);
        students3.addGrade(87);
        students3.addGrade(60);
        System.out.println(students3.getGradeAverage());
        System.out.println(students2.getGradeAverage());
        System.out.println(students1.getGradeAverage());

    }
}