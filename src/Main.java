import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o Curso Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o Curso JS");
		curso2.setCargaHoraria(4);
		
		System.out.println(curso1);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descri��o mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1.toString());

	}

}
