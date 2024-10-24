package ru.timosh.universityapp.entity;

public class University {
    private String name;
    private String addresses;





    public static class Student implements Discussing, DoingHomework {
        @Override
        public void discuss() {
            System.out.println("Я студент! И сегодня я обсуждал с преподавателем идеи для индивидуального проекта, а также методы исследования, которые можно использовать в моей работе.");
        }
        @Override
        public void doHomework(){
            System.out.println("Студент. Когда я начал работать над проектом, мне стало интересно погрузиться в выбранную тему. Я выбрал исследовать влияние изменения климата на экосистемы, и это действительно актуальная и важная проблема. Первые шаги включали сбор информации: я изучал научные статьи, книги и ресурсы в интернете. Это было увлекательно, но и немного пугающе, так как объем информации огромен, и нужно было отобрать самое важное.");
        }

    }
}
