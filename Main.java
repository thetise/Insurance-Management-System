package Sigorta;

public class Main {
    public static void main(String[] args) throws InvalidAuthenticationException {

        AccountManager account1 = new AccountManager();
        User user1 = new User("John", "Stones","xxxxxxxxx@hotmail.com","123",
                "Freelancer",23);

        user1.getInsurancesList().add(new CarInsurance(50000));

        AddressManager address1 = new AddressManager(user1);
        address1.addAddress(new HomeAddress("İngiltere","Manchester","Etihad ","Ashton New",52));

        Account indAcc1 = new IndividualAccount(user1);
        account1.getDataList().add(indAcc1);
        account1.login("xxxxxxxxx@hotmail.com", "123");

    }
}

@SuppressWarnings("serial")
class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String message){
        super(message);
    }
}











