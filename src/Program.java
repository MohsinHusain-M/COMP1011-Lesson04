/**
 * 
 */

/**
 * @author BlackArc
 *
 */

import javax.swing.JOptionPane;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstNumber ="";
		String secondNumber = "";
		
		
		
	    try {
			
	    	firstNumber = JOptionPane.showInputDialog("Enter First Integer");
	    	System.out.println(firstNumber);
		    secondNumber = JOptionPane.showInputDialog("Enter second integer");
			System.out.println(secondNumber);
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The Sum is " + sum, "Sum of two integers ", JOptionPane.PLAIN_MESSAGE);
	    	
		} catch (Exception e) {
			// TODO: handle exception
			//JOptionPane.showMessageDialog(null, "Incorrect Values Entered");
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered", "Entry Error", JOptionPane.ERROR_MESSAGE);
			System.out.println("Incorrect values Entered");
			System.out.println(e);
		}
	    
	    
		
	}

}
