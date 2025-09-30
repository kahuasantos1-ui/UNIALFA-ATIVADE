package DTO;

import Modelo.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDTO {
    private Connection con;
    
    public ProductDTO() throws Exception {
        String url = "jdbc:mysql://localhost:3306/cadastrodeempresa";
        String user = "root";
        String pass = "aluno";
        con = DriverManager.getConnection(url, user, pass);
    }

    public void salvar(ProductModel produto) throws Exception {
        String sql = "INSERT INTO produtos (nome, preco, codigo_barra) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, produto.getName());
        stmt.setDouble(2, produto.getPrice());
        stmt.setString(3, produto.getBarCode());

        stmt.executeUpdate();
        stmt.close();
    }
}
