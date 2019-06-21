package Jira.Task;

import Jira.Sprint.Sprint;
import Jira.User.BasicUser;
import Jira.User.User;

import java.util.Date;

public abstract class AbstractTask implements Task {

    public Integer Id;
    public String Status;
    public Date dueDate;
    public User Owner;
    public Sprint sprint;
    public String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AbstractTask(Integer id, String status, User owner, String title) {
        Id = id;
        Status = status;
        Owner = owner;
        this.title = title;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public User getOwner() {
        return Owner;
    }

    public void setOwner(User owner) {
        Owner = owner;
    }

    public void setOwner(BasicUser owner) {
        Owner = (User)owner;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    @Override
    public String toString() {
        return "AbstractTask{" +
                "Id=" + Id +
                ", Status='" + Status + '\'' +
                ", dueDate=" + dueDate +
                ", Owner=" + Owner +
                ", sprint=" + sprint +
                ", title='" + title + '\'' +
                '}';
    }
}
