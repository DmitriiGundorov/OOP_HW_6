package model;

import model.base.BaseUser;
import model.base.Persister;

public class SaveUser extends Persister {
    @Override
    public int save(BaseUser user) {
        try {
            // Just for example...
            System.out.println("Сохранен пользователь: " + user.getName());
            return 0;
        }
        catch (Exception e){
            return -1;
        }
    }
}
