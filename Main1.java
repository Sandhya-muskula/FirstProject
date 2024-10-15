package condittionalstatements;

public class Main1 {

	public static void main(String[] args) {
		int n = 12346789;
		int count = 0;
		while(n!=0) {
			n = n/10;
			count++;
		}
        System.out.println(count);
	}

}
