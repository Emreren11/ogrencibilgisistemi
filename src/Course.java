public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;

    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        if (this.prefix.equals("FZK")){
            this.note=0.8;
            this.verbalNote=0.2;
        }
        if(this.prefix.equals("BIO")){
            this.note = 0.85;
            this.verbalNote = 0.15;
        }
        if (this.prefix.equals("TRH")){
            this.note = 0.75;
            this.verbalNote = 0.25;
        }
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix))
        {
            this.teacher=teacher;
        }else
            System.out.println("Öğretmen ve ders uyuşmuyor.!");
    }

    void printTeacher(){
        this.teacher.print();
    }
}
