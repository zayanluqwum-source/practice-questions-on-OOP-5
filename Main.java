//abstract class-provides the outline for all the other classes
abstract class Student{
    //encaplsulation - making methods and variables private
    private String name;
    private int age;
    //constructor - assinggs values to a classs
    public Student(String name, int age){
        this.name=name;
        this.age=age; //assing the variables to the class
    }
    //geters(get method) - gives access to the private variables
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //absract method
    abstract void displayCourse();
    //method - display student details
    void displayDetails() {
        System.out.println("Student Name:" + name);
        System.out.println("Student Age:" + age);
    }
}
//INHERITANCE - The child takes on properties of a parent class 
//The keyword extends is usedd
class ITStudent extends Student{
    //constructor
    public ITStudent(String name, int age){
        super(name, age); // SUPER means the variable has been inherited
    }
    //polymorphism by accessing a private variable
    @Override //allows you to access a orivate class
    void displayCourse(){
        System.out.println("Course:Infromation Technology");
    }
}
//main class - execute the entire code
public class Main {
    public static void main(String[] args) {
        //object - execute the classes
        ITStudent s1 = new ITStudent("Zayan Luqman", 13);
        // display student details
        s1.displayDetails();
        s1.displayCourse();
        //blank line
        System.out.println();
    }
}