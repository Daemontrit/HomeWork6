package SckoolProblem.java;

import java.util.ArrayList;

public class Student extends UniversityVisitor{
public  int count=0;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);

    }
    public static ArrayList pullStudent(ArrayList stud){
        return stud;
    }

    @Override
    public void spisokUniversityVisitor(Object object) {

    }


    @Override
    public String toString() {
        return "Student" + " "+ '\'' + firstName + '\'' + LastName + '\'' ;
    }
}
