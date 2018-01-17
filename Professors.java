
import java.util.List;

public class Professors {

    String fNameProfessor;
    String lNameProfessor;
    String chair;

    public Professors(String fNameProfessor, String lNameProfessor, String chair) {
        this.fNameProfessor = fNameProfessor;
        this.lNameProfessor = lNameProfessor;
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Имя профессора " + fNameProfessor +
                ", Фамилия профессора " + lNameProfessor +
                ", кафедра " + chair;
    }

    public String getfNameProfessor() {
        return fNameProfessor;
    }

    public void setfNameProfessor(String fNameProfessor) {
        this.fNameProfessor = fNameProfessor;
    }

    public String getlNameProfessor() {
        return lNameProfessor;
    }

    public void setlNameProfessor(String lNameProfessor) {
        this.lNameProfessor = lNameProfessor;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }



    static void rollAllCall(List list, String fname, String lname, String chair) {
        System.out.println("Профессор " + fname+ " "+ lname+ " кафедры " + chair +" делает перекличку студентов в аудитории");

        for(int i = 0; i < list.size(); ++i) {
            if(Math.random() * 10.0D > 3.0D) {
                System.out.println(list.get(i) + " присутствует");
            } else {
                System.out.println(list.get(i) + " отсутствует");
            }
        }

    }
}
