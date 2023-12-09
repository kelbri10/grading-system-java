# Grading System

The Grading System application allows teachers to manage their students' grades. 

## Diving Deeper 
The ```Scanner``` class from the ```java.utils``` package was an important part of this application. 
The teacher is walked through a series of questions in order to determine what student and class they would like to edit.

```
    Scanner editGradeInput = new Scanner(System.in);
    System.out.println("Enter the grade you'd like to change it to:");
    char gradeToEdit = editGradeInput.next().charAt(0);
```
In order to get the character entered, I used the above code block to read the first (and should be only) character on the next line.
The grades and schedule arrays share the same index, meaning that if Math is located at the 0 index then the grade associated with it in the grades array is also the 0 index. 
This means I could use the following code: 
```
    for(int i = 0; i < s.schedule.length; i++){
        if(s.schedule[i].equals(classToEdit)){
            s.grades[i] = gradeToEdit;
        }
    }
```
Using a for-loop, I iterate through the chosen student's schedule to find the class and once found, reassign it to the teacher's grade input. 
When the teacher goes to view the student and their grades, it shows the updated grade. 