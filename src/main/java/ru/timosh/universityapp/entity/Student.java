package ru.timosh.universityapp.entity;

public class Student implements Discussing, DoingHomework{
    private String name;
    private String surname;
    private int age;
    private Teacher teacher;

  /*  public Student() {

    }*/

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
 public Teacher getTeacher(){
        return teacher;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
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

    public void setAge(Integer age) {
        if (age == 0) {
            System.out.println("Возраст не указан");
        }
        this.age = age;
    }
        @Override
        public void discuss() {
            System.out.println("Я студент! И сегодня я обсуждал с преподавателем идеи для индивидуального проекта, а также методы исследования, которые можно использовать в моей работе.");
        }
        @Override
        public void doHomework(){
            System.out.println("Студент. Когда я начал работать над проектом, мне стало интересно погрузиться в выбранную тему. Я выбрал исследовать влияние изменения климата на экосистемы, и это действительно актуальная и важная проблема. Первые шаги включали сбор информации: я изучал научные статьи, книги и ресурсы в интернете. Это было увлекательно, но и немного пугающе, так как объем информации огромен, и нужно было отобрать самое важное.");
        }

}
