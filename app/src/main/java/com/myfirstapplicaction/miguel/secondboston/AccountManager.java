package com.myfirstapplicaction.miguel.secondboston;

import java.util.HashMap;

/**
 * Created by Miguel on 20/01/2017.
 */

public class AccountManager {
    static HashMap<String,String> accounts = new HashMap<>();

    public static Boolean addAccount(String name, String password){
        if(!accounts.containsKey(name)){
            accounts.put(name, password);
            return true;
        }else{
            return false;
        }
    }
}
