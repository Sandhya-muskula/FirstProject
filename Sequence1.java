package condittionalstatements;

public class Sequence1 {
    
	public static void main(String[] args) {
		/*initialization*/
		int term=2;
		while(term<=442)
		{
			if(term%4==0)
			{
				System.out.println(-term+",");
			}
			else
			{
				System.out.println(term+",");
			}
			/*update*/
			term=term+2;
		}
	}
}
		
	
			
		
	