package ru.mirea.task17;

enum Priorities{
    First, Second, Third
}
public class PrioritiesDemo {
    public static void main(String[] args) {
        Priorities priority=Priorities.First;
        Task17 task1 = new Task17(priority);
        check(task1);

        priority=Priorities.Third;
        Task17 task2 = new Task17(priority);
        check(task2);
    }

    static void check(Task17 task){
        switch (task.priority){
            case First:
                System.out.println("У задачи первый приоритет");
                break;
            case Second:
                System.out.println("У задачи второй приоритет");
                break;
            case Third:
                System.out.println("У задачи третий приоритет");
                break;
        }
    }
}
