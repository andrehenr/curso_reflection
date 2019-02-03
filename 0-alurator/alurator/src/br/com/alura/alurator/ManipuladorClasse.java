package br.com.alura.alurator;

import java.lang.reflect.Constructor;

public class ManipuladorClasse {

	private Class<?> clazz;

	public ManipuladorClasse(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	 public ManipuladorConstrutor getConstrutorPadrao() {

	        try {
	            Constructor<?> construtorPadrao = clazz.getDeclaredConstructor();
	            return new ManipuladorConstrutor(construtorPadrao);
	        } catch (NoSuchMethodException | SecurityException e) {
	            e.printStackTrace();
	            throw new RuntimeException(e); 
	        }
	    }

	public ManipulaObjeto criaInstancia() {
		Object instancia = getConstrutorPadrao().invoca();
		return new ManipulaObjeto(instancia);
	}

}
