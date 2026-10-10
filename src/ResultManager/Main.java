
import java.util.*;

public class Main {

    public static void main (String[] args){

        Scanner sc =new Scanner(System.in);
        Student[] student = new Student[5];

        for(int i=0; i<student.length;i++){

            student[i]= new Student();

        }
        for(int i=0; i<student.length; i++){

            System.out.println("\nEnter information for practice1.Student "+(i+1));

            System.out.print("ID: ");
            student[i].id=sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            student[i].name=sc.nextLine();

            System.out.print("Marks: ");
            student[i].marks=sc.nextDouble();

            sc.nextLine();

        }
        System.out.println("\n===== practice1.Student Information =====");
        for(int i=0; i<student.length; i++){
            student[i].display();

        }

        Student h = student[0];
        for(int i=0; i<student.length;i++){

            if(student[i].marks>h.marks){

                h=student[i];


            }

        }
        System.out.println("\nHighest marks : "+h.marks);

        System.out.println("\n===== Top practice1.Student =====");
        h.display();


        double total = 0;
        for(int i=0;  i<student.length; i++){

            total=total+student[i].marks;

        }


        System.out.println("\nAverage Marks: "+(total/student.length));

    }


        }
