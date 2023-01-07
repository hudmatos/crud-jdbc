package VIEW;

import DAO.Functions;
import DTO.Livro;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InsertScreen extends javax.swing.JFrame {

    public InsertScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_copias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();
        txt_ano = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(new java.awt.Color(20, 205, 200));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inserir Livro");

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Título do livro");

        txt_titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_autor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nome do Autor");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Número de cópias");

        txt_copias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Data de lançamento");

        btn_voltar.setBackground(new java.awt.Color(45, 85, 255));
        btn_voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_inserir.setBackground(new java.awt.Color(178, 222, 39));
        btn_inserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inserir.setForeground(new java.awt.Color(255, 255, 255));
        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        txt_ano.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_ano.setForeground(java.awt.Color.gray);
        txt_ano.setText("aaaa");
        txt_ano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_anoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_anoFocusLost(evt);
            }
        });

        txt_mes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_mes.setForeground(java.awt.Color.gray);
        txt_mes.setText("mm");
        txt_mes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_mesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_mesFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("/");

        txt_dia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_dia.setForeground(java.awt.Color.gray);
        txt_dia.setText("dd");
        txt_dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_diaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_diaFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_copias, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_autor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_titulo, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_copias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        
        try {
            
            String titulo = txt_titulo.getText();
            String autor = txt_autor.getText();   
            int copias = Integer.parseInt(txt_copias.getText());
        
            String dia = txt_dia.getText();
            String mes = txt_mes.getText();
            String ano = txt_ano.getText();
            String data = ano + "-" + mes + "-" + dia;
            java.sql.Date date = java.sql.Date.valueOf(data);
        
            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setCopias(copias);
            livro.setData(date);
            Functions function = new Functions();
            function.insert(livro);
            
            txt_titulo.setText("");
            txt_autor.setText("");
            txt_copias.setText("");
            txt_dia.setText("");
            txt_mes.setText("");
            txt_ano.setText("");
            JOptionPane.showMessageDialog(null, "Dados inserirdos com sucesso");
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "InsertScreen/btn_inserir");
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!\n"+e); }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Padrão de data não aceito!\n" + e); }
        
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        MainScreen teste = new MainScreen();
        teste.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_diaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_diaFocusGained
        if(!txt_dia.getText().equals("dd")) {
            return; }
        txt_dia.setText("");
        txt_dia.setForeground(Color.black);
    }//GEN-LAST:event_txt_diaFocusGained

    private void txt_diaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_diaFocusLost
        if(txt_dia.getText().equals("")) {
            txt_dia.setText("dd");
            txt_dia.setForeground(Color.gray);}
    }//GEN-LAST:event_txt_diaFocusLost

    private void txt_mesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_mesFocusGained
        if(!txt_mes.getText().equals("mm")) {
            return; }
        txt_mes.setText("");
        txt_mes.setForeground(Color.black);
    }//GEN-LAST:event_txt_mesFocusGained

    private void txt_mesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_mesFocusLost
        if(txt_mes.getText().equals("")) {
            txt_mes.setText("mm");
            txt_mes.setForeground(Color.gray);}
    }//GEN-LAST:event_txt_mesFocusLost

    private void txt_anoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_anoFocusGained
        if(!txt_ano.getText().equals("aaaa")) {
            return; }
        txt_ano.setText("");
        txt_ano.setForeground(Color.black);
    }//GEN-LAST:event_txt_anoFocusGained

    private void txt_anoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_anoFocusLost
        if(txt_ano.getText().equals("")) {
            txt_ano.setText("aaaa");
            txt_ano.setForeground(Color.gray);}
    }//GEN-LAST:event_txt_anoFocusLost

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ano;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_copias;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
