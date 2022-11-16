public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String  stuNo;
    String classes;
    double note1,note1_1;
    double note2, note2_1;
    double note3, note3_1;
    double sumNote1,sumNote2,sumNote3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(double note1, double note1_1, double note2, double note2_1, double note3, double note3_1){
        if (note1>=0 && note1<=100 && note1_1>=0 && note1_1<=100) {
            this.note1 = note1;
            this.note1_1 = note1_1;
            this.sumNote1=(this.c1.note*note1) + (this.c1.verbalNote*note1_1);
        }
        if (note2>=0 && note2<=100 && note2_1>=0 && note2_1<=100) {
            this.note2 = note2;
            this.note2_1 = note2_1;
            this.sumNote2=(this.c2.note*note2) + (this.c2.verbalNote*note2_1);
        }
        if (note3>=0 && note3<=100 && note3_1>=0 && note3_1<=100) {
            this.note3 = note3;
            this.note3_1 = note3_1;
            this.sumNote3=(this.c3.note*note1) + (this.c3.verbalNote*note3_1);
        }
    }

    void isPass(){
        this.avarage=(this.sumNote1+this.sumNote2+this.sumNote3)/3.0;
        if (this.avarage >= 55)
            System.out.println("Geçti");
        else
            System.out.println("Kaldı");
        printNote();
    }

    void printNote(){
        System.out.println(c1.name+" Notu: "+this.sumNote1);
        System.out.println(c2.name+" Notu: "+this.sumNote2);
        System.out.println(c3.name+" Notu: "+this.sumNote3);
        System.out.println("Ortalama: "+this.avarage);
    }
}
