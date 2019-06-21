package Jira.User;

import Jira.Mediator.Mediator;

public class UserFactory extends AbstractUserFactory {

    static int userCount = 0; // static variable to assign as ID to created Users

    public UserFactory(){}

    public User getUserObject(String name, String designation) throws IllegalArgumentException {
        if(designation.equals("developer")){
            return new Developer(name,userCount, designation);
        }
        else if(designation.equals("tester")){
            return new Tester(name,userCount,designation);
        }
        else if(designation.equals("manager")){
            return new Manager(name,userCount,designation);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public BasicUser getUser(String name, String designation) throws IllegalArgumentException{
        BasicUser user = this.getUserObject(name,designation);
        this.registerUser(user);
        UserFactory.userCount++;
        return user;
    }

    public void registerUser(BasicUser user){
        Mediator.registerUser(user);
    }
}
