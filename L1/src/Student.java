import java.util.List;

public class Student{
    private String name;

    private String favColor;
    public static int majorId = 1;

    public int year;
    //public final int year;
    private int grade;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int grade){
        this.name = name;
        this.setGrade(grade);
    }

    public Student(String name, int grade, String favColor, int year){
        this.name = name;
        this.setGrade(grade);
        this.setFavColor(favColor);
        this.year = year;
    }

    public void setGrade(int grade) {
        if(grade < 0 || grade > 5) return;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
