//Gerente é um funcionarioAutentucavel, Gerente herda da classe FuncionarioAutenticavel
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}

}
