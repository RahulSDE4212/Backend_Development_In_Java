package ObjectOrientedProgramming._5_Inheritance;

public class AdminUser extends User{
    public AdminUser(String userName, String email) {
        super(userName, email);
    }
    public void managingProduct() {
        System.out.println("Admin is managing product ");
    }

    @Override // this means that although i am using the method of parent class but i am overriding
    // the implementation of the parent class method.
    public void showingDashboard() {
        super.showingDashboard(); // this will call parent class method even though the method has been overriden.
        System.out.println("Admin user's personalised dashboard!!!");
    }


    public static void main(String[] args) {
        AdminUser au = new AdminUser("rahulsde", "baaburahulsingh@gmail.com");
        au.login();
        au.managingProduct();
        au.showingDashboard();
        System.out.println(au.userName);
    }
}
