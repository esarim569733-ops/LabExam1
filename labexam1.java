package Sarim;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
public class labexam1 {
	
	static Scanner input = new Scanner(System.in);
	static Queue<String> queue = new LinkedList<>();
	
	

	public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("===INPUT THE FOLLOWING COMMAND===");
			System.out.println("1. ADD Element: ");
			System.out.println("2. Display Element: ");
			System.out.println("3. Permutate Element: ");
			choice = input.nextInt();
		
			
			switch(choice) {
			
			case 1:
				addElement();
				break;
			case 2:
				displayElement();
				break;
			case 3:
				 generatePermutations();
				break;
				
			default:
				System.out.println("Invalid");

			
			}
		}
			while(choice != 4);
			
		
	
		
		
		
		}
	static void addElement() {
		System.out.println("Enter number of elements:");
		int num = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter elements: ");
			String ele = input.nextLine();
			queue.add(ele);
			
				
		}
		
		
	}
	static void displayElement() {
		if (queue.isEmpty()) {
			System.out.println("Empty list");
		}
		else {
			System.out.println(queue);
		}
		System.out.println("Dequeuing....");
		queue.poll();
		queue.poll();
		System.out.println(queue);
	}
	
	 static void generatePermutations() {
	    	if (queue.isEmpty()) {
	    		System.out.println("Queue is empty. Add elements first.");
	    		return;
	    	}
	    	
	    	System.out.println("How many elements should be selected? ");
	    	int num = input.nextInt();
	    	input.nextLine();
	    	
	    	ArrayList<String> list = new ArrayList<>(queue);
	    	
	    	if (num < 1 || num > list.size()) {
	    		System.out.println("Invalid number.");
	    		return;
	    	}
	    	
	    	System.out.println("Permutations:");
	    	int total = permute(list, "", 0, num);
	    	System.out.println("Total permutations: " + total);
	 
	 
	      
	 
	    }
	    
	
	    static int permute(ArrayList<String> list, String current, int picked, int r) {
	    	if (picked == r) {
	    		System.out.println(current);
	    		return 1;
	    	}
	    	
	    	int count = 0;
	    	for (int i = 0; i < list.size(); i++) {
	    		String item = list.remove(i);
	    		count += permute(list, current.isEmpty() ? item : current + "," + item, picked + 1, r);
	    		list.add(i, item);
	    	}
	    	return count;
	    }
}