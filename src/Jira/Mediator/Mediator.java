package Jira.Mediator;

import Jira.Sprint.Sprint;
import Jira.Task.AbstractTask;
import Jira.Task.Task;
import Jira.User.BasicUser;
import Jira.User.User;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    public static List<BasicUser> userList = new ArrayList<>();
    public static List<Sprint> sprintList = new ArrayList<>();
    public static List<Task> taskList = new ArrayList<>();

    public static void registerUser(BasicUser user){
        userList.add(user);
    }

    public static void deleteUser(BasicUser user){
        userList.remove(user);
    }

    public static void registerSprint(Sprint sprint){
        sprintList.add(sprint);
    }

    public static void deleteSprint(Sprint sprint){
        sprintList.remove(sprint);
    }

    public static void registerTask(Task task){
        taskList.add(task);
    }

    public static void deleteTask(Task task){
        taskList.remove(task);
    }

    public static void printAllUsers(){
        System.out.println(userList);
    }

    public static void printAllTasks(){
        System.out.println(taskList);
    }

    public static void printAllSprint(){
        System.out.println(sprintList);
    }

    public static void printAllTasksofUser(BasicUser user){
        for(Task task: taskList){
            if(((AbstractTask)task).getOwner().equals(((User)user))){
                System.out.println(((AbstractTask)task));
            }
        }
    }

    public static void printAllTasksOfSprint(Sprint sprint){
        for(Task task: taskList){
            if(((AbstractTask)task).getSprint() != null)
            if(((AbstractTask)task).getSprint().equals(sprint)){
                System.out.println((AbstractTask)task);
            }
        }
    }


}
