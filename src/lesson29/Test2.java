package lesson29;
import java.util.ArrayList;
public class Test2 {
}
/*class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentShowInfo{
    public void showInfo(Student st){
        System.out.println("Имя студента :"+st.name+ " Пол студента :"+ st.sex+" Возраст :"+st.age+
                " Курс :"+st.course+" Средняя оценка :"+st.avgGrade);
    }
    void testStudents(ArrayList<Student> list, StudentChecs sc){
        for(Student s:list){
            if(sc.testStudent(s)){
                showInfo(s);
            }

        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Юля",'f',19, 2,4.5);
        Student s2 = new Student("Коля",'x',22, 3,4.8);
        Student s3 = new Student("Света",'f',20, 1,3.5);
        Student s4 = new Student("Ваня",'x',19, 4,3.7);
        Student s5 = new Student("Маша",'f',21, 1,4.1);
        Student s6 = new Student("Саша",'x',20, 5,5.0);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
FindStodentsOverGrade fsog = new FindStodentsOverGrade();
StudentShowInfo ssi = new StudentShowInfo();
ssi.testStudents(list, fsog);
    }
}
interface StudentChecs{
    boolean testStudent(Student s);
}
class FindStodentsOverGrade implements StudentChecs{
    @Override
    public boolean testStudent(Student s) {
        return (s.avgGrade>4&&s.sex=='f');
    }
}*/