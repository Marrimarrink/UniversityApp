package ru.timosh.universityapp.entity;

public class Teacher implements Discussing, KnowledgeTester{
    private String name;
    private String surname;

    public Teacher() {

    }

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            System.out.println("Имя не заполнено");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname.length() == 0) {
            System.out.println("Фамилия не заполнена");
        }
        this.surname = surname;
    }

        @Override
        public void discuss() {
            System.out.println("Я преподаватель! И сегодня я обсуждал со студентами исследовательские проекты, в частности научных исследования и публикация в области биологии, которые могут быть полезны для нашего обучения.");
        }

        @Override
        public void checkStudent(){
            System.out.println("Преподаватель. Когда я открыл первую версию проекта студента, меня сразу же привлекла выбранная тема — влияние изменения климата на экосистемы. Это актуальная и важная проблема, и я рад видеть, что студент выбрал ее для своего исследования.");
        }


}
