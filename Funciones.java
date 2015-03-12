package generadorSer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Funciones {
	private int contadorOjo = 0;
	private int contadorCabeza = 0;
	private int contadorCola = 0;
	private int contadorBrazo = 0;
	private int contadorPierna = 0;

	public void generarCopia(String ficheroEntrada, String ficheroSalida) {

		// fichero
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			// Lectura del Fichero
			archivo = new File(ficheroEntrada);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Escritura del Fichero
			fw = new FileWriter(ficheroSalida);
			pw = new PrintWriter(fw);

			String linea = null;

			while ((linea = br.readLine()) != null) {
				pw.println(linea);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void cambiarOjo(String fichero, int valorVision) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		// Este paso sirve para crear un copia de un Fichero
		String resultado = "";
		String ficheroCopia = null;
		for (int i = 0; i < fichero.length() - 4; ++i) {
			resultado += fichero.charAt(i);
		}

		String spine = null;
		spine = ("spine[0, 0.125, 0 0, 0.1875, 0 0, 0.25, 0 0, 0.375, 0 0, 0.50, 0 0 0.625, 0 0, 0.75, 0 0 0.875, 0]");
		String scale1 = null;
		scale1 = ("scale[0 0, 0.25 0.25, 0.5 0.5, 0.5625 0.5625, 0.625 0.625, 0.69 0.69 ,0.75 0.75, 0.875 0.875]");
		String scale2 = null;
		scale2 = ("scale[0 0, 0.3125 0.3125, 0.625 0.625, 0.703125 0.703125, 0.78125 0.78125, 0.8625 0.8625 ,0.9375 0.9375, 1.09375 1.09375]");
		String scale3 = null;
		scale3 = ("scale[0 0, 0.375 0.375, 0.75 0.75, 0.84375 0.84375, 0.9375 0.9375, 1.035 1.035 ,1.125 1.125, 1.3125 1.3125]");
		String scale4 = null;
		scale4 = ("scale[0 0, 0.4375 0.4375, 0.875 0.875, 0.984375 0.984375, 1.09375 1.09375, 1.2075 1.2075 ,1.3125 1.3125, 1.53125 1.53125]");
		String scale5 = null;
		scale5 = ("scale[0 0, 0.50 0.50, 1 1, 1.125 1.125, 1.25 1.25, 1.38 1.38 ,1.5 1.5, 1.75 1.75]");

		ficheroCopia = resultado.concat("Copia" + contadorOjo + ".wrl");
		generarCopia(fichero, ficheroCopia);
		contadorOjo++;

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Escritura del Fichero
			fw = new FileWriter(ficheroCopia);
			pw = new PrintWriter(fw);

			String linea = null;

			while ((linea = br.readLine()) != null) {
				if (valorVision > 0) {
					if (linea.substring(0, 4).equals("spine")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
						if (linea.equals("scale")) {
							if (valorVision == 1)
								pw.println(scale1);
							else if (valorVision == 2) {
								pw.println(scale2);
							} else if (valorVision == 3) {
								pw.println(scale3);
							} else if (valorVision == 4) {
								pw.println(scale4);
							} else if (valorVision == 5) {
								pw.println(scale5);
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void cambiarCabeza(String fichero, int valorIntelecto) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		// Este paso sirve para crear un copia de un Fichero
		String resultado = "";
		String ficheroCopia = null;
		for (int i = 0; i < fichero.length() - 4; ++i) {
			resultado += fichero.charAt(i);
		}

		String spine = null;
		spine = ("spine[0 -3.5 0,0 -2.75 0,0 -2 0,0 -1.75 0,0 -1 0,0 -0.75 0,0 0 0,0 0.25 0,0 0.5 0,0 0.75 0,0 1 0,0 1.75 0,0 2 00 2.75 00 3 0, 0 3.25 0, 0 3.50 0, 0 3.75 0, 0 4, 0]");
		String scale1 = null;
		scale1 = ("scale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.15 0.15, 0.25 0.25, 0.5 0.5, 0.75 0.75, 0.5 0.5]");
		String scale2 = null;
		scale2 = ("scale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.1875 0.1875, 0.3125 0.3125, 0.625 0.625, 0.9375 0.9375, 0.5 0.5]");
		String scale3 = null;
		scale3 = ("scale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.225 0.225, 0.375 0.375, 0.75 0.75, 1.125 1.125, 0.5 0.5]");
		String scale4 = null;
		scale4 = ("scale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.2625 0.2625, 0.4375 0.4375, 0.875 0.875, 1.3125 1.3125, 0.5 0.5]");
		String scale5 = null;
		scale5 = ("scale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.30 0.30, 0.5 0.5, 1 1, 1.5 1.5, 0.5 0.5]");

		ficheroCopia = resultado.concat("Copia" + contadorCabeza + ".wrl");
		generarCopia(fichero, ficheroCopia);
		contadorCabeza++;

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Escritura del Fichero
			fw = new FileWriter(ficheroCopia);
			pw = new PrintWriter(fw);

			String linea = null;

			while ((linea = br.readLine()) != null) {
				if (valorIntelecto > 0) {
					if (linea.substring(0, 4).equals("spine")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
						if (linea.equals("scale")) {
							if (valorIntelecto == 1)
								pw.println(scale1);
							else if (valorIntelecto == 2) {
								pw.println(scale2);
							} else if (valorIntelecto == 3) {
								pw.println(scale3);
							} else if (valorIntelecto == 4) {
								pw.println(scale4);
							} else if (valorIntelecto == 5) {
								pw.println(scale5);
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void cambiarCola(String fichero, int valorAgilidad) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		// Este paso sirve para crear un copia de un Fichero
		String resultado = "";
		String ficheroCopia = null;
		for (int i = 0; i < fichero.length() - 4; ++i) {
			resultado += fichero.charAt(i);
		}

		String spine = null;
		spine = ("spine[0.5 -2 0, 0 -1.5 0, 0 0.5 0, 0 0.75 0, 0 1 0, 0 1.25 0, 0 1.5 0, 0 2 0, 0 2.5 0, 0 2.75 0, 0 3 0, 0 3.25 0, 0 3.5 0]");
		String scale1 = null;
		scale1 = ("scale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 0.5 0.5, 1.25 1.25]");
		String scale2 = null;
		scale2 = ("scale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 0.9375 0.9375, 1.25 1.25, 0.625 0.625, 1.5625 1.5625]");
		String scale3 = null;
		scale3 = ("scale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 1.125 1.125, 1.5 1.5, 0.75 0.75, 1.875 1.875]");
		String scale4 = null;
		scale4 = ("scale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 1.3125 1.3125, 1.75 1.75, 0.875 0.875, 2.1875 2.1875]");
		String scale5 = null;
		scale5 = ("scale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 1.5 1.5, 2 2, 1 1, 2.5 2.5]");

		ficheroCopia = resultado.concat("Copia" + contadorCola + ".wrl");
		generarCopia(fichero, ficheroCopia);
		contadorCola++;

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Escritura del Fichero
			fw = new FileWriter(ficheroCopia);
			pw = new PrintWriter(fw);

			String linea = null;

			while ((linea = br.readLine()) != null) {
				if (valorAgilidad > 0) {
					if (linea.substring(0, 4).equals("spine")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
						if (linea.equals("scale")) {
							if (valorAgilidad == 1)
								pw.println(scale1);
							else if (valorAgilidad == 2) {
								pw.println(scale2);
							} else if (valorAgilidad == 3) {
								pw.println(scale3);
							} else if (valorAgilidad == 4) {
								pw.println(scale4);
							} else if (valorAgilidad == 5) {
								pw.println(scale5);
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void cambiarFuerza(String fichero, String fichero2, int valorFuerza) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		// Este paso sirve para crear un copia de un Fichero
		String resultado = "";
		String ficheroCopia = null;
		for (int i = 0; i < fichero.length() - 4; ++i) {
			resultado += fichero.charAt(i);
		}

		String spine = null;
		spine = ("spine[0.5 1.75 0, 0.625 1.75 0, 0.75 1.75 0, 0.875 1.75 0, 1 1.75 0, 2.125 1.75 0, 3.25 1.75 0, 3.375 1.75 0, 3.5 1.75 0, 3.625 1.75 0, 3.75 1.75 0, 5.625 1.75 0, 7 1.75 0]");
		String scale1 = null;
		scale1 = ("scale[0.75 0.75, 0.625 0.625, 0.5 0.5, 0.6875 0.6875, 0.125 0.125, 0.25 0.25, 0.5 0.5, 0.625 0.625, 0.75 0.75, 0.875 0.875, 0.625 0.625, 0.55 0.55, 0.5 0.5]");
		String scale2 = null;
		scale2 = ("scale[0.75 0.75, 0.78125 0.78125, 0.5 0.5, 0.85937 0.85937, 0.125 0.125, 0.3125 0.3125, 0.5 0.5, 0.78125 0.78125, 0.75 0.75, 1.09375 1.09375, 0.625 0.625, 0.6875 0.6875, 0.5 0.5]");
		String scale3 = null;
		scale3 = ("scale[0.75 0.75, 0.9375 0.9375, 0.5 0.5, 1.03125 1.03125, 0.125 0.125, 0.375 0.375, 0.5 0.5, 0.9375 0.9375, 0.75 0.75, 1.3125 1.3125, 0.625 0.625, 0.825 0.825, 0.5 0.5]");
		String scale4 = null;
		scale4 = ("scale[0.75 0.75, 1.09375 1.09375, 0.5 0.5, 1.2031 1.2031, 0.125 0.125, 0.4375 0.4375, 0.5 0.5, 1.09375 1.09375, 0.75 0.75, 1.53125 1.53125, 0.625 0.625, 0.9625 0.9625, 0.5 0.5]scale[0.75 0.75, 1.09375 1.09375, 0.5 0.5, 1.2031 1.2031, 0.125 0.125, 0.4375 0.4375, 0.5 0.5, 1.09375 1.09375, 0.75 0.75, 1.53125 1.53125, 0.625 0.625, 0.9625 0.9625, 0.5 0.5]");
		String scale5 = null;
		scale5 = ("scale[0.75 0.75, 1.25 1.25, 0.5 0.5, 1.375 1.375, 0.125 0.125, 0.5 0.5, 0.5 0.5, 1.25 1.25, 0.75 0.75, 1.75 1.75, 0.625 0.625, 1.10 1.10, 0.5 0.5]");

		ficheroCopia = resultado.concat("Copia" + contadorBrazo + ".wrl");
		generarCopia(fichero, ficheroCopia);
		contadorBrazo++;

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Escritura del Fichero
			fw = new FileWriter(ficheroCopia);
			pw = new PrintWriter(fw);

			String linea = null;

			while ((linea = br.readLine()) != null) {
				if (valorFuerza > 0) {
					if (linea.substring(0, 4).equals("spine")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
						if (linea.equals("scale")) {
							if (valorFuerza == 1)
								pw.println(scale1);
							else if (valorFuerza == 2) {
								pw.println(scale2);
							} else if (valorFuerza == 3) {
								pw.println(scale3);
							} else if (valorFuerza == 4) {
								pw.println(scale4);
							} else if (valorFuerza == 5) {
								pw.println(scale5);
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		File archivo2 = null;
		FileReader fr2 = null;
		BufferedReader br2 = null;
		FileWriter fw2 = null;
		PrintWriter pw2 = null;

		// Este paso sirve para crear un copia de un Fichero
		String resultado2 = "";
		String ficheroCopia2 = null;
		for (int i = 0; i < fichero2.length() - 4; ++i) {
			resultado2 += fichero2.charAt(i);
		}

		String spine2 = null;
		spine2 = ("");
		String scale12 = null;
		scale12 = ("");
		String scale22 = null;
		scale22 = ("");
		String scale32 = null;
		scale32 = ("");
		String scale42 = null;
		scale42 = ("");
		String scale52 = null;
		scale52 = ("");

		ficheroCopia2 = resultado2.concat("Copia" + contadorPierna + ".wrl");
		generarCopia(fichero2, ficheroCopia2);
		contadorPierna++;

		try {
			// Lectura del Fichero
			archivo2 = new File(fichero2);
			fr2 = new FileReader(archivo2);
			br2 = new BufferedReader(fr2);

			// Escritura del Fichero
			fw2 = new FileWriter(ficheroCopia2);
			pw2 = new PrintWriter(fw2);

			String linea2 = null;

			while ((linea2 = br2.readLine()) != null) {
				if (valorFuerza > 0) {
					if (linea2.substring(0, 4).equals("spine")) {
						while (!br2.readLine().equals("]"))
							;
						pw.println(spine2);
						if (linea2.equals("scale")) {
							if (valorFuerza == 1)
								pw2.println(scale12);
							else if (valorFuerza == 2) {
								pw2.println(scale22);
							} else if (valorFuerza == 3) {
								pw2.println(scale32);
							} else if (valorFuerza == 4) {
								pw2.println(scale42);
							} else if (valorFuerza == 5) {
								pw2.println(scale52);
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr2) {
					fr2.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void cambiarArchivos(String fichero) {
		// fichero
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Escritura del Fichero
			fw = new FileWriter(fichero);
			pw = new PrintWriter(fw);

			String linea = null;

			while ((linea = br.readLine()) != null) {
				if (linea.substring(0, 9).equals("brazo.wrl")) {
					pw.println("brazoCopia" + contadorBrazo + ".wrl");

				}
				if (linea.substring(0, 9).equals("ojo.wrl")) {
					pw.println("ojoCopia" + contadorBrazo + ".wrl");

				}
				if (linea.substring(0, 9).equals("cabeza.wrl")) {
					pw.println("cabezaCopia" + contadorBrazo + ".wrl");

				}
				if (linea.substring(0, 9).equals("pierna.wrl")) {
					pw.println("piernaCopia" + contadorBrazo + ".wrl");

				}
				if (linea.substring(0, 9).equals("cola.wrl")) {
					pw.println("colaCopia" + contadorCola + ".wrl");

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrado del Fichero
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
}
