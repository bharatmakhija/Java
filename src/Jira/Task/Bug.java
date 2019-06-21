package Jira.Task;

import Jira.User.User;

public class Bug extends AbstractTask {


    public Bug(Integer id, String status, User owner, String title) {
        super(id, status, owner, title);
    }
}
