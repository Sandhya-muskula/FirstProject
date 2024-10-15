package condittionalstatements;

public class Greatest {

	public static void main(String[] args) {
		int a = 12;
		int b = 21;
		int c =10;
		if(a>b&&a>c)
		{
            System.out.println("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
