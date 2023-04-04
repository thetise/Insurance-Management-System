package Sigorta;

import java.util.Scanner;

public class AuthenticationControl {
    private User user;
    public enum AuthenticationStatus{
        SUCCESS, FAIL
    }

    public AuthenticationControl(User user){
        super();
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @SuppressWarnings("resource")
    public AuthenticationStatus login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Mail address : ");
        String email = input.next();
        System.out.print("Password : ");
        String  password = input.next();

        if(user.getEmail().equals(email) && user.getPassword().equals(password)){
            return AuthenticationStatus.SUCCESS;
        }
        else{
            return AuthenticationStatus.FAIL;
        }
    }
}
