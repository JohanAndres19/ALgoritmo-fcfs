package Items;

import Objetos.Proceso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Riiuzaky
 */
public class Vista extends javax.swing.JFrame {

    private Ventana_procesos ventana2;
    private DefaultTableModel dfm, dfm1;
    private ArrayList<Proceso> listaProcesosListos = new ArrayList<Proceso>();
    private ArrayList<Proceso> listaProcesosBloqueados = new ArrayList<Proceso>();
    private boolean bloqueado = false;

    public Vista() {
        initComponents();
        this.getContentPane().setBackground(Color.cyan);
        jPanel1.setBackground(Color.cyan);
        jPanel2.setBackground(Color.cyan);
        ventana2 = new Ventana_procesos(this);
        dfm = (DefaultTableModel) this.jTable2.getModel();
        dfm1 = (DefaultTableModel) this.jTable1.getModel();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BtnAgregarProceso = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBloquear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 102));

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre proceso", "T.llegada", "Rafaga", "T.comienzo", "T.final", "T.retorno", "T.espera"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(0, 204, 204));
        jTable2.setRowHeight(30);
        jScrollPane1.setViewportView(jTable2);

        BtnAgregarProceso.setText("Agregar Proceso");
        BtnAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarProcesoActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre proceso", "T.llegada", "Rafaga", "T.comienzo", "T.final", "T.retorno", "T.espera"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.setRowHeight(30);
        jScrollPane2.setViewportView(jTable1);

        btnBloquear.setText("Bloquear");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAgregarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(700, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnAgregarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla Cola  Listos");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tabla Cola  Espera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarProcesoActionPerformed
        this.ventana2.setVisible(true);

    }//GEN-LAST:event_BtnAgregarProcesoActionPerformed
    public void AgregarTablaespera() {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2800);
                    Object[] lista = new Object[7];
                    if (ventana2.getListaProcesos().size() > 0) {
                        Proceso ultimoproceso = ventana2.getListaProcesos().get(ventana2.getListaProcesos().size() - 1);
                        lista[0] = ultimoproceso.getNombre();
                        lista[1] = ultimoproceso.getT_llegada();
                        lista[2] = ultimoproceso.getRafaga();
                        lista[3] = 0;
                        lista[4] = 0;
                        lista[5] = 0;
                        lista[6] = 0;
                        dfm1.addRow(lista);
                        if (ventana2.getContador() == 4) {
                            while (!ventana2.getListaProcesos().isEmpty()) {
                                Thread.sleep(200);
                                Proceso aux = ventana2.getListaProcesos().get(0);
                                ventana2.getListaProcesos().remove(0);
                                dfm1.removeRow(0);
                                Bandera(aux);
                            }
                            ventana2.setContador(0);
                        }
                        if (ventana2.getListaProcesos().isEmpty() && !listaProcesosBloqueados.isEmpty()) {
                            Thread.sleep(200);
                            Proceso aux = listaProcesosBloqueados.get(0);
                            listaProcesosBloqueados.remove(0);
                            Bandera(aux);
                        }
                    }

                } catch (Exception e) {

                }
            }
        });
        hilo.start();
    }

    public void Bandera(Proceso p) {
        if (this.bloqueado) {
            this.listaProcesosBloqueados.add(p);
            this.bloqueado = false;
        } else {
            p.setT_comienzo(ventana2.getTiempocomienzo());
            p.setT_final(p.getRafaga() + p.getT_comienzo());
            p.setT_retorno(p.getT_final() - p.getT_llegada());
            p.setT_espera(p.getT_retorno() - p.getRafaga());
            ventana2.setTiempocomienzo(p.getT_final());
            this.listaProcesosListos.add(p);
            this.Agregrar();
            this.Pintar_Grafica();
        }
    }

    public void Agregrar() {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Object[] lista = new Object[7];
                    if (listaProcesosListos.size() > 0) {
                        Proceso ultimoproceso = listaProcesosListos.get(listaProcesosListos.size() - 1);
                        lista[0] = ultimoproceso.getNombre();
                        lista[1] = ultimoproceso.getT_llegada();
                        lista[2] = ultimoproceso.getRafaga();
                        lista[3] = ultimoproceso.getT_comienzo();
                        lista[4] = ultimoproceso.getT_final();
                        lista[5] = ultimoproceso.getT_retorno();
                        lista[6] = ultimoproceso.getT_espera();
                        dfm.addRow(lista);
                    }
                } catch (Exception e) {

                }
            }
        });
        hilo.start();
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Pintar_Grafica() {
        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3020);
                    graficas();
                } catch (Exception e) {
                    System.out.println("se jodio esta joda");
                }
            }

        });
        hilo2.start();
    }
    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown


            }//GEN-LAST:event_jPanel1ComponentShown

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        this.bloqueado = true;
    }//GEN-LAST:event_btnBloquearActionPerformed

    public void graficas() {
        System.out.println("este es el metodo que pinta las graficas");
        pack();
        repaint();

        ArrayList<String> NombresProcesos = new ArrayList<String>();
        ArrayList<Integer> Inicioprocesos = new ArrayList<Integer>();
        ArrayList<Integer> FinProcesos = new ArrayList<Integer>();

        for (int i = 0; i < jTable2.getRowCount(); i++) {
            NombresProcesos.add(jTable2.getValueAt(i, 0).toString());
            Inicioprocesos.add(Integer.parseInt(jTable2.getValueAt(i, 1).toString()));
            FinProcesos.add(Integer.parseInt(jTable2.getValueAt(i, 4).toString()));
        }

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for (int i = 0; i < jTable2.getRowCount(); i++) {
            datos.setValue(FinProcesos.get(i), NombresProcesos.get(i), Inicioprocesos.get(i).toString());
        }

        JFreeChart graficoGantt = ChartFactory.createBarChart(
                "Grafico de Gantt",
                "Procesos",
                "Tiempo Final",
                datos,
                PlotOrientation.HORIZONTAL,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(graficoGantt);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel, BorderLayout.NORTH);

        jPanel2.removeAll();
        jPanel2.revalidate(); // This removes the old chart 

        graficoGantt.removeLegend();
        ChartPanel chartPanel = new ChartPanel(graficoGantt);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(chartPanel);
        jPanel2.repaint();
        pack();
        repaint();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarProceso;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
