import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<String> AL = new ArrayList<String>();
		
		int num = sc.nextInt();
		int[] list = new int[num];
		for (int i=0; i<num; i++) {
			list[i] = sc.nextInt();
		}
		int index = 0;
		for (int i=1; i<=num; i++) {
			stack.push(i);
			AL.add("+");
			while (!stack.isEmpty()) {
				if (stack.peek() == list[index]) {
					stack.pop();
					AL.add("-");
					index++;
				} else {
					break;
				}
			}
		}
		if (!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			for (int i=0; i<num; i++) {
				System.out.println(AL.get(i));
			}
		}
	sc.close();	
	}
}