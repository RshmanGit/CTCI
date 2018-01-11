import java.util.Scanner;
import java.lang.*;

public class urlify{

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		String url = "";
		
		str = sc.nextLine();
		
		int truelen = sc.nextInt();
		
		Character space = new Character(' ');
		
		for(int i = 0; i < truelen; i++){
			Character temp = new Character(str.charAt(i));
			if(temp.compareTo(space) == 0){
				url = url + "%20";
			}
			else{
				url = url + str.charAt(i);
			}
		}
		
		System.out.println(url);
		
	}
}
