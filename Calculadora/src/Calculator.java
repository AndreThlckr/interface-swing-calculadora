public class Calculator {
	private Double primeiroValor;
	private Double segundoValor;
	private CalculatorOperation operacao;

	public Calculator() {
		primeiroValor = null;
		segundoValor = null;
		operacao = null;
	}

	public void setPrimeiroValor(double valor) {
		primeiroValor = valor;
	}

	public void setSegundoValor(double valor) {
		segundoValor = valor;
	}

	public void setOperacao(CalculatorOperation operacao) {
		this.operacao = operacao;
	}

	public double getResultado() {
		if (operacao == null) {
			if (primeiroValor == null) {
				return 0;
			} else {
				return primeiroValor;
			}
		} else if (segundoValor == null) {
			return operacao.execute(primeiroValor, primeiroValor);
		} else {

			return operacao.execute(primeiroValor, segundoValor);
		}
	}
	
	public boolean isPrimeiroValorEntered() {
		if(primeiroValor != null) {
			return true;
		} else {
			return false;
		}
	}

	public void cleanMemory() {
		primeiroValor = null;
		segundoValor = null;
		operacao = null;
	}

}
