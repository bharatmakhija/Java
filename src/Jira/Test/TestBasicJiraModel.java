package Jira.Test;

import Jira.Mediator.Mediator;
import Jira.Sprint.Sprint;
import Jira.Sprint.SprintFactory;
import Jira.Task.AbstractTask;
import Jira.Task.Story;
import Jira.Task.Task;
import Jira.Task.TaskBasicFactory;
import Jira.User.BasicUser;
import Jira.User.User;
import Jira.User.UserFactory;

public class TestBasicJiraModel {



    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        BasicUser bharat = userFactory.getUser("Bharat", "developer");
        BasicUser ankita = userFactory.getUser("Ankita", "tester");
        //Mediator.printAllUsers();
        TaskBasicFactory taskBasicFactory = new TaskBasicFactory();
        AbstractTask task1 = (AbstractTask) taskBasicFactory.getTask("story",((User)bharat),"This is a story");
        task1.setOwner(ankita);
        AbstractTask task2 = (AbstractTask) taskBasicFactory.getTask("feature",((User)bharat),"This is a feature");
        AbstractTask task3 = (AbstractTask) taskBasicFactory.getTask("bug",((User)bharat),"This is a bug");
        SprintFactory sprintFactory = new SprintFactory();
        Sprint mySprint = sprintFactory.getSprint("My Current Sprint");
        task1.setSprint(mySprint);
        task2.setSprint(mySprint);
        Mediator.printAllTasksofUser(bharat);
        Mediator.printAllTasksOfSprint(mySprint);
    }
}
