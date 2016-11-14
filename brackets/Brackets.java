public class Brackets {
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("usage: java Brackets <statement1> [statement2 ... statementN]");
			return;
		}

		int i = 0;
		StringIterator stringIter;

		do {
			stringIter = new StringIterator(args[i]);

			System.out.println(isBalanced(stringIter, StringIterator.END_OF_STRING) ? "balanced" : "unbalanced");

			i++;
		} while (i < args.length);
	}

	private static boolean isBalanced(StringIterator stringIter, final char bracketClose) {

		char token;

		while (true) {
			token = stringIter.next();

			switch (token) {
				case StringIterator.END_OF_STRING:
				case ')':
				case '}':
				case ']':
				case '>':
					return token == bracketClose;

				case '(':
					if (isBalanced(stringIter, ')')) {
						break;
					}

					return false;

				case '{':
					if (isBalanced(stringIter, '}')) {
						break;
					}

					return false;

				case '[':
					if (isBalanced(stringIter, ']')) {
						break;
					}

					return false;

				case '<':
					if (isBalanced(stringIter, '>')) {
						break;
					}

					return false;

				default: // continue
					break;
			}
		}
	}


	private static class StringIterator {
		public static final char END_OF_STRING = 0;
		private String string;
		private int index;

		private StringIterator(String string) {
			this.string = string;
			this.index  = 0;
		}

		private char next() {
			if (this.index >= this.string.length()) {
				return END_OF_STRING;

			} else {
				final char nextChar = this.string.charAt(this.index);

				this.index++;

				return nextChar;
			}
		}
	}
}
