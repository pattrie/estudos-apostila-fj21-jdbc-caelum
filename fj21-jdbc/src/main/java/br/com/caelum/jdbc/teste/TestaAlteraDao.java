package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

import java.util.List;

public class TestaAlteraDao {
    public static void main(String[] args) {
        ContatoDao contatoDao = new ContatoDao();
        List<Contato> contatoes = contatoDao.getLista();

        Contato contato = contatoes.get(1);
        contato.setNome("Moquidesia");
        contatoDao.altera(contato);

    }
}
