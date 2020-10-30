package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemoveDao {
    public static void main(String[] args) {
        ContatoDao contatoDao = new ContatoDao();
        Contato contato = new Contato();

        contato.setId(7L);

        contatoDao.remove(contato);
    }
}
