
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    // student's id is a number wiyh 7 digits
    private double grade;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        // by default every student's grade is 0
        grade = 0;
    }

    // setter methods
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 20) {
            System.out.println("Invalid grade ! it should be between 0 and 20");
            return;
        }
        this.grade = grade;
    }

    public void setID(int id) {
        if (id <= 0 || count(id) != 7) {
            System.out.println("Invalid grade ! it should be 7 digits");
            return;
        }
        this.id = id;
    }

    // getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    // Logic of the program
    private int count(int num) {
        int countd = 0;
        while (num != 0) {
            num /= 10;
            countd++;
        }
        return countd;
    }

    public void printStudentInfo() {
        System.out.println(firstName + " " + lastName + "\nID: " + id + "\nGRADE: " + grade);
    }
}
