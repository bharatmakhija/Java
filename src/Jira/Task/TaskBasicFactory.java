package Jira.Task;

import Jira.Mediator.Mediator;
import Jira.User.User;

public class TaskBasicFactory {

    static Integer taskCount = 0;


    public Task getTask(String type, User owner, String title) throws IllegalArgumentException{
        Task x;
        String defaultStatus = "TODO";
        if("story".equals(type)){
            x = new Story(TaskBasicFactory.taskCount,defaultStatus, owner, title);
        }
        else if("feature".equals(type)){
            x = new Feature(TaskBasicFactory.taskCount,defaultStatus, owner, title);
        }
        else if("bug".equals(type)){
            x = new Bug(TaskBasicFactory.taskCount,defaultStatus, owner, title);
        }
        else{
            throw new IllegalArgumentException();
        }
        Mediator.registerTask(x);
        TaskBasicFactory.taskCount++;
        return x;
    }

}
