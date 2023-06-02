import model.SimpleReport;
import model.SimpleSave;
import model.User;

public class Main{
	public static void main(String[] args){
		User user = new User("Dmitrii");
		user.report(new SimpleReport());
		user.save(new SimpleSave());
	}
}