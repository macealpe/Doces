/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import beans.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Macealpe
 */
public class ProdutoDao {

    private final Connection conexao;

    public ProdutoDao() {
        this.conexao = MyConnection.getConnection();
    }

    public boolean adicionaProduto(Produto produto) {
        if (!buscaProduto(produto)) {
            String sql = "INSERT INTO PRODUTO (descricao, preco_unitario, quantidade_estoque, imagem_produto, ativo) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
                pstmt.setString(1, produto.getDescricao());
                pstmt.setDouble(2, produto.getPrecoUnitario());
                pstmt.setInt(3, produto.getQuantidadeEstoque());
                pstmt.setString(4, produto.getImagemProduto());
                pstmt.setBoolean(5, produto.isAtivo());
                pstmt.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return buscaProduto(produto);
    }

    public void atualizaProduto(Produto produto) {
        String sql = "UPDATE TABLE PRODUTO SET descricao=?, preco_unitario=?, quantidade_estoque=?, imagem_produto=?, ativo=? WHERE id_produto=?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, produto.getDescricao());
            pstmt.setDouble(2, produto.getPrecoUnitario());
            pstmt.setInt(3, produto.getQuantidadeEstoque());
            pstmt.setString(4, produto.getImagemProduto());
            pstmt.setBoolean(5, produto.isAtivo());
            pstmt.setInt(6, produto.getId());
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Produto consultaProduto(Produto produto) {
        String sql = "SELECT * FROM PRODUTO WHERE id_produto=?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, produto.getId());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                produto.setId(rs.getInt("id_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoUnitario(rs.getDouble("preco_unitario"));
                produto.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                produto.setImagemProduto(rs.getString("imagem_produto"));
                produto.setAtivo(rs.getBoolean("ativo"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produto;
    }

    public void removeProduto(Produto produto) {
        String sql = "UPDATE TABLE PRODUTO SET descricao=?, preco_unitario=?, quantidade_estoque=?, imagem_produto=?, ativo=? WHERE id_produto=?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, produto.getDescricao());
            pstmt.setDouble(2, produto.getPrecoUnitario());
            pstmt.setInt(3, produto.getQuantidadeEstoque());
            pstmt.setString(4, produto.getImagemProduto());
            pstmt.setBoolean(5, produto.isAtivo());
            pstmt.setInt(6, produto.getId());
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listaTodosProdutos() {
        String sql = "SELECT * FROM PRODUTO";
        List<Produto> lista = new ArrayList();

        try (Statement stmt = conexao.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoUnitario(rs.getDouble("preco_unitario"));
                produto.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                produto.setImagemProduto(rs.getString("imagem_produto"));
                produto.setAtivo(rs.getBoolean("ativo"));
                lista.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public boolean buscaProduto(Produto produto) {
        boolean achou = false;
        String sql = "SELECT * FROM PRODUTO WHERE descricao=?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, produto.getDescricao());
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                achou = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return achou;
    }
}
