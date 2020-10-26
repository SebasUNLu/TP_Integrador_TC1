package integrador;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.JTextArea;
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

public class Integ extends JFrame{

	private static final long serialVersionUID = 1L;
    private JFileChooser agreArc ;
    private FileReader fichero;
    private JTextArea textArea;
    private JTextArea textArea_1;
	private String ruta;


	public Integ() {
		initialize();
	}

//___________________________________________________________________________AREA DE OBJETOS 
	private void initialize() {
		
		this.setBounds(100, 100,600,430);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JButton btnNewButton_1 = new JButton("SIMBOLOS");
		btnNewButton_1.setBounds(334, 358, 136, 23);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ANALIZAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					fichero=new FileReader(ruta);
					Lexico lex= new Lexico(fichero);
					lex.next_token();
					fichero.close();
				} catch (FileNotFoundException e) {
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_2.setBounds(173, 358, 136, 23);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_2);
		
		 textArea = new JTextArea();
		 textArea.setTabSize(5);
		 textArea.setLineWrap(true);
		 textArea.setWrapStyleWord(true);
		 textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		 textArea.setBounds(34, 24, 255, 277);
		panel.add(textArea);
	
		
		 textArea_1 = new JTextArea();
		 textArea_1.setBounds(312, 21, 255, 280);
		 textArea_1.setLineWrap(true);
		panel.add(textArea_1);
		
		JButton btnNewButton = new JButton("CARGAR ARCHIVO");
		btnNewButton.setBounds(20, 358, 136, 23);
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
		btnNewButton_3.setBounds(20, 324, 136, 23);
		panel.add(btnNewButton_3);
  

	
		
	
	}
	//__________________________________________________________________________mostrar text area 2
	 protected void  mostrar2(String str) {
		  
		 this.textArea_1.setText(str+" \n ");
	 }
	
	
	//___________________________________________________________________________________GUARDA LO QUE ESTA EN TEXTAREA EN EL ARCHIVO EN UBICACION
			protected void guardarARc() throws IOException {
				
				String str = textArea.getText();
				textArea.setText("");
				FileWriter escribir = new FileWriter(ruta);
				  for (int i=0;i<str.length();i++) {
					  escribir.write(str.charAt(i));
				  }
				  escribir.close();
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
                
				};
		
	}
}
