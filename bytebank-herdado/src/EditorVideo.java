//Gerente é um funcionario, Gerente herda da classe Funcionario
public class EditorVideo extends Funcionario {
	
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
	
}
