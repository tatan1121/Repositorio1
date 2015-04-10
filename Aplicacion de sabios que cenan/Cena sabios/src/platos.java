import java.net.URL;
import javax.swing.*;

public class platos extends javax.swing.JFrame {
    public JLabel estados[];
    public JLabel tiempos[];
    public JPanel tenedores[];
    public JPanel platos[];
    public JLabel imagenes[];
    public boolean disten[] = new boolean[5];
    static platos obj;
    boolean tem = false;
    public platos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ten1 = new javax.swing.JPanel();
        ten2 = new javax.swing.JPanel();
        ten5 = new javax.swing.JPanel();
        ten3 = new javax.swing.JPanel();
        ten4 = new javax.swing.JPanel();
        bini = new javax.swing.JButton();
        est4 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        est3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        est2 = new javax.swing.JLabel();
        est1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        est5 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ten1.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout ten1Layout = new javax.swing.GroupLayout(ten1);
        ten1.setLayout(ten1Layout);
        ten1Layout.setHorizontalGroup(
            ten1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        ten1Layout.setVerticalGroup(
            ten1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        ten2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout ten2Layout = new javax.swing.GroupLayout(ten2);
        ten2.setLayout(ten2Layout);
        ten2Layout.setHorizontalGroup(
            ten2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        ten2Layout.setVerticalGroup(
            ten2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ten5.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout ten5Layout = new javax.swing.GroupLayout(ten5);
        ten5.setLayout(ten5Layout);
        ten5Layout.setHorizontalGroup(
            ten5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ten5Layout.setVerticalGroup(
            ten5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ten3.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout ten3Layout = new javax.swing.GroupLayout(ten3);
        ten3.setLayout(ten3Layout);
        ten3Layout.setHorizontalGroup(
            ten3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        ten3Layout.setVerticalGroup(
            ten3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        ten4.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout ten4Layout = new javax.swing.GroupLayout(ten4);
        ten4.setLayout(ten4Layout);
        ten4Layout.setHorizontalGroup(
            ten4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        ten4Layout.setVerticalGroup(
            ten4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bini.setText("EMPEZAR");
        bini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biniActionPerformed(evt);
            }
        });

        est4.setText("pensando");

        t4.setText("00");

        est3.setText("Pensando");

        t3.setText("00");

        t2.setText("00");

        est2.setText("Pensando");

        est1.setText("Pensando");

        t1.setText("00");

        est5.setText("Pensando");

        t5.setText("00");

        img1.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(est1)
                                .addGap(18, 18, 18)
                                .addComponent(t1)
                                .addGap(127, 127, 127)
                                .addComponent(est2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ten5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(ten2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ten1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(est5)
                                .addGap(18, 18, 18)
                                .addComponent(t5)
                                .addGap(108, 108, 108)
                                .addComponent(est4)
                                .addGap(18, 18, 18)
                                .addComponent(t4)
                                .addGap(148, 148, 148)
                                .addComponent(est3)
                                .addGap(18, 18, 18)
                                .addComponent(t3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(img5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ten4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ten3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(bini, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(est2)
                            .addComponent(t2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(est1)
                            .addComponent(t1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ten5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ten2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(est5)
                                    .addComponent(t5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(est4)
                                    .addComponent(t4))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ten4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ten3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addComponent(bini, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(est3)
                            .addComponent(t3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void biniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biniActionPerformed
      tem =true;
    }//GEN-LAST:event_biniActionPerformed

    public static void main(String args[]) {
        obj=new platos();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj.setVisible(true);
         }
        });        
           
    obj.añadir();
    for (int i=0;i<=4;i++){
        hilo hilo=new hilo(i,obj);
        hilo.start();
        }
    
    
    
    }
    
    
    
     void añadir(){
     estados=new JLabel [5];
        estados[0]=est1;
        estados[1]=est2;
        estados[2]=est3;
        estados[3]=est4;
        estados[4]=est5;
    tiempos=new JLabel [5];
        tiempos[0]=t1;
        tiempos[1]=t2;
        tiempos[2]=t3;
        tiempos[3]=t4;
        tiempos[4]=t5;
        for (int i=0;i<5;i++){
            disten[i]=true;   
        }
    tenedores=new JPanel [5];
        tenedores[0]=ten1;
        tenedores[1]=ten2;
        tenedores[2]=ten3;
        tenedores[3]=ten4;
        tenedores[4]=ten5;
        imagenes=new JLabel [5];
        imagenes[0]=img1;
        imagenes[1]=img2;
        imagenes[2]=img3;
        imagenes[3]=img4;
        imagenes[4]=img5;
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bini;
    public static javax.swing.JLabel est1;
    public static javax.swing.JLabel est2;
    public static javax.swing.JLabel est3;
    public static javax.swing.JLabel est4;
    public static javax.swing.JLabel est5;
    public static javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    public static javax.swing.JLabel t1;
    public static javax.swing.JLabel t2;
    public static javax.swing.JLabel t3;
    public static javax.swing.JLabel t4;
    public static javax.swing.JLabel t5;
    public static javax.swing.JPanel ten1;
    public static javax.swing.JPanel ten2;
    public static javax.swing.JPanel ten3;
    public static javax.swing.JPanel ten4;
    public static javax.swing.JPanel ten5;
    // End of variables declaration//GEN-END:variables
}
