public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ALİ","544 557 15 58","MAT" );
        Teacher t2 = new Teacher("Osman","564 123 21 21","FZK");
        Teacher t3 = new Teacher("Mehmet","532 123 45 56","GEO");

        Course matematik = new Course("Matemaik","101","MAT");
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course geometri =new Course("Geometri","103","GEO");
        geometri.addTeacher(t3);

        Student s1=new Student("Sinan Karabulut","1001","4",matematik,fizik,geometri);
        s1.studentInfo();
        s1.addBulkExamNote(50,55,70);
        s1.isPass();

        Student s2 =new Student("Ali Karabulut","1002","4",matematik,fizik,geometri);
        s2.studentInfo();
        s2.addBulkExamNote(40,30,100);
        s2.isPass();

        Student s3=new Student("Ayşe Karabulut","1003","4",matematik,fizik,geometri);
        s3.studentInfo();
        s3.addBulkExamNote(80,60,55);
        s3.isPass();





    }
}