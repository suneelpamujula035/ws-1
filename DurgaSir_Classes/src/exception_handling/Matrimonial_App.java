package exception_handling;

class TooYoungException extends RuntimeException{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException{
	TooOldException(String s)
	{
		super(s);
	}
}
public class Matrimonial_App{

	public void checkAge(int age)
	{
		if(age<18)
		{
			throw new TooYoungException("You are too young....You have to wait for some time");
		}
		else if(age>60)
		{
			throw new TooOldException("Your marriage time is overed....");
		}
	}
	public static void main(String[] args) {

		Matrimonial_App m = new Matrimonial_App();
		m.checkAge(12);
	}

}
