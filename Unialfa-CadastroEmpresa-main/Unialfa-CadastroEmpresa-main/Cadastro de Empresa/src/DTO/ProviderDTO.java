
package DTO;

import Modelo.ProviderModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProviderDTO {
    private Connection con;
    
    public ProviderDTO() throws Exception {
        String url = "jdbc:mysql://localhost:3306/cadastrodeempresa";
        String user = "root";
        String pass = "aluno";
        con = DriverManager.getConnection(url, user, pass);
    }

    public void salvar(ProviderModel fornecedor) throws Exception {
        String sql = "INSERT INTO fornecedores (nome, cpf, data_nascimento) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, fornecedor.getName());
        stmt.setString(2, fornecedor.getCpf());
        stmt.setInt(3, fornecedor.getData());

        stmt.executeUpdate();
        stmt.close();
    }
}
