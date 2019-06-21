package Jira.Task;

import Jira.User.User;

public class SubStory extends AbstractTask {

    public SubStory(Integer id, String status, User owner, String title) {
        super(id, status, owner, title);
    }
}
