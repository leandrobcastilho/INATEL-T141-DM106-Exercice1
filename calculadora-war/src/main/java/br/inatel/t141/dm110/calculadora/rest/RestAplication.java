package br.inatel.t141.dm110.calculadora.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.t141.dm110.calculadora.impl.CalcServiceImpl;

@ApplicationPath("/rest")
public class RestAplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalcServiceImpl.class);
		return classes;
	}
}
