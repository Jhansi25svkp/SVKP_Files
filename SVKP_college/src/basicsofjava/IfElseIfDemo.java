package basicsofjava;

public class IfElseIfDemo {

	public static void main(String[] args) {
		int Score=89;
		if(Score>90) 
		{
			System.out.println("grade A");
		}
		else if(Score>=80)
		{
			System.out.println("Grade B");
		}
		else if(Score>=70)
		{
			System.out.println("Grade C");
		}
		else if(Score>60)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
