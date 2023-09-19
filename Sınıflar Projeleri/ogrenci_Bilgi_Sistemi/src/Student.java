public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarege;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarege = 0.0;
        this.isPass = false;


    }

    void studentInfo() {
        System.out.println("---------------------");
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.stuNo);
        System.out.println("Sınıfı: " + this.classes);
    }

    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if ((note1 >= 0 && note1 <= 100) && (sozlu1 >= 0 && sozlu1 <= 100)) {
            this.c1.note = note1;
            this.c1.sozlu=sozlu1;

        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.c2.sozlu=sozlu2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.sozlu=sozlu3;
        }


    }

    void isPass() {


        this.avarege = ((this.c1.note*0.8+this.c1.sozlu*0.2) + (this.c2.note*0.8+this.c2.sozlu*0.2) + (this.c3.note*0.8+this.c3.sozlu*0.2)) / 3.0;
        if (this.avarege > 55) {
            System.out.println("---------------------");
            System.out.println("Sınıfı Geçtiniz :)");
            this.isPass = true;

        } else {
            System.out.println("---------------------");
            System.out.println("Sınıfta kaldınız :(");
            this.isPass = false;
        }
        printNote();

    }

    void printNote() {
        System.out.println("---------------------");
        System.out.println(c1.name + " Sınav Notu\t:" + c1.note);
        System.out.println(c1.name+" Sozlu Notu\t:"+c1.sozlu);

        System.out.println(c2.name + " Sınav Notu\t:" + c2.note);
        System.out.println(c2.name+" Sozlu Notu\t:"+c2.sozlu);

        System.out.println(c3.name + " Sınav Notu\t:" + c3.note);
        System.out.println(c3.name+" Sozlu Notu\t:"+c3.sozlu);

        System.out.println("Ortalamanız\t\t\t:" + this.avarege);

    }
}




