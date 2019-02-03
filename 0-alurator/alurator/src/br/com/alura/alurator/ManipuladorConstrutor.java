package br.com.alura.alurator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {

	private Constructor<?> construtor;

	public ManipuladorConstrutor(Constructor<?> construtorPadrao) {
		this.construtor = construtorPadrao;
	}
	
	 public Object invoca() {
	        try {
	            return construtor.newInstance();
	        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException e) {

	            e.printStackTrace();
	            return new RuntimeException(e);
	        } catch (InvocationTargetException e) {
	            e.printStackTrace();
	            return new RuntimeException("Erro no consturtor!", e.getTargetException());

	        }
	    }

}
