package model;

import model.base.BaseUser;
import model.base.Persister;


public class SimpleSave extends Persister {
    @Override
    public int save(BaseUser user) {
        try {
            System.out.println("Пользователь сохранен: " + user.getName());
            return 0;
        }
        catch (Exception e){
            return -1;
        }
    }
}
