

import java.util.List;

public class Students {
    String fName;
    String lName;
    int age;
    int progress;

    public Students(String fName, String lName, int age, int progress) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Имя " + fName +
                ", Фамилия " + lName +
                ", возраст " + age + " лет" +
                ", успеваемость " + progress + "%";
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    static void choiceOfSinyor(List list) {
        for (int i = 0; i < 0; i++) {
            System.out.println(list.get(i));
        }
    }
    static void WhyIsSenior(List<Students> list) {
            int max = list.get(0).getProgress();
            int z=0;
        for (int i = 0; i < list.size()-1; i++) {
            if (max<list.get(i+1).getProgress()) {
                max = list.get(i+1).getProgress();
                z=i;
            }
        }
        System.out.println("Старостой выбрали "+list.get(z+1));
    }
}