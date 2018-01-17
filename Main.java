import java.util.*;


public class Main {
    static Students students;
    static Professors professors;
    static Groups groups;


    public static void main(String[] args) {

        //Создаем студентов
        List<Students> studentsList = new ArrayList();
        int countStudents = 20;
        for (int i = 1; i < countStudents + 1; i++) {
            studentsList.add(new Students("StudentsFName" + i, "StudentsLName" + i, (int) (18 + 15 * Math.random()), (int) (100 * Math.random())));
        }

        //Создаем профессоров
        List<Professors> professorsList = new ArrayList();
        int countProfessors = 4;
        for (int i = 1; i < countProfessors + 1; i++) {
            professorsList.add(new Professors("ProfessorsFName" + i, "ProfessorsLName" + i, "№" + i));
        }

        // список всех созданных студентов
/*        for (Object z:studentsList
                ) {
            System.out.println(z);
        }*/

        //Создаем группы студентов
        List<Groups> groupList = new ArrayList();
        int countGroup = 5;
        for (int i = 1; i < countGroup + 1; i++) {
            groupList.add(new Groups(i));
        }
        // список созданных групп
/*        for (Object z:groupList
                ) {
            System.out.println(z);
        }*/

        // минимальное колличество людей в группе
        final int r = studentsList.size() / countGroup;
        int t = 0;

        //Создаем и наполгяем коллекции студентами
        List<Object> divideStudents = new ArrayList();
        boolean l = true;
        for (int i = 0; i < groupList.size(); i++) {

            List<Object> studentsInGroup = new ArrayList();

            //добавляем в 1-ю группу студентов, которые остались без группы

            for (int f = t; f < r + t; f++) {
                studentsInGroup.add(studentsList.get(f));
            }
            if (countStudents != 0 & l == true) {
                int y = countStudents % r;
                for (int k = studentsList.size() - y; k < studentsList.size(); k++) {
                    studentsInGroup.add(studentsList.get(k));
                }
                l = false;
            }
            t = t + r;
            divideStudents.add(studentsInGroup);
        }

        // Создаем коллекции Группа-Студенты
        HashMap<Object, Object> groupAndStudents = new HashMap<>();
        for (int i = 0; i < groupList.size(); i++) {
            groupAndStudents.put(groupList.get(i), divideStudents.get(i));
        }



        // список группа-студенты при помощи HashMap
/*        for (Map.Entry<Object, Object> z:groupAndStudents.entrySet()
                ) {
            System.out.println(z);
        }*/



        // еще один вывод група-студент
/*        for (int i =0;i<divideStudents.size();i++){
            System.out.println(groupList.get(i));
            System.out.println(divideStudents.get(i));
        }*/




        // профессор s делает перекличку в аудитории;
/*      int s = 0;
        professors.rollAllCall(studentsList, professorsList.get(s).getfNameProfessor(), professorsList.get(s).getlNameProfessor(),
                professorsList.get(s).getChair());*/


        // выбор старосты по успеваемости

         /*students.WhyIsSenior(studentsList);*/


        // еще один вывод група-студент через toString
/*
        int u = 0; // задаем номер группы
        int d = 0; //задаем профессора что будет делать перекличку
        String s = groupAndStudents.get(groupList.get(u)).toString();
        System.out.println(s);
        String resultString = s.replace("["," ");
        String resultString1 = resultString.replace("]","");
        String resultString2 = resultString1.replace("%,","%   ");

        System.out.println(groupList.get(u));
        String[] isbnParts = resultString2.split("   ");
        for (int i=0;i<r;i++){
            System.out.println(isbnParts[i]);
        }*/

        }
    }

