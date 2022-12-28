package DAO;

import DTO.Livro;
import java.util.ArrayList;

public class TesteConexao {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Livro cliente = new Livro();
        
        //cliente.setId(2);
        cliente.setTitulo("As aventuras de jorgin");
        cliente.setAutor("Jorgin");
        cliente.setCopias(10);
        //cliente.setData("2010-10-10");
        
        Functions comando = new Functions();
        comando.remove(cliente);
        ArrayList<Livro> lista = comando.list();
        System.out.println(lista.get(1).getTitulo());
        
        
    }
    
}
