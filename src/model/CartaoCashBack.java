package model;

public class CartaoCashBack extends CartaoPrePago {
	public static final int GOLD   = 0;
	public static final int SILVER = 1;
	public static final int BRONZE = 2;
	
	private int tipo;
	

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}
	
	public boolean Compra(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			switch(tipo) {
			case GOLD:
				super.saldo += valor *8/100;
				break;
			case SILVER:
				super.saldo += valor *5/100;
				break;
			case BRONZE:
				super.saldo += valor *2/100;
				break;
			}
			return true;
		}else
			return false;
	}
	
	public String Consulta() {
		return 	"Cartão:   " +this.numeroCartao+
				"\nTipo      " +tipo+
				"\nNome:     " +this.nomeTitular+
				"\nValidade: " +this.mesValidade+ "/" + this.anoValidade+
				"\nSaldo:    " +this.saldo;	
	
	}
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
