import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();   // line = "not not not True"
		String[] strs = line.split(" ");  // strs = {"not", "not", "not", "True"}; strs[0] == "not"; strs[1]=="not", strs[3]=="True". strs.length == 4
		int noOfNots = strs.length-1;
		
		if (noOfNots % 2 == 0) { // even
			System.out.println(strs[strs.length-1]);
		} else {// odd
			if (strs[strs.length-1].equals("True")) {
				System.out.println("False");
			} else {
				System.out.println("True");
			}
		}
	}

}
