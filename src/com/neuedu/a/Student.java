package  com.neuedu.a;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;// 学生姓名
    private String no;// 学生学号
    private String sex;// 性别

    public Student(String name, String no, String sex) {
        super();
        this.name = name;
        this.no = no;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Student s1 = new Student("张三", "20160001", "男");
        Student s2 = new Student("张四", "20160002", "男");
        Student s3 = new Student("张五", "20160003", "男");
        Student s4 = new Student("张六", "20160004", "女");
        Student s5 = new Student("张七", "20160005", "女");
        Student s6 = new Student("张八", "20160006", "女");

//添加学生到学生列表里
        List<Student> students = new ArrayList<Student>();
        StudentUtil.addStudent(students, s1);
        StudentUtil.addStudent(students, s2);
        StudentUtil.addStudent(students, s3);
        StudentUtil.addStudent(students, s4);
        StudentUtil.addStudent(students, s5);
        StudentUtil.addStudent(students, s6);

//找到学号，删除掉这个学生。
        StudentUtil.deleteStudent(students, "20160005");
    }

    static class StudentUtil {

        public static void addStudent(List<Student> students, Student s) {
            students.add(s);
        }

        public static void deleteStudent(List<Student> students, String no) {
            Student student = null;
            for (Student s : students) {
                if (no != null && s.getNo().equals(no)) {
                    student = s;
                    break;
                }
            }
            if (student != null) {
                students.remove(student);
            }
        }

    }

}
