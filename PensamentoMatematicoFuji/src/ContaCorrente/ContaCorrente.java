package ContaCorrente;

public class ContaCorrente {
	private float saldo;
	
	public ContaCorrente(float saldo) {
		this.saldo = saldo;
		
	}
	
	public ContaCorrente() {
		this.saldo = 0;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String sacar(float valor) {
		float saldoAnterior = saldo;
		float result = saldo - valor;
		if(result < 0) {
			return "Saldo Insufiente";
		} else {
			saldo = result;
		}
		
		return imprimirOperacao(saldoAnterior, valor, "sacar");		
	}
	
	
	public String depositar(float valor) {
		float saldoAnterior = saldo;
		saldo += valor;
		return imprimirOperacao(saldo, valor, "depositar");

	}
	
	public String imprimirOperacao(float saldoAntigo, float valor, String operacao) {
		if(operacao.equals("sacar")) {
			return saldoAntigo+"-"+valor+"="+saldo;
		} else if(operacao.equals("depositar")) {
			return saldoAntigo+"+"+valor+"="+saldo;
		} else {
			return "Operacao Invalida";
		}
	}
	
}
