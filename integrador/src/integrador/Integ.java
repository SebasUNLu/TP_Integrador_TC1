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
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Integ extends JFrame {

	private static final long serialVersionUID = 1L;
    private JFileChooser agreArc ;
    private FileReader fichero;
    private JTextArea textArea;
    private JTextArea textArea_1;
	


	public Integ() {
		initialize();
	}


	private void initialize() {
		
		this.setBounds(100, 100, 998, 776);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JButton btnNewButton_1 = new JButton("SIMBOLOS");
		btnNewButton_1.setBounds(308, 703, 121, 23);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ANALIZAR");
		btnNewButton_2.setBounds(177, 703, 121, 23);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton_2);
		
		 textArea = new JTextArea();
		textArea.setBounds(42, 21, 442, 627);
		panel.add(textArea);
	
		
		 textArea_1 = new JTextArea();
		textArea_1.setBounds(498, 21, 442, 627);
		panel.add(textArea_1);
		
		JButton btnNewButton = new JButton("CARGAR ARCHIVO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                      try {
						ventanaArc();
					} catch (IOException e) {
						
					}

				
			
			}
		});
	
		
		                          
		
		btnNewButton.setBounds(32, 703, 135, 23);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton);
		
		
	
	}
	
		protected void ventanaArc() throws IOException {
			this.agreArc = new JFileChooser();
			int num = this.agreArc.showOpenDialog(this);
				if (num==agreArc.APPROVE_OPTION) {
					 File archivo = agreArc.getSelectedFile();
					 String str="";
						fichero=new FileReader(archivo);
						     int i=fichero.read();
						     while(i!=-1) {
						    	 str=str+ " " + (char) i;
						    	 i=fichero.read();
						     }
				this.textArea.setText(str);

				};
		
	}
	
}
