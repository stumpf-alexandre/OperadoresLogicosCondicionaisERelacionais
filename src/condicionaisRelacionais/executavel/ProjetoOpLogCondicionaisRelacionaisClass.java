package condicionaisRelacionais.executavel;

public class ProjetoOpLogCondicionaisRelacionaisClass {
	public static void main(String[] args) {
		int mediaAluno = 80;
		String nome = "Alexandre";
		
		if(mediaAluno >= 70 && nome.equals("Alexandre")) {
			System.out.println("Parabens, voce esta aprovado");
		}
		else if (mediaAluno < 70) {
			System.out.println("Voce esta reprovado");
		}
		else {
			System.out.println("Aluno não encontrado");
		}
		media();
	}
	public static void media() {
		int nota1 = 100;
		int nota2 = 100;
		int nota3 = 100;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		
		/*Condições lógica com if e else*/
		if(media >= 70) {
			System.out.println("Aluno aprovado " + media);
		}
		else if (media >= 50 && media <= 69) {
			System.out.println("Aluno em recuperação " + media);
		}
		else {
			System.out.println("Aluno reprovado " + media);
		}
		
		
		/*Operadores ternários para micro validações*/
		String saidaResultado;
		saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		System.out.println(saidaResultado);
		
		/*Um operador ternário dentro de outro*/
		String resultado;
		System.out.println(resultado = media >= 70 ? "Aluno aprovado" : (media >= 50 && media <= 69) ? "Aluno em recuperação" : "Aluno reprovado");
		
		/*Operações lógicas aninhadas são operações dentro de operações*/
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno aprovado com louvor");
				}
				else {
					System.out.println("Aluno aprovado");
				}
			}
			else {
				System.out.println("Aluno esta em recuperação");
			}
		}
		else {
			System.out.println("Aluno reprovado");
		}
		
		/*Switch case: operações exatas*/
		int dia = 5;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;	
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia não identificado");
			break;
		}
	}
}
