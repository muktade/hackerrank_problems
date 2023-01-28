package test.hacker.javasort;

import java.util.*;

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(Comparator.comparing(Student::getCgpa, Comparator.reverseOrder()));
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getCgpa(), o2.getCgpa());
//            }
//        });
//        Collections.sort(studentList);
        //studentList.sort(Comparator.naturalOrder());
        //Collections.sort(studentList, Collections.reverseOrder());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
