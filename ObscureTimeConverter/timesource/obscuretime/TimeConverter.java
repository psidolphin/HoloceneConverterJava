package obscuretime;
import java.util.*;
public class TimeConverter {


	public static void ask() {
		System.out.println("This converts a calendar year you input in stdin to Holocene, only BC/AD/BCE/CE");
		System.out.println("For example Today is June 9 2020, in Holocene that would be june 9 12020");

	}



	public static void main(String[] args) {
		ask();
		Scanner sc = new Scanner(System.in);
		System.out.println("The year:");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("AD/CE or BC/BCE, in all caps");
		String era = sc.nextLine();
		if(era.equals("BC")) {
			if(year == 1) {
				System.out.println("The holocene year is\t" + 10000);
				sc.close();
				System.exit(0);
			}else if(year > 1) {
				int ans = 10001 - year;
				System.out.println("The holocene year is\t" + ans);
				sc.close();
				System.exit(0);
			}else {
				System.out.println("Now you've done it");
				sc.close();
				System.exit(0);
			}
		}else if(era.equals("AD")) {
			if(year == 1) {
				System.out.println("Holocene year is\t" + 10001);
				sc.close();
				System.exit(0);

			}else if(year > 1) {
				int ans = 10000 + year;
				System.out.println("Holocene year is\t" + ans);
				sc.close();
				System.exit(0);
			}else {
				System.out.println("Now you've done it");
				sc.close();
				System.exit(0);
			}
		}


	}

}

