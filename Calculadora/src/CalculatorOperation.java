
enum CalculatorOperation {
	SOMA("+") {
		@Override
		double execute(final double num1, final double num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO("-") {
		@Override
		double execute(final double num1, final double num2) {
			return num1 - num2;
		}
	},
	MULTIPLICACAO("*") {
		@Override
		double execute(final double num1, final double num2) {
			return num1 * num2;
		}
	},
	DIVISAO("/") {
		@Override
		double execute(final double num1, final double num2) {
			if (num2 == 0) {
				if (num1 == 0) {
					throw new ArithmeticException("Opera��o indefinida");
				} else {
					throw new ArithmeticException("Imposs�vel dividir " + num1 + " por 0.");
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

	abstract double execute(double num1, double num2);
}