package program;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ScientificCalculator extends JFrame {
	// Declaration of a personal serialVersioUID not to have errors in the
	// future
	private static final long serialVersionUID = 128609292020710218L;
	// Declaration of the buttons
	private JButton zero, one, two, three, four, five, six, seven, eight, nine,
			dot, clear, factorial, power, squareRoot, modulus, sin, cos, tan,
			asin, acos, atan, sinh, cosh, tanh, changeSign;
	// Declaration of the text area/screen
	private JTextArea text;
	// Declaration of a panel which holds our buttons and shows them on the
	// frame
	private JPanel panel;
	// Declaration and creation of a custom size
	private Dimension dim = new Dimension(75, 25);
	// Declaration and creationg of a custom font style for the text appearance
	private Font font = new Font("Serif", Font.ITALIC, 14);
	// Variable of type double (for better precision in comparison to float) to
	// work with at the trigonometrical functions
	double num;
	// String that holds the result and number on screen, as this calculator
	// works with mono operational numbers
	private String result = "";
	// Boolean to check if the number is a non integer
	private boolean hasDot = false;

	// Class constructor
	public ScientificCalculator() {
		initUI();
	}

	// Method to initialize the interface
	private void initUI() {

		// JFrame specifications
		setTitle("JCalculator");
		setResizable(false);
		// Creation of the panel
		panel = new JPanel(new FlowLayout());

		// Text area: 1 line, up to a total of 21 characters
		text = new JTextArea(1, 21);
		// Creation of the buttons using "keyboard" characters, respectively
		// UNICODE characters
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
		clear = new JButton("CE");
		factorial = new JButton("n!");
		power = new JButton("x\u00B2");
		squareRoot = new JButton("\u221Ax");
		modulus = new JButton("|x|");
		sin = new JButton("sin");
		cos = new JButton("cos");
		tan = new JButton("tan");
		asin = new JButton("asin");
		acos = new JButton("acos");
		atan = new JButton("atan");
		sinh = new JButton("sinh");
		cosh = new JButton("cosh");
		tanh = new JButton("tanh");
		changeSign = new JButton("\u00B1");

		// Setting a custom font for the trigonometrical operations
		sin.setFont(font);
		cos.setFont(font);
		tan.setFont(font);
		asin.setFont(font);
		acos.setFont(font);
		atan.setFont(font);
		sinh.setFont(font);
		cosh.setFont(font);
		tanh.setFont(font);

		// Setting a custom size for the buttons and scren
		text.setPreferredSize(dim);
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
		modulus.setPreferredSize(dim);
		dot.setPreferredSize(dim);
		clear.setPreferredSize(new Dimension(235, 25));
		factorial.setPreferredSize(dim);
		power.setPreferredSize(dim);
		squareRoot.setPreferredSize(dim);
		sin.setPreferredSize(dim);
		cos.setPreferredSize(dim);
		tan.setPreferredSize(dim);
		asin.setPreferredSize(dim);
		acos.setPreferredSize(dim);
		atan.setPreferredSize(dim);
		sinh.setPreferredSize(dim);
		cosh.setPreferredSize(dim);
		tanh.setPreferredSize(dim);
		changeSign.setPreferredSize(new Dimension(235, 25));

		// Adding the elements to the panel
		panel.add(text);
		panel.add(clear);
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
		panel.add(modulus);
		panel.add(factorial);
		panel.add(power);
		panel.add(squareRoot);
		panel.add(sin);
		panel.add(cos);
		panel.add(tan);
		panel.add(asin);
		panel.add(acos);
		panel.add(atan);
		panel.add(sinh);
		panel.add(cosh);
		panel.add(tanh);
		panel.add(changeSign);

		// Adding the panel to the frame
		add(panel);

		// Configuring the frame a little more
		// width, height
		setSize(250, 380);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Action handlers for the buttons
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "1";
				text.setText(result);
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "2";
				text.setText(result);
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "3";
				text.setText(result);
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "4";
				text.setText(result);
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "5";
				text.setText(result);
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "6";
				text.setText(result);
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "7";
				text.setText(result);
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "8";
				text.setText(result);
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "9";
				text.setText(result);
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!result.equals("0")) {
					text.setText("");
					result += "0";
					text.setText(result);
				}
			}
		});

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				text.setText("");
				result = "";
				hasDot = false;
			}
		});

		dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!hasDot) {
					hasDot = true;
					if(result.equals(""))
						result = "0";
					result += ".";
					text.setText(result);
				}
			}
		});

		factorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int i;
				double fact = 1;
				
					// In the for (due to laziness) we convert the number into
					// an
					// integer before performing the operation (this in case the
					// number on the screen is of a non-integer type)
					for (i = 2; i <= Integer.parseInt(result.split("\\.")[0]); i++)
						fact *= i;

					if (fact != Double.POSITIVE_INFINITY) {
						result = Double.toString(fact);
						text.setText(result);
					}
					else {
						result = "0";
						text.setText("Number too large! Result is now 0!");
					}
				/*} catch (NumberFormatException e) {
					text.setText("Number too large! Result will reset");
					result = "";
				}*/
			}
		});

		power.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				num = Double.parseDouble(result);
				num = Math.pow(num, 2);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		squareRoot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				num = Double.parseDouble(result);
				num = Math.sqrt(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		modulus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				num = Double.parseDouble(result);
				if (num < 0)
					num *= -1;
				result = Double.toString(num);
				text.setText(result);
			}
		});

		changeSign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				num = Double.parseDouble(result);
				num *= -1;
				result = Double.toString(num);
				text.setText(result);
			}
		});

		sin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('s', 0);
			}
		});

		asin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('s', 1);
			}
		});

		sinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('s', 2);
			}
		});

		cos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('c', 0);
			}
		});

		acos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('c', 1);
			}
		});

		cosh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('c', 2);
			}
		});

		tan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('t', 0);
			}
		});

		atan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('t', 1);
			}
		});

		tanh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				trigonometricalOperations('t', 2);
			}
		});
	}

	// Method that handles the trigonometrical operations, to avoid code
	// repitition
	private void trigonometricalOperations(char trigonometricalOperation,
			int type) {
		num = Double.parseDouble(result);
		// Based on the given operation (sin, cos, tan) and type (normal,
		// inverse, hyperbolic) we do the operation
		switch (trigonometricalOperation) {
		case 's': {
			switch (type) {
			case 0: {
				result = Double.toString(Math.sin(num));
				break;
			}

			case 1: {
				result = Double.toString(Math.asin(num));
				break;
			}

			case 2: {
				result = Double.toString(Math.sinh(num));
				break;
			}
			// This will never be reached, but we have to put it, just in
			// case...
			default:
				break;
			}
		}
		case 'c': {
			switch (type) {
			case 0: {
				result = Double.toString(Math.cos(num));
				break;
			}

			case 1: {
				result = Double.toString(Math.acos(num));
				break;
			}

			case 2: {
				result = Double.toString(Math.cosh(num));
				break;
			}
			// This will never be reached, but we have to put it, just in
			// case...
			default:
				break;
			}
		}
		case 't': {
			switch (type) {
			case 0: {
				result = Double.toString(Math.tan(num));
				break;
			}

			case 1: {
				result = Double.toString(Math.atan(num));
				break;
			}

			case 2: {
				result = Double.toString(Math.tanh(num));
				break;
			}
			// This will never be reached, but we have to put it, just in
			// case...
			default:
				break;
			}
		}
		// This will never be reached, but we have to put it, just in case...
		default:
			break;
		}

		// Eventually, we show the result we've obtained
		text.setText(result);
	}

	// In case we reopen
	public void reset() {
		text.setText("");
		result = "";
		hasDot = false;
	}
}
