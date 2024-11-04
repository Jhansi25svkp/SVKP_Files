package basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {
	String day="Monday";
	switch(day)
	{
	case "Monday":
	case "monday":
	System.out.println("Attend the meetings");
	break;
	case "Tuesday":
	case "tuesday":
	System.out.println("Work on project task");
	break;
	}

	}

}
