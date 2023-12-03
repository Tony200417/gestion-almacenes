package gestion.almacenes.forms.insumos;

import gestion.almacenes.dao.entities.Insumo;
import gestion.almacenes.controller.InsumoControllerImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import gestion.almacenes.controller.IInsumoController;
import gestion.almacenes.controller.IProveedorController;
import gestion.almacenes.controller.ProveedorControllerImpl;
import gestion.almacenes.dao.entities.Proveedor;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Bacilio
 */
public class GestionInsumos extends javax.swing.JInternalFrame {

    private final IInsumoController iInsumoService;
    private final IProveedorController iProveedorController;
    private List<Insumo> listaInsumo;

    /**
     * Creates new form GestionUsuario
     */
    public GestionInsumos() {
        initComponents();
        this.iInsumoService = new InsumoControllerImpl();
        this.iProveedorController = new ProveedorControllerImpl();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        cargarComboProveedores();
        cargarComboTipoInsumo();
        cargarComboUnidadMedida();
        cargarListaInsumo();
        cargarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidInsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        txtStockInicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        comboTipoInsumo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboUnidadMedida = new javax.swing.JComboBox<>();
        panelActions = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInsumos = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Insumos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setName("formGestionUsuario"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 550));

        panelDatos.setBackground(java.awt.SystemColor.inactiveCaption);
        panelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("ID Insumo");

        txtidInsumo.setEditable(false);
        txtidInsumo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtidInsumo.setForeground(new java.awt.Color(0, 0, 204));
        txtidInsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setName("gestionInsumos"); // NOI18N

        txtNombre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Serie:");

