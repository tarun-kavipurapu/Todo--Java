public class Task {
    private String description;
    private boolean completed;

    Task(String description){
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void setCompleted(boolean status){
        this.completed = status;
    }
}
