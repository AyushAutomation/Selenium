package CreitSuissewe;

public class Clqasd {

	public static void main(String[] args) {
		String s="Ayush";
		int Count =0;
		for( int i=0;i<=s.length(); i++)
		{
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				Count++;
			}
		}
		
		System.out.println("Number of vowels"  +Count);

	}

}
