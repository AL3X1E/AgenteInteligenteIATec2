package Principal;

/**
 *
 * @author Jesus Angel Serna
 */
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    //Variables
    int PosicionX = 0;
    int PosicionY = 4;
    int Turnos = 0;
    int Tiempo = 1;
    
    int [] Pozo1 = new int [2];
    int [] Pozo2 = new int [2];
    int [] Tesoro = new int [2];
    int [] Gumpi = new int [2];
    
    int [] Alrededor = new int [8];
    int XTesoro = 0;
    int YTesoro = 0;
    boolean EncontroTesoro = false;
    int XGumpi = 0;
    int YGumpi = 0;
    boolean EncontroGumpi = false;
            
    int [] AlrededorGumpi = new int [8];
    int EjeXGumpi = 0;
    int EjeYGumpi = 0;
    
    String Cadena ="";
    String CadenaMemo ="";
    String CadenaAlrededor="";
    
    //Matrices
    int [][] Mapa = {
        {3,3,3,3,3},
        {3,3,3,3,3},
        {3,3,3,3,3},
        {3,3,3,3,3},
        {5,3,3,3,3}
    };
    int [][] Memoria = {
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {5,0,0,0,0}
    };
    
    //Metodo Constructor para la ventana
    public Interfaz() {
        super("Agente Inteligente 1.3.1");
        UbicarObjetos();
        
        initComponents();
        
        RellenarCadena();
        RellenarCadenaMemo();
        setLocationRelativeTo(null);
        setResizable(false);
        
        LabelTurnos.setText(Turnos+"");
        LabelTiempo.setText(Tiempo+"");
        
        
        
    }

    //Codigo Generado Automaticamente NO MOVER
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        PanelMemoria = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMemoria = new javax.swing.JTextArea();
        PanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelTurnos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelTiempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelTesoro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelXTesoro = new javax.swing.JLabel();
        LabelYTesoro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelGumpi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelXGumpi = new javax.swing.JLabel();
        LabelYGumpi = new javax.swing.JLabel();
        PanelJuego = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaMapa = new javax.swing.JTextArea();
        BtnSubir = new javax.swing.JButton();
        BtnBajar = new javax.swing.JButton();
        BtnIzquierda = new javax.swing.JButton();
        BtnDerecha = new javax.swing.JButton();
        BtnAnalizar = new javax.swing.JButton();
        BtnAutomatico = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelAlrededor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextAreaAlrededor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PanelMemoria.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Memoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 12))); // NOI18N

        TextAreaMemoria.setEditable(false);
        TextAreaMemoria.setColumns(20);
        TextAreaMemoria.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        TextAreaMemoria.setRows(5);
        jScrollPane1.setViewportView(TextAreaMemoria);

        javax.swing.GroupLayout PanelMemoriaLayout = new javax.swing.GroupLayout(PanelMemoria);
        PanelMemoria.setLayout(PanelMemoriaLayout);
        PanelMemoriaLayout.setHorizontalGroup(
            PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelMemoriaLayout.setVerticalGroup(
            PanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Cambria", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel1.setText("Turnos =");

        LabelTurnos.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelTurnos.setText("0");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel2.setText("Tiempo =");

        LabelTiempo.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelTiempo.setText("0");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel3.setText("Tesoro =");

        LabelTesoro.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelTesoro.setText("False");

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel5.setText("XY T =");

        LabelXTesoro.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelXTesoro.setText("0");

        LabelYTesoro.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelYTesoro.setText("0");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel4.setText("Gumpi =");

        LabelGumpi.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelGumpi.setText("False");

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel6.setText("XY G =");

        LabelXGumpi.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelXGumpi.setText("0");

        LabelYGumpi.setFont(new java.awt.Font("Constantia", 3, 14)); // NOI18N
        LabelYGumpi.setText("0");

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTurnos)
                            .addComponent(LabelTesoro)
                            .addComponent(LabelTiempo)))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(LabelXGumpi)
                        .addGap(18, 18, 18)
                        .addComponent(LabelYGumpi))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(LabelGumpi))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(LabelXTesoro)
                        .addGap(18, 18, 18)
                        .addComponent(LabelYTesoro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelTurnos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelTiempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabelTesoro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LabelXTesoro)
                    .addComponent(LabelYTesoro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LabelGumpi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LabelXGumpi)
                    .addComponent(LabelYGumpi))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        TextAreaMapa.setEditable(false);
        TextAreaMapa.setColumns(20);
        TextAreaMapa.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        TextAreaMapa.setRows(5);
        jScrollPane2.setViewportView(TextAreaMapa);

        BtnSubir.setBackground(new java.awt.Color(204, 0, 51));
        BtnSubir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BtnSubir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubir.setText("Subir");
        BtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubirActionPerformed(evt);
            }
        });

        BtnBajar.setBackground(new java.awt.Color(0, 0, 204));
        BtnBajar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BtnBajar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBajar.setText("Bajar");
        BtnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajarActionPerformed(evt);
            }
        });

        BtnIzquierda.setBackground(new java.awt.Color(153, 0, 255));
        BtnIzquierda.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BtnIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        BtnIzquierda.setText("Izquierda");
        BtnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIzquierdaActionPerformed(evt);
            }
        });

        BtnDerecha.setBackground(new java.awt.Color(204, 0, 102));
        BtnDerecha.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BtnDerecha.setForeground(new java.awt.Color(255, 255, 255));
        BtnDerecha.setText("Derecha");
        BtnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDerechaActionPerformed(evt);
            }
        });

        BtnAnalizar.setBackground(new java.awt.Color(51, 204, 0));
        BtnAnalizar.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        BtnAnalizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAnalizar.setText("Analizar");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });

        BtnAutomatico.setBackground(new java.awt.Color(255, 153, 102));
        BtnAutomatico.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        BtnAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        BtnAutomatico.setText("Automatico");
        BtnAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutomaticoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel7.setText("Controles Manuales");

        jLabel8.setFont(new java.awt.Font("Wingdings 3", 0, 14)); // NOI18N
        jLabel8.setText("Controles Manualesss");

        jLabel9.setFont(new java.awt.Font("Wingdings 3", 0, 14)); // NOI18N
        jLabel9.setText("Controles Manualesss");

        javax.swing.GroupLayout PanelJuegoLayout = new javax.swing.GroupLayout(PanelJuego);
        PanelJuego.setLayout(PanelJuegoLayout);
        PanelJuegoLayout.setHorizontalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addComponent(BtnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelJuegoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnBajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJuegoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnAutomatico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJuegoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        PanelJuegoLayout.setVerticalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAutomatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelJuegoLayout.createSequentialGroup()
                            .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34))
                        .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addComponent(BtnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnBajar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelAlrededor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Alrededores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 12))); // NOI18N

        TextAreaAlrededor.setEditable(false);
        TextAreaAlrededor.setColumns(14);
        TextAreaAlrededor.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        TextAreaAlrededor.setRows(3);
        TextAreaAlrededor.setAutoscrolls(false);
        jScrollPane4.setViewportView(TextAreaAlrededor);

        javax.swing.GroupLayout PanelAlrededorLayout = new javax.swing.GroupLayout(PanelAlrededor);
        PanelAlrededor.setLayout(PanelAlrededorLayout);
        PanelAlrededorLayout.setHorizontalGroup(
            PanelAlrededorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlrededorLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        PanelAlrededorLayout.setVerticalGroup(
            PanelAlrededorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlrededorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAlrededor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                        .addComponent(PanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelAlrededor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarActionPerformed

        AnalizadorAgente();
        
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    private void BtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubirActionPerformed
        
        if(PosicionY-1 < 0){
            JOptionPane.showMessageDialog(null,"No Puedes Subir");
        }else if(Mapa[PosicionY-1][PosicionX] == 2){
            JOptionPane.showMessageDialog(null,"Bloqueado por un Pozo");
        }else if(Mapa[PosicionY-1][PosicionX] == 1){
            JOptionPane.showMessageDialog(null,"Game Over");
            System.exit(0);
        }else if(Mapa[PosicionY-1][PosicionX] == 4){
            JOptionPane.showMessageDialog(null,"Victoria");
            System.exit(0);
        }else{
            
            MoverArriba();  
            
        }
        
    }//GEN-LAST:event_BtnSubirActionPerformed

    private void BtnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajarActionPerformed
        
        if(PosicionY+1 > 4){
            JOptionPane.showMessageDialog(null,"No Puedes Bajar");
        }else if(Mapa[PosicionY+1][PosicionX] == 2){
            JOptionPane.showMessageDialog(null,"Bloqueado por un Pozo");
        }else if(Mapa[PosicionY+1][PosicionX] == 1){
            JOptionPane.showMessageDialog(null,"Game Over");
            System.exit(0);
        }else if(Mapa[PosicionY+1][PosicionX] == 4){
            JOptionPane.showMessageDialog(null,"Victoria");
            System.exit(0);
        }else{
            
            MoverAbajo();
            
        }
        
    }//GEN-LAST:event_BtnBajarActionPerformed

    private void BtnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIzquierdaActionPerformed
        
        if(PosicionX-1 < 0){
            JOptionPane.showMessageDialog(null,"No Puedes ir a la Izquierda");
        }else if(Mapa[PosicionY][PosicionX-1] == 2){
            JOptionPane.showMessageDialog(null,"Bloqueado por un Pozo");
        }else if(Mapa[PosicionY][PosicionX-1] == 1){
            JOptionPane.showMessageDialog(null,"Game Over");
            System.exit(0);
        }else if(Mapa[PosicionY][PosicionX-1] == 4){
            JOptionPane.showMessageDialog(null,"Victoria");
            System.exit(0);
        }else{
            
            MoverIzquierda();
            
        }
        
    }//GEN-LAST:event_BtnIzquierdaActionPerformed

    private void BtnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDerechaActionPerformed
        
        if(PosicionX+1 > 4){
            JOptionPane.showMessageDialog(null,"No Puedes ir a la Derecha");
        }else if(Mapa[PosicionY][PosicionX+1] == 2){
            JOptionPane.showMessageDialog(null,"Bloqueado por un Pozo");
        }else if(Mapa[PosicionY][PosicionX+1] == 1){
            JOptionPane.showMessageDialog(null,"Game Over");
            System.exit(0);
        }else if(Mapa[PosicionY][PosicionX+1] == 4){
            JOptionPane.showMessageDialog(null,"Victoria");
            System.exit(0);
        }else{
            
            MoverDerecha();
            
        }
        
    }//GEN-LAST:event_BtnDerechaActionPerformed

    private void BtnAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutomaticoActionPerformed
        
        //Arriba , Derecha , Abajo , Izquierda 
        int Dir1 = -1;
        int Dir2 = -1;
        int Dir3 = -1;
        int Dir4 = -1;
        
        int Random = 0;
        int CicloRandom = 0;
        int MayorPrioridad = 0;
        
        boolean BloqueoT = false;
        int XFaltante = 0;
        int YFaltante = 0;
        
        AnalizadorAgente();
        
        //Checar los cuatro puntos cardinales
        if(Alrededor[3]==3){
            Dir1 = 0;
        }
        if(Alrededor[6]==3){
            Dir2 = 0;
        }
        if(Alrededor[4]==3){
            Dir3 = 0;
        }
        if(Alrededor[1]==3){
            Dir4 = 0;
        }
        
        //Chacar al gumpi en las esquinas de su campo de vision
        if(EncontroGumpi == true && Tiempo == 2){
            if(Alrededor[0] == 1){
                if(Alrededor[3] != 4){
                    Dir1 = -1;
                }
                if(Alrededor[1] != 4){
                    Dir4 = -1;
                }
            }
            if(Alrededor[5] == 1){
                if(Alrededor[3] != 4){
                    Dir1 = -1;
                }
                if(Alrededor[6] != 4){
                    Dir2 = -1;
                }
            }
            if(Alrededor[7] == 1){
                if(Alrededor[6] != 4){
                    Dir2 = -1;
                }
                if(Alrededor[4] != 4){
                    Dir3 = -1;
                }
            }
            if(Alrededor[2] == 1){
                if(Alrededor[4] != 4){
                    Dir3 = -1;
                }
                if(Alrededor[1] != 4){
                    Dir4 = -1;
                }
                
            }
        }
        
        //Buscar camino optimo al Tesoro
        if(EncontroTesoro == true && BloqueoT == false){
            XFaltante = XTesoro - PosicionX;
            YFaltante = YTesoro - PosicionY;
            
            //No esta alineado en el eje X y Y
            if(XFaltante != 0 && YFaltante != 0){
                
                if(XFaltante > 0){
                    if(Dir2 == 0){
                        Dir2 = 5;
                    }
                }
                if(XFaltante < 0){
                    if(Dir4 == 0){
                        Dir4 = 5;
                    }
                }
                if(YFaltante > 0){
                    if(Dir3 == 0){
                        Dir3 = 5;
                    }
                }
                if(YFaltante < 0){
                    if(Dir1 == 0){
                        Dir1 = 5;
                    }
                }
                
                if(Dir1 == 5 || Dir2 == 5 || Dir3 == 5 || Dir4 == 5){
                
                    while(CicloRandom == 0){

                        Random = (int)(Math.random()*4+1);

                        if(Random == 1 && Dir1 == 5){
                            MoverArriba();
                            CicloRandom = 1;
                        }
                        if(Random == 2 && Dir2 == 5){
                            MoverDerecha();
                            CicloRandom = 1;
                        }
                        if(Random == 3 && Dir3 == 5){
                            MoverAbajo();
                            CicloRandom = 1;
                        }
                        if(Random == 4 && Dir4 == 5){
                            MoverIzquierda();
                            CicloRandom = 1;
                        }
                    }
                }else{
                    BloqueoT = true;
                }
                
            //No esta alineado en el eje X
            }else if(XFaltante != 0){
                
                if(XFaltante > 0){
                    if(Dir2 == 0){
                        MoverDerecha();
                        Dir2 = 5;
                    }else if(Mapa[PosicionY][PosicionX+1] == 4){
                        MoverDerecha();
                        JOptionPane.showMessageDialog(null,"Victoria");
                        System.exit(0);
                    }else{
                        BloqueoT = true;
                    }
                }
                if(XFaltante < 0){
                    if(Dir4 == 0){
                        MoverIzquierda();
                        Dir4 = 5;
                    }else if(Mapa[PosicionY][PosicionX-1] == 4){
                        MoverIzquierda();
                        JOptionPane.showMessageDialog(null,"Victoria");
                        System.exit(0);
                    }else{
                        BloqueoT = true;
                    }
                }
                
            //No esta alineado en el eje Y
            }else if(YFaltante != 0){
                
                if(YFaltante < 0){
                    if(Dir1 == 0){
                        MoverArriba();
                        Dir1 = 5;
                    }else if(Mapa[PosicionY-1][PosicionX] == 4){
                        MoverArriba();
                        JOptionPane.showMessageDialog(null,"Victoria");
                        System.exit(0);
                    }else{
                        BloqueoT = true;
                    }
                }
                if(YFaltante > 0){
                    if(Dir3 == 0){
                        MoverAbajo();
                        Dir3 = 5;
                    }else if(Mapa[PosicionY+1][PosicionX] == 4){
                        MoverAbajo();
                        JOptionPane.showMessageDialog(null,"Victoria");
                        System.exit(0);
                    }else{
                        BloqueoT = true;
                    }
                }
                
            }
            
            if(BloqueoT == true){
                EncontroTesoro = false;
            }
            
        }
        
        //Camino a los 0, en caso de no encontar el tesoro
        if(EncontroTesoro == false){
            
            if(Dir1 == 0){
                for(int a=-1; a < 2; a++){
                    try {
                        if(Memoria[PosicionY-2][PosicionX+a] == 0){
                            Dir1 = Dir1 + 1;
                        }
                    } catch (Exception e) {
                        
                    }
                }
            }
            
            if(Dir2 == 0){
                for(int a=-1; a < 2; a++){
                    try {
                        if(Memoria[PosicionY+a][PosicionX+2] == 0){
                            Dir2 = Dir2 + 1;
                        }
                    } catch (Exception e) {
                        
                    }
                }
            }
            
            if(Dir3 == 0){
                for(int a=-1; a < 2; a++){
                    try {
                        if(Memoria[PosicionY+2][PosicionX+a] == 0){
                            Dir3 = Dir3 + 1;
                        }
                    } catch (Exception e) {
                        
                    }
                }
            }
            
            if(Dir4 == 0){
                for(int a=-1; a < 2; a++){
                    try {
                        if(Memoria[PosicionY+a][PosicionX-2] == 0){
                            Dir4 = Dir4 + 1;
                        }
                    } catch (Exception e) {
                        
                    }
                }
            }
            
            if(MayorPrioridad < Dir1){
                MayorPrioridad = Dir1;
            }
            if(MayorPrioridad < Dir2){
                MayorPrioridad = Dir2;
            }
            if(MayorPrioridad < Dir3){
                MayorPrioridad = Dir3;
            }
            if(MayorPrioridad < Dir4){
                MayorPrioridad = Dir4;
            }
            
            if(Dir1 > 0 || Dir2 > 0 || Dir3 > 0 || Dir4 > 0){
                
                while(CicloRandom == 0){
                
                    Random = (int)(Math.random()*4+1);
                
                    if(Random == 1 && Dir1 == MayorPrioridad){
                        MoverArriba();
                        CicloRandom = 1;
                    }
                    if(Random == 2 && Dir2 == MayorPrioridad){
                        MoverDerecha();
                        CicloRandom = 1;
                    }
                    if(Random == 3 && Dir3 == MayorPrioridad){
                        MoverAbajo();
                        CicloRandom = 1;
                    }
                    if(Random == 4 && Dir4 == MayorPrioridad){
                        MoverIzquierda();
                        CicloRandom = 1;
                    }
                }
            }
            
        }
        
        //Sin Ceros
        if(Dir1 < 1 && Dir2 < 1 && Dir3 < 1 && Dir4 < 1){
            
            while(CicloRandom == 0){
                
                Random = (int)(Math.random()*4+1);
                
                if(Random == 1 && Dir1 == 0){
                    MoverArriba();
                    CicloRandom = 1;
                }
                if(Random == 2 && Dir2 == 0){
                    MoverDerecha();
                    CicloRandom = 1;
                }
                if(Random == 3 && Dir3 == 0){
                    MoverAbajo();
                    CicloRandom = 1;
                }
                if(Random == 4 && Dir4 == 0){
                    MoverIzquierda();
                    CicloRandom = 1;
                }
                
            }
            
        }
        
        //Sin Caminos
        if(Dir1 < 0 && Dir2 < 0 && Dir3 < 0 && Dir4 < 0){
            
            JOptionPane.showMessageDialog(null,"Ha sido Vencido por las Circunstancias");
            System.exit(0);
            
        }
        
        if(BloqueoT == true){
            EncontroTesoro = true;
        }
        
        if(Tiempo == 1){
            LogicaGumpi();
        }
        AnalizadorAgente();
        
        
    }//GEN-LAST:event_BtnAutomaticoActionPerformed

    //Clase Main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    public void AnalizadorAgente(){
        
        //El alrededor inicia en 0
        for(int ciclo = 0; ciclo < 8; ciclo++){
            Alrededor[ciclo] = 0;
        }
        
        //Analizar si esta en una esquina, borde o centro
        if((PosicionX == 0 || PosicionX == 4) && (PosicionY == 0 || PosicionY == 4)){
            
            if(PosicionY == 4 && PosicionX == 0){
                Memoria[3][0] = Mapa[3][0];
                Memoria[3][1] = Mapa[3][1];
                Memoria[4][1] = Mapa[4][1];
                
                Alrededor[3] = Memoria[3][0];
                Alrededor[5] = Memoria[3][1];
                Alrededor[6] = Memoria[4][1];
                
            }else if(PosicionY == 0 && PosicionX == 0){
                Memoria[1][0] = Mapa[1][0];
                Memoria[0][1] = Mapa[0][1];
                Memoria[1][1] = Mapa[1][1];
                
                Alrededor[4] = Memoria[1][0];
                Alrededor[6] = Memoria[0][1];
                Alrededor[7] = Memoria[1][1];
                
            }else if(PosicionY == 0 && PosicionX == 4){
                Memoria[0][3] = Mapa[0][3];
                Memoria[1][3] = Mapa[1][3];
                Memoria[1][4] = Mapa[1][4];
                
                Alrededor[1] = Memoria[0][3];
                Alrededor[2] = Memoria[1][3];
                Alrededor[4] = Memoria[1][4];
                
            }else if(PosicionY == 4 && PosicionX == 4){
                Memoria[4][3] = Mapa[4][3];
                Memoria[3][3] = Mapa[3][3];
                Memoria[3][4] = Mapa[3][4];
                
                Alrededor[0] = Memoria[3][3];
                Alrededor[1] = Memoria[4][3];
                Alrededor[3] = Memoria[3][4];
            }
            
        }else if(PosicionX == 0 || PosicionX == 4){
            
            if(PosicionX == 0){
                Memoria[PosicionY+1][PosicionX] = Mapa[PosicionY+1][PosicionX];
                Memoria[PosicionY-1][PosicionX] = Mapa[PosicionY-1][PosicionX];
                Memoria[PosicionY+1][PosicionX+1] = Mapa[PosicionY+1][PosicionX+1];
                Memoria[PosicionY][PosicionX+1] = Mapa[PosicionY][PosicionX+1];
                Memoria[PosicionY-1][PosicionX+1] = Mapa[PosicionY-1][PosicionX+1];

                Alrededor[3] = Memoria[PosicionY-1][PosicionX];
                Alrededor[4] = Memoria[PosicionY+1][PosicionX];
                Alrededor[5] = Memoria[PosicionY-1][PosicionX+1];
                Alrededor[6] = Memoria[PosicionY][PosicionX+1];
                Alrededor[7] = Memoria[PosicionY+1][PosicionX+1];
                
            }else if(PosicionX == 4){
                Memoria[PosicionY+1][PosicionX] = Mapa[PosicionY+1][PosicionX];
                Memoria[PosicionY-1][PosicionX] = Mapa[PosicionY-1][PosicionX];
                Memoria[PosicionY+1][PosicionX-1] = Mapa[PosicionY+1][PosicionX-1];
                Memoria[PosicionY][PosicionX-1] = Mapa[PosicionY][PosicionX-1];
                Memoria[PosicionY-1][PosicionX-1] = Mapa[PosicionY-1][PosicionX-1];
                
                Alrededor[0] = Memoria[PosicionY-1][PosicionX-1];
                Alrededor[1] = Memoria[PosicionY][PosicionX-1];
                Alrededor[2] = Memoria[PosicionY+1][PosicionX-1];
                Alrededor[3] = Memoria[PosicionY-1][PosicionX];
                Alrededor[4] = Memoria[PosicionY+1][PosicionX];
                
            }
            
        }else if(PosicionY == 0 || PosicionY == 4){
            
            if(PosicionY == 0){
                Memoria[PosicionY][PosicionX-1] = Mapa[PosicionY][PosicionX-1];
                Memoria[PosicionY+1][PosicionX-1] = Mapa[PosicionY+1][PosicionX-1];
                Memoria[PosicionY+1][PosicionX] = Mapa[PosicionY+1][PosicionX];
                Memoria[PosicionY+1][PosicionX+1] = Mapa[PosicionY+1][PosicionX+1];
                Memoria[PosicionY][PosicionX+1] = Mapa[PosicionY][PosicionX+1];
                
                Alrededor[1] = Memoria[PosicionY][PosicionX-1];
                Alrededor[2] = Memoria[PosicionY+1][PosicionX-1];
                Alrededor[4] = Memoria[PosicionY+1][PosicionX];
                Alrededor[6] = Memoria[PosicionY][PosicionX+1];
                Alrededor[7] = Memoria[PosicionY+1][PosicionX+1];
                
            }else if(PosicionY == 4){
                Memoria[PosicionY][PosicionX-1] = Mapa[PosicionY][PosicionX-1];
                Memoria[PosicionY-1][PosicionX-1] = Mapa[PosicionY-1][PosicionX-1];
                Memoria[PosicionY-1][PosicionX] = Mapa[PosicionY-1][PosicionX];
                Memoria[PosicionY-1][PosicionX+1] = Mapa[PosicionY-1][PosicionX+1];
                Memoria[PosicionY][PosicionX+1] = Mapa[PosicionY][PosicionX+1];
                
                Alrededor[0] = Memoria[PosicionY-1][PosicionX-1];
                Alrededor[1] = Memoria[PosicionY][PosicionX-1];
                Alrededor[3] = Memoria[PosicionY-1][PosicionX];
                Alrededor[5] = Memoria[PosicionY-1][PosicionX+1];
                Alrededor[6] = Memoria[PosicionY][PosicionX+1];
                
            }
            
        }else{
            
            Memoria[PosicionY+1][PosicionX-1] = Mapa[PosicionY+1][PosicionX-1];
            Memoria[PosicionY][PosicionX-1] = Mapa[PosicionY][PosicionX-1];
            Memoria[PosicionY-1][PosicionX-1] = Mapa[PosicionY-1][PosicionX-1];
            Memoria[PosicionY+1][PosicionX] = Mapa[PosicionY+1][PosicionX];
            Memoria[PosicionY-1][PosicionX] = Mapa[PosicionY-1][PosicionX];
            Memoria[PosicionY+1][PosicionX+1] = Mapa[PosicionY+1][PosicionX+1];
            Memoria[PosicionY][PosicionX+1] = Mapa[PosicionY][PosicionX+1];
            Memoria[PosicionY-1][PosicionX+1] = Mapa[PosicionY-1][PosicionX+1];
            
            Alrededor[0] = Memoria[PosicionY-1][PosicionX-1];
            Alrededor[1] = Memoria[PosicionY][PosicionX-1];
            Alrededor[2] = Memoria[PosicionY+1][PosicionX-1];
            Alrededor[3] = Memoria[PosicionY-1][PosicionX];
            Alrededor[4] = Memoria[PosicionY+1][PosicionX];
            Alrededor[5] = Memoria[PosicionY-1][PosicionX+1];
            Alrededor[6] = Memoria[PosicionY][PosicionX+1];
            Alrededor[7] = Memoria[PosicionY+1][PosicionX+1];
            
        }
        
        
        //Cambiar posicion
        Memoria[PosicionY][PosicionX] = 5;
        CadenaMemo="";
        CadenaAlrededor="";
        String A = "";
        String B = "";
        String C = "";
        EncontroGumpi = false;
        LabelGumpi.setText("False");
        
        //Actualizar la Memoria
        for (int Y = 0; Y < 5; Y++){
            for (int X = 0; X < 5; X++){
                if(Y==4){
                    CadenaMemo = CadenaMemo + "[ "+Memoria[Y][X]+" ]";
                }else if(X==4){
                    CadenaMemo = CadenaMemo + "[ "+Memoria[Y][X]+" ]\n";
                }else{
                    CadenaMemo = CadenaMemo + "[ "+Memoria[Y][X]+" ]";
                }
            }
        }
        
        //Actualizar el alrededor
        for(int ciclo = 0; ciclo < 8; ciclo++){
            
            if(ciclo==0 || ciclo==3 || ciclo==5){
                A = A + "["+Alrededor[ciclo]+"] ";
            }else if(ciclo==1 || ciclo==6){
                
                if(ciclo == 6){
                    B = B + "[A] ["+Alrededor[ciclo]+"]";
                }else{
                    B = B + "["+Alrededor[ciclo]+"] ";
                }
                
            }else{
                C = C + "["+Alrededor[ciclo]+"] ";
            }
            
            //En caso de que se encuentre el Tesoro
            if(Alrededor[ciclo] == 4){
                EncontroTesoro = true;
                LabelTesoro.setText("True");
                
                switch(ciclo){
                    case 0:
                        XTesoro = PosicionX-1;
                        YTesoro = PosicionY-1;
                    break;
                    case 1:
                        XTesoro = PosicionX-1;
                        YTesoro = PosicionY;
                    break;
                    case 2:
                        XTesoro = PosicionX-1;
                        YTesoro = PosicionY+1;
                    break;
                    case 3:
                        XTesoro = PosicionX;
                        YTesoro = PosicionY-1;
                    break;
                    case 4:
                        XTesoro = PosicionX;
                        YTesoro = PosicionY+1;
                    break;
                    case 5:
                        XTesoro = PosicionX+1;
                        YTesoro = PosicionY-1;
                    break;
                    case 6:
                        XTesoro = PosicionX+1;
                        YTesoro = PosicionY;
                    break;
                    case 7:
                        XTesoro = PosicionX+1;
                        YTesoro = PosicionY+1;
                    break;
                }
                
                LabelXTesoro.setText(XTesoro+"");
                LabelYTesoro.setText(YTesoro+"");
                
            }
            
            //En caso de que se encuentre al Gumpi
            if(Alrededor[ciclo] == 1){
                EncontroGumpi = true;
                LabelGumpi.setText("True");
                
                switch(ciclo){
                    case 0:
                        XGumpi = PosicionX-1;
                        YGumpi = PosicionY-1;
                    break;
                    case 1:
                        XGumpi = PosicionX-1;
                        YGumpi = PosicionY;
                    break;
                    case 2:
                        XGumpi = PosicionX-1;
                        YGumpi = PosicionY+1;
                    break;
                    case 3:
                        XGumpi = PosicionX;
                        YGumpi = PosicionY-1;
                    break;
                    case 4:
                        XGumpi = PosicionX;
                        YGumpi = PosicionY+1;
                    break;
                    case 5:
                        XGumpi = PosicionX+1;
                        YGumpi = PosicionY-1;
                    break;
                    case 6:
                        XGumpi = PosicionX+1;
                        YGumpi = PosicionY;
                    break;
                    case 7:
                        XGumpi = PosicionX+1;
                        YGumpi = PosicionY+1;
                    break;
                }
                
                LabelXGumpi.setText(XGumpi+"");
                LabelYGumpi.setText(YGumpi+"");
                
            }
            
            
        }
        
        
        CadenaAlrededor = " "+A +"\n "+ B +"\n "+ C;
        
        TextAreaMemoria.setText(CadenaMemo);
        TextAreaAlrededor.setText(CadenaAlrededor);
        
    }
    
    public void AnalizadorGumpi(){
        
        //El alrededor inicia en 0
        for(int ciclo = 0; ciclo < 8; ciclo++){
            AlrededorGumpi[ciclo] = 0;
        }
        
        //Analizar si esta en una esquina, borde o centro
        if((XGumpi == 0 || XGumpi == 4) && (YGumpi == 0 || YGumpi == 4)){
            
            if(YGumpi == 4 && XGumpi == 0){
                
                AlrededorGumpi[3] = Mapa[3][0];
                AlrededorGumpi[5] = Mapa[3][1];
                AlrededorGumpi[6] = Mapa[4][1];
                
            }else if(YGumpi == 0 && XGumpi == 0){
                
                AlrededorGumpi[4] = Mapa[1][0];
                AlrededorGumpi[6] = Mapa[0][1];
                AlrededorGumpi[7] = Mapa[1][1];
                
            }else if(YGumpi == 0 && XGumpi == 4){
                
                AlrededorGumpi[1] = Mapa[0][3];
                AlrededorGumpi[2] = Mapa[1][3];
                AlrededorGumpi[4] = Mapa[1][4];
                
            }else if(YGumpi == 4 && XGumpi == 4){
                
                AlrededorGumpi[0] = Mapa[3][3];
                AlrededorGumpi[1] = Mapa[4][3];
                AlrededorGumpi[3] = Mapa[3][4];
            }
            
        }else if(XGumpi == 0 || XGumpi == 4){
            
            if(XGumpi == 0){

                AlrededorGumpi[3] = Mapa[YGumpi-1][XGumpi];
                AlrededorGumpi[4] = Mapa[YGumpi+1][XGumpi];
                AlrededorGumpi[5] = Mapa[YGumpi-1][XGumpi+1];
                AlrededorGumpi[6] = Mapa[YGumpi][XGumpi+1];
                AlrededorGumpi[7] = Mapa[YGumpi+1][XGumpi+1];
                
            }else if(XGumpi == 4){
                
                AlrededorGumpi[0] = Mapa[YGumpi-1][XGumpi-1];
                AlrededorGumpi[1] = Mapa[YGumpi][XGumpi-1];
                AlrededorGumpi[2] = Mapa[YGumpi+1][XGumpi-1];
                AlrededorGumpi[3] = Mapa[YGumpi-1][XGumpi];
                AlrededorGumpi[4] = Mapa[YGumpi+1][XGumpi];
                
            }
            
        }else if(YGumpi == 0 || YGumpi == 4){
            
            if(YGumpi == 0){
                
                AlrededorGumpi[1] = Mapa[YGumpi][XGumpi-1];
                AlrededorGumpi[2] = Mapa[YGumpi+1][XGumpi-1];
                AlrededorGumpi[4] = Mapa[YGumpi+1][XGumpi];
                AlrededorGumpi[6] = Mapa[YGumpi][XGumpi+1];
                AlrededorGumpi[7] = Mapa[YGumpi+1][XGumpi+1];
                
            }else if(YGumpi == 4){
                
                AlrededorGumpi[0] = Mapa[YGumpi-1][XGumpi-1];
                AlrededorGumpi[1] = Mapa[YGumpi][XGumpi-1];
                AlrededorGumpi[3] = Mapa[YGumpi-1][XGumpi];
                AlrededorGumpi[5] = Mapa[YGumpi-1][XGumpi+1];
                AlrededorGumpi[6] = Mapa[YGumpi][XGumpi+1];
                
            }
            
        }else{
            
            AlrededorGumpi[0] = Mapa[YGumpi-1][XGumpi-1];
            AlrededorGumpi[1] = Mapa[YGumpi][XGumpi-1];
            AlrededorGumpi[2] = Mapa[YGumpi+1][XGumpi-1];
            AlrededorGumpi[3] = Mapa[YGumpi-1][XGumpi];
            AlrededorGumpi[4] = Mapa[YGumpi+1][XGumpi];
            AlrededorGumpi[5] = Mapa[YGumpi-1][XGumpi+1];
            AlrededorGumpi[6] = Mapa[YGumpi][XGumpi+1];
            AlrededorGumpi[7] = Mapa[YGumpi+1][XGumpi+1];
            
        }        
            
        //Actualizar el alrededor
        for(int ciclo = 0; ciclo < 8; ciclo++){
                
            //En caso de que se encuentre al Gumpi
            if(AlrededorGumpi[ciclo] == 5){
                
                switch(ciclo){
                    case 0:
                        EjeXGumpi = XGumpi-1;
                        EjeYGumpi = YGumpi-1;
                    break;
                    case 1:
                        EjeXGumpi = XGumpi-1;
                        EjeYGumpi = YGumpi;
                    break;
                    case 2:
                        EjeXGumpi = XGumpi-1;
                        EjeYGumpi = YGumpi+1;
                    break;
                    case 3:
                        EjeXGumpi = XGumpi;
                        EjeYGumpi = YGumpi-1;
                    break;
                    case 4:
                        EjeXGumpi = XGumpi;
                        EjeYGumpi = YGumpi+1;
                    break;
                    case 5:
                        EjeXGumpi = XGumpi+1;
                        EjeYGumpi = YGumpi-1;
                    break;
                    case 6:
                        EjeXGumpi = XGumpi+1;
                        EjeYGumpi = YGumpi;
                    break;
                    case 7:
                        EjeXGumpi = XGumpi+1;
                        EjeYGumpi = YGumpi+1;
                    break;
                }
            }
        }
        
        
    }
    
    public void LogicaGumpi(){
        
        //Arriba , Derecha , Abajo , Izquierda 
        int Dir1 = -1;
        int Dir2 = -1;
        int Dir3 = -1;
        int Dir4 = -1;
        
        int Random = 0;
        int CicloRandom = 0;
        
        AnalizadorGumpi();
        
        //Checar los cuatro puntos cardinales Vacios
        if(AlrededorGumpi[3]==3){
            Dir1 = 0;
        }
        if(AlrededorGumpi[6]==3){
            Dir2 = 0;
        }
        if(AlrededorGumpi[4]==3){
            Dir3 = 0;
        }
        if(AlrededorGumpi[1]==3){
            Dir4 = 0;
        }
        
        //Buscar camino optimo al Agente
        if(EjeXGumpi != 0 || EjeYGumpi != 0){
            
            //No esta alineado en el eje X y Y
            if(EjeXGumpi != 0 && EjeYGumpi != 0){
                
                if(EjeXGumpi > 0){
                    if(Dir2 == 0){
                        Dir2 = 5;
                    }
                }
                if(EjeXGumpi < 0){
                    if(Dir4 == 0){
                        Dir4 = 5;
                    }
                }
                if(EjeYGumpi > 0){
                    if(Dir3 == 0){
                        Dir3 = 5;
                    }
                }
                if(EjeYGumpi < 0){
                    if(Dir1 == 0){
                        Dir1 = 5;
                    }
                }
                
                if(Dir1 == 5 || Dir2 == 5 || Dir3 == 5 || Dir4 == 5){
                
                    while(CicloRandom == 0){

                        Random = (int)(Math.random()*4+1);

                        if(Random == 1 && Dir1 == 5){
                            MoverArribaGumpi();
                            EjeYGumpi = 0;
                            CicloRandom = 1;
                        }
                        if(Random == 2 && Dir2 == 5){
                            MoverDerechaGumpi();
                            EjeXGumpi = 0;
                            CicloRandom = 1;
                        }
                        if(Random == 3 && Dir3 == 5){
                            MoverAbajoGumpi();
                            EjeYGumpi = 0;
                            CicloRandom = 1;
                        }
                        if(Random == 4 && Dir4 == 5){
                            MoverIzquierdaGumpi();
                            EjeXGumpi = 0;
                            CicloRandom = 1;
                        }
                    }
                }
            
            //No esta alineado en el eje X
            }else if(EjeXGumpi != 0){
                
                if(EjeXGumpi > 0){
                    if(Dir2 == 0){
                        MoverDerechaGumpi();
                        EjeXGumpi = 0;
                        Dir2 = 5;
                    }else if(Mapa[YGumpi][XGumpi+1] == 5){
                        MoverDerechaGumpi();
                        JOptionPane.showMessageDialog(null,"Game Over");
                        System.exit(0);
                    }
                }
                if(EjeXGumpi < 0){
                    if(Dir4 == 0){
                        MoverIzquierdaGumpi();
                        EjeXGumpi = 0;
                        Dir4 = 5;
                    }else if(Mapa[YGumpi][XGumpi-1] == 5){
                        MoverIzquierdaGumpi();
                        JOptionPane.showMessageDialog(null,"Game Over");
                        System.exit(0);
                    }
                }
                
            //No esta alineado en el eje Y
            }else if(EjeYGumpi != 0){
                
                if(EjeYGumpi < 0){
                    if(Dir1 == 0){
                        MoverArribaGumpi();
                        EjeYGumpi = 0;
                        Dir1 = 5;
                    }else if(Mapa[YGumpi-1][XGumpi] == 5){
                        MoverArribaGumpi();
                        JOptionPane.showMessageDialog(null,"Game Over");
                        System.exit(0);
                    }
                }
                if(EjeYGumpi > 0){
                    if(Dir3 == 0){
                        MoverAbajoGumpi();
                        EjeYGumpi = 0;
                        Dir3 = 5;
                    }else if(Mapa[YGumpi+1][XGumpi] == 5){
                        MoverAbajoGumpi();
                        JOptionPane.showMessageDialog(null,"Game Over");
                        System.exit(0);
                    }
                }
                
            }
    
            
        }
        
        //Sin Ceros
        if(Dir1 < 1 && Dir2 < 1 && Dir3 < 1 && Dir4 < 1){
            
            while(CicloRandom == 0){
                
                Random = (int)(Math.random()*4+1);
                
                if(Random == 1 && Dir1 == 0){
                    MoverArribaGumpi();
                    CicloRandom = 1;
                }
                if(Random == 2 && Dir2 == 0){
                    MoverDerechaGumpi();
                    CicloRandom = 1;
                }
                if(Random == 3 && Dir3 == 0){
                    MoverAbajoGumpi();
                    CicloRandom = 1;
                }
                if(Random == 4 && Dir4 == 0){
                    MoverIzquierdaGumpi();
                    CicloRandom = 1;
                }
                
            }
            
        }      
        
        EjeXGumpi = 0;
        EjeYGumpi = 0;
        AnalizadorGumpi();
        
    }
    
    public void UbicarObjetos(){
        
        int Contador = 0;
        int X;
        int Y;
                
        while(Contador == 0){
            
            X = (int)(Math.random()*4);
            Y = (int)(Math.random()*4);
                
            if(X==0 && Y==4){
                Contador = 0;
            }else{
                Pozo1 [0] = X;
                Pozo1 [1] = Y;
                Mapa [Y][X] = 2;
                Contador = 1;
            }
        }
        
        while(Contador == 1){
            
            X = (int)(Math.random()*4);
            Y = (int)(Math.random()*4);
                
            if(X==0 && Y==4 || X==Pozo1[0] && Y==Pozo1[1] ){
                Contador = 1;
            }else{
                Pozo2 [0] = X;
                Pozo2 [1] = Y;
                Mapa [Y][X] = 2;
                Contador = 2;
            }
        }
        
        while(Contador == 2){
            
            X = (int)(Math.random()*4);
            Y = (int)(Math.random()*4);
                
            if(X==0 && Y==4 || X==Pozo1[0] && Y==Pozo1[1] || X==Pozo2[0] && Y==Pozo2[1] ){
                Contador = 2;
            }else{
                Tesoro [0] = X;
                Tesoro [1] = Y;
                Mapa [Y][X] = 4;
                Contador = 3;
            }
        }
        
        while(Contador == 3){
            
            X = (int)(Math.random()*4);
            Y = (int)(Math.random()*4);
                
            if(X==0 && Y==4 || X==Pozo1[0] && Y==Pozo1[1] || X==Pozo2[0] && Y==Pozo2[1] || X==Tesoro[0] && Y==Tesoro[1] ){
                Contador = 3;
            }else{
                Gumpi [0] = X;
                Gumpi [1] = Y;
                Mapa [Y][X] = 1;
                XGumpi = Gumpi [0];
                YGumpi = Gumpi [1];
                Contador = 4;
            }
        }
        
    }
    
    public void RellenarCadena(){
        
        Cadena ="";
        
        for (int Y = 0; Y < 5; Y++){
            
            if(Y == 0){
                Cadena = Cadena + "\n";
            }
            
            for (int X = 0; X < 5; X++){
                switch (X) {
                    case 0:
                        if(Mapa[Y][X] == 1){
                            Cadena = Cadena + "  [ G ]";
                        }else if(Mapa[Y][X] == 2){
                            Cadena = Cadena + "  [ P ]";
                        }else if(Mapa[Y][X] == 4){
                            Cadena = Cadena + "  [ T ]";
                        }else if(Mapa[Y][X] == 5){
                            Cadena = Cadena + "  [ A ]";
                        }else{
                            Cadena = Cadena + "  [   ]";
                        }
                    break;
                    case 4:
                        if(Mapa[Y][X] == 1){
                            Cadena = Cadena + "[ G ]\n";
                        }else if(Mapa[Y][X] == 2){
                            Cadena = Cadena + "[ P ]\n";
                        }else if(Mapa[Y][X] == 4){
                            Cadena = Cadena + "[ T ]\n";
                        }else if(Mapa[Y][X] == 5){
                            Cadena = Cadena + "[ A ]\n";
                        }else{
                            Cadena = Cadena + "[   ]\n";
                        }
                    break;
                    default:
                        if(Mapa[Y][X] == 1){
                            Cadena = Cadena + "[ G ]";
                        }else if(Mapa[Y][X] == 2){
                            Cadena = Cadena + "[ P ]";
                        }else if(Mapa[Y][X] == 4){
                            Cadena = Cadena + "[ T ]";
                        }else if(Mapa[Y][X] == 5){
                            Cadena = Cadena + "[ A ]";
                        }else{
                            Cadena = Cadena + "[   ]";
                        }
                    break;
                }
            }
            
            TextAreaMapa.setText(Cadena);
            
        }
    }
    
    public void RellenarCadenaMemo(){
        
        for (int Y = 0; Y < 5; Y++){
            for (int X = 0; X < 5; X++){
                if(Y==4){
                    CadenaMemo = CadenaMemo + "[ "+Memoria[Y][X]+" ]";
                }else if(X==4){
                    CadenaMemo = CadenaMemo + "[ "+Memoria[Y][X]+" ]\n";
                }else{
                    CadenaMemo = CadenaMemo + "[ "+Memoria[Y][X]+" ]";
                }
            }
        }
        
        /*
        for (int Y = 0; Y < 5; Y++){
            for (int X = 0; X < 5; X++){
                if(X==0 && Y==4){
                    CadenaMemo = CadenaMemo + "[ 5 ]";
                }else if(Y==4){
                    CadenaMemo = CadenaMemo + "[ 0 ]";
                }else if(X==4){
                    CadenaMemo = CadenaMemo + "[ 0 ]\n";
                }else{
                    CadenaMemo = CadenaMemo + "[ 0 ]";
                }
            }
        }
        */
        TextAreaMemoria.setText(CadenaMemo); 
    }
    
    //Movimientos
    public void MoverArriba(){
        int Y = PosicionY;
        PosicionY = PosicionY - 1;
            
        Mapa[PosicionY][PosicionX] = 5;
        Mapa[Y][PosicionX] = 3;
            
        Turnos = Turnos + 1;
        if(Tiempo == 1){
            Tiempo = 2;
        }else{
            Tiempo = 1;
        }
            
        LabelTurnos.setText(Turnos+"");
        LabelTiempo.setText(Tiempo+"");
        RellenarCadena();      
    }
    
    public void MoverAbajo(){
        int Y = PosicionY;
        PosicionY = PosicionY + 1;
            
        Mapa[PosicionY][PosicionX] = 5;
        Mapa[Y][PosicionX] = 3;
            
        Turnos = Turnos + 1;
        if(Tiempo == 1){
            Tiempo = 2;
        }else{
            Tiempo = 1;
        }
            
        LabelTurnos.setText(Turnos+"");
        LabelTiempo.setText(Tiempo+"");
        RellenarCadena();
    }
    
    public void MoverDerecha(){
        int X = PosicionX;
        PosicionX = PosicionX + 1;
            
        Mapa[PosicionY][PosicionX] = 5;
        Mapa[PosicionY][X] = 3;
            
        Turnos = Turnos + 1;
        if(Tiempo == 1){
            Tiempo = 2;
        }else{
            Tiempo = 1;
        }
            
        LabelTurnos.setText(Turnos+"");
        LabelTiempo.setText(Tiempo+"");
        RellenarCadena();
    }
    
    public void MoverIzquierda(){
        int X = PosicionX;
        PosicionX = PosicionX - 1;
            
        Mapa[PosicionY][PosicionX] = 5;
        Mapa[PosicionY][X] = 3;
            
        Turnos = Turnos + 1;
        if(Tiempo == 1){
            Tiempo = 2;
        }else{
            Tiempo = 1;
        }
            
        LabelTurnos.setText(Turnos+"");
        LabelTiempo.setText(Tiempo+"");
        RellenarCadena();
    }
    
    public void MoverArribaGumpi(){
        int Y = YGumpi;
        YGumpi = YGumpi - 1;
            
        Mapa[YGumpi][XGumpi] = 1;
        Mapa[Y][XGumpi] = 3;
            
        RellenarCadena();      
    }
    
    public void MoverAbajoGumpi(){
        int Y = YGumpi;
        YGumpi = YGumpi + 1;
            
        Mapa[YGumpi][XGumpi] = 1;
        Mapa[Y][XGumpi] = 3;

        RellenarCadena();
    }
    
    public void MoverDerechaGumpi(){
        int X = XGumpi;
        XGumpi = XGumpi + 1;
            
        Mapa[YGumpi][XGumpi] = 1;
        Mapa[YGumpi][X] = 3;
            
        RellenarCadena();
    }
    
    public void MoverIzquierdaGumpi(){
        int X = XGumpi;
        XGumpi = XGumpi - 1;
            
        Mapa[YGumpi][XGumpi] = 1;
        Mapa[YGumpi][X] = 3;
            
        RellenarCadena();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizar;
    private javax.swing.JButton BtnAutomatico;
    private javax.swing.JButton BtnBajar;
    private javax.swing.JButton BtnDerecha;
    private javax.swing.JButton BtnIzquierda;
    private javax.swing.JButton BtnSubir;
    private javax.swing.JLabel LabelGumpi;
    private javax.swing.JLabel LabelTesoro;
    private javax.swing.JLabel LabelTiempo;
    private javax.swing.JLabel LabelTurnos;
    private javax.swing.JLabel LabelXGumpi;
    private javax.swing.JLabel LabelXTesoro;
    private javax.swing.JLabel LabelYGumpi;
    private javax.swing.JLabel LabelYTesoro;
    private javax.swing.JPanel PanelAlrededor;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelJuego;
    private javax.swing.JPanel PanelMemoria;
    private javax.swing.JTextArea TextAreaAlrededor;
    private javax.swing.JTextArea TextAreaMapa;
    private javax.swing.JTextArea TextAreaMemoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
