package Exercise4;

import java.util.Objects;

public class Task {

    private String title;
    private String description;
    private int priority;
    private String deadline;
    private String status;

    public Task(String title, String description, int priority,
                String deadline, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.status = status;
    }

    public String getDescription() {
        return title + " " + description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Название: " + title
                + ", Описание: " + description
                + ", Приоритет: " + priority
                + ", Срок: " + deadline
                + ", Статус: " + status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        // возможно что-то еще
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Task other = (Task) obj;

        return priority == other.priority
                && Objects.equals(title, other.title)
                && Objects.equals(description, other.description)
                && Objects.equals(deadline, other.deadline)
                && Objects.equals(status, other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, priority, deadline, status);
    }
}
