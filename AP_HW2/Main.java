public class Main {
    public static void main(String[] args) {
        // Driver code
        Student std1 = new Student("Amirali", "Homayouni", 9931092);
        Student std2 = new Student("Amir", "ali", 9931093);
        std1.setGrade(20);
        std2.setGrade(15);
        std1.printStudentInfo();
        std2.printStudentInfo();
        Lab lab = new Lab("Khancherli", "Monday", 3);
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        System.out.println(lab.currentSize());
        System.out.println(lab.AverageGrade());
        lab.pritLabInfo();
    }
}
