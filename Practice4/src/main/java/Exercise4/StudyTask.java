package Exercise4;

import java.util.Objects;

public class StudyTask extends Task {

    private String subject;

    public StudyTask(String title, String description, int priority,
                     String deadline, String status, String subject) {

        super(title, description, priority, deadline, status);
        this.subject = subject;
    }

    @Override
    public String getDescription() {
        return "Учебная задача (" + subject + "): "
                + super.getDescription();
    }

    @Override
    public String toString() {
        return super.toString() + ", Предмет: " + subject;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        StudyTask other = (StudyTask) obj;
        return Objects.equals(subject, other.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }
}
