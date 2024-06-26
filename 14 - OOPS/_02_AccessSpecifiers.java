public class _02_AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.username = "Hyper";
        // b1.password = "Hyper123"; //Invalid
        b1.setPassword("Hyper123"); //Valid

        //Now Let's Print
        System.out.println(b1.username);
        // System.out.println(b1.password); //Invalid
    }
}

class BankAccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        this.password = pwd;
    }
}
