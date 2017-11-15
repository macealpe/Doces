/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ProdutoDao;

/**
 *
 * @author Macealpe
 */
public class ProdutoServlet extends HttpServlet {

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

        //String descricao = request.getParameter("descricao");
        //Double preco = Double.valueOf(request.getParameter("preco"));
        //Integer quantidade = Integer.valueOf(request.getParameter("quantidade"));
        //String imagem = request.getParameter("imagem");
        Integer id = Integer.valueOf(request.getParameter("id"));

        Produto produto = new Produto();
        //produto.setDescricao(descricao);
        //produto.setPrecoUnitario(preco);
        //produto.setQuantidadeEstoque(quantidade);
        //produto.setImagemProduto(imagem);
        produto.setId(id);

        ProdutoDao dao = new ProdutoDao();
        // Reportando informações para o usuário
        String report = "";

        switch (request.getParameter("operacao")) {
            case "insert":
                if(dao.adicionaProduto(produto)) {
                    report = "Produto já cadastrado no Banco!!!";
                }
                else {
                    report = "Produto cadastrado com sucesso!!!";
                }
                break;
            case "update":
                dao.atualizaProduto(produto);
                break;
            case "select":
                Produto produtoDoBanco = dao.consultaProduto(produto);
                request.setAttribute("produtocadastrado", produtoDoBanco);
                request.getRequestDispatcher("ExibeProduto.jsp").forward(request, response);
                break;
            case "drop":
                dao.removeProduto(produto);
                break;
            case "showAll":
                dao.listaTodosProdutos();
                break;
            case "find":
                dao.buscaProduto(produto);
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
