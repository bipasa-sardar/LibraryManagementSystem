package pkg_person;
import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class StudentManager {
    ObjectOutputStream oos_student =null;
    ObjectInputStream ois_student =null;
    File Student_file=null;
    ArrayList<Student> Student_list =null;
    public StudentManager(){
        Student_file=new File("Student.dat");
        Student_list=new ArrayList<Student>();

        if(Student_file.exists()){
            try {
                ois_student=new ObjectInputStream(new FileInputStream(Student_file));
                Student_list= (ArrayList<Student>) ois_student.readObject();
            }catch (IOException e){
                e.printStackTrace();
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }

        }

    }
    public void addAStudent(Student student){
        Student_list.add(student);
    }
    public Student get(int RollNo){
        for(Student s : Student_list){
            if(s.getRollNo()==RollNo) return s;
        }
        return null;
    }
    public void ViewAllStudent(){
        for(Student s :Student_list){
            System.out.println(s);
        }
    }
    public boolean deleteStudent(int delete_RollNo){
        ListIterator<Student> Student_iterator = ( ListIterator<Student>) Student_list.listIterator();
        while(Student_iterator.hasNext()){
            Student s=Student_iterator.next();
            if(s.getRollNo()==delete_RollNo){
                Student_list.remove(s);
                return true;
            }
        }
        return false;
    }
}
