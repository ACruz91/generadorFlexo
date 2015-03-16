package generadorSer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Funciones {
	public void cambiarOjo(String fichero, int valorVision, int contadorOjo) {

		String spine = null;
		spine = ("\t\tspine[0, 0.125, 0 0, 0.1875, 0 0, 0.25, 0 0, 0.375, 0 0, 0.50, 0 0 0.625, 0 0, 0.75, 0 0 0.875, 0]");
		String scale1 = null;
		scale1 = ("\t\tscale[0 0, 0.25 0.25, 0.5 0.5, 0.5625 0.5625, 0.625 0.625, 0.69 0.69 ,0.75 0.75, 0.875 0.875]");
		String scale2 = null;
		scale2 = ("\t\tscale[0 0, 0.3125 0.3125, 0.625 0.625, 0.703125 0.703125, 0.78125 0.78125, 0.8625 0.8625 ,0.9375 0.9375, 1.09375 1.09375]");
		String scale3 = null;
		scale3 = ("\t\tscale[0 0, 0.375 0.375, 0.75 0.75, 0.84375 0.84375, 0.9375 0.9375, 1.035 1.035 ,1.125 1.125, 1.3125 1.3125]");
		String scale4 = null;
		scale4 = ("\t\tscale[0 0, 0.4375 0.4375, 0.875 0.875, 0.984375 0.984375, 1.09375 1.09375, 1.2075 1.2075 ,1.3125 1.3125, 1.53125 1.53125]");
		String scale5 = null;
		scale5 = ("\t\tscale[0 0, 0.50 0.50, 1 1, 1.125 1.125, 1.25 1.25, 1.38 1.38 ,1.5 1.5, 1.75 1.75]");

		// fichero
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		String ficheroCopia = null;

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			String resultado = "";
			for (int i = 0; i < fichero.length() - 4; ++i) {
				resultado += fichero.charAt(i);
			}
			
			ficheroCopia = resultado.concat("Copia" + contadorOjo + ".wrl");


			try {
				fw = new FileWriter(ficheroCopia);
				pw = new PrintWriter(fw);
				while ((linea = br.readLine()) != null) {
					if (linea.equals("spine[")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
					} else if (linea.equals("scale[")) {
						while (!br.readLine().equals("]"))
							;
						if (valorVision == 1) {
							pw.println(scale1);
						} else if (valorVision == 2) {
							pw.println(scale2);
						} else if (valorVision == 3) {
							pw.println(scale3);
						} else if (valorVision == 4) {
							pw.println(scale4);
						} else if (valorVision == 5) {
							pw.println(scale5);
						}
					} else {
						pw.println(linea);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw)
						fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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

	public void cambiarCabeza(String fichero, int valorIntelecto, int contadorCabeza) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		String ficheroCopia = null;

		String spine = null;
		spine = ("\t\tspine[0 -3.5 0,0 -2.75 0,0 -2 0,0 -1.75 0,0 -1 0,0 -0.75 0,0 0 0,0 0.25 0,0 0.5 0,0 0.75 0,0 1 0,0 1.75 0,0 2 0,0 2.75 0,0 3 0, 0 3.25 0, 0 3.50 0, 0 3.75 0, 0 4 0]");
		String scale1 = null;
		scale1 = ("\t\tscale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.15 0.15, 0.25 0.25, 0.5 0.5, 0.75 0.75, 0.5 0.5]");
		String scale2 = null;
		scale2 = ("\t\tscale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.1875 0.1875, 0.3125 0.3125, 0.625 0.625, 0.9375 0.9375, 0.5 0.5]");
		String scale3 = null;
		scale3 = ("\t\tscale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.225 0.225, 0.375 0.375, 0.75 0.75, 1.125 1.125, 0.5 0.5]");
		String scale4 = null;
		scale4 = ("\t\tscale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.2625 0.2625, 0.4375 0.4375, 0.875 0.875, 1.3125 1.3125, 0.5 0.5]");
		String scale5 = null;
		scale5 = ("\t\tscale[0.5 0.5, 0.5 0.5, 1 1, 1.5 1.5, 2 2, 2.5 2.5, 2.5 2.5 , 2.5 2.5, 2.5 2.5, 2 2, 1.5 1.5, 1 1, 0.5 0.5, 1 1, 0.30 0.30, 0.5 0.5, 1 1, 1.5 1.5, 0.5 0.5]");

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			String resultado = "";
			for (int i = 0; i < fichero.length() - 4; ++i) {
				resultado += fichero.charAt(i);
			}

			ficheroCopia = resultado.concat("Copia" + contadorCabeza + ".wrl");


			try {
				fw = new FileWriter(ficheroCopia);
				pw = new PrintWriter(fw);
				while ((linea = br.readLine()) != null) {
					if (linea.equals("spine[")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
					} else if (linea.equals("scale[")) {
						while (!br.readLine().equals("]"))
							;
						if (valorIntelecto == 1) {
							pw.println(scale1);
						} else if (valorIntelecto == 2) {
							pw.println(scale2);
						} else if (valorIntelecto == 3) {
							pw.println(scale3);
						} else if (valorIntelecto == 4) {
							pw.println(scale4);
						} else if (valorIntelecto == 5) {
							pw.println(scale5);
						}
					} else {
						pw.println(linea);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw)
						fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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


	public void cambiarCola(String fichero, int valorAgilidad, int contadorCola) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		String ficheroCopia = null;

		String spine = null;
		spine = ("\t\tspine[0.5 -2 0, 0 -1.5 0, 0 0.5 0, 0 0.75 0, 0 1 0, 0 1.25 0, 0 1.5 0, 0 2 0, 0 2.5 0, 0 2.75 0, 0 3 0, 0 3.25 0, 0 3.5 0]");
		String scale1 = null;
		scale1 = ("\t\tscale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 0.5 0.5, 1.25 1.25]");
		String scale2 = null;
		scale2 = ("\t\tscale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 0.9375 0.9375, 1.25 1.25, 0.625 0.625, 1.5625 1.5625]");
		String scale3 = null;
		scale3 = ("\t\tscale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 1.125 1.125, 1.5 1.5, 0.75 0.75, 1.875 1.875]");
		String scale4 = null;
		scale4 = ("\t\tscale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 1.3125 1.3125, 1.75 1.75, 0.875 0.875, 2.1875 2.1875]");
		String scale5 = null;
		scale5 = ("\t\tscale[0.25 0.25, 0.25 0.25, 0.25 0.25, 0.5 0.5, 0.75 0.75, 1 1, 1.25 1.25, 0.5 0.5, 0.25 0.25, 0.5 0.5, 1.5 1.5, 2 2, 1 1, 2.5 2.5]");

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			String resultado = "";
			for (int i = 0; i < fichero.length() - 4; ++i) {
				resultado += fichero.charAt(i);
			}

			ficheroCopia = resultado.concat("Copia" + contadorCola + ".wrl");


			try {
				fw = new FileWriter(ficheroCopia);
				pw = new PrintWriter(fw);
				while ((linea = br.readLine()) != null) {
					if (linea.equals("spine[")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
					} else if (linea.equals("scale[")) {
						while (!br.readLine().equals("]"))
							;
						if (valorAgilidad == 1) {
							pw.println(scale1);
						} else if (valorAgilidad == 2) {
							pw.println(scale2);
						} else if (valorAgilidad == 3) {
							pw.println(scale3);
						} else if (valorAgilidad == 4) {
							pw.println(scale4);
						} else if (valorAgilidad == 5) {
							pw.println(scale5);
						}
					} else {
						pw.println(linea);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw)
						fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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

	public void cambiarFuerza(String fichero, String fichero2, String fichero3, int valorFuerza, int contadorPierna, int contadorBrazo) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		String ficheroCopia = null;

		String spine = null;
		spine = ("\t\tspine[0.5 1.75 0, 0.625 1.75 0, 0.75 1.75 0, 0.875 1.75 0, 1 1.75 0, 2.125 1.75 0, 3.25 1.75 0, 3.375 1.75 0, 3.5 1.75 0, 3.625 1.75 0, 3.75 1.75 0, 5.625 1.75 0, 7 1.75 0]");
		String scale1 = null;
		scale1 = ("\t\tscale[0.75 0.75, 0.625 0.625, 0.5 0.5, 0.6875 0.6875, 0.125 0.125, 0.25 0.25, 0.5 0.5, 0.625 0.625, 0.75 0.75, 0.875 0.875, 0.625 0.625, 0.55 0.55, 0.5 0.5]");
		String scale2 = null;
		scale2 = ("\t\tscale[0.75 0.75, 0.78125 0.78125, 0.5 0.5, 0.85937 0.85937, 0.125 0.125, 0.3125 0.3125, 0.5 0.5, 0.78125 0.78125, 0.75 0.75, 1.09375 1.09375, 0.625 0.625, 0.6875 0.6875, 0.5 0.5]");
		String scale3 = null;
		scale3 = ("\t\tscale[0.75 0.75, 0.9375 0.9375, 0.5 0.5, 1.03125 1.03125, 0.125 0.125, 0.375 0.375, 0.5 0.5, 0.9375 0.9375, 0.75 0.75, 1.3125 1.3125, 0.625 0.625, 0.825 0.825, 0.5 0.5]");
		String scale4 = null;
		scale4 = ("\t\tscale[0.75 0.75, 1.09375 1.09375, 0.5 0.5, 1.2031 1.2031, 0.125 0.125, 0.4375 0.4375, 0.5 0.5, 1.09375 1.09375, 0.75 0.75, 1.53125 1.53125, 0.625 0.625, 0.9625 0.9625, 0.5 0.5]scale[0.75 0.75, 1.09375 1.09375, 0.5 0.5, 1.2031 1.2031, 0.125 0.125, 0.4375 0.4375, 0.5 0.5, 1.09375 1.09375, 0.75 0.75, 1.53125 1.53125, 0.625 0.625, 0.9625 0.9625, 0.5 0.5]");
		String scale5 = null;
		scale5 = ("\t\tscale[0.75 0.75, 1.25 1.25, 0.5 0.5, 1.375 1.375, 0.125 0.125, 0.5 0.5, 0.5 0.5, 1.25 1.25, 0.75 0.75, 1.75 1.75, 0.625 0.625, 1.10 1.10, 0.5 0.5]");
		
		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			String resultado = "";
			for (int i = 0; i < fichero.length() - 4; ++i) {
				resultado += fichero.charAt(i);
			}

			ficheroCopia = resultado.concat("Copia" + contadorPierna + ".wrl");


			try {
				fw = new FileWriter(ficheroCopia);
				pw = new PrintWriter(fw);

				while ((linea = br.readLine()) != null) {
					if (linea.equals("spine[")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
					} else if (linea.equals("scale[")) {
						while (!br.readLine().equals("]"))
							;
						if (valorFuerza == 1) {
							pw.println(scale1);
						} else if (valorFuerza == 2) {
							pw.println(scale2);
						} else if (valorFuerza == 3) {
							pw.println(scale3);
						} else if (valorFuerza == 4) {
							pw.println(scale4);
						} else if (valorFuerza == 5) {
							pw.println(scale5);
						}
					} else {
						pw.println(linea);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw)
						fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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
		String ficheroCopia2 = null;
		
		String spine2 = null;
		spine2 = ("\t\tspine[0 -0.75 0,0 -0.625 0,0 -0.50 0,0 -0.375 0,0 -0.25 0,0 -0.1875 0,0 -0.125 0,0 0 0,0 0.125 0,0 0.5625 0,0 1 0,0.125 1.125 0,0.25 1.25 0,0.375 1.375 0,0.50 1.50 0,0.625 1.625 0,0.75 1.75 0,0.875 1.875 0,1 1.75 0,2 1.75 0,5 1.75 0,5.125 1.75 0, 5.25 1.75 0,5.375 1.75 0, 5.5 1.75 0, 5.625 1.75 0, 5.75 1.75 0, 5.875 1.75 0,6 1.75 0]");
		String scale12 = null;
		scale12 = ("\t\tscale[1 1, 0.625 0.625, 0.75 0.75, 0.625 0.625, 0.5 0.5, 0.625 0.625, 0.5 0.5, 0.625 0.625, 0.5 0.5, 0.625, 0.625, 0.5 0.5, 0.625 0.625,0.5 0.5, 0.625 0.625,0.5 0.5, 0.625 0.625,0.5 0.5, 0.625 0.625, 0.5 0.5, 0.375 0.375, 0.25 0.25, 0.1875 0.1875, 0.125 0.125, 0.375 0.375,0.5 0.5, 0.625 0.625, 0.75 0.75]");
		String scale22 = null;
		scale22 = ("\t\tscale[1 1, 0.7125 0.7125, 0.75 0.75, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.7125 0.7125, 0.5 0.5, 0.46875 0.46875, 0.25 0.25, 0.234375 0.234375, 0.125 0.125, 0.46875 0.46875, 0.5 0.5, 0.7125 0.7125, 0.75 0.75]");
		String scale32 = null;
		scale32 = ("\t\tscale[1 1, 0.9575 0.9575, 0.75 0.75, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.9575 0.9575, 0.5 0.5, 0.703125 0.703125, 0.25 0.25, 0.28125 0.28125, 0.125 0.125, 0.703125 0.703125, 0.5 0.5, 0.9575 0.9575, 0.75 0.75]");
		String scale42 = null;
		scale42 = ("\t\tscale[1 1, 1.09375 1.09375, 0.75 0.75, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 1.09375 1.09375, 0.5 0.5, 0.65625 0.65625, 0.25 0.25, 0.328125 0.328125, 0.125 0.125, 0.65625 0.65625, 0.5 0.5, 1.09375 1.09375, 0.75 0.75]");
		String scale52 = null;
		scale52 = ("\t\tscale[1 1, 1.25 1.25, 0.75 0.75, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 1.25 1.25, 0.5 0.5, 0.75 0.75, 0.25 0.25, 0.375 0.375, 0.125 0.125, 0.75 0.75, 0.5 0.5, 1.25 1.25, 0.75 0.75]");
		String spine3 = null;
		spine3 = ("\t\tspine[0 -0.75 0,0 -0.625 0,0 -0.50 0,0 -0.375 0,0 -0.25 0,0 -0.1875 0,0 -0.125 0,0 0 0,0 0.125 0,0 0.5625 0,0 1 0,-0.125 1.125 0,-0.25 1.25 0,-0.375 1.375 0,-0.50 1.50 0,-0.625 1.625 0,-0.75 1.75 0,-0.875 1.875 0,-1 1.75 0,-2 1.75 0,-5 1.75 0,-5.125 1.75 0, -5.25 1.75 0,-5.375 1.75 0, -5.5 1.75 0, -5.625 1.75 0, -5.75 1.75 0, -5.875 1.75 0,-6 1.75 0]");
		FileWriter fw3 = null;
		PrintWriter pw3 = null;
		String ficheroCopia3 = null;
		
		try {
			// Lectura del Fichero
			archivo2 = new File(fichero2);
			fr2 = new FileReader(archivo2);
			br2 = new BufferedReader(fr2);
			String linea2;

			String resultado2 = "";
			for (int i = 0; i < fichero2.length() - 4; ++i) {
				resultado2 += fichero2.charAt(i);
			}
			ficheroCopia2 = resultado2.concat("Copia" + contadorBrazo + ".wrl");
			
		
			
			String resultado3 = "";
			for (int i = 0; i < fichero3.length() - 4; ++i) {
				resultado3 += fichero3.charAt(i);
			}
			
			ficheroCopia3 = resultado3.concat("Copia" + contadorBrazo + ".wrl");
			
			try {
				fw2 = new FileWriter(ficheroCopia2);
				pw2 = new PrintWriter(fw2);
				
				while ((linea2 = br2.readLine()) != null){
					if (linea2.equals("spine[")) {
						while (!br2.readLine().equals("]"))
							;
						pw2.println(spine2);
					} else if (linea2.equals("scale[")) {
						while (!br2.readLine().equals("]"))
							;
						if (valorFuerza == 1) {
							pw2.println(scale12);
						} else if (valorFuerza == 2) {
							pw2.println(scale22);
						} else if (valorFuerza == 3) {
							pw2.println(scale32);
						} else if (valorFuerza == 4) {
							pw2.println(scale42);
						} else if (valorFuerza == 5) {
							pw2.println(scale52);
						}
					} else {
						pw2.println(linea2);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw2)
						fw2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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
		
		
		try {
			// Lectura del Fichero
			archivo2 = new File(fichero2);
			fr2 = new FileReader(archivo2);
			br2 = new BufferedReader(fr2);
			String linea2;
			
	
			String resultado3 = "";
			for (int i = 0; i < fichero3.length() - 4; ++i) {
				resultado3 += fichero3.charAt(i);
			}
			
			ficheroCopia3 = resultado3.concat("Copia" + contadorBrazo + ".wrl");
			
			try {			
				fw3 = new FileWriter(ficheroCopia3);
				pw3 = new PrintWriter(fw3);
				while ((linea2 = br2.readLine()) != null){
					if (linea2.equals("spine[")) {
						while (!br2.readLine().equals("]"))
							;
						pw3.println(spine3);
					} else if (linea2.equals("scale[")) {
						while (!br2.readLine().equals("]"))
							;
						if (valorFuerza == 1) {
							pw3.println(scale12);
						} else if (valorFuerza == 2) {
							pw3.println(scale22);
						} else if (valorFuerza == 3) {
							pw3.println(scale32);
						} else if (valorFuerza == 4) {
							pw3.println(scale42);
						} else if (valorFuerza == 5) {
							pw3.println(scale52);
						}
					} else {
						pw3.println(linea2);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw3)
						fw3.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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

	public void cambiarArchivos(String fichero, String ficheroBrazo2, int valorFuerza,
			int valorIntelecto, int valorVision, int valorGordura,
			int valorAgilidad, String valorPostura, int contadorFlexo, int contadorOjo, int contadorCola, int contadorPierna, int contadorBrazo, int contadorCabeza) {
		// fichero
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		String ficheroCopia = null;
		
		String spine = null;
		spine = ("\t\tspine[0 -4 0,0 -4.5 0,0 -4.75 0,0 -5.25 0,0 -5.5 0,0 -5.75 0,0 -6 0,0 -8 0, 0 -9 0,0 -10 0,0 -11 0,0 -12 0,0 -13 0]");
		String scale1 = null;
		scale1 = ("\t\tscale[0.5 0.5, 0.75 0.75, 1.5 1.5, 1.75 1.75, 2 2, 2.25 2.25, 2.5 2.5, 2.5 2.5, 2.6 2.6, 2.7 2.7, 2.8 2.8, 2.9 2.9, 3.2 3.2]");
		String scale2 = null;
		scale2 = ("\t\tscale[0.5 0.5, 0.75 0.75, 1.5 1.5, 1.75 1.75, 2 2, 2.25 2.25, 2.5 2.5, 2.6 2.6, 2.7 2.7, 2.8 2.8, 2.9 2.9, 3.0 3.0, 3.4 3.4]");
		String scale3 = null;
		scale3 = ("\t\tscale[0.5 0.5, 0.75 0.75, 1.5 1.5, 1.75 1.75, 2 2, 2.25 2.25, 2.5 2.5, 2.7 2.7, 2.8 2.8, 2.9 2.9, 3.0 3.0, 3.1 3.1, 3.6 3.6]");
		String scale4 = null;
		scale4 = ("\t\tscale[0.5 0.5, 0.75 0.75, 1.5 1.5, 1.75 1.75, 2 2, 2.25 2.25, 2.5 2.5, 2.8 2.8, 2.9 2.9, 3.0 3.0, 3.1 3.1, 3.2 3.2, 3.8 3.8]");
		String scale5 = null;
		scale5 = ("\t\tscale[0.5 0.5, 0.75 0.75, 1.5 1.5, 1.75 1.75, 2 2, 2.25 2.25, 2.5 2.5, 2.9 2.9, 3.0 3.0, 3.1 3.1, 3.2 3.2, 3.3 3.3, 4.0 4.0]");

		try {
			// Lectura del Fichero
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;

			String resultado = "";
			for (int i = 0; i < fichero.length() - 4; ++i) {
				resultado += fichero.charAt(i);
			}

			ficheroCopia = resultado.concat("Copia" + contadorFlexo + ".wrl");


			try {
				fw = new FileWriter(ficheroCopia);
				pw = new PrintWriter(fw);
				while ((linea = br.readLine()) != null) {
					if (linea.length() == 15
							&& linea.substring(0, 15).equals(
									"url \"brazo.wrl\"")) {
						if (valorFuerza > 0)
							pw.println("\t\t\turl \"brazoCopia" + contadorBrazo
									+ ".wrl\"");
						else
							pw.println("\t\t\t"+linea);

					} else if (linea.length() == 16
							&& linea.substring(0, 16).equals(
									"url \"pierna.wrl\"")) {
						if (valorFuerza > 0)
							pw.println("\t\t\turl \"piernaCopia"
									+ contadorPierna + ".wrl\"");
						else
							pw.println("\t\t\t"+linea);
						
					} else if (linea.length() == 16
							&& linea.substring(0, 16).equals(
									"url \"brazo2.wrl\"")) {
						if (valorFuerza > 0)
							pw.println("\t\t\turl \"brazo2Copia"
									+ contadorPierna + ".wrl\"");
						else
							pw.println("\t\t\t"+linea);

					} else if (linea.length() == 16
							&& linea.substring(0, 16).equals(
									"url \"cabeza.wrl\"")) {
						if (valorIntelecto > 0)
							pw.println("\t\t\turl \"cabezaCopia"
									+ contadorCabeza + ".wrl\"");
						else
							pw.println("\t\t\t"+linea);

					} else if (linea.length() == 13
							&& linea.substring(0, 13).equals("url \"ojo.wrl\"")) {
						if (valorVision > 0)
							pw.println("\t\t\turl \"ojoCopia" + contadorOjo
									+ ".wrl\"");
						else
							pw.println("\t\t\t"+linea);

					} else if (linea.length() == 14
							&& linea.substring(0, 14)
									.equals("url \"cola.wrl\"")) {
						if (valorAgilidad > 0)
							pw.println("\t\t\turl \"colaCopia" + contadorCola
									+ ".wrl\"");
						else
							pw.println("\t\t\t"+linea);
					} else if (linea.equals("spine[")) {
						while (!br.readLine().equals("]"))
							;
						pw.println(spine);
					} else if (linea.equals("scale[") && valorGordura > 0) {
						while (!br.readLine().equals("]"))
							;
						if (valorFuerza == 1) {
							pw.println(scale1);
						} else if (valorGordura == 2) {
							pw.println(scale2);
						} else if (valorGordura == 3) {
							pw.println(scale3);
						} else if (valorGordura == 4) {
							pw.println(scale4);
						} else if (valorGordura == 5) {
							pw.println(scale5);
						}
					} else {
						pw.println(linea);
					}
				}
							
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fw)
						fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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
