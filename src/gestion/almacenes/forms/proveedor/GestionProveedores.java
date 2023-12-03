package gestion.almacenes.forms.proveedor;

import gestion.almacenes.forms.usuarios.*;
import gestion.almacenes.dao.entities.Usuario;
import gestion.almacenes.service.IUsuarioService;
import gestion.almacenes.service.impl.UsuarioService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Bacilio
 */
public class GestionProveedores extends javax.swing.JInternalFrame {

    private final IUsuarioService iUsuarioService;
    private List<Usuario> listaUsuarios;

    /**
     * Creates new form GestionUsuario
     */
    public GestionProveedores() {
        initComponents();
        this.iUsuarioService = new UsuarioService();

        cargarListaUsuario();
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        panelActions = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Usuarios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setName("formGestionUsuario"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 550));

        panelDatos.setBackground(java.awt.SystemColor.inactiveCaption);
        panelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Appellidos:");

        txtApellido.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 204));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Dni:");

        txtDni.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 204));
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCelular.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 0, 204));
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña:");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 204));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosLayout.createSequentialGroup()
                                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtDni)
                                    .addComponent(txtPassword))))
                        .addGap(22, 22, 22))))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelActionsLayout = new javax.swing.GroupLayout(panelActions);
        panelActions.setLayout(panelActionsLayout);
        panelActionsLayout.setHorizontalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelActionsLayout.setVerticalGroup(
            panelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLista.setBackground(java.awt.SystemColor.inactiveCaption);
        panelLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tbUsuarios.setUpdateSelectionOnSort(false);
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
        Usuario usuario = new Usuario();
        usuario.setNombre(txtNombre.getText());
        usuario.setApellidos(txtApellido.getText());
        usuario.setCelular(txtCelular.getText());
        usuario.setDni(txtDni.getText());
        usuario.setUsuario(txtUsuario.getText());
        usuario.setPassword(txtPassword.getText());
        String message = iUsuarioService.usuarioCreate(usuario);
        JOptionPane.showMessageDialog(null, message, "Registar Usuario", HEIGHT);
        limpiarUsuario();
        cargarListaUsuario();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setNombre(txtNombre.getText());
        usuario.setApellidos(txtApellido.getText());
        usuario.setCelular(txtCelular.getText());
        usuario.setDni(txtDni.getText());
        usuario.setUsuario(txtUsuario.getText());
        usuario.setPassword(txtPassword.getText());
        System.out.println("Usuarui " + usuario.toString());
        String message = iUsuarioService.usuarioUpdate(usuario);
        JOptionPane.showMessageDialog(null, message, "Actualizar Usuario", HEIGHT);
        limpiarUsuario();
        cargarListaUsuario();


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        String message = iUsuarioService.usuarioDelete(txtDni.getText());
        JOptionPane.showMessageDialog(null, message, "Elimnar Usuario", HEIGHT);
        limpiarUsuario();
        cargarListaUsuario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String dni = JOptionPane.showInputDialog(null, "Ingrese el DNI");
        System.out.println("DNI " + dni);
        Usuario usuario = iUsuarioService.usuarioGet(dni);
         System.out.println("usuario " + usuario);
        if (usuario== null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Buscar Usuario", HEIGHT);

        } else {
            txtDni.setText(usuario.getDni());
            txtDni.enable(false);
            txtNombre.setText(usuario.getNombre());
            txtApellido.setText(usuario.getApellidos());
            txtUsuario.setText(usuario.getUsuario());
            txtUsuario.enable(false);
            txtPassword.setText(usuario.getPassword());
            txtCelular.setText(usuario.getCelular());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        // TODO add your handling code here:
        int index = tbUsuarios.getSelectedRow();
        TableModel tableModel = tbUsuarios.getModel();

        String dni = tableModel.getValueAt(index, 0).toString();
        String nombre = tableModel.getValueAt(index, 1).toString();
        String apellido = tableModel.getValueAt(index, 2).toString();
        String usuario = tableModel.getValueAt(index, 3).toString();
        String password = tableModel.getValueAt(index, 4).toString();
        String celular = tableModel.getValueAt(index, 5).toString();

        txtDni.setText(dni);
        txtDni.enable(false);
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtUsuario.setText(usuario);
        txtUsuario.enable(false);
        txtPassword.setText(password);
        txtCelular.setText(celular);
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void limpiarUsuario() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtDni.enable(true);
        txtUsuario.setText("");
        txtUsuario.enable(true);
        txtPassword.setText("");
        txtCelular.setText("");
    }

    private void cargarListaUsuario() {
        listaUsuarios = this.iUsuarioService.usuarioRead();
        DefaultTableModel tableUsuario = new DefaultTableModel();
        tableUsuario.addColumn("DNI");
        tableUsuario.addColumn("NOMBRE");
        tableUsuario.addColumn("APELLIDO");
        tableUsuario.addColumn("USUARIO");
        tableUsuario.addColumn("PASSWORD");
        tableUsuario.addColumn("CELULAR");

        for (int i = 0; i < listaUsuarios.size(); i++) {
            tableUsuario.addRow(new Object[]{
                listaUsuarios.get(i).getDni(),
                listaUsuarios.get(i).getNombre(),
                listaUsuarios.get(i).getApellidos(),
                listaUsuarios.get(i).getUsuario(),
                listaUsuarios.get(i).getPassword(),
                listaUsuarios.get(i).getCelular()
            });
        }

        tbUsuarios.setModel(tableUsuario);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelActions;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
