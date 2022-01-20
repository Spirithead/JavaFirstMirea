package TaskManager;

public class Task {
    Priorities priority=Priorities.Null;
    String tag="";
    String name="";
    String description="";

    public Task(String name, String tag, Priorities priority){
        this.name=name;
        this.tag=tag;
        this.priority=priority;
    }

    public Task(String name){
        this.name=name;
    }

    public Task(String name, String tag){
        this.name=name;
        this.tag=tag;

    }

    public String getName() {
        return name;
    }
}
