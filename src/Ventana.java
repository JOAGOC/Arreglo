
import static javax.swing.JOptionPane.showMessageDialog;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Ventana extends javax.swing.JFrame {

    private static final String anc = "El arreglo no ha sido creado";
    private static final String piun = "Por favor Inserta un número";

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        m = (javax.swing.table.DefaultTableModel) jTDato.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tFTamanio = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tFDato = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnInicializar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDato = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSacar = new javax.swing.JButton();
        btnOrdenarBurbuja = new javax.swing.JButton();
        lblOrdenar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tamaño");

        tFTamanio.setPreferredSize(new java.awt.Dimension(60, 20));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel2.setText("Dato");

        tFDato.setPreferredSize(new java.awt.Dimension(60, 20));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnInicializar.setText("Inicializar");
        btnInicializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicializarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(80, 80));

        jTDato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dato"
            }
        ));
        jScrollPane1.setViewportView(jTDato);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnOrdenarBurbuja.setText("Ordenar");
        btnOrdenarBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarBurbujaActionPerformed(evt);
            }
        });

        lblOrdenar.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(tFTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCrear)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(tFDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnInsertar)
                .addGap(5, 5, 5)
                .addComponent(btnInicializar)
                .addGap(5, 5, 5)
                .addComponent(btnMostrar)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnSacar)
                .addGap(5, 5, 5)
                .addComponent(btnOrdenarBurbuja)
                .addGap(5, 5, 5)
                .addComponent(lblOrdenar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tFTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCrear))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tFDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnInsertar))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnInicializar))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnMostrar))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnSacar))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnOrdenarBurbuja))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblOrdenar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarBurbujaActionPerformed
        try {
            jPanel1.removeAll();
            XYSeries serie = new XYSeries("Coste");
            lblOrdenar.setText(a.ordenar()+"");
            for (int i = 0; i < a.getTope() - 1; i++) {
                 serie.add(i, 6*i*i-9*i+7);
            }
            XYSeriesCollection collection = new XYSeriesCollection();
            collection.addSeries(serie);
            JFreeChart oChart = ChartFactory.createXYLineChart("Coste","Col","Ren",collection);
            ChartPanel pan = new ChartPanel(oChart);
            jPanel1.add(pan);
            btnMostrarActionPerformed(null);
        } catch (NullPointerException e) {
            showMessageDialog(this, "El objeto no ha sido creado");
        }
    }//GEN-LAST:event_btnOrdenarBurbujaActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSacarActionPerformed
        try {
            a.sacar();
            m.removeRow(m.getRowCount() - 1);
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnSacarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInsertarActionPerformed
        try {
            a.insertar(Integer.parseInt(tFDato.getText()));
            tFDato.setText("");
            tFDato.requestFocus();
            Object[] x = {a.getA()[a.getTope() - 1]};
            m.addRow(x);

        } catch (NullPointerException e) {
            showMessageDialog(this, anc);
        } catch (NumberFormatException e) {
            showMessageDialog(this, piun + " entero");
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnInsertarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCrearActionPerformed
        try {
            a = new ArrayEntero(Integer.parseInt(tFTamanio.getText()));
            tFTamanio.setText("");
            btnMostrarActionPerformed(null);
        } catch (NegativeArraySizeException e) {
            showMessageDialog(this, piun + " entero válido (positivo)");
        } catch (NumberFormatException e) {
            showMessageDialog(this, piun + " entero");
        }
    }// GEN-LAST:event_btnCrearActionPerformed

    private void btnInicializarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInicializarActionPerformed
        try {
            a.inicializar();
            btnMostrarActionPerformed(null);
        } catch (Exception e) {
            showMessageDialog(this, anc);
        }
    }// GEN-LAST:event_btnInicializarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMostrarActionPerformed
        try {
            m.setRowCount(0);
            for (int c = 0; c < a.getTope(); c++) {
                Object vector[] = new Object[1];
                vector[0] = a.getA()[c];
                m.addRow(vector);
            }
        } catch (NullPointerException e) {
            showMessageDialog(this, anc);
        }
    }// GEN-LAST:event_btnMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    private javax.swing.table.DefaultTableModel m;
    private ArrayEntero a;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnInicializar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenarBurbuja;
    private javax.swing.JButton btnSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDato;
    private javax.swing.JLabel lblOrdenar;
    private javax.swing.JTextField tFDato;
    private javax.swing.JTextField tFTamanio;
    // End of variables declaration//GEN-END:variables
}
