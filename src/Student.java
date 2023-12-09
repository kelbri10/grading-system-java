import java.util.Arrays;
import java.util.Scanner;

public class Student {
    //goal is to create a grading system that allows you to update a students grade by class
    String name;

    String[] schedule;
    char[] grades; //where the index of the grade corresponds with the index of the class

    public Student(String name, String[] schedule, char[] grades){
        this.name = name;
        this.schedule = schedule;
        this.grades = grades;
    }

    public void displayAllInfo(){
        int i = 0;
        while(i < schedule.length){
            System.out.println(schedule[i]);
            System.out.println("Current Grade: " + grades[i]);
            i++;
        }

    }



    public static void main(String[] args) {

        Student lisa = new Student("Lisa", new String[]{"Math", "Reading", "Science"}, new char[]{'A', 'C', 'C'});
        Student matthew = new Student("Matthew", new String[]{"Social Studies", "Spanish"}, new char[]{'A', 'A'});
        Student garrett = new Student("Garrett", new String[]{"Math", "Reading"}, new char[]{'A', 'B'});

        Student[] allStudents = {lisa, matthew, garrett};
        boolean isViewing = true;

        while(isViewing){
            System.out.println("Hello Teacher. Here are a list of students in your class.");
            for(Student s : allStudents){
                System.out.println(s.name);
            }
            System.out.println("Which student would you like to view? Type their name below.");

            Scanner teacherInput = new Scanner(System.in);
            String studentToView = teacherInput.nextLine();

            for(Student s : allStudents){
                if(s.name.equalsIgnoreCase(studentToView)){
                    s.displayAllInfo();

                    System.out.println("Would you like to edit this student's grade? Type Yes or No.");
                    Scanner toEdit = new Scanner(System.in);
                    String edit = toEdit.nextLine();

                    if(edit.equalsIgnoreCase("yes")){
                        System.out.println("Type the class you would like to edit.");
                        Scanner editInput = new Scanner(System.in);
                        String  classToEdit = editInput.nextLine();
                        Scanner editGradeInput = new Scanner(System.in);
                        System.out.println("Enter the grade you'd like to change it to:");
                        char gradeToEdit = editGradeInput.next().charAt(0);
                        for(int i = 0; i < s.schedule.length; i++){
                            if(s.schedule[i].equals(classToEdit)){
                                s.grades[i] = gradeToEdit;
                            }
                        }
                        System.out.println("The Grade was updated successfully.");
                        System.out.println(Arrays.toString(s.grades));
                        System.out.println(Arrays.toString(s.schedule));

                    } else{
                        isViewing = false;
                    }
                }
            }
        }



    }
}