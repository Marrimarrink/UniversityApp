package ru.timosh.universityapp._main;

import ru.timosh.universityapp.entity.DiscussionCreator;
import ru.timosh.universityapp.entity.HomeworkCreator;
import ru.timosh.universityapp.entity.KnowledgeTestCreator;
import ru.timosh.universityapp.entity.University;

public class _Main {
    public static void main(String[] args){

        University.Student student = new University.Student();
        University.Teacher teacher = new University.Teacher();
        DiscussionCreator discussionCreator = new DiscussionCreator();
        HomeworkCreator homeworkCreator = new HomeworkCreator();
        KnowledgeTestCreator knowledgeTestCreator = new KnowledgeTestCreator();

        discussionCreator.startDiscuss(student);
        discussionCreator.startDiscuss(teacher);
        homeworkCreator.startDoHomework(student);
        knowledgeTestCreator.startTestKnowledge(teacher);

    }
}
