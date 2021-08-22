package SckoolProblem.java;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println( pullName("Студенты"));


    }

    public static ArrayList pullName(String who) {
        ArrayList<String>end= new ArrayList<>();
        end.add("Попробуй еще раз");
        ArrayList<Student> studentiki = new ArrayList();
        studentiki.add(new Student("Sacha", "Bokaev"));
        studentiki.add(new Student("Dacha", "Dobro"));
        studentiki.add(new Student("Macha", "Dobro"));
        studentiki.add(new Student("Mage", "80LVL"));
        studentiki.add(new Student("Assasin", "80LVL"));
        studentiki.add(new Student("Paladin", "80LVL"));
        Student.pullStudent(studentiki);

        ArrayList<Employee> workers = new ArrayList();
        workers.add(new Employee("Witcher", "From Rivia"));
        workers.add(new Employee("Goad", "Earth"));
        workers.add(new Employee("Demiurhos", "University"));
        workers.add(new Employee("Archmage", "80LVL"));
        workers.add(new Employee("Kings Killer", "80LVL"));
        workers.add(new Employee("Daemon", "80LVL"));
        Employee.pullEmployee(workers);

        ArrayList<Object> fullList = new ArrayList<>();
        fullList.addAll(studentiki);
        fullList.addAll(workers);

        if (who.equals("Студенты")){
            return studentiki;
        }
        else if (who.equals("Работники")){
            return workers;
        }
        else if (who.equals("Все")){
            return fullList;
        }
        else
            return end;
    }
}