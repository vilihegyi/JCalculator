package program;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SimpleCalculator extends JFrame {
	// Declaration of a personal serialVersioUID not to have errors in the
	// future
	private static final long serialVersionUID = 128609292020710218L;
	// Declaration of the buttons
	private JButton zero, one, two, three, four, five, six, seven, eight, nine,
			dot, plus, minus, multiply, divide, equal, clear;
	// Declaration of the text area/screen
	private JTextArea text;
	// Declaration of a panel which holds our buttons and shows them on the
	// frame
	private JPanel panel;
	// Declaration and creation of a custom size
	Dimension dim = new Dimension(75, 25);
	// Variabile to store the operation we do (needed for equal mostly)
	private char op;
	// Strings that hold the result, and the next introduced number
	private String result = "", nextNum = "";
	// Booleans to check if our "number" has a dot already or not to avoid
	// repetition and another one to check if our strings are still empty or not
	private boolean hasDot = false, isStillEmpty = true;

	// Class constructor
	public SimpleCalculator() {
		initUI();
	}

	// Private method which initializes the user interface
	private void initUI() {

		// Frame title and resizability modifiers
		setTitle("JCalculator");
		setResizable(false);
		// Creation of the JPanel with a flow layout
		panel = new JPanel(new FlowLayout());

		// Text area: 1 line, up to a total of 21 characters
		text = new JTextArea(2, 21);
		// Creating the buttons with the appropriate text to suggest what it
		// does upon pressing
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		dot = new JButton(".");
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		equal = new JButton("=");
		clear = new JButton("CE");

		// Adding dimensions to the buttons to resize them
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(dim);
		dot.setPreferredSize(dim);
		plus.setPreferredSize(dim);
		minus.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		divide.setPreferredSize(dim);
		equal.setPreferredSize(dim);
		clear.setPreferredSize(new Dimension(150, 25));

		// Adding the elements to the panel
		panel.add(text);
		panel.add(clear);
		panel.add(equal);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(dot);
		panel.add(zero);
		panel.add(plus);
		panel.add(minus);
		panel.add(multiply);
		panel.add(divide);

		// adding the panel to the frame
		add(panel);
		// Further details of the frame: size, location, and default close
		// operation
		// width, height
		setSize(250, 275);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Action listeners so that our buttons have some functionality once
		// they are pressed/clicked!

		/*
		 * Logic of the numerical numbers: 0: if the text isn't 0, it adds a 0
		 * character to the string, otherwise it doesn't do anything not to
		 * repeat it Other numbers: checks if number is 0 so it replaces it
		 * (because we don't work with cell/phone numbers here), otherwise it
		 * adds it to the end of the string
		 */

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "1";
				text.setText(nextNum);
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "2";
				text.setText(nextNum);
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "3";
				text.setText(nextNum);
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "4";
				text.setText(nextNum);
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "5";
				text.setText(nextNum);
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "6";
				text.setText(nextNum);
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "7";
				text.setText(nextNum);
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "8";
				text.setText(nextNum);
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum = nextNum + "4";
				text.setText(nextNum);
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!nextNum.equals("0")) {
					text.setText("");
					nextNum = nextNum + "0";
					text.setText(nextNum);
				}
			}
		});

		// Action handlers for the operational signed buttons
		/*
		 * Logic of these buttons: The op variable stores the operation in case
		 * the user clicks on equal so we know what operation we have to do The
		 * method calculate is appealed in case we have multiple operations to
		 * know which one to do,eq. we have 2 + 2 - 1, then the calculator first
		 * does the 2 + 2 then it subtracts 1 from 4, which gives us 3
		 */
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				op = '+';
				calculate(op);
			}
		});

		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				op = '-';
				calculate(op);
			}
		});

		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				op = '*';
				calculate(op);
			}
		});

		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				op = '/';
				calculate(op);
			}
		});

		// Action handle for clearing everything up. Basically everything is
		// reseted here
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				text.setText("");
				result = "";
				nextNum = "";
				hasDot = false;
				isStillEmpty = true;
			}
		});

		// We perform the operation we have stored in the op variable
		equal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				calculate(op);
			}
		});

		// Action handler for the dot button
		/*
		 * Logic of the button: checks if there is already a dot in the number
		 * (so if it's a non integer) and if there isn't one, it adds it to end
		 * of the string, otherwise it does nothing not to do anything wrong
		 */
		dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!hasDot) {
					hasDot = true;
					if(nextNum.equals(""))
						nextNum = "0";
					nextNum = nextNum + ".";
					text.setText(nextNum);
				}
			}
		});
	}

	// Private method used by the Simple calculator to perform the operations
	// and show on the screen the proper result
	private void calculate(char operation) {
		float first, second;
		// Checking if our result variable is empty
		if (result.equals("")) {
			if (operation == '/')
				result = "1";
			else if(operation == '*')
				result = "1";
			else
				result = "0";
		}
		// Conversion from String to Float
		first = Float.parseFloat(result);
		try {
			second = Float.parseFloat(nextNum);
		} catch (NumberFormatException e) {
			if (operation == '+') {
				second = 0;
			} else if (operation == '-') {
				second = 0;
			} else if (operation == '*') {
				second = 1;
			} else {
				second = 1;
			}
		}
		// We do the operation for it's respective case based on the taken
		// variable
		switch (operation) {
		case '+': {
			first = first + second;
			result = Float.toString(first);
			text.setText(result);
			break;
		}
		case '-': {
			// If condition not to get a negative number as we set result to be
			// 0 in case it is empty
			if (!isStillEmpty)
				first = first - second;
			else {
				first = second - first;
				isStillEmpty = false;
			}
			result = Float.toString(first);
			text.setText(result);
			break;
		}
		case '*': {
			if (!isStillEmpty)
				first = first * second;
			else {
				first = second;
				isStillEmpty = false;
			}
			result = Float.toString(first);
			text.setText(result);
			break;
		}
		case '/': {
			// Checking for absurdities (dividing by 0)
			if (second == 0) {
				text.setText("Cannot divide by 0!");
			} else if (isStillEmpty) {
				first = second / first;
				result = Float.toString(first);
				text.setText(result);
				isStillEmpty = false;
			} else {
				first = first / second;
				result = Float.toString(first);
				text.setText(result);
			}
			break;
		}
		// This case is never reached
		default:
			break;
		}
		// we reset the nextNum variable so we can have another one stored in it
		nextNum = "";
		hasDot = false;
	}

	// In case of reopening the calculator
	public void reset() {
		text.setText("");
		result = "";
		nextNum = "";
		hasDot = false;
		isStillEmpty = true;
	}
}
