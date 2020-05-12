import model.CartaoPrePago;
import model.CartaoCashBack;

public class AppCartao {
	public static void main(String args[]) {
		CartaoPrePago  c1 = new CartaoPrePago("1111.2222.3333.4444", "Marco Antonio", 2026, 05, 1000.0);
		CartaoCashBack c2 = new CartaoCashBack("5555.6666.7777.8888", "Amanda Luna", 2028, 10, 3000.0, CartaoCashBack.BRONZE);
		
		//System.out.println(c1.Consulta());
		if (c1.Compra(1000.00)) {
			System.out.println("*******************************");
			System.out.println("*Compra realizada com sucesso.*");
			System.out.println("*******************************");
			System.out.println(c1.Consulta());
		}
		else {
			System.out.println("*******************************************");
			System.out.println("*Compra não realizada, saldo insuficiente.*");
			System.out.println("*******************************************");
		}
		System.out.println("----------------------------------------");
		if (c2.Compra(1000.00)) {
			System.out.println("*******************************");
			System.out.println("*Compra realizada com sucesso.*");
			System.out.println("*******************************");
			
			System.out.println(c2.Consulta());
		}
		else {
			System.out.println("*******************************************");
			System.out.println("*Compra não realizada, saldo insuficiente.*");
			System.out.println("*******************************************");
		}
	}
	
}
