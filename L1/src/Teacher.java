import java.util.Scanner;
public class Teacher {
    public static void main(String[] args) {

        // Z2

//        Student st1 = new Student();
//        Student st2 = new Student();
//
//        st1.setName("Jan");
//        st1.year = 2020;
//        st1.setGrade(3);
//
//        st2.setName("Bob");
//        st1.year = 2020;
//        st1.setGrade(5);

        // Z3

//        System.out.println(st1.getName());
//        System.out.println(st1.year);
//        System.out.println(st1.getGrade());
//
//        System.out.println(st2.getName());
//        System.out.println(st2.year);
//        System.out.println(st2.getGrade());

        // Z7

        Scanner scanner = new Scanner(System.in);
        System.out.println("New student creation");

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter year:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter color:");
        String favColor = scanner.nextLine();

        System.out.println("Enter grade:");
        int grade = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, grade, favColor, year);

        System.out.println("student:\n\n" + student.getName() + "\n" + student.getGrade() + "\n"+ student.getFavColor() + "\n"+ student.year);
    }
}
