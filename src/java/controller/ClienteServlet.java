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

        Cliente cliente = new Cliente();
        ClienteDao dao = new ClienteDao();
        String report;
        report = "";
        String nome;
        String usuario;
        String senha;
        String endereco;
        String telefone;
        String email;
        String cpf;
        String rg;
        String foto;
        
        switch (request.getParameter("operacao")) {
            case "insert":  
                nome = request.getParameter("nome");
                usuario = request.getParameter("usuario");
                senha = request.getParameter("senha");
                endereco = request.getParameter("endereco");
                telefone = request.getParameter("telefone");
                email = request.getParameter("email");
                cpf = request.getParameter("cpf");
                rg = request.getParameter("rg");
                foto = request.getParameter("foto");
                                
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
                
                //Cliente clienteDoBanco = new Cliente();

                if (dao.adicionaCliente(cliente)) {
                    report = "Cliente já cadastrado no Banco!!!";
                } else {
                    report = "Cliente cadastrado com sucesso!!!";
                }
                System.out.println("REPORT: " + report);
                //HttpSession sessao = request.getSession();

                //clienteDoBanco = dao.consultaCliente(cliente);
                //request.setAttribute("clientecadastrado", clienteDoBanco);
                request.getRequestDispatcher("listaclientes.jsp").forward(request, response);
                break;
            case "login":
                usuario = request.getParameter("usuario");
                senha = request.getParameter("senha");  
                
                cliente.setUsuario(usuario);
                cliente.setSenha(senha);                
                if (dao.existeUsuario(cliente)) {                    
                    report = "Seja bem vindo, " + cliente.getUsuario();
                    request.setAttribute("report", report);
                    request.getRequestDispatcher("carrinho.jsp").forward(request, response);
                }
                else {
                    report = "Usuário e/ou Senha incorretos";
                    request.setAttribute("report", report);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                }                
                break;                    
            default:
                break;
        }        
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
