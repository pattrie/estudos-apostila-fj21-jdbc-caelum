package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

import java.util.List;

public class TestaListaDao {
    public static void main(String[] args) {
        ContatoDao dao = new ContatoDao();
        List<Contato> contatoes = dao.getLista();
        for (Contato c : contatoes) {
            System.out.println(c);
        }
        char letra = 'C';
        contatoes = dao.getListaEnquantoNomeComecarCom(letra);
        for (Contato c : contatoes) {
            System.out.println("Nome(s) que começa(m) com a letra : " + letra + " " + c);
        }
        int id = 3;
        contatoes = dao.getContatoComID(id);
        for (Contato c : contatoes) {
            System.out.println("Contato com id: " + id + " " + c);
        }
    }
}
