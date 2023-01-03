package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplications {

    public static void getGrades() {
        HashMap<String, Students> students = new HashMap<>();
        Students students1 = new Students("Tom", new ArrayList<>());
        Students students2 = new Students("Derik", new ArrayList<>());
        Students students3 = new Students("Winston", new ArrayList<>());
        Students students4 = new Students("Harry", new ArrayList<>());
        students1.addGrade(50);
        students1.addGrade(60);
        students1.addGrade(45);
        students2.addGrade(67);
        students2.addGrade(60);
        students2.addGrade(67);
        students3.addGrade(50);
        students3.addGrade(87);
        students3.addGrade(60);
        students4.addGrade(50);
        students4.addGrade(87);
        students4.addGrade(60);
        students.put("Pam", students1);
        students.put("Tommy", students2);
        students.put("Cole", students3);
        students.put("Genna", students4);
        System.out.println("Welcome! \n\nHere are the Github usernames for our students: \n");
        students.entrySet().stream().forEach(x -> System.out.printf("| %s | ", x.getKey()));
        System.out.println("\n\nWhat Student would you like information on?");
        Input input = new Input(new Scanner(System.in));
        String userInput = input.getString();
        if (userInput.equalsIgnoreCase("Pam")) {
            System.out.println("Name: " + students.get("Pam").getName() + " - Github Username: Pam \nGrade Average: " + students.get("Pam").getGradeAverage() + "\n");
        } else if (userInput.equalsIgnoreCase("Tommy")) {
            System.out.println("Name: " + students.get("Tommy").getName() + " - Github Username: Tommy \nGrade Average: " + students.get("Tommy").getGradeAverage() + "\n");
        } else if (userInput.equalsIgnoreCase("Cole")) {
            System.out.println("Name: " + students.get("Cole").getName() + " - Github Username: Cole \nGrade Average: " + students.get("Cole").getGradeAverage() + "\n");
        } else if (userInput.equalsIgnoreCase("Genna")) {
            System.out.println("Name: " + students.get("Genna").getName() + " - Github Username: Genna  \nGrade Average: " + students.get("Genna").getGradeAverage() + "\n");
        } else {
            System.out.println("Sorry wrong student");
        }

        boolean check = input.yesNo();
        if (check == true) {
            getGrades();
        } else {}
    }

    public static void main(String[] args) {
        getGrades();
        
    }
}
