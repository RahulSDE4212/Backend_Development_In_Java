package Lesson1_SingleResponsibilityPrinciple.Example4.BetterCode;

public class UserManager {
    public String userName;

    UserManager(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void createUser(String userName) {
        // code to create a user
    }

    public void deleteUser(String userName){
        // code to delete a user
    }
}
