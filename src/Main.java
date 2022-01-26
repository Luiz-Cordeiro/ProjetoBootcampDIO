import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JS");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		
		
		
		Dev devLuiz = new Dev();
		devLuiz.setNome("Luiz Felipe Vieira Cordeiro");
		devLuiz.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Luiz" + devLuiz.getConteudosInscritos());
		devLuiz.progredir();
		devLuiz.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Luiz" + devLuiz.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Luiz" + devLuiz.getConteudosConcluidos());
		System.out.println("XP: " + devLuiz.calcularTotalXp());
		
		System.out.println("---------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João Fernando Mellier");	
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		

	}

}
