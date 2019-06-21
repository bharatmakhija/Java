package Jira.Sprint;

import Jira.Mediator.Mediator;

public class SprintFactory {

    static Integer sprintCount = 0;

    public Sprint getSprint(String name){
        Sprint x = new BasicSprint();
        Mediator.registerSprint(x);
        SprintFactory.sprintCount++;
        return x;
    }
}
