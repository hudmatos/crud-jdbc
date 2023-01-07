package VIEW;

import DAO.Functions;
import DTO.Livro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
        dataList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btn_deletar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Livraria");

        tabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Autor", "Copias","Lançamento"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        btn_deletar.setBackground(new java.awt.Color(242, 38, 19));
        btn_deletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_deletar.setForeground(new java.awt.Color(240, 240, 240));
        btn_deletar.setText("Deletar");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(248, 148, 6));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(240, 240, 240));
        btn_modificar.setText("Editar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_inserir.setBackground(new java.awt.Color(45, 85, 255));
        btn_inserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inserir.setForeground(new java.awt.Color(240, 240, 240));
        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        if(tabela.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione a linha na tabela que deseja excluir");
            return; }
        
        int linha = tabela.getSelectedRow();
        int id = (int) tabela.getModel().getValueAt(linha,0);
        
        try {
            Livro livro = new Livro();
            livro.setId(id);
            
            Functions function = new Functions();
            function.remove(livro);
            dataList();
            JOptionPane.showMessageDialog(null,"Registro excluido com sucesso"); }
        
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar!"); }
    }//GEN-LAST:event_btn_deletarActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        InsertScreen insert = new InsertScreen();
        insert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int linha = tabela.getSelectedRow();
        if(linha < 0) {
            JOptionPane.showMessageDialog(null,"Selecione a linha que deseja modificar");
            return;  }

        int id = Integer.parseInt(tabela.getModel().getValueAt(linha, 0).toString());
        String titulo = tabela.getModel().getValueAt(linha, 1).toString();
        String autor = tabela.getModel().getValueAt(linha, 2).toString();
        String copias = tabela.getModel().getValueAt(linha, 3).toString();
        String data = tabela.getModel().getValueAt(linha, 4).toString();
        String ano = data.substring(0, 4);
        String mes = data.substring(5, 7);
        String dia = data.substring(8, 10);
        
        UpdateScreen update = new UpdateScreen();
        update.setId(id);
        update.setTitulo(titulo);
        update.setAutor(autor);
        update.setCopias(copias);
        update.setDia(dia);
        update.setMes(mes);
        update.setAno(ano);
        
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_modificarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    public void dataList() {
        try {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
        
            ArrayList<Livro> lista = new Functions().list();
            for(int i=0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getTitulo(),
                lista.get(i).getAutor(),
                lista.get(i).getCopias(),
                lista.get(i).getData()
                }); } 
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"TeteVIEW"+e); } }

}
