package Jira.Sprint;

public abstract class AbstractSprint implements Sprint {

    public String name;
    public Integer Id;
    public String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AbstractSprint{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", description='" + description + '\'' +
                '}';
    }
}
