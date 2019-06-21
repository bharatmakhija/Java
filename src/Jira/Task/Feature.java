package Jira.Task;

import Jira.User.User;

public class Feature extends AbstractTask {


    public Feature(Integer id, String status, User owner, String title) {
        super(id, status, owner, title);
    }
}
