/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import beans.Cliente;
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
public class ClienteDao {
    
    private final Connection conexao;
    
    public ClienteDao() {
        this.conexao = MyConnection.getConnection();
    }
    
    
    public void adicionaCliente(Cliente cliente) {
        
        String sql = "INSERT INTO CLIENTE (nome_completo, usuario, senha, endereco, telefone, email, cpf, rg, foto, ativo) VALUES (?,?,md5(?),?,?,?,?,?,?,?)";
        
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getUsuario());
            pstmt.setString(3, cliente.getSenha());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setString(6, cliente.getEmail());
            pstmt.setString(7, cliente.getCpf());
            pstmt.setString(8, cliente.getRg());
            pstmt.setString(9, cliente.getFoto());       
            pstmt.setBoolean(10, cliente.isAtivo());
            pstmt.execute();
        } catch(SQLException e) {
            throw new RuntimeException(e);                  
        }    
    }
    
    public void atualizaCliente(Cliente cliente) {
        String sql = "UPDATE CLIENTE SET nome_completo=?, usuario=?, senha=?, endereco=?, telefone=?, email=?, cpf=?, rg=?, foto=?, ativo=? WHERE id_cliente=?";
        
         try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getUsuario());
            pstmt.setString(3, cliente.getSenha());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setString(6, cliente.getEmail());
            pstmt.setString(7, cliente.getCpf());
            pstmt.setString(8, cliente.getRg());
            pstmt.setString(9, cliente.getFoto());       
            pstmt.setBoolean(10, cliente.isAtivo());
            pstmt.setInt(11, cliente.getId());
            pstmt.execute();
        } catch(SQLException e) {
            throw new RuntimeException(e);                  
        }          
    }
    
    public Cliente consultaCliente(Cliente cliente) {
        String sql = "SELECT * FROM CLIENTE WHERE cpf=?";
        
         try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getCpf());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome_completo"));
                cliente.setUsuario(rs.getString("usuario"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setRg(rs.getString("rg"));
                cliente.setFoto(rs.getString("foto"));
                cliente.setAtivo(rs.getBoolean("ativo"));
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);                  
        }
        return cliente;
    }
    
    public void removeCliente(Cliente cliente) {
        String sql = "UPDATE CLIENTE SET nome_completo=?, usuario=?, senha=?, endereco=?, telefone=?, email=?, cpf=?, rg=?, foto=?, ativo=? WHERE id_cliente=?";
        
         try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getUsuario());
            pstmt.setString(3, cliente.getSenha());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setString(6, cliente.getEmail());
            pstmt.setString(7, cliente.getCpf());
            pstmt.setString(8, cliente.getRg());
            pstmt.setString(9, cliente.getFoto());       
            pstmt.setBoolean(10, cliente.isAtivo());
            pstmt.setInt(11, cliente.getId());
            pstmt.execute();
        } catch(SQLException e) {
            throw new RuntimeException(e);                  
        } 
        
    }
    
    public List<Cliente> listaTodosClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM CLIENTE";
        
         try (Statement stmt = conexao.createStatement()) {            
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome_completo"));
                cliente.setUsuario(rs.getString("usuario"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setRg(rs.getString("rg"));
                cliente.setFoto(rs.getString("foto"));
                cliente.setAtivo(rs.getBoolean("ativo"));
                lista.add(cliente);
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);                  
        }
        return lista;
    }
    
    public boolean buscaCliente(Cliente cliente) {
        boolean achou = false;
        
        String sql = "SELECT * FROM CLIENTE WHERE id_cliente=?";
        
         try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, cliente.getId());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                achou = true;
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);                  
        }
        return achou;
    }   
}
