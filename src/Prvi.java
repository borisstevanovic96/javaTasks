import java.util.Scanner;

public class Prvi {
	
	 public static int traverseString(String str)
	    {
		 int j  = 0;
	        for (int i = 0; i < str.length()-1; i++) {
	        	if(str.charAt(i)=='1' && str.charAt(i+1)=='1'  && i!=0 && str.charAt(i-1)=='0') {
	        		j++;
	        	}
	        }
		    if(str.charAt(0)==str.charAt(1) && str.charAt(2) != '1' && str.length()>=3) {
	        	j++;
	        }
	        return j;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite binarni string: ");
        String binaryString = scanner.nextLine();
        System.out.println(traverseString(name));
	}

}
