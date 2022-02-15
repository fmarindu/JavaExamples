package Lectura;

import java.io.*;

public class LecturaTerminalImpl implements Lectura {

	@Override
	public String leerDato() {
		String sdato = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error." + e.getMessage());
		}
		return sdato;
	}

	@Override
	public short leerShort() {
		try {
			return Short.parseShort(leerDato());
		} catch (NumberFormatException e) {
			return Short.MIN_VALUE;
		}
	}

	@Override
	public Integer leerInteger() {
		try {
			return Integer.parseInt(leerDato());
		} catch (NumberFormatException e) {
			return Integer.MIN_VALUE;
		}
	}

	@Override
	public Long leerLong() {
		try {
			return Long.parseLong(leerDato());
		} catch (NumberFormatException e) {
			return Long.MIN_VALUE;
		}
	}

	@Override
	public Float leerFloat() {
		try {
			Float f = Float.parseFloat(leerDato());
			return f.floatValue();
		} catch (NumberFormatException e) {
			return Float.NaN;
		}
	}

	@Override
	public Double leerDouble() {
		try {
			Double d = Double.parseDouble(leerDato());
			return d.doubleValue();
		} catch (NumberFormatException e) {
			return Double.NaN;
		}
	}


}