
package DTO;

import Modelo.TransportModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransportDTO {
    private Connection con;
    
    public TransportDTO() throws Exception {
        String url = "jdbc:mysql://localhost:3306/cadastrodeempresa";
        String user = "root";
        String pass = "aluno";
        con = DriverManager.getConnection(url, user, pass);
    }

    public void salvar(TransportModel transporte) throws Exception {
        String sql = "INSERT INTO transportadoras (nome, cnpj) VALUES (?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, transporte.getName());
        stmt.setString(2, transporte.getCnpj());

        stmt.executeUpdate();
        stmt.close();
    }
}
