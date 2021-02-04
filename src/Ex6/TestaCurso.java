package Ex6;
import java.util.Scanner;


public class TestaCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("CURSO");
        System.out.println("");
		System.out.println("Insira o nome do curso: ");
		String nome = scan.nextLine();
		        
		System.out.println("Insira o horário do curso: ");
		String horario = scan.nextLine();
        System.out.println("");
		
        System.out.println("PROFESSOR");
        System.out.println("");
		System.out.println("Insira o nome do professor: ");
		String nomeProfessor = scan.nextLine();
		        
		System.out.println("Insira o departamento do professor:");
		String deptoProfessor = scan.nextLine();
		        
		System.out.println("Insira o e-mail do professor:");
		String emailProfessor = scan.nextLine();
        System.out.println("");
        
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		        
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setDepartamento(deptoProfessor);
		professor.setEmail(emailProfessor);
		        
		curso.setProfessor(professor);
		        
        System.out.println("ALUNOS");
        Aluno[] alunos = new Aluno[5];
        System.out.println("");
        for (int i=0; i<5; i++){
        	scan.nextLine();
        	System.out.println("Insira o nome do aluno " + (i+1));
        	String nomeAluno = scan.nextLine();
		    System.out.println("Insira a matrícula do aluno: ");
		    String matAluno = scan.nextLine();
		   double[] notas = new double[4];
		   
		   for (int a=0; a<4; a++){
		         System.out.println("Insira a nota " + (a+1));
		          notas[a] = scan.nextDouble();
		            }
		            Aluno aluno = new Aluno();
		            aluno.setNome(nomeAluno);
		            aluno.setMatricula(matAluno);
		            aluno.setNotas(notas);
		            
		            alunos[i] = aluno;
		        }
		        
		   curso.setAlunos(alunos);
		   		   System.out.println(curso.obterInfo());
		    }
		            
		

	}
