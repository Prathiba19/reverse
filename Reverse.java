# reverse
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		String str=String.valueOf(num);
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
    
