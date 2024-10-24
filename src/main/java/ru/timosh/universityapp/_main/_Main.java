package ru.timosh.universityapp._main;

import ru.timosh.universityapp.entity.DiscussionCreator;
import ru.timosh.universityapp.entity.HomeworkCreator;
import ru.timosh.universityapp.entity.KnowledgeTestCreator;
import ru.timosh.universityapp.entity.University;
import ru.timosh.universityapp.entity.Student;
import ru.timosh.universityapp.entity.Teacher;

public class _Main {
    public static void main(String[] args) {

        Student student1 = new Student("Матвей", "Новиков", 19);
        Student student2 = new Student("Тимур", "Ильин", 20);
        Teacher teacher = new Teacher("Софон", "Королев");

        //Teacher teacher = student1.getTeacher();

        DiscussionCreator discussionCreator = new DiscussionCreator();
        HomeworkCreator homeworkCreator = new HomeworkCreator();
        KnowledgeTestCreator knowledgeTestCreator = new KnowledgeTestCreator();

        discussionCreator.startDiscuss(student1);
        discussionCreator.startDiscuss(teacher);
        homeworkCreator.startDoHomework(student1);
        knowledgeTestCreator.startTestKnowledge(teacher);


    }
}
