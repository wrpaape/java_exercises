import java.util.Stack;
import java.util.EmptyStackException;


public class ReversePolish {
	public static void main(String[] args) {

		Stack<Integer> accumulator;
		String arg;
		int i;
		char token;
		Integer operand1;
		Integer operand2;

		if (args.length == 0) {
				exitOnFailure("no input");
		}

		accumulator = new Stack<Integer>();
		i = 0;

		while (true) {
			arg = args[i];

			switch (arg.length()) {
				case 0:
					exitOnFailure("empty input");

				case 1:
					token = arg.charAt(0);
					switch (token) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							accumulator.push(Integer.valueOf(Character.getNumericValue(token)));
							break;

						case '+':
						case '-':
						case '/':
						case '*':
							try {
								operand1 = accumulator.pop();
								operand2 = accumulator.pop();

								switch (token) {
									case '+':
										operand1 = operand2 + operand1;
										break;

									case '-':
										operand1 = operand2 - operand1;
										break;

									case '/':
										operand1 = operand2 / operand1;
										break;

									default:
										operand1 = operand2 * operand1;
								}

								accumulator.push(operand1);
								break;

							} catch(EmptyStackException e) {
								exitOnFailure("imbalanced expression");
							}

						default:
							exitOnFailure("invalid input: \"" + arg + "\"");
					}
					break;

				default:
					try {
						accumulator.push(Integer.valueOf(Integer.parseInt(arg)));
						
					} catch(NumberFormatException e) {
						exitOnFailure("invalid input: \"" + arg + "\"");
					}
			}

			++i;

			if (i == args.length) {
				try {
					operand1 = accumulator.pop();

					System.out.println(operand1);

				} catch(EmptyStackException e) {
					exitOnFailure("imbalanced expression");

				}

				if (accumulator.empty()) {
					return;

				} else {
					exitOnFailure("imbalanced expression");
				}
			}
		}
	}


	private static void exitOnFailure(String failure) {
		System.err.println(failure);
		System.exit(1);
	}
} 
