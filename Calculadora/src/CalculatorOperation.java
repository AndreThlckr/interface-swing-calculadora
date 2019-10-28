
enum CalculatorOperation {
	SOMA("+") {
		@Override
		int execute(final int num1, final int num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO("-") {
		@Override
		int execute(final int num1, final int num2) {
			return num1 - num2;
		}
	},
	MULTIPLICACAO("*") {
		@Override
		int execute(final int num1, final int num2) {
			return num1 * num2;
		}
	},
	DIVISAO("/") {
		@Override
		int execute(final int num1, final int num2) {
			if (num2 == 0) {
				if (num1 == 0) {
					throw new ArithmeticException("Operação indefinida");
				} else {
					throw new ArithmeticException("Impossível dividir " + num1 + " por 0.");
				}
			} else {
				return num1 / num2;
			}
		}
	};
	private final String value;

	CalculatorOperation(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	abstract int execute(int num1, int num2);
}