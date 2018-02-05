package program;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ProgrammingCalculator extends JFrame {
	private static final long serialVersionUID = 128609292020710218L;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine,
			plus, minus, multiply, divide, equal, clear, blackspace;
	private JTextArea text;
	private JPanel contentPanel;

	private String nextNum = "", result = ""; // all the time i have an result
												// with wich
	// i will work . and after that i will
	// do operations with next number after
	// him
	private char operations;
	private Font tahoma = new Font("Tahoma", Font.ITALIC, 20);
	private Font font = new Font("Verdana", Font.BOLD, 10);
	// the color of border panel
	private Border border = BorderFactory.createLineBorder(Color.CYAN);
	// The size of the elements (buttons)
	private Dimension dim = new Dimension(75, 25);
	// Colors
	private Color clblack = new Color(255, 51, 204);
	private Color foreground = new Color(255, 255, 255);
	private boolean stillEmpty = true; // for * and - of type boolean

	// private JLabel labelOtal, labelHexa, labelBinary;
	private JLabel labelOctal, labelHexa, labelBinary;
	private JTextField textOctal, textHexa, textBinary;

	public ProgrammingCalculator() {

		initUI();
	}

	private void initUI() {
		setTitle("JCalculator");
		setResizable(false);
		contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout());

		// in these lines we set alignment to our buttons

		// 1 line, up to a total of 20 characters

		text = new JTextArea(1, 20);

		one = new JButton("1");

		two = new JButton("2");

		three = new JButton("3");

		four = new JButton("4");

		five = new JButton("5");

		six = new JButton("6");

		seven = new JButton("7");

		eight = new JButton("8");

		nine = new JButton("9");

		zero = new JButton("0");

		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		equal = new JButton("=");
		clear = new JButton("CE");
		blackspace = new JButton("<");

		labelBinary = new JLabel("Binary: ");
		textBinary = new JTextField(16);
		labelOctal = new JLabel("Octal: ");
		textOctal = new JTextField(16);
		labelHexa = new JLabel("Hexa: ");
		textHexa = new JTextField(16);

		// the color of panel
		contentPanel.setBackground((Color.BLUE));

		contentPanel.setBorder(border);

		// in this part we want to resize the all buttons and screen
		text.setPreferredSize(dim);
		zero.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		one.setPreferredSize(dim);
		plus.setPreferredSize(dim);
		minus.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		divide.setPreferredSize(dim);
		equal.setPreferredSize(dim);
		blackspace.setPreferredSize(new Dimension(110, 25));
		clear.setPreferredSize(new Dimension(110, 25));

		// the fonts of the all buttons
		zero.setFont(tahoma);
		one.setFont(tahoma);
		two.setFont(tahoma);
		three.setFont(tahoma);
		four.setFont(tahoma);
		five.setFont(tahoma);
		six.setFont(tahoma);
		seven.setFont(tahoma);
		eight.setFont(tahoma);
		nine.setFont(tahoma);
		plus.setFont(tahoma);
		minus.setFont(tahoma);
		multiply.setFont(tahoma);
		divide.setFont(tahoma);

		labelBinary.setFont(font);
		labelOctal.setFont(font);
		labelHexa.setFont(font);

		// Set the foreground
		labelBinary.setForeground(Color.CYAN);
		labelOctal.setForeground(Color.CYAN);
		labelHexa.setForeground(Color.CYAN);

		textBinary.setBackground(Color.ORANGE);
		textOctal.setBackground(Color.ORANGE);
		textHexa.setBackground(Color.ORANGE);

		contentPanel.add(text, BorderLayout.NORTH);
		contentPanel.add(text);

		contentPanel.add(one);
		contentPanel.add(two);
		contentPanel.add(three);
		contentPanel.add(four);
		contentPanel.add(five);
		contentPanel.add(six);
		contentPanel.add(seven);
		contentPanel.add(eight);
		contentPanel.add(nine);
		contentPanel.add(zero);
		contentPanel.add(plus);
		contentPanel.add(minus);
		contentPanel.add(multiply);
		contentPanel.add(divide);
		contentPanel.add(equal);
		contentPanel.add(clear);
		contentPanel.add(blackspace);

		contentPanel.add(labelBinary);
		contentPanel.add(textBinary);
		contentPanel.add(labelOctal);
		contentPanel.add(textOctal);
		contentPanel.add(labelHexa);
		contentPanel.add(textHexa);

		getContentPane().add(contentPanel, BorderLayout.CENTER);

		// width,height
		setSize(250, 340);
		// frame.setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Design all the buttons
		// Background for buttons
		zero.setBackground(clblack);
		one.setBackground(clblack);
		two.setBackground(clblack);
		three.setBackground(clblack);
		four.setBackground(clblack);
		five.setBackground(clblack);
		six.setBackground(clblack);
		seven.setBackground(clblack);
		eight.setBackground(clblack);
		nine.setBackground(clblack);
		plus.setBackground(clblack);
		minus.setBackground(clblack);
		multiply.setBackground(clblack);
		divide.setBackground(clblack);
		clear.setBackground(clblack);
		equal.setBackground(clblack);
		blackspace.setBackground(clblack);

		// Foreground for buttons

		zero.setForeground(foreground);
		one.setForeground(foreground);
		two.setForeground(foreground);
		three.setForeground(foreground);
		four.setForeground(foreground);
		five.setForeground(foreground);
		six.setForeground(foreground);
		seven.setForeground(foreground);
		eight.setForeground(foreground);
		nine.setForeground(foreground);
		plus.setForeground(foreground);
		minus.setForeground(foreground);
		multiply.setForeground(foreground);
		divide.setForeground(foreground);
		clear.setForeground(foreground);
		blackspace.setForeground(foreground);
		equal.setForeground(foreground);

		// actionListener for all buttons

		// delete the numbers

		blackspace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backspaceUpdate();
				updateDataConvert();
			}
		});

		// this method show you how to accept only the numbers in the textfield

		text.addKeyListener(new KeyAdapter() {
			// no string methods
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();

				if (((character < '0') || (character > '9'))) {
					e.consume();
				}
				updateDataConvert();
			}
		});

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText("0");
				result = "";
				nextNum = "0";
				stillEmpty = true;
				updateDataConvert();
			}
		});
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!nextNum.equals("0")) {
					text.setText("");
					nextNum += "0";
					text.setText(nextNum);
					updateDataConvert();
				}
			}
		});

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "1";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "2";
				text.setText(nextNum);
				updateDataConvert();
			}

		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "3";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "4";
				text.setText(nextNum);
				updateDataConvert();

			}

		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "5";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "6";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "7";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "8";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "9";
				text.setText(nextNum);
				updateDataConvert();
			}
		});

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations = '+';
				calculation(operations);
			}
		});

		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations = '-';
				calculation(operations);
			}
		});

		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations = '*';
				calculation(operations);
			}
		});

		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations = '/';
				calculation(operations);
			}
		});

		equal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculation(operations);
				updateDataConvert();
			}
		});
	}

	// method for operations +, -, *, /;

	public void calculation(char operation) {
		// parameter for operation of type char
		int firstNumber, secondNumber;
		// Checking if our result variable is empty
		try {
			// result between 2 numbers or more
			firstNumber = Integer.parseInt(result);
			stillEmpty = false;
		} catch (NumberFormatException e) {
			if (operation == '*') {
				firstNumber = 1;
			} else if (operation == '/') {
				firstNumber = 1;
			} else
				firstNumber = 0;
			stillEmpty = true;
		}
		// the second number is the
		// nextNum after of him
		try {
			secondNumber = Integer.parseInt(nextNum);
		} catch (NumberFormatException e) {
			if (operation == '*') {
				secondNumber = 1;
			} else if (operation == '/') {
				secondNumber = 1;
			} else
				secondNumber = 0;
		}

		switch (operation) {
		case '+': {
			firstNumber = firstNumber + secondNumber;
			result = Integer.toString(firstNumber);
			text.setText(result);
			break;
		}
		case '-': {
			if (!stillEmpty) {
				firstNumber = firstNumber - secondNumber;
				result = Integer.toString(firstNumber);
				text.setText(result);
				break;
			} else {
				firstNumber = secondNumber - firstNumber;
				stillEmpty = false;
				result = Integer.toString(firstNumber);
				text.setText(result);
				break;
			}
		}
		case '*': {
			if (!stillEmpty) {
				firstNumber = firstNumber * secondNumber;
				stillEmpty = false;
				result = Integer.toString(firstNumber);
				text.setText(result);
				break;
			} else {
				firstNumber = secondNumber;
				stillEmpty = false;
				result = Integer.toString(firstNumber);
				text.setText(result);
				break;
			}
		}
		case '/': {
			// Checking for absurdities (dividing by 0)
			if (secondNumber == 0) {
				text.setText("Cannot divide by 0!");
				break;
			} else if (stillEmpty) {
				firstNumber = secondNumber / firstNumber;
				result = Integer.toString(firstNumber);
				text.setText(result);
				stillEmpty = false;
				break;
			} else {
				firstNumber = firstNumber / secondNumber;
				result = Integer.toString(firstNumber);
				text.setText(result);
				break;
			}
		}
		// never reached
		default: {
			break;
		}
		}
		updateDataConvert();
		nextNum = "";
	}

	private void updateDataConvert() {
		// updating result only would be logical...
		try {
			int binary, octal, hexadecimal;

			if (result.equals("")) {
				// if verifying the string is empty so we give 0
				// as starting value
				binary = Integer.parseInt(nextNum);
			}
			// conversion to int from string
			else {
				binary = Integer.parseInt(result);
			}
			// conversion into binary text but also setting the jtextfield
			// update the value
			textBinary.setText(Integer.toBinaryString(binary));

			if (result.equals("")) {
				// if verifying the string is empty so we give 0
				// as starting value
				hexadecimal = Integer.parseInt(nextNum);
			}
			// conversion to int from string
			else {
				hexadecimal = Integer.parseInt(result);
			}
			// conversion to hexa text but also setting the jtextfield
			// update the value
			textHexa.setText(Integer.toHexString(hexadecimal));

			if (result.equals("")) // if verifying the string is empty so we
									// give 0
									// as starting value
			{
				octal = Integer.parseInt(nextNum);
			}

			// conversion to int from string
			else {
				octal = Integer.parseInt(result);
			}
			// conversion to hexa text but also setting the jtextfield
			// update the value
			textOctal.setText(Integer.toOctalString(octal));
		} catch (Exception e) {
			textBinary.setText("0");
			textHexa.setText("0");
			textOctal.setText("0");
		}

	}

	// method for deleting the last character
	public void backspaceUpdate() {
		// We check if either one is empty
		// We basicall just cut down the last character here
		if (!result.equals("") && result != null && result.length() > 0) {
			result = result.substring(0, result.length() - 1);
			text.setText(result);
		} else if (!nextNum.equals("") && nextNum != null
				&& nextNum.length() > 0) {
			nextNum = nextNum.substring(0, nextNum.length() - 1);
			text.setText(nextNum);
		}
	}

	// In case of reopening
	public void reset() {
		text.setText("");
		result = "";
		nextNum = "";
	}
}
