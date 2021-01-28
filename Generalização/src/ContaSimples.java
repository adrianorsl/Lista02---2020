
public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	public ContaSimples() {
		super();
	}
	
	public ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca > 0)
			this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double depositoPoupanca) {
		if (depositoPoupanca > 0) {
			saldo += depositoPoupanca;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean saquePoupanca(double saquePoupanca) {
		if (saldo >= saquePoupanca) {
			saldo -= saquePoupanca;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
