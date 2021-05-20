package lession2;

public class MainTest {
    public static void main(String[] args) {
        ManageStudent manageStudent=new ManageStudent();
        manageStudent.add(new Student("Cường",12,"HN"));
        manageStudent.add(new Student("Hằng",21,"HN"));
        manageStudent.display();
        manageStudent.sortByAge();


    }
}
