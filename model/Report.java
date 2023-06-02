package model;

import model.base.BaseUser;
import model.base.Reporter;

public class Report extends Reporter {
    @Override
    public void report(BaseUser user) {
        System.out.println("Отчет: " + user.getName());
    }
}
