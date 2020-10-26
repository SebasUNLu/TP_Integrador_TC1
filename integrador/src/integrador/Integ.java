package integrador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

import java_cup.runtime.Symbol;
import jflex.core.sym;
import javax.swing.JLabel;

public class Integ extends JFrame{

	private static final long serialVersionUID = 1L;
    private JFileChooser agreArc ;
    private FileReader fichero;
    private JTextArea textArea;
    private JTextArea textArea_1;
    private JScrollPane ap;
    private JScrollPane ap2;
	private String ruta;
	private inputOutputFile iof = new inputOutputFile();
	private JLabel label_ruta;

	private TablaSimbolos Tabla;

	public Integ() {
		initialize();
		Tabla=new TablaSimbolos();
	}

//___________________________________________________________________________AREA DE OBJETOS 
	private void initialize() {
		
		this.setBounds(100, 100,797,430);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JButton btnNewButton_1 = new JButton("SIMBOLOS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iof.guardarArchivo(Tabla.TBL_Simbolos);
			}
		});
		btnNewButton_1.setBounds(615, 357, 136, 23);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ANALIZAR");
		btnNewButton_2.setBounds(322, 357, 136, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ruta == null) {
					JOptionPane.showMessageDialog(null, "No se detecto ningun archivo cargado\nDebe cargar un archivo antes", "Ruta no especificada", JOptionPane.ERROR_MESSAGE);
				}else {
					textArea_1.setText("");
					try {
						fichero=new FileReader(ruta);
						Lexico lex= new Lexico(fichero,textArea_1,Tabla);
						lex.next_token();
						fichero.close();
					} catch (FileNotFoundException e) {
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_2);
		
		 textArea = new JTextArea();
		 textArea.setBounds(10, 10,345, 283);
		 textArea.setEditable(true);
		 textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		 ap=new JScrollPane(textArea);
		 ap.setBounds(10, 10,345, 283);
		 panel.add(ap);
		 

		 textArea_1 = new JTextArea();
		 textArea_1.setBounds(406, 13,345, 280);
		 textArea_1.setEditable(true);
		 textArea_1.setFont(new Font("Arial", Font.PLAIN, 12));

		 ap2=new JScrollPane(textArea_1);
		 ap2.setBounds(406, 13,345, 280);
		 panel.add(ap2);
		 
		
		JButton btnNewButton = new JButton("CARGAR ARCHIVO");
		btnNewButton.setBounds(166, 357, 136, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                      try {
						ventanaArc();
					} catch (IOException e) {
						
					}

				
			
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton);
	//_____________________________________________________________________EVENTO LO ESCRITO EN TEXT AREA 
		JButton btnNewButton_3 = new JButton("GUARDAR");
		btnNewButton_3.setBounds(20, 357, 136, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					guardarARc();
				} catch (IOException e) {
					System.out.println("Guardado");
				} 
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_3);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(129, 293, 89, 23);
		panel.add(btnClear);
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText("");
			}
		});
		btnClear_1.setBounds(536, 293, 89, 23);
		panel.add(btnClear_1);
		
		label_ruta = new JLabel("Ruta indicada:");
		label_ruta.setBounds(10, 332, 741, 14);
		panel.add(label_ruta);
  

	
		
	
	}
	//__________________________________________________________________________mostrar text area 2
	 protected void  mostrar2(String str) {
		  
		 this.textArea_1.setText(str+" \n ");
	 }
	
	
	//___________________________________________________________________________________GUARDA LO QUE ESTA EN TEXTAREA EN EL ARCHIVO EN UBICACION
			protected void guardarARc() throws IOException {
				
				if(ruta == null) {
					ruta = JOptionPane.showInputDialog("Ingrese el nombre del archivo a guardar\nSe guardara en la carpeta del proyecto");
				}
				if(ruta !=null) {
					String str = textArea.getText();
					textArea.setText("");
					FileWriter escribir = new FileWriter(ruta);
					  for (int i=0;i<str.length();i++) {
						  escribir.write(str.charAt(i));
					  }
					  escribir.close();
				}
			}
	
	
	
	
	//__________________________________________________________________________________PIDE UBICACION DE ARCHIVO 
		@SuppressWarnings("static-access")
		protected void ventanaArc() throws IOException {
			this.agreArc = new JFileChooser();
			int num = this.agreArc.showOpenDialog(this);
				if (num==agreArc.APPROVE_OPTION) {
					 File archivo = agreArc.getSelectedFile();
					 ruta=new String();
				     ruta=archivo.getAbsolutePath();
					 String str="";
						fichero=new FileReader(archivo);
						     int i=fichero.read();
						     while(i!=-1) {
						    	 if(i!=0) {
						    	 str=str+(char)(i);
						    	 }
						    	 i=fichero.read();
						     }
		        fichero.close();
				this.textArea.setText(str);
                label_ruta.setText("Ruta indicada: "+archivo.getAbsolutePath());
				};
		
	}
}
