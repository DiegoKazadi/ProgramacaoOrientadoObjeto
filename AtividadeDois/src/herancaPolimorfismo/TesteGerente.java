package herancaPolimorfismo;

public class TesteGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		// Usando os metodos do Funcionario:
		gerente.setNome("Zadio");
		gerente.setCpf("017.413.294-85");
		gerente.setNumeroDeFuncionariosGerenciados(2);
		gerente.setSalario(1100.00);
		gerente.setSenha(1202021);
		
		
		System.out.println(gerente.toString());
		System.out.println("Bonificacao "+ gerente.getBonificacao());
	}

}
