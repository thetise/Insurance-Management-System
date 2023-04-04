package Sigorta;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import Sigorta.AuthenticationControl.AuthenticationStatus;

public class AccountManager {
    private Set<Account> dataList = new TreeSet<>(new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2){
            return o1.getUser().getName().compareTo(o2.getUser().getName());
        }
    });

    public void login(String email, String password) throws InvalidAuthenticationException{
        for(Account account: dataList){
            AuthenticationControl control = new AuthenticationControl(account.getUser());
            if(account.getUser().getPassword().equals(password) && account.getUser().getEmail().equals(email)){
                if(control.login() == AuthenticationControl.AuthenticationStatus.FAIL){
                    throw new InvalidAuthenticationException("ERROR: Invalid email or password.");
                }
                else{
                    account.showUserInfo();
                }
            }
        }
    }
    public Set<Account> getDataList(){
        return dataList;
    }
    public void setDataList(Set<Account> dataList) {
        this.dataList = dataList;
    }
}
