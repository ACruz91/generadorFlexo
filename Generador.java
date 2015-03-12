package generadorSer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class Generador {
	private int intelecto;
	private int altura;
	private int fuerza;
	private int vision;
	private int agilidad;
	private String postura;

	public void Interfaz() {
		Menu menuBar, menuArchivo;
		MenuItem menuArchivoCabecera;
		MenuItem menuArchivoSalir, menuArchivoNuevo;

		// Creación del display y shell
		Display display = new Display();
		Shell shell = new Shell(display);

		// Creación del Menú
		menuBar = new Menu(shell, SWT.BAR);

		// Características de la Ventana "Nuevo"
		shell.setSize(700, 300);
		shell.setMaximized(true);
		shell.setText("Creación de Flexo");

		// Layout de la Ventana
		// FillLayout de la Ventana
		FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		fillLayout.marginWidth = 5;
		fillLayout.marginHeight = 5;
		fillLayout.spacing = 50;
		shell.setLayout(fillLayout);

		CTabFolder folder = new CTabFolder(shell, SWT.BORDER);

		// Creación de la Cabecera del menuBar, Archivo
		menuArchivoCabecera = new MenuItem(menuBar, SWT.CASCADE);
		menuArchivoCabecera.setText("&Archivo");

		// Creación del subMenú Archivo es una cabecera del menú menuBar
		menuArchivo = new Menu(shell, SWT.DROP_DOWN);
		menuArchivoCabecera.setMenu(menuArchivo);

		// Creación de un Item del Submenú Archivo, Nuevo
		menuArchivoNuevo = new MenuItem(menuArchivo, SWT.PUSH);
		menuArchivoNuevo.setText("&Nuevo\t CTRL+N");
		menuArchivoNuevo.setAccelerator(SWT.CTRL + 'N');

		// Creación de un Item del Submenú Archivo, Salir
		menuArchivoSalir = new MenuItem(menuArchivo, SWT.PUSH);
		menuArchivoSalir.setText("&Salir\t CTRL+X");
		menuArchivoSalir.setAccelerator(SWT.CTRL + 'X');

		class nuevo implements SelectionListener {
			public void widgetSelected(SelectionEvent event) {
				// Creación de una Shell hija llamada "nuevo" para el nuevo
				// dialogo
				Shell nuevo = new Shell(shell, SWT.DIALOG_TRIM);

				// Características de la Ventana "Nuevo"
				nuevo.setSize(150, 250);
				nuevo.setText("Nuevo");
				nuevo.setLocation(600, 250);

				// Layout de la Ventana
				GridLayout gridLayout = new GridLayout();
				gridLayout.numColumns = 2;
				nuevo.setLayout(gridLayout);
				GridData gridData = new GridData();
				gridData.horizontalAlignment = SWT.FILL;
				gridData.grabExcessHorizontalSpace = true;

				// Creación del Label y Text para pedir la Fuerza
				Label labelFuerza = new Label(nuevo, SWT.LEFT);
				labelFuerza.setText("Fuerza: ");
				Combo comboFuerza = new Combo(nuevo, SWT.NONE);
				comboFuerza.add("0");
				comboFuerza.add("1");
				comboFuerza.add("2");
				comboFuerza.add("2");
				comboFuerza.add("4");
				comboFuerza.add("5");
				comboFuerza.setText("0");
				setAltura(Integer.parseInt(comboFuerza.getText()));

				// Creación del Label y Text para pedir el Intelecto
				Label labelIntelecto = new Label(nuevo, SWT.LEFT);
				labelIntelecto.setText("Intelecto: ");
				Combo comboIntelecto = new Combo(nuevo, SWT.NONE);
				comboIntelecto.add("0");
				comboIntelecto.add("1");
				comboIntelecto.add("2");
				comboIntelecto.add("2");
				comboIntelecto.add("4");
				comboIntelecto.add("5");
				comboIntelecto.setText("0");
				setAltura(Integer.parseInt(comboIntelecto.getText()));

				// Creación del Label y Text para pedir la Vision
				Label labelVision = new Label(nuevo, SWT.LEFT);
				labelVision.setText("Visión: ");
				Combo comboVision = new Combo(nuevo, SWT.NONE);
				comboVision.add("0");
				comboVision.add("1");
				comboVision.add("2");
				comboVision.add("2");
				comboVision.add("4");
				comboVision.add("5");
				comboVision.setText("0");
				setAltura(Integer.parseInt(comboVision.getText()));

				// Creación del Label y Text para pedir la Altura
				Label labelAltura = new Label(nuevo, SWT.LEFT);
				labelAltura.setText("Altura: ");
				Combo comboAltura = new Combo(nuevo, SWT.NONE);
				comboAltura.add("0");
				comboAltura.add("1");
				comboAltura.add("2");
				comboAltura.add("2");
				comboAltura.add("4");
				comboAltura.add("5");
				comboAltura.setText("0");
				setAltura(Integer.parseInt(comboAltura.getText()));

				// Creación del Label y Text para pedir la Agilidad
				Label labelAgilidad = new Label(nuevo, SWT.LEFT);
				labelAgilidad.setText("Agilidad: ");
				Combo comboAgilidad = new Combo(nuevo, SWT.NONE);
				comboAgilidad.add("0");
				comboAgilidad.add("1");
				comboAgilidad.add("2");
				comboAgilidad.add("2");
				comboAgilidad.add("4");
				comboAgilidad.add("5");
				comboAgilidad.setText("0");
				setAltura(Integer.parseInt(comboAgilidad.getText()));

				// Creación del Label y Text para pedir la Postura
				Label labelPostura = new Label(nuevo, SWT.LEFT);
				labelPostura.setText("Postura: ");
				Combo comboPostura = new Combo(nuevo, SWT.NONE);
				comboPostura.add("Ataque");
				comboPostura.add("Defensa");
				comboPostura.add("Reposo");
				comboPostura.setText("Reposo");
				setPostura("Reposo");

				// Creación de Button para aceptar los Parámetros
				Button buttonAceptar = new Button(nuevo, SWT.PUSH);
				buttonAceptar.setText("Aceptar");

				buttonAceptar.addSelectionListener(new SelectionListener() {
					public void widgetSelected(SelectionEvent event) {
						Funciones funciones = new Funciones();
						setFuerza(Integer.parseInt(comboFuerza.getText()));
						setIntelecto(Integer.parseInt(comboIntelecto.getText()));
						setVision(Integer.parseInt(comboVision.getText()));
						setAltura(Integer.parseInt(comboAltura.getText()));
						setAgilidad(Integer.parseInt(comboAgilidad.getText()));

						// Creación de un Dialogo para Abrir cabeza.wrl
						FileDialog fdCabeza = new FileDialog(shell, SWT.OPEN
								| SWT.CLOSE);
						fdCabeza.setFilterPath("C:/");
						String[] filterExtCabeza = { "cabeza.wrl", };
						fdCabeza.setFilterExtensions(filterExtCabeza);
						String ficheroCabeza = fdCabeza.open();

						// Creación de un Dialogo para Abrir ojo.wrl
						FileDialog fdOjo = new FileDialog(shell, SWT.OPEN
								| SWT.CLOSE);
						fdOjo.setFileName("Abrir ojo.wrl");
						fdOjo.setFilterPath("C:/");
						String[] filterExtOjo = { "ojo.wrl", };
						fdOjo.setFilterExtensions(filterExtOjo);
						String ficheroOjo = fdOjo.open();

						// Creación de un Dialogo para Abrir cola.wrl
						FileDialog fdCola = new FileDialog(shell, SWT.OPEN
								| SWT.CLOSE);
						fdCola.setFilterPath("C:/");
						String[] filterExtCola = { "cola.wrl", };
						fdCola.setFilterExtensions(filterExtCola);
						String ficheroCola = fdCola.open();

						// Creación de un Dialogo para Abrir flexo.wrl
						FileDialog fdFlexo = new FileDialog(shell, SWT.OPEN
								| SWT.CLOSE);
						fdFlexo.setFilterPath("C:/");
						String[] filterExt = { "flexo.wrl", };
						fdFlexo.setFilterExtensions(filterExt);
						String ficheroFlexo = fdFlexo.open();

						// Creación de un Dialogo para Abrir brazo.wrl
						FileDialog fdBrazo = new FileDialog(shell, SWT.OPEN
								| SWT.CLOSE);
						fdBrazo.setFilterPath("C:/");
						String[] filterExtBrazo = { "brazo.wrl", };
						fdBrazo.setFilterExtensions(filterExtBrazo);
						String ficheroBrazo = fdBrazo.open();

						// Creación de un Dialogo para Abrir pierna.wrl
						FileDialog fdPierna = new FileDialog(shell, SWT.OPEN
								| SWT.CLOSE);
						fdPierna.setFilterPath("C:/");
						String[] filterExtPierna = { "pierna.wrl", };
						fdPierna.setFilterExtensions(filterExtPierna);
						String ficheroPierna = fdPierna.open();

						// Si Existe el Fichero
						if (ficheroCabeza != null && ficheroOjo != null
								&& ficheroCola != null && ficheroFlexo != null
								&& ficheroBrazo != null
								&& ficheroPierna != null) {

							funciones.cambiarCabeza(ficheroCabeza,
									getIntelecto());
							funciones.cambiarOjo(ficheroOjo, getVision());
							funciones.cambiarCola(ficheroCola, getAgilidad());
							// funciones.cambiarAltura(ficheroFlexo,getAltura());
							funciones.cambiarFuerza(ficheroBrazo,
									ficheroPierna, getFuerza());
							funciones.cambiarArchivos(ficheroFlexo);

							// Creacion de una Ilustración que muestra los datos
							// que se han introducido en ese Ser

							CTabItem item = new CTabItem(folder, SWT.CLOSE);
							item.setText("Flexo " + folder.getItemCount());
							StyledText sytledText = new StyledText(folder,
									SWT.NONE);
							String resultado = "";
							resultado += ("-- Parámetros" + "\n");
							resultado += ("- Fuerza:      " + getFuerza() + "\n");
							resultado += ("- Intelecto:   " + getIntelecto() + "\n");
							resultado += ("- Visión:      " + getVision() + "\n");
							resultado += ("- Altura:      " + getAltura() + "\n");
							resultado += ("- Agilidad:    " + getAgilidad() + "\n");
							resultado += ("- Postura:    " + getPostura() + "\n");
							resultado += ("- Nombre del Archivo: "
									+ ficheroFlexo + "\n");

							sytledText.setText(resultado);
							item.setControl(sytledText);
							folder.showItem(item);
							folder.setSelection(item);
							nuevo.close();
						} else {
							nuevo.close();
							CTabItem item = new CTabItem(folder, SWT.CLOSE);
							item.setText("Error");
							StyledText sytledTextError = new StyledText(folder,
									SWT.NONE);
							sytledTextError
							.setText("No se ha podido crear el Ser");
							item.setControl(sytledTextError);
							folder.showItem(item);
							folder.setSelection(item);

						}
					}

					public void widgetDefaultSelected(SelectionEvent event) {
					}
				});

				nuevo.open();
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}

		}

		// Funcion salir, Sale de la Aplicación
		class salir implements SelectionListener {
			public void widgetSelected(SelectionEvent event) {
				// Creación de un Dialogo para Salir del programa
				MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION
						| SWT.YES | SWT.NO);
				messageBox.setMessage(" Seguro que desea Salir?");
				messageBox.setText("Salir");
				int response = messageBox.open();
				if (response == SWT.YES)
					System.exit(0);
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}
		}

		// Asignación de Funciones de menuArchivo
		menuArchivoNuevo.addSelectionListener(new nuevo());
		menuArchivoSalir.addSelectionListener(new salir());

		shell.setMenuBar(menuBar);

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		Generador obj = new Generador();
		obj.Interfaz();
	}

	public int getIntelecto() {
		return intelecto;
	}

	public void setIntelecto(int intelecto) {
		this.intelecto = intelecto;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public String getPostura() {
		return postura;
	}

	public void setPostura(String postura) {
		this.postura = postura;
	}

}
