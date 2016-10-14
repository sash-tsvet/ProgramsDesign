package ru.sbt.bit.classwork.ocp;

public class EntryController{
    public void addComment(String comment) {
        if (validateNotSpam (comment)){
            // save comment to database
        }
    }
    private boolean validateNotSpam (String comment) {
        // ip-spammer
        // keywords
        // email
        return true;
    }
}