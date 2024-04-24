
public class Driver {

	public static void main(String[] args) {
		int n = 5;
		Aluno[] alunos = new Aluno[n];

		// Aluno aluno0 = new Aluno();
		// aluno0.nome = "Pedro";
		// aluno0.matricula = "577028";
		// aluno0.idade = 25;
		// alunos[0] = aluno0;

		alunos[0] = new Aluno("Pedro", "577028", 25);
		alunos[1] = new Aluno("Aninha", "922955", 28, 10, 9.3, 6);
		alunos[2] = new Aluno("Banana", "579855", 26, 6);
		alunos[3] = new Aluno("Bernado", "398855", 31, 9, 9.3);
		alunos[4] = new Aluno("Shulambs", "000001", 46, 8, 10, 9.3, 6);

		System.out.println("Alunos registrados: \n");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("---------------------");

	}

}
