//Gerente é um funcionarioAutentucavel, Gerente herda da classe FuncionarioAutenticavel
public class Administrador extends Funcionario {

	@Override
	public double getBonificacao() {
		return 50;
	}

}
