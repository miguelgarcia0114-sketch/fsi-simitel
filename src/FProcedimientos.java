
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FProcedimientos extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FProcedimientos.class.getName());

    Conexion2 cnx;
    String todo = "SELECT * FROM medicos";
    ImageIcon foto;
    String archivoFoto;

    public FProcedimientos() {
        initComponents();
        setLocationRelativeTo(this);
        TConsultas.setRowHeight(100);

        cnx = new Conexion2();
        if (cnx.conectar("localhost", "simitel", "root", "") == 1) {
            cnx.entablar(todo, TConsultas);
        } else {
            JOptionPane.showMessageDialog(this, "Sin conexion a la BD");
            System.exit(0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        BProcedimiento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TCedula = new javax.swing.JTextField();
        TMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CBEspecialidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CBSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TNac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox<>();
        LFoto = new javax.swing.JLabel();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultas);

        BProcedimiento.setText("INSERTAR");
        BProcedimiento.addActionListener(this::BProcedimientoActionPerformed);

        jLabel1.setText("CEDULA:");

        jLabel2.setText("NOMBRE DEL MÉDICO:");

        jLabel3.setText("ESPECIALIDAD:");

        CBEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina General", "Medicina Interna", "Pediatría" }));

        jLabel4.setText("Sexo:");

        CBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jLabel5.setText("Fecha de Nacimiento:");

        jLabel6.setText("Estado:");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        LFoto.setBackground(new java.awt.Color(255, 255, 255));
        LFoto.setForeground(new java.awt.Color(255, 255, 255));
        LFoto.setOpaque(true);
        LFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LFotoMousePressed(evt);
            }
        });

        BActualizar.setText("ACTUALIZAR");
        BActualizar.addActionListener(this::BActualizarActionPerformed);

        BBorrar.setText("BORRAR");
        BBorrar.addActionListener(this::BBorrarActionPerformed);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("MÉDICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BProcedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TMedico)
                            .addComponent(TCedula)
                            .addComponent(CBSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TNac)
                            .addComponent(CBEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BProcedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(TMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CBEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
        int fila = TConsultas.rowAtPoint(evt.getPoint());
        if (fila < 0 || TConsultas.getColumnCount() < 7) {
            return;
        }
        // Columnas de medicos: 0 cedula, 1 nombrem, 2 especialidad, 3 sexom, 4 fecha_nacm, 5 estadom, 6 fotom
        TCedula.setText(String.valueOf(TConsultas.getModel().getValueAt(fila, 0)));
        TMedico.setText(String.valueOf(TConsultas.getModel().getValueAt(fila, 1)));
        CBEspecialidad.setSelectedItem(String.valueOf(TConsultas.getModel().getValueAt(fila, 2)));
        CBSexo.setSelectedItem(String.valueOf(TConsultas.getModel().getValueAt(fila, 3)));
        TNac.setText(String.valueOf(TConsultas.getModel().getValueAt(fila, 4)));
        CBEstado.setSelectedItem(String.valueOf(TConsultas.getModel().getValueAt(fila, 5)));

        archivoFoto = null; // si no se elige otra foto, el UPDATE conserva la anterior
        Object celda = TConsultas.getModel().getValueAt(fila, 6);
        if (celda instanceof ImageIcon icono && icono.getIconWidth() > 0) {
            LFoto.setIcon(new ImageIcon(Conexion2.escalarImagen(icono.getImage(), LFoto.getWidth(), LFoto.getHeight())));
        } else {
            LFoto.setIcon(null);
        }
    }//GEN-LAST:event_TConsultasMousePressed

    private void BProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProcedimientoActionPerformed
        if (TCedula.getText().trim().isEmpty() || TMedico.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Capture la cédula y el nombre del médico");
            return;
        }
        try {

            Object[] res = cnx.ejecutarCRUD(
                    "gestionar_medico",
                    new Object[]{
                        "INSERT",
                        TCedula.getText().trim(),
                        TMedico.getText().trim(),
                        CBEspecialidad.getSelectedItem().toString(),
                        CBSexo.getSelectedItem().toString(),
                        LocalDate.parse(TNac.getText().trim()),
                        CBEstado.getSelectedItem().toString(),
                        archivoFoto == null ? null : Files.readAllBytes(Path.of(archivoFoto))
                    }
            );
            JOptionPane.showMessageDialog(this, "Estado:" + res[0] + "\n Mensaje: " + res[1]);
            if (Integer.parseInt(res[0].toString()) == 1) {
                cnx.entablar(todo, TConsultas);
                limpiar();
            }
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Fecha no válida. Use el formato AAAA-MM-DD (ejemplo: 1985-04-23)");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
        }
    }//GEN-LAST:event_BProcedimientoActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        if (TCedula.getText().trim().isEmpty() || TMedico.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un médico de la tabla");
            return;
        }
        try {

            Object[] res = cnx.ejecutarCRUD(
                    "gestionar_medico",
                    new Object[]{
                        "UPDATE",
                        TCedula.getText().trim(),
                        TMedico.getText().trim(),
                        CBEspecialidad.getSelectedItem().toString(),
                        CBSexo.getSelectedItem().toString(),
                        LocalDate.parse(TNac.getText().trim()),
                        CBEstado.getSelectedItem().toString(),
                        archivoFoto == null ? null : Files.readAllBytes(Path.of(archivoFoto))
                    }
            );
            JOptionPane.showMessageDialog(this, "Estado:" + res[0] + "\n Mensaje: " + res[1]);
            if (Integer.parseInt(res[0].toString()) == 1) {
                cnx.entablar(todo, TConsultas);
                limpiar();
            }
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Fecha no válida. Use el formato AAAA-MM-DD (ejemplo: 1985-04-23)");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
        }
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        if (TCedula.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un médico de la tabla");
            return;
        }
        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Eliminar al médico con cédula " + TCedula.getText().trim() + "?",
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion != JOptionPane.YES_OPTION) {
            return;
        }

        Object[] res = cnx.ejecutarCRUD(
                "gestionar_medico",
                new Object[]{
                    "DELETE",
                    TCedula.getText().trim(),
                    null, null, null, null, null, null
                }
        );
        JOptionPane.showMessageDialog(this, "Estado:" + res[0] + "\n Mensaje: " + res[1]);
        if (Integer.parseInt(res[0].toString()) == 1) {
            cnx.entablar(todo, TConsultas);
            limpiar();
        }
    }//GEN-LAST:event_BBorrarActionPerformed

    private void limpiar() {
        TCedula.setText("");
        TMedico.setText("");
        TNac.setText("");
        CBEspecialidad.setSelectedIndex(0);
        CBSexo.setSelectedIndex(0);
        CBEstado.setSelectedIndex(0);
        LFoto.setIcon(null);
        archivoFoto = null;
    }

    private void LFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFotoMousePressed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir") + "/imagenes/");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            archivoFoto = fc.getSelectedFile().getPath();
            foto = new ImageIcon(archivoFoto);
            LFoto.setIcon(new ImageIcon(Conexion2.escalarImagen(foto.getImage(), LFoto.getWidth(), LFoto.getHeight())));
        }
    }//GEN-LAST:event_LFotoMousePressed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FProcedimientos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BProcedimiento;
    private javax.swing.JComboBox<String> CBEspecialidad;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBSexo;
    private javax.swing.JLabel LFoto;
    private javax.swing.JTextField TCedula;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TMedico;
    private javax.swing.JTextField TNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
