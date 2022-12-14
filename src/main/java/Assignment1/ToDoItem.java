package Assignment1;

import java.time.LocalDate;

public class ToDoItem {

    // fields
    private int id;
    public String title;
    public String taskDescription;
    public LocalDate deadLine;
    public boolean done;
    public Person creator;

    // constructors

    // methods
    public boolean isOverdue() {
        // how to get the current date ?
        LocalDate currentDate = LocalDate.now();
        // check if the current date is after the deadline date means overdue true
        if (currentDate.isAfter(deadLine)) {
            return true;
        } else {
            return false;
        }
    }

    public String getSummary() {
        return "Id: " + id + " " + "Title: " + title + " " + " " + "Taskdescription:" + " " + taskDescription + " " + "Deadline:" + " " + deadLine + " " + "Done:" + " " + done + " " + " Creator:" + " " + creator.getSummary();
    }

    // setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null){
            throw new IllegalArgumentException("title was null");
        }
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        if (done){
            throw new IllegalArgumentException("done was null");

        }
        this.done = false;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        if (creator == null){
            throw new IllegalArgumentException("creator was null");
        }
        this.creator = creator;

    }
}
