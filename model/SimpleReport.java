package model;

import model.base.BaseUser;
import model.base.Reporter;

public class SimpleReport extends Reporter {
    @Override
    public void report(BaseUser user) {
        System.out.println("Имя пользователя: " + user.getName());
    }
}
