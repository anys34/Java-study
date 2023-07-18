package student;

import java.util.ArrayList;

public class Students {
    private String name;
    private String tel;
    private String nativeSC;
    private int score;
    private int attendance;
    private int point;
    private static ArrayList<Students> studentData = new ArrayList<>();

    public Students() {
    }

    public Students(String name, String tel, String nativeSC, int score, int attendance, int point) {
        this.name = name;
        this.tel = tel;
        this.nativeSC = nativeSC;
        this.score = score;
        this.attendance = attendance;
        this.point = point;
    }

    public void setData(String name, String tel, String nativeSC, int score, int attendance, int point) {
        Students student = new Students(name, tel, nativeSC, score, attendance, point);
        studentData.add(student);
    }

    public static ArrayList<Students> get() {
        return studentData;
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setData("John Doe", "123456789", "New York", 90, 95, 85);

        Students student2 = new Students();
        student2.setData("Jane Smith", "987654321", "Los Angeles", 85, 92, 88);

        ArrayList<Students> allStudents = Students.get();

        for (Students student : allStudents) {
            System.out.println(student);
        }
    }

//    @Override
//    public String toString() {
//        return "Name: " + name +
//                ", Tel: " + tel +
//                ", NativeSC: " + nativeSC +
//                ", Score: " + score +
//                ", Attendance: " + attendance +
//                ", Point: " + point;
//    }
}
