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
	private static final long serialVersionUID = 128609292020710218L;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine,
			dot, plus, minus, multiply, divide, equal, clear;
	private JTextArea text;
	private JPanel panel;
	private char op;
	private String result = "", nextNum = "";
	boolean hasDot = false, isStillEmpty = true;

	public SimpleCalculator() {
		initUI();
	}

	private void initUI() {

		setTitle("JCalculator");
		setResizable(false);
		panel = new JPanel(new FlowLayout());

		// 1 line, up to a total of 21 characters
		text = new JTextArea(2, 21);
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

		one.setPreferredSize(new Dimension(75, 25));
		two.setPreferredSize(new Dimension(75, 25));
		three.setPreferredSize(new Dimension(75, 25));
		four.setPreferredSize(new Dimension(75, 25));
		five.setPreferredSize(new Dimension(75, 25));
		six.setPreferredSize(new Dimension(75, 25));
		seven.setPreferredSize(new Dimension(75, 25));
		eight.setPreferredSize(new Dimension(75, 25));
		nine.setPreferredSize(new Dimension(75, 25));
		zero.setPreferredSize(new Dimension(75, 25));
		dot.setPreferredSize(new Dimension(75, 25));
		plus.setPreferredSize(new Dimension(75, 25));
		minus.setPreferredSize(new Dimension(75, 25));
		multiply.setPreferredSize(new Dimension(75, 25));
		divide.setPreferredSize(new Dimension(75, 25));
		equal.setPreferredSize(new Dimension(75, 25));
		clear.setPreferredSize(new Dimension(150, 25));

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

		add(panel);
		//width, height
		setSize(250, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "1";
				text.setText(nextNum);
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "2";
				text.setText(nextNum);
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "3";
				text.setText(nextNum);
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "4";
				text.setText(nextNum);
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "5";
				text.setText(nextNum);
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "6";
				text.setText(nextNum);
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "7";
				text.setText(nextNum);
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "8";
				text.setText(nextNum);
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (nextNum.equals("0"))
					nextNum = "";
				text.setText("");
				nextNum += "4";
				text.setText(nextNum);
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!nextNum.equals("0")) {
					text.setText("");
					nextNum += "0";
					text.setText(nextNum);
				}
			}
		});

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

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				text.setText("");
				result = "";
				nextNum = "";
			}
		});

		equal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				calculate(op);
			}
		});

		dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!hasDot) {
					hasDot = true;
					nextNum += ".";
					text.setText(nextNum);
				}
			}
		});
	}

	private void calculate(char operation) {
		float first, second;
		if (result.equals("")) {
			result = "0";
		}
		first = Float.parseFloat(result);
		second = Float.parseFloat(nextNum);
		switch (operation) {
		case '+': {
			first = first + second;
			result = Float.toString(first);
			text.setText(result);
			break;
		}
		case '-': {
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
			first = first / second;
			result = Float.toString(first);
			text.setText(result);
			break;
		}
		default:
			break;
		}
		nextNum = "";
	}
}
