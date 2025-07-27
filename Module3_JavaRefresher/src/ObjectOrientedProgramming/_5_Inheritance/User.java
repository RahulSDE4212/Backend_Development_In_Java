package ObjectOrientedProgramming._5_Inheritance;

public class User {
    protected String userName;
    public String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public void login() {
        System.out.println(userName + " logged in");
    }

    public void showingDashboard() {
        System.out.println(userName + "'s dashboard..");
    }
}
