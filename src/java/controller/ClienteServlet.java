/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import jdbc.ClienteDao;

/**
 *
 * @author Macealpe
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha"); 
        String endereco = request.getParameter("endereco");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String foto = request.getParameter("foto");
                
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setUsuario(usuario);
        cliente.setSenha(senha);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setCpf(cpf);
        cliente.setRg(rg);
        cliente.setFoto(foto);
        cliente.setAtivo(true);
        
        
        ClienteDao dao = new ClienteDao();
        Cliente clienteDoBanco = new Cliente();
        
        dao.adicionaCliente(cliente);
        //HttpSession sessao = request.getSession();
        
        clienteDoBanco = dao.consultaCliente(cliente);
        request.setAttribute("clientecadastrado", clienteDoBanco);
        request.getRequestDispatcher("ExibeCliente.jsp").forward(request, response); 
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
