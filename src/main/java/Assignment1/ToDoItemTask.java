package Assignment1;

public class ToDoItemTask {

    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person assignee;

    public String getSummary() {
        return "Id: " + id + " " + "Assigned:" + " " + assigned + " " + "ToDoItem:" + " " + toDoItem.getSummary() + " " + "Assignee:" + " " + assignee.getSummary();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public ToDoItem isToDoItem() {
        return toDoItem;
    }

    public void setToDoItem(ToDoItem toDoItem) {
        if (toDoItem == null){
            throw new IllegalArgumentException("ToDoItem was null");
        }
        this.toDoItem = toDoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}