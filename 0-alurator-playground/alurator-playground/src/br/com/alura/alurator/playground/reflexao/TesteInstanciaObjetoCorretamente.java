package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<SubControle> subControleClasse1 = SubControle.class;

		Class<?> subControleClasse2 = Class.forName("br.com.alura.alurator.playground.controle.SubControle");

		Class<?> controleClasse1 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		
		Constructor<SubControle> constructorSubController = subControleClasse1.getDeclaredConstructor(String.class); 
		constructorSubController.setAccessible(true);
		System.out.println(constructorSubController);
	}

}
