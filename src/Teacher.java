public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch,String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }
    void print()
    {
        System.out.println("Adı: "+this.name);
        System.out.println("BÖlümü: "+this.branch);
        System.out.println("Telefon Numarası: "+this.mpno);
    }
}
