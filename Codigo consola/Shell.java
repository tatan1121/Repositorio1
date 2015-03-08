
import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComponent;

public class Shell extends JFrame{
	
	//elementos gráficos
	JTextField tComando;
	JButton bEjecutar,bBorrar;
	JTextArea tResultado;
	JScrollPane sPane;
        JLabel titulo;
	//oyente de click de botón
	ActionListener alEjecutar;

	public Shell(){
            
		setSize(600,600);
		setTitle(System.getProperty("os.name"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void graficos(){
            
		getContentPane().setLayout(null);
//poner para ejecutar desde IDE
               // Icon blanco=new ImageIcon(getClass().getResource("home/sebastian/Desktop/blanco.jpg"));
               // Icon negro=new ImageIcon(getClass().getResource("home/sebastian/Desktop/negro.jpg"));

                //label de titulo
                titulo= new JLabel("INGRESE EL COMANDO ");
                titulo.setBounds(50,15,200,30);
                add(titulo);
		//cuadro de texto
		tComando = new JTextField();
		tComando.setBounds(50,50,250,30);
		add(tComando);
		//botón para ejecutar comando.
                // agregue arreglo visual para botones limpiar y ejecutar
//poner para ejecutar desde IDE
		//bEjecutar = new JButton("Ejecutar",blanco);
		//bEjecutar.setRolloverIcon(negro);
//quitar para ejecutar desde IDE
		bEjecutar =new JButton("Ejecutar");
               //
		bEjecutar.setBounds(320,50,110,30);
		add(bEjecutar);
		bEjecutar.addActionListener(alEjecutar);
                //agregue boton para borrar la consola

//poner para ejecutar desde IDE
		//bBorrar = new JButton("Limpiar",blanco);
               //bBorrar.setRolloverIcon(negro);

//quitar para ejecutar desde IDE
		bBorrar = new JButton("Limpiar");
		bBorrar.setBounds(440,50,110,30);
		add(bBorrar);
                bBorrar.addActionListener(alEjecutar);

		//área de texto
		tResultado = new JTextArea("Aqui podrá observar la respuesta a sus comandos..");
		tResultado.setBounds(50,130,600,370);
		tResultado.setBackground(Color.BLACK);
		tResultado.setForeground(Color.BLUE);
		//scroll pane
		sPane = new JScrollPane(tResultado);
		sPane.setBounds(50,120,500,400);
		add(sPane);
		//
		setVisible(true);
	}

	private void acciones(){
		alEjecutar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// agregue switch  y cambien nombre ejecutar para diferenciar metodo de linux con windows
                            if(e.getActionCommand().equals("Ejecutar")){
				String SO;
                                SO=(System.getProperty("os.name"));
                                System.out.println(SO);
				switch(SO){
				case "Linux":
				ejecutarLinux();
				//limpiar la caja de texto
				tComando.setText(" ");
				
				break;	
				case "Windows 7":
				ejecutarWindows();
				//Limpiar la caja de texto 
				tComando.setText(" ");
				
				break;			
				}
                            }
                            // agregue accion limpiar consola
                            if(e.getActionCommand().equals("Limpiar")){
                                tResultado.setText(" ");
                            }
                            
			}
		};
             
	}
	//agregue metodo ejecutar windows
	private void ejecutarWindows(){
	String salida = null;
        String lecto=null;
		try{
		    //limpiar mensaje de bienvenida
			tResultado.setText(" ");
		    // Ejecucion Basica del Comando
		    Process proceso = Runtime.getRuntime().exec(tComando.getText());

		    InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
		    BufferedReader stdInput = new BufferedReader(entrada);
                    
                    lecto=stdInput.readLine();
		    //Si el comando tiene una salida la mostramos
		    if(lecto != null){
		    	System.out.println("Comando ejecutado Correctamente");
		    	while (lecto != null){
		        	tResultado.setText(tResultado.getText()+lecto+"\n");
                                lecto=stdInput.readLine();
		        }
		    }else{
		    	System.out.println("No se a producido ninguna salida");
		    }
		}catch (IOException e) {
                System.out.println("Excepción: ");
                e.printStackTrace();
       	 	}

	}
	private void ejecutarLinux(){

		Process proc; 
		InputStream is_in;
		String s_aux;
		BufferedReader br;

		try
		{
		//limpiar mensaje de bienvenida
		tResultado.setText(" ");
			proc = Runtime.getRuntime().exec(tComando.getText());
			is_in=proc.getInputStream();
			br=new BufferedReader (new InputStreamReader (is_in));
			s_aux = br.readLine();
            while (s_aux!=null)
            {
            	tResultado.setText(tResultado.getText()+s_aux+"\n");
                s_aux = br.readLine();
            } 
		}
		catch(Exception e)
		{
			e.getMessage();
		}


	}

	public static void main(String args[]){
		Shell ventana = new Shell();
		ventana.acciones();	
		ventana.graficos();
                
	}

}
