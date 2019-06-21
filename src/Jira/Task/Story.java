package Jira.Task;

import Jira.User.User;

import java.util.List;

public class Story extends AbstractTask {

    public List<SubStory> subStories;

    public Story(Integer id, String status, User owner, String title) {
        super(id, status, owner, title);
    }


    public void addSubStory(SubStory subStory){
        this.subStories.add(subStory);
    }

}
