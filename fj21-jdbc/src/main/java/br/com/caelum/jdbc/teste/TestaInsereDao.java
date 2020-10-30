package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

import java.util.Calendar;

public class TestaInsereDao {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Xuxu");
        contato.setEmail("xuxu@teste");
        contato.setEndereco("Rua da Deprê");
        contato.setDataNascimento(Calendar.getInstance());

        ContatoDao contatoDao = new ContatoDao();
        contatoDao.adiciona(contato);
    }
}
