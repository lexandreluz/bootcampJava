package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Bernardo Ravi");
		aluno.setIdade(1);
		
		System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos ");	
	}
}