package Sigorta;

import java.util.*;
public abstract class Account {
    private User user;

    public final void showUserInfo(){

        System.out.println("-----------------------Müşteri Bilgileri-----------------------");
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Job: " + user.getJob());
        System.out.println("Age: " + user.getAge());
        System.out.println();

        System.out.println("-----------------------Address List-----------------------");
        for(int i = 0; i < user.getAddressList().size(); i++){
            System.out.print((i+1) + ". adress: ");
            System.out.println(user.getAddressList().get(i).getStreet() + " Street, " +
                    user.getAddressList().get(i).getNumber() + ". number, " +
                    user.getAddressList().get(i).getTown() + " Town, " +
                    user.getAddressList().get(i).getCity() + "/" +
                    user.getAddressList().get(i).getCountry());
        }
        System.out.println();

        System.out.println("-----------------------Insurance List---------------------");
        for(Insurance s: user.getInsurancesList()){
            System.out.println("Type of Insurance : " + s.getClass().getSimpleName());
            System.out.println("Price of Insurance : " + s.calculate());
            System.out.println("Start date : " + s.getStartDate());
            System.out.println("Finish date : " + s.getFinishDate());
            System.out.println();
        }
    }

    public Account(User user){
        super();
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
