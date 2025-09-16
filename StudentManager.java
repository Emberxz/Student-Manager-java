import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager{
    private static ArrayList<String> studentList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            choice = scnr.next();
            if (choice.equals("1")){
                addStudent(scnr);
            }
            else if (choice.equals("2")){
                displayStudentList();
            }
            else if (choice.equals("3")){
                exit();
                break;
            } else { 
                System.out.println("Invalid Input");
            }
        } while (true);
        scnr.close();
    }

        public static void addStudent(Scanner scnr){
            String name;
            System.out.println("Enter the student's name: ");
            name = scnr.next();
            studentList.add(name);
            System.out.println(name + " has been added to the student list.");
        }

        public static void displayStudentList(){
            System.out.println("Student List: ");
                for (int x = 0; x < studentList.size(); x++){
                    System.out.println(studentList.get(x));
                }
        }
        
        public static void exit(){
            System.out.println("Exiting Student Manager. Goodbye!");
        }
        public static void displayMenu() {
            System.out.println("Student Manager Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
        }
}
