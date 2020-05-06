
public class Conta {
	private int saldo;
	
	public Conta() {
		
	}
	public Conta(int agencia, int numero) {
		   if(agencia < 1) {
	            throw new IllegalArgumentException("Agencia inválida");
	        }

	        if(numero < 1) {
	            throw new IllegalArgumentException("Numero da conta inválido");
	        }
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	    this.saca(valor);
	    destino.deposita(valor);
	}
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 

        this.saldo -= valor;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
