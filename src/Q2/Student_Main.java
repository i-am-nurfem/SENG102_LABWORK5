package Q2;

import java.util.Scanner;

public class Student_Main {

    public static void main(String [] args){
        int size, total, grade, index = 1, rate;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of students: ");
        size = scanner.nextInt();
        total = size;

        while(size > 0){
            System.out.print("Enter grade of student number " + index + ": ");
            grade = scanner.nextInt();
            new Student(grade);
            size--;
            index++;
        }

        System.out.println("\n" + Student.passed + " students passed.");
        System.out.println(Student.failed + " students failed.");

        rate = (Student.passed * 100) / total;
        System.out.println("Success rate is: " + (double) rate + "%");


    }
}
