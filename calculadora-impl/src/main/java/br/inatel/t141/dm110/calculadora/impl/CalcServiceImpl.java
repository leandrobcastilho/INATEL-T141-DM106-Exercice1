package br.inatel.t141.dm110.calculadora.impl;

import br.inatel.t141.dm110.calculadora.api.CalcResult;
import br.inatel.t141.dm110.calculadora.api.CalcService;

public class CalcServiceImpl implements CalcService {

	@Override
	public CalcResult sum(double first, double second) {
		CalcResult calcResult = new CalcResult();
		calcResult.setFirst(first);
		calcResult.setSecond(second);
		double result = first + second;
		calcResult.setResult(result);
		return calcResult;
	}

	@Override
	public CalcResult subtract(double first, double second) {
		CalcResult calcResult = new CalcResult();
		calcResult.setFirst(first);
		calcResult.setSecond(second);
		double result = first - second;
		calcResult.setResult(result);
		return calcResult;
	}

}
