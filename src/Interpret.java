/*
Write a simple interpreter which understands "+", "-", and "*" operations.
Apply the operations in order using command pairs starting with the initial value of `value`.
If you encounter an unknown command, return -1.

interpret(1, ["+"], [1]) => 2
interpret(4, ["-"], [2]) => 2
interpret(1, ["+", "*"], [1, 3]) => 6
*/
public class Interpret {

	
	public static void main(String arg[]) {
		
		int value = 1;
		String[] commands = {"+","-","*"};
		int[] args = {5,1,2};
		System.out.println(interpret(value, commands, args));
	}
	
	public static int interpret(int value, String[] commands, int[] args) {
		  
		  for(int i=0;i<commands.length;i++){
		    if(commands[i].equals("+")){
		      value +=args[i];
		    }
		     else if(commands[i].equals("-")){
		      value -=args[i];
		    }
		     else if(commands[i].equals("*")){
		      value *=args[i];
		    }
		    else{
		      return -1;
		    }
		  }
		  return value;
		}
}
