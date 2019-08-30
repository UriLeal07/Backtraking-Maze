package Vista;

import Modelo.Laberinto;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FramePrincipal extends javax.swing.JFrame
{
    private JFileChooser abrir;
    private Scanner sc;
    private Laberinto laberinto;
    private int xInit, yInit;
    
    public FramePrincipal()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLaberinto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSolucion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelDimensiones = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPosInicio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelNPasos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mCargarLab = new javax.swing.JMenuItem();
        mResolverLab = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laberinto");
        setResizable(false);

        txtAreaLaberinto.setColumns(20);
        txtAreaLaberinto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtAreaLaberinto.setRows(5);
        jScrollPane1.setViewportView(txtAreaLaberinto);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel1.setText("Laberinto");

        txtAreaSolucion.setEditable(false);
        txtAreaSolucion.setColumns(20);
        txtAreaSolucion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtAreaSolucion.setRows(5);
        jScrollPane2.setViewportView(txtAreaSolucion);

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel2.setText("'1' = Camino libre");

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel3.setText("Recorrido");

        jLabel4.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel4.setText("Dimensiones:");

        jLabelDimensiones.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelDimensiones.setText(" ");

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel5.setText("Posicion inicio:");

        jLabelPosInicio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelPosInicio.setText(" ");

        jLabel6.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel6.setText("'X' = Casilla visitada (Backtracking)");

        jLabel7.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel7.setText("'1' = Recorrido del laberinto");

        jLabel8.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel8.setText("'0' = Camino bloqueado");

        jLabel9.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel9.setText("Numero de pasos:");

        jLabel10.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel10.setText("'P' = Posicion inicial");

        jLabelNPasos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelNPasos.setText(" ");

        jLabel11.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel11.setText("'S' = Salida del laberinto");

        jMenu1.setText("Menú");
        jMenu1.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N

        mCargarLab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mCargarLab.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        mCargarLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Load.png"))); // NOI18N
        mCargarLab.setText("Cargar Laberinto");
        mCargarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCargarLabActionPerformed(evt);
            }
        });
        jMenu1.add(mCargarLab);

        mResolverLab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mResolverLab.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        mResolverLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Solve.png"))); // NOI18N
        mResolverLab.setText("Resolver Laberinto");
        mResolverLab.setEnabled(false);
        mResolverLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mResolverLabActionPerformed(evt);
            }
        });
        jMenu1.add(mResolverLab);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPosInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDimensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNPasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelDimensiones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPosInicio)
                    .addComponent(jLabel9)
                    .addComponent(jLabelNPasos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mCargarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCargarLabActionPerformed
        
        int res;
        File archivo;
        
        // Ajustamos opciones de FileChooser
        abrir = new JFileChooser();
        abrir.setMultiSelectionEnabled(false);
        abrir.setFileFilter(new FileNameExtensionFilter("Archivos de Texto", "txt"));
        abrir.setDialogTitle("Seleccione archivo de laberinto");
        
        // Mostramos cuadro de dialogo
        res = abrir.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION)
        {
            // Obtenemos archivo
            archivo = abrir.getSelectedFile().getAbsoluteFile();
            
            // Limpiamos area de informacion
            txtAreaLaberinto.setText("");
            txtAreaSolucion.setText("");
            jLabelDimensiones.setText("");
            jLabelPosInicio.setText("");
            jLabelNPasos.setText("");
            
            // Inicializamos un Scanner para leer el archivo
            try { sc = new Scanner(archivo);
            }
            catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error", "Archivo Inexistente", JOptionPane.ERROR_MESSAGE); }
            
            String aux = "";
            
            // Leemos el archivo linea por linea
            while(sc.hasNextLine())
                aux += sc.nextLine()+" ";
            
            // Separamos por espacios '\\s'
            StringTokenizer s = new StringTokenizer(aux);
            
            try
            {
                int m = Integer.parseInt(s.nextToken()); // Leemos numero de filas
                int n = Integer.parseInt(s.nextToken()); // Leemos numero de columnas
                
                int i, j;
                char c;
                byte[][] newLaberinto = new byte[m][n];
                String maze = "";
                
                // Leemos la matriz del archivo
                for(i = 0; i < m; i++)
                {
                    aux = s.nextToken();
                    
                    for(j = 0; j < n; j++)
                    {
                        c = aux.charAt(j);
                        
                        // Si no es un espacio en blanco guardamos valor
                        if(c != ' ')
                        {
                            maze += c+" ";
                            newLaberinto[i][j] = Byte.parseByte(""+c);
                        }
                    }
                    maze += '\n';
                }
                
                // Leemos coordenada inicial
                xInit = Integer.parseInt(s.nextToken()); // pos x
                yInit = Integer.parseInt(s.nextToken()); // pos y
                
                // Si la coordenada leida no es una casilla cerrada
                if(newLaberinto[xInit][yInit] != 0)
                {
                    // Actualizamos etiquetas
                    jLabelPosInicio.setText("("+xInit+","+yInit+")");
                    jLabelDimensiones.setText(m+"x"+n);
                    
                    // Actualizamos txtArea del laberinto cargado
                    txtAreaLaberinto.setText(maze);
                    
                    // Creamos una nueva instancia de Laberinto
                    laberinto = new Laberinto(newLaberinto, xInit, yInit, m, n);
                    
                    // Habilitamos boton para resolver laberinto
                    mResolverLab.setEnabled(true);
                }
                
                else
                {
                    mResolverLab.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Posición Inicial Inválida\nSe debe iniciar en una casilla marcada como '1'", "Error de Formato", JOptionPane.ERROR_MESSAGE);
                }
            }
            // Errores de formato de archivo
            catch(NumberFormatException | HeadlessException e)
            {
                mResolverLab.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Error al Leer Archivo de laberinto", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(res == JFileChooser.ERROR_OPTION)
            mResolverLab.setEnabled(false);
        
    }//GEN-LAST:event_mCargarLabActionPerformed

    private void mResolverLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mResolverLabActionPerformed

        // Reseteamos contador de pasos y
        laberinto.resetNPasos();
        laberinto.resetRecorrido();
        
        // Buscamos una solucion y notificamos el resultado
        if(laberinto.buscaSalida(xInit, yInit))
        {
            JOptionPane.showMessageDialog(null, "Laberinto Resuelto", "Operacion Terminada", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Laberinto Sin Solución", "Operacion Terminada", JOptionPane.WARNING_MESSAGE);
        
        // Actualizamos resultados en la interfaz
        txtAreaSolucion.setText(laberinto.getRecorrido()+"\n"+laberinto.printSalida());
        jLabelNPasos.setText(""+laberinto.getnPasos());
    }//GEN-LAST:event_mResolverLabActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDimensiones;
    private javax.swing.JLabel jLabelNPasos;
    private javax.swing.JLabel jLabelPosInicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mCargarLab;
    private javax.swing.JMenuItem mResolverLab;
    private javax.swing.JTextArea txtAreaLaberinto;
    private javax.swing.JTextArea txtAreaSolucion;
    // End of variables declaration//GEN-END:variables
}