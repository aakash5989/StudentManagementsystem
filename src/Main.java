
import java.util.*;

class Student{
    int id;
    String name;
    String course;
    Student(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    void show(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : "+ this.name);
        System.out.println("Course :" + this.course);
        System.out.println("------------------");
    }
}
class Main{
    static ArrayList<Student>students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent(){
        System.out.println("Enter Student Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        for(Student s : students){
            if(s.id == id){
                System.out.println("Student ID already Exists!");
                return;
            }
        }
        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Student Course");
        String course = sc.nextLine();

        students.add(new Student(id,name,course));
        System.out.println("Student added Successfully");
    }
    static void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Student Found");
            return;
        }
        for(Student s : students){
            s.show();
        }
    }
    static void searchStudent(){
        System.out.println("Enter Student Id to search :");
        int id = sc.nextInt();

        for(Student s : students){
            if(s.id == id){
                System.out.println("Student Found");
                s.show();
                return;

            }
        }
        System.out.println("Student Not Found!");
    }

    static void deleteStudent(){
        System.out.println("Enter Student ID to delete");
        int id = sc.nextInt();

        for(Student s : students){
            if(s.id == id){
                students.remove(s);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public static void main(String[] args){
        int choice ;
        do{
            System.out.println("\n ======= Student Management System =======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1 :
                    addStudent();
                    break;

                case 2 :
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("ThankYou for Using the System");

                default :
                    System.out.println("Invalid Choice!");
            }
        }
        while (choice != 5);
    }

}