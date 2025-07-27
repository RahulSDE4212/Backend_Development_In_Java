package ObjectOrientedProgramming._5_Inheritance;

public class RegularUser extends User{
    public RegularUser(String userName, String email){
        super(userName, email);
    }

    public void browsingProduct() {
        System.out.println("Customer is browsing product!!!");
    }

    @Override
    public void showingDashboard() {
        System.out.println("regularUser personalised dashboard");
    }

    public static void main(String[] args) {
        RegularUser ru = new RegularUser("rohit", "baaburohitsingh@gmail.com");
        ru.login();
        ru.browsingProduct();
    }
}
