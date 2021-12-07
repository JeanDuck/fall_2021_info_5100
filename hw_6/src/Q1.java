import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Q1 {
    public static class Student {
        private int id;
        private String name;
        private double gpa;
        private Date dateOfBirth;

        public Student(int id, String name, double gpa, Date date) {
            this.id=id;
            this.name=name;
            this.gpa=gpa;
            this.dateOfBirth=date;
        }
    }
    public static void main(String[] args) throws ParseException {
        List<Student> list=new ArrayList<>();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString1 = "15-10-2022 10:20:56";
        String dateInString2 = "15-11-2021 10:20:56";
        String dateInString3 = "15-12-2021 10:20:56";
        Date date1 = DateFor.parse(dateInString1);
        Date date2 = DateFor.parse(dateInString2);
        Date date3 = DateFor.parse(dateInString3);

        list.add(new Student(1,"Lucy",3.00,date1));
        list.add(new Student(2,"Jimmmy",3.50,date2));
        list.add(new Student(3,"Zoe",3.80,date3));
        //sort by name
        List<Student> nameList=NameComparator(list);
        for(int i=0;i<nameList.size();i++){
            System.out.print(nameList.get(i).id+" "+nameList.get(i).name+" "+nameList.get(i).gpa+" "+nameList.get(i).dateOfBirth);
            System.out.println();
        }
        System.out.println("--------------------------------------");
        //sort by gpa
        List<Student> gpaList= GpaComparator(list);
        for(int i=0;i< gpaList.size();i++){
            System.out.print( gpaList.get(i).id+" "+ gpaList.get(i).name+" "+ gpaList.get(i).gpa+" "+ gpaList.get(i).dateOfBirth);
            System.out.println();
        }

        System.out.println("--------------------------------------");
        //sort by date
        List<Student> dateList=DateOfBirthComparator(list);
        for(int i=0;i< dateList.size();i++){
            System.out.print( dateList.get(i).id+" "+ dateList.get(i).name+" "+ dateList.get(i).gpa+" "+ dateList.get(i).dateOfBirth);
            System.out.println();
        }


    }
    static class  SortbyName implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            return a.name.compareTo(b.name);
        }
    }
    public static List<Student> NameComparator(List<Student> student){
        Collections.sort(student,new SortbyName() );
        return student;

    }


    static class  SortbyGpa implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            return Double.compare(b.gpa,a.gpa);
        }
    }
    public static List<Student> GpaComparator(List<Student> student){
        Collections.sort(student,new SortbyGpa() );
        return student;

    }


    static class  SortbyDate implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            return a.dateOfBirth.compareTo(b.dateOfBirth);
        }
    }
    public static List<Student> DateOfBirthComparator(List<Student> student){
        Collections.sort(student,new SortbyDate() );
        return student;
    }


}

