package colecoes;

import java.util.*;

public class CollectionsExample {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ricardo", 15);
		Pessoa pessoa2 = new Pessoa("Marcos", 20);
		Pessoa pessoa3 = new Pessoa("Karlos", 25);
		int idades;
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Set<Pessoa> pessoasSemRepeticao = new HashSet<Pessoa>();
		
		
		/*Operações Com ArrayList*/
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println("--- Array List --");
		
		System.out.println("Tamanho do ArrayList: " + pessoas.size());
		
		pessoas.add(pessoa1);
		
		System.out.println("Tamanho do ArrayList após novas inserções: " + pessoas.size());
		System.out.println("O ArrayList possue a pessoa1 ? " + pessoas.contains(pessoa1));
		System.out.println("Primeira pessoa do array é: "+ pessoas.get(0).getNome());
		
		pessoas.set(0, pessoa2);
		
		System.out.println("Primeira pessoa do array após a modificação é: "+ pessoas.get(0).getNome());
		
		idades = pessoas.stream().mapToInt(p-> p.getIdade()).sum();
		
		System.out.println("A soma das idades das pessoas, com o elemento repetido é: "+ idades);
		
		pessoas.remove(pessoa2);
		idades = pessoas.stream().mapToInt(p-> p.getIdade()).sum();

		System.out.println("A soma das idades das pessoas, sem o elemento repetido é: "+ idades);


		
		/*Operações Com Set*/
		pessoasSemRepeticao.add(pessoa1);
		pessoasSemRepeticao.add(pessoa2);
		pessoasSemRepeticao.add(pessoa3);
		
		System.out.println("--- Hash Set --");

		
		System.out.println("Tamanho do HashSet: " + pessoasSemRepeticao.size());
		
		pessoasSemRepeticao.add(pessoa1);
				
		/*Tamanho não é alterado*/
		System.out.println("Tamanho do HashSet após 'elemento repetido': " + pessoasSemRepeticao.size());
		System.out.println("O HashSet possue a pessoa1 ? " + pessoasSemRepeticao.contains(pessoa1));
		System.out.println("Primeira pessoa do hashSet é: "+ pessoasSemRepeticao.stream().findFirst().get().getNome());
		
		idades = pessoasSemRepeticao.stream().mapToInt(p-> p.getIdade()).sum();
		
		System.out.println("A soma das idades das pessoas presentes no HashSet é: "+ idades);


		
				


	}
}
