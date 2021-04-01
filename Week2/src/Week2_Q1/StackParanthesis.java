package Week2_Q1;

public class StackParanthesis {
	
	boolean checkBalanced(String input) {
		String openBraces = "[{(";
		String closedBraces = "]})";
		int lngth = input.length();
		stack char_stk = new stack(lngth);
		
		for(int i=0; i<lngth; i++) {
			char braces = input.charAt(i);
			if(openBraces.indexOf(braces) != -1) {
				char_stk.push(braces);
				} else {
					int closed_indx = closedBraces.indexOf(braces);
					char similar_to_open = openBraces.charAt(closed_indx);
					if(char_stk.pop() != similar_to_open) {
						return false;
						}
					}
			}
		if(char_stk.peak() == -1) {
			return true;
			} else {
				return false;
				}
		}
	public static void main(String[] args) {
		String braces_input = "{()}{}";
		StackParanthesis bp = new StackParanthesis();
		boolean final_output = bp.checkBalanced(braces_input);
		System.out.println("Result: " + final_output);
		}
	}