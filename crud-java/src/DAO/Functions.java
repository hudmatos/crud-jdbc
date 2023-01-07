package DAO;

import DTO.Livro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Functions {
    
    private final ArrayList<Livro> clienteList = new ArrayList<>();
    private Connection connect = null;
    private PreparedStatement pstm;
    
    public void insert(Livro livro) throws ClassNotFoundException {
        connect = new ConnectionFactory().connectDB();
        try {
            String command = "INSERT INTO livro(titulo,autor,copias,data_emissao) values(?,?,?,?)";
            pstm = connect.prepareStatement(command);
            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getAutor());
            pstm.setInt(3, livro.getCopias());
            pstm.setDate(4, (Date) livro.getData());
            pstm.execute();} 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro ao inserir os dados"+erro); } }
    
    
    public void remove(Livro livro) throws ClassNotFoundException {
        connect = new ConnectionFactory().connectDB();
        try {
            String command = "DELETE FROM livro WHERE id = ?";
            pstm = connect.prepareStatement(command);
            pstm.setInt(1, livro.getId());
            pstm.execute(); }
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro ao remover"+erro); } }
    
    
    public void update(Livro livro) throws ClassNotFoundException {
        connect = new ConnectionFactory().connectDB();
        try {
            String command = "UPDATE livro SET id=?, titulo=?, autor=?, copias=?, data_emissao=? WHERE id=?";
            pstm = connect.prepareStatement(command);
            pstm.setInt(1, livro.getId());
            pstm.setString(2, livro.getTitulo());
            pstm.setString(3, livro.getAutor());
            pstm.setInt(4, livro.getCopias());
            pstm.setDate(5, (Date) livro.getData());
            pstm.setInt(6, livro.getId());
            pstm.execute(); }
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro ao editar"+erro); } }
    
    public ArrayList<Livro> list() throws ClassNotFoundException {
        connect = new ConnectionFactory().connectDB();
        try {
            String command = "SELECT * FROM livro;";
            pstm = connect.prepareStatement(command);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                Livro livro = new Livro();
                
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setCopias(rs.getInt("copias"));
                livro.setData(rs.getDate("data_emissao"));
                
                clienteList.add(livro); } }
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao listar os dados"+erro);
        }
        return clienteList; }
       
}