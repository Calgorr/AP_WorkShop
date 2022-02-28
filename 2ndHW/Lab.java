public class Lab {
    private Student[] students;
    private String teacherName;
    // the day in which the lab is held
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double averageGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        // create an array of student with the size of "maxSize"
        students = new Student[maxSize];
        currentSize = 0;
    }

    public double calAve() {
        double ave = 0;
        for (int i = 0; i < currentSize; i++) {
            ave += students[i].getGrade();
        }
        ave /= currentSize;
        return ave;
    }

    public void enrollStudent(Student student) {
        if (currentSize <= maxSize) {
            int i;
            for (i = 0; i < maxSize; i++) {
                if (students[i] == null) {
                    break;
                }
            }
            students[i] = student;
            setCurrentSize(currentSize + 1);
        }
    }

    public double AverageGrade() {
        setAverageGrade();
        return averageGrade;
    }

    public int currentSize() {
        return currentSize;
    }

    public String dayOfWeek() {
        return dayOfWeek;
    }

    public int maxSize() {
        return maxSize;
    }

    public Student[] getStudent() {
        return students;
    }

    public void pritLabInfo() {
        System.out.println("This lab is held on " + dayOfWeek + " And the instructor is Mr." + teacherName);
        for (int i = 0; i < currentSize; i++) {
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
        }
    }

    public void setAverageGrade() {
        double grade;
        grade = calAve();
        this.averageGrade = grade;
    }

    public void setCurrentSize(int currentSize) {
        if (currentSize <= 0 || currentSize > maxSize) {
            System.out.println("Invalid input");
            return;
        }
        this.currentSize = currentSize;
    }

    public void setDayOFWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}