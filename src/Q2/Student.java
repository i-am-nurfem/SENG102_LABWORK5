package Q2;

public class Student {

    public static int passed;
    public static int failed;
    private final int grade;
    private final int THRESHOLD = 45;


    public Student(int _grade) {
        grade = _grade;

        if (grade >= THRESHOLD) {
            if (grade <= 100) {
                passed++;
            } else {
                System.out.println("Incorrect value.");
            }

        } else if (grade < THRESHOLD) {
            if (grade > 0) {
                failed++;
            } else {
                System.out.println("Incorrect value.");
            }

        }
    }


}
