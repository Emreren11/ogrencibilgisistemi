public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut","TRH","555");
        Teacher t2=new Teacher("Emre","FZK","222");
        Teacher t3=new Teacher("Eren","BIO","111");

        Course tarih= new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);
        Course fizik= new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course biyo= new Course("Biyoloji", "103","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("Emir","123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,55,95,85,95,65);
        s1.isPass();

        Student s2=new Student("Merve","222", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(95,65,40,85,65,75);
        s2.isPass();
    }
}