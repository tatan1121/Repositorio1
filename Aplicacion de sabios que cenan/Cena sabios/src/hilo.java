import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import javax.swing.*;

    
public class hilo extends Thread {
    public String Estado;
    platos obj ;
    int num;
    int slep=1;
    String path;
    Random r = new Random();
    static Timer timer[]=new Timer [5];
    public int tiempo;
    public hilo(int num, platos obj){
        Estado="pensando";
        this.num=num;
        this.obj=obj;
    }
    public void run() {
        timer[num] = new Timer (500, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            { 
                if(Estado.equals("comiendo")&&(Integer.parseInt(obj.tiempos[num].getText())==0)){
                    Estado="durmiendo";
                    obj.estados[num].setText("durmiendo");
                    obj.tiempos[num].setText("-");
                    if(num==0){
                            obj.disten[num]=true;
                            obj.tenedores[num].setBackground(Color.yellow);
                            obj.disten[4]=true;
                            obj.tenedores[4].setBackground(Color.yellow);
                            
                    }
                    else{
                        obj.disten[num]=true;
                        obj.tenedores[num].setBackground(Color.yellow);
                        obj.disten[num-1]=true;
                        obj.tenedores[num-1].setBackground(Color.yellow);
                    }
                
                }
                if((Estado.equals("pensando")||(Estado.equals("esperando")))&&(Integer.parseInt(obj.tiempos[num].getText())==0)){
                    if(num==0){
                        if((obj.disten[num]==true)&&(obj.disten[4]==true)){
                    
                            Estado="comiendo";
                            obj.disten[num]=false;
                            obj.tenedores[num].setBackground(Color.red);
                            obj.disten[4]=false;
                            obj.tenedores[4].setBackground(Color.red);
                            obj.estados[num].setText("comiendo");
                            obj.tiempos[num].setText("10");
                        }
                        else{
                        Estado="esperando";
                        obj.estados[num].setText("esperando");
                        }   
                    }
                    else{
                        if((obj.disten[num]==true)&&(obj.disten[num-1]==true)){
                            Estado="comiendo";
                            obj.disten[num]=false;
                            obj.tenedores[num].setBackground(Color.red);
                            obj.disten[num-1]=false;
                            obj.tenedores[num-1].setBackground(Color.red);
                            obj.estados[num].setText("comiendo");
                            obj.tiempos[num].setText("10");
                        }
                        else{
                        Estado="esperando";
                        obj.estados[num].setText("esperando");
                        }
                        
                    }
                }
                if(slep==1){
                    if(Estado.equals("comiendo")){
                        if(num==0){ path = "/imagenes/comer11.gif"; }
                        if(num==1){ path = "/imagenes/comer12.gif"; }
                        if(num==2){ path = "/imagenes/comer13.gif"; }
                        if(num==3){ path = "/imagenes/comer14.gif"; }
                        if(num==4){ path = "/imagenes/comer15.gif"; }  
                    URL url = this.getClass().getResource(path);  
                    ImageIcon icon = new ImageIcon(url); 
                    obj.imagenes[num].setIcon(icon);
                    
                    }
                    
                if(Estado.equals("pensando")||Estado.equals("comiendo"))
                obj.tiempos[num].setText(Integer.toString(Integer.parseInt(obj.tiempos[num].getText())-1));
                slep=0;
                }
                else{
                    if(Estado.equals("pensando")){
                        if(num==0){  path = "/imagenes/pensar11.gif"; }
                        else if(num==1){  path = "/imagenes/pensar12.gif"; }
                        else if(num==2){  path = "/imagenes/pensar13.gif"; }
                        else if(num==3){  path = "/imagenes/pensar14.gif"; }
                        else if(num==4){  path = "/imagenes/pensar15.gif"; }
                        
                    }
                    if(Estado.equals("durmiendo")){
                     if(num==0){  path = "/imagenes/dormir21.gif"; }
                        else if(num==1){  path = "/imagenes/dormir22.gif"; }
                        else if(num==2){  path = "/imagenes/dormir23.gif"; }
                        else if(num==3){  path = "/imagenes/dormir24.gif"; }
                        else if(num==4){  path = "/imagenes/dormir25.gif"; }
                       
                    }
                    if(Estado.equals("comiendo")){
                            if(num==0){  path = "/imagenes/comer21.gif"; }
                        else if(num==1){  path = "/imagenes/comer22.gif"; }
                        else if(num==2){  path = "/imagenes/comer23.gif"; }
                        else if(num==3){  path = "/imagenes/comer24.gif"; }
                        else if(num==4){  path = "/imagenes/comer25.gif"; }
                        
                   
                    }
                     URL url = this.getClass().getResource(path);  
                    ImageIcon icon = new ImageIcon(url); 
                    obj.imagenes[num].setIcon(icon);
                    
                    slep=1;
                }
            } 
        });
        tiempo=r.nextInt(12)+1;
        obj.tiempos[num].setText(String.valueOf(tiempo));
        while (true){
            
            if (obj.tem==true){
                timer[num].start();
            }
            else{
            System.out.print("");
            }
        }
    }
}


