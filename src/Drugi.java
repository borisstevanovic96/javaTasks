import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Drugi {
	public static void longestSequence(String s) {
		int j = 1;
		int max = 1;
		int k = 0;
		char first = s.charAt(0);
		String[] consecutiveDigits = new String[s.length()];
		String maxString = "";
		String pomocniString = String.valueOf(first);
		for(int i=0;i<s.length()-1;i++) {
			char c1 = s.charAt(i);
			String s1 = String.valueOf(c1);
			int a1 = Character.getNumericValue(c1);
			char c2 = s.charAt(i+1);
			String s2 = String.valueOf(c2);
			int a2 = Character.getNumericValue(c2);
			if(a2==a1+1) {
				j++;
				if(j>max) {
					max = j;
					//maxString += s2;
					maxString = pomocniString + s2;
					pomocniString += s2;
				}else {
					//maxString += s2;
					maxString = pomocniString + s2;
					pomocniString += s2;
				}
			}else {
				if(maxString!="") {
					consecutiveDigits[k] = maxString;
				}
				maxString = "";
				k++;
				//max=1;
				j=1;
				pomocniString = s2;
			}
		}
		for(int l=0;l<consecutiveDigits.length;l++) {
			System.out.println(consecutiveDigits[l]);
			if(consecutiveDigits[l]==null) {
				consecutiveDigits[l]="";
			}
		}
		
		List<String> strings = Arrays.asList(consecutiveDigits);    
		String longest = strings.stream().
		    max(Comparator.comparingInt(String::length)).get();
		System.out.println(longest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        longestSequence(name);
	}
}