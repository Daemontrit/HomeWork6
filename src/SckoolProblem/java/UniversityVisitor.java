package SckoolProblem.java;

abstract public class UniversityVisitor {
    public String firstName;
    public String LastName;

    public UniversityVisitor(String firstName,String lastName) {
        this.firstName = firstName;
        this.LastName= lastName;
    }


   abstract public void spisokUniversityVisitor(Object object);
}