        txtSerie.setEditable(false);
        txtSerie.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSerie.setForeground(new java.awt.Color(0, 0, 204));
        txtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtStockInicial.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtStockInicial.setForeground(new java.awt.Color(0, 0, 204));
        txtStockInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Stock Inicial");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Proveedor:");

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 204));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Precio:");
        jLabel8.setName("gestionInsumos"); // NOI18N

        comboProveedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        comboProveedor.setForeground(new java.awt.Color(0, 0, 204));

        comboTipoInsumo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        comboTipoInsumo.setForeground(new java.awt.Color(0, 0, 204));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("U/M");
        jLabel9.setName("gestionInsumos"); // NOI18N

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboProveedor, 0, 191, Short.MAX_VALUE)
                            .addComponent(comboTipoInsumo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel8))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombre)
                            .addComponent(txtSerie)))
                    .addComponent(txtidInsumo)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(txtStockInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelActions.setBackground(java.awt.SystemColor.inactiveCaption);
        panelActions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 102));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setName("btnRegistrar"); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 204, 102));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizar.setBorderPainted(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setName("btnRegistrar"); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setName("btnRegistrar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.setName("btnRegistrar"); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 255));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setName("btnRegistrar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActionsLayout = new javax.swing.GroupLayout(panelActions);
        panelActions.setLayout(panelActionsLayout);
        panelActionsLayout.setHorizontalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelActionsLayout.setVerticalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLista.setBackground(java.awt.SystemColor.inactiveCaption);
        panelLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbInsumos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbInsumos.setUpdateSelectionOnSort(false);
        tbInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInsumosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInsumos);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String rucProveedor = comboProveedor.getItemAt(comboProveedor.getSelectedIndex()).getRuc();
        String tipoInsumo = comboTipoInsumo.getItemAt(comboTipoInsumo.getSelectedIndex());
        String unidadMedida = comboUnidadMedida.getItemAt(comboUnidadMedida.getSelectedIndex());
        Insumo insumo = new Insumo();
        insumo.setIdProveedor(rucProveedor);
        insumo.setTipo(tipoInsumo);
        insumo.setUnidad(unidadMedida);

        llenarInsumo(insumo);
        String message = iInsumoService.insumoCreate(insumo);
        JOptionPane.showMessageDialog(null, message, "Registar Insumo", HEIGHT);
        limpiarInsumo();
        cargarListaInsumo();
        cargarValores();
        cargarComboUnidadMedida();
        cargarComboProveedores();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Insumo insumo = new Insumo();
        String rucProveedor = comboProveedor.getItemAt(comboProveedor.getSelectedIndex()).getRuc();
        String tipoInsumo = comboTipoInsumo.getItemAt(comboTipoInsumo.getSelectedIndex());
        String unidadMedida = comboUnidadMedida.getItemAt(comboUnidadMedida.getSelectedIndex());
        insumo.setIdProveedor(rucProveedor);
        insumo.setTipo(tipoInsumo);
        insumo.setUnidad(unidadMedida);
        llenarInsumo(insumo);
        String message = iInsumoService.insumoUpdate(insumo);
        JOptionPane.showMessageDialog(null, message, "Actualizar Insumo", HEIGHT);
        limpiarInsumo();
        cargarListaInsumo();
        cargarValores();
        cargarComboUnidadMedida();
        cargarComboProveedores();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String message = iInsumoService.insumoDelete(txtidInsumo.getText());
        JOptionPane.showMessageDialog(null, message, "Elimnar Insumo", HEIGHT);
        limpiarInsumo();
        cargarListaInsumo();
        cargarValores();
        cargarComboUnidadMedida();
        cargarComboProveedores();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String idinsumo = JOptionPane.showInputDialog(null, "Ingrese el Codigo de Insumo");
        Insumo insumo = iInsumoService.insumoGet(idinsumo);

        if (insumo == null) {
            JOptionPane.showMessageDialog(null, "Insumo no encontrado", "Insumo Usuario", HEIGHT);

        } else {
            llenarTextFieldsInsumos(insumo);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInsumosMouseClicked
        // TODO add your handling code here:
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnRegistrar.setEnabled(false);
        int index = tbInsumos.getSelectedRow();
        TableModel tableModel = tbInsumos.getModel();
        String id = tableModel.getValueAt(index, 0).toString();
        String proveedor = tableModel.getValueAt(index, 1).toString();
        String nombre = tableModel.getValueAt(index, 2).toString();
        String precio = tableModel.getValueAt(index, 3).toString();
        String serie = tableModel.getValueAt(index, 4).toString();
        String tipo = tableModel.getValueAt(index, 5).toString();
        String stock = tableModel.getValueAt(index, 6).toString();
        String unidad = tableModel.getValueAt(index, 7).toString();

        txtidInsumo.setText(id);
        txtNombre.setText(nombre);
        txtPrecio.setText(precio);
        txtSerie.setText(serie);
        txtStockInicial.setText(stock);
        comboUnidadMedida.setSelectedItem(unidad);
        comboTipoInsumo.setSelectedItem(tipo);
        comboProveedor.setSelectedItem(proveedor);
    }//GEN-LAST:event_tbInsumosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarInsumo();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        cargarComboProveedores();
        cargarComboTipoInsumo();
        cargarComboUnidadMedida();
        cargarValores();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarInsumo() {
        txtidInsumo.enable(true);
        txtidInsumo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtSerie.setText("");
        txtSerie.enable(true);
        txtStockInicial.setText("");
    }

    private void cargarListaInsumo() {
        listaInsumo = this.iInsumoService.insumoRead();
        DefaultTableModel tableInsumo = new DefaultTableModel();
        tableInsumo.addColumn("ID");
        tableInsumo.addColumn("PROVEEDOR");
        tableInsumo.addColumn("NOMBRE");
        tableInsumo.addColumn("PRECIO");
        tableInsumo.addColumn("SERIE");
        tableInsumo.addColumn("TIPO");
        tableInsumo.addColumn("STOCK");
        tableInsumo.addColumn("UUMM");

        for (int i = 0; i < listaInsumo.size(); i++) {
            tableInsumo.addRow(new Object[]{
                listaInsumo.get(i).getId(),
                listaInsumo.get(i).getIdProveedor(),
                listaInsumo.get(i).getNombre(),
                listaInsumo.get(i).getPrecio(),
                listaInsumo.get(i).getSerie(),
                listaInsumo.get(i).getTipo(),
                listaInsumo.get(i).getStockInicial(),
                listaInsumo.get(i).getUnidad(),});
        }

        tbInsumos.setModel(tableInsumo);
    }

    private void cargarComboProveedores() {
        comboProveedor.removeAllItems();
        List<Proveedor> listaProveedores = iProveedorController.proveedorRead();
        for (int i = 0; i < listaProveedores.size(); i++) {
            comboProveedor.addItem(listaProveedores.get(i));
        }
    }

    private void cargarComboTipoInsumo() {
        comboTipoInsumo.removeAllItems();
        List<String> listaTipoInsumo = new ArrayList<>();
        listaTipoInsumo.add("Perecible");
        listaTipoInsumo.add("No Perecible");
        for (int i = 0; i < listaTipoInsumo.size(); i++) {
            comboTipoInsumo.addItem(listaTipoInsumo.get(i));
        }
    }

    private void cargarComboUnidadMedida() {
        comboUnidadMedida.removeAllItems();
        List<String> listaUnidadMedida = new ArrayList<>();
        listaUnidadMedida.add("KG");
        listaUnidadMedida.add("Lts");
        listaUnidadMedida.add("Unid");
        for (int i = 0; i < listaUnidadMedida.size(); i++) {
            comboUnidadMedida.addItem(listaUnidadMedida.get(i));
        }
    }

    private void llenarInsumo(Insumo insumo) {
        insumo.setId(txtidInsumo.getText());
        insumo.setNombre(txtNombre.getText());
        insumo.setPrecio(Double.parseDouble(txtPrecio.getText()));
        insumo.setSerie(txtSerie.getText());
        insumo.setStockInicial(Integer.parseInt(txtStockInicial.getText()));
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(true);
    }

    private void cargarValores() {
        txtidInsumo.setText(UUID.randomUUID().toString());
        txtSerie.setText("I-00" + 1);
    }

    private void llenarTextFieldsInsumos(Insumo insumo) {
        txtidInsumo.setText(insumo.getId());
        txtNombre.setText(insumo.getNombre());
        txtPrecio.setText(String.valueOf(insumo.getPrecio()));
        txtSerie.setText(insumo.getSerie());
        txtStockInicial.setText(String.valueOf(insumo.getStockInicial()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<Proveedor> comboProveedor;
    private javax.swing.JComboBox<String> comboTipoInsumo;
    private javax.swing.JComboBox<String> comboUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTable tbInsumos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStockInicial;
    private javax.swing.JTextField txtidInsumo;
    // End of variables declaration//GEN-END:variables
}
