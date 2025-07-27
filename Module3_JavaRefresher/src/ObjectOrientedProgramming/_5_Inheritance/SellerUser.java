package ObjectOrientedProgramming._5_Inheritance;

import java.nio.channels.SeekableByteChannel;

public class SellerUser extends User{
    public SellerUser(String userName, String email) {
        super(userName, email);
    }

    public void addingProduct() {
        System.out.println("Seller is adding product!!!");
    }

    @Override
    public void showingDashboard() {
        System.out.println("seller user's personalised dashboard!!!");
    }

    public static void main(String[] args) {
        SellerUser su = new SellerUser("khushboo", "khushboosinghsavitri@gmail.com");
        su.login();
        su.addingProduct();
    }
}

