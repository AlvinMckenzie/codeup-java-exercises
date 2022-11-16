import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] persons = new Person[3];
        persons[0] = new Person("Will");
        persons[1] = new Person("Carlton");
        persons[2] = new Person("Jazz");

        Person y = new Person("Lisa");
        Person[] x  = addPerson(persons, y);

        for (int i = 0; i < x.length; i++){
            System.out.println("x[i] = " + x[i].getName());
        }

    }


    public static Person[] addPerson(Person[] arr, Person personAdd ){
        Person[] cloneArr = Arrays.copyOf(arr, arr.length+1);
        cloneArr[arr.length] = personAdd;

        return cloneArr;
    }
}
