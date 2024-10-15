package condittionalstatements;

public class Calculator {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		String symbol="-";
		switch (symbol) {
		case"+":System.out.println(n1+n2);
		    break;
		case"-":System.out.println(n1-n2);
		    break;
		case"*":System.out.println(n1*n2);
		    break;
		case"/":System.out.println(n1/n2);
		    break;
		}
	}

}
