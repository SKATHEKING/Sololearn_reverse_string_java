import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		
	
	String reverted ="";
	for (int i=arr.length-1;i>=0;i--) {
    reverted += arr[i];
	}
	System.out.println(reverted);
	}
}
