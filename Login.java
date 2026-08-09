class Login {


    private String password;

    Login(String password) {
        this.password = password;
    }




    public boolean checkPassword(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }
}


 class LoginMain {
       public static void main(String[] args) {

        Login user = new Login("abc123");

        System.out.println(user.checkPassword("abc123"));
        System.out.println(user.checkPassword("wrong"));
    }
}
