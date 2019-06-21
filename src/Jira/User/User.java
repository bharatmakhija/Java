package Jira.User;

public abstract class User implements BasicUser {
    public String name;
    public String Department;
    public Integer Id;
    public String Designation;


    public User(String name, Integer id, String designation) {
        this.name = name;
        Id = id;
        Designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", Id=" + Id +
                ", Designation='" + Designation + '\'' +
                '}';
    }
}
