
package DTO;

import Modelo.StoreModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreDTO {
    private Connection con;
    
    public StoreDTO() throws Exception {
        String url = "jdbc:mysql://localhost:3306/cadastrodeempresa";
        String user = "root";
        String pass = "aluno";
        con = DriverManager.getConnection(url, user, pass);
    }

    public void salvar(StoreModel loja) throws Exception {
        String sql = "INSERT INTO lojas (nome, cnpj, local) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, loja.getName());
        stmt.setString(2, loja.getCnpj());
        stmt.setString(3, loja.getLocale());

        stmt.executeUpdate();
        stmt.close();
    }
}
