package ToDo;

public class Task {
    public String title;
    public boolean done;

    public Task(String title) {
        this.title = title;
        this.done = false;

    }

    @Override

    public String toString() {
        return(done ? "✔" : "🎈") +title;
    }

}
