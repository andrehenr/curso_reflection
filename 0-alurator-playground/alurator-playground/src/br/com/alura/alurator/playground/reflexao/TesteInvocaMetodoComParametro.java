package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesteInvocaMetodoComParametro {
	
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> controleClasse = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		Constructor<?> contrutorPadrao = controleClasse.getDeclaredConstructor();
		
		Object controle = contrutorPadrao.newInstance();
		
		Method m = controleClasse.getDeclaredMethod("metodoControle2", String.class);
		
		Object retorno = m.invoke(controle,"Teste");
		
		System.out.println(retorno);
	}

}
