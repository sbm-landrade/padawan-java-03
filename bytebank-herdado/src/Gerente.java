//Gerente é um funcionarioAutentucavel, Gerente herda da classe FuncionarioAutenticavel
public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}
	
}
