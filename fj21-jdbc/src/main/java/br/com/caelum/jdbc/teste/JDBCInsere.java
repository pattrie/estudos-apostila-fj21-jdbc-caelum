package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class JDBCInsere {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = new ConnectionFactory().getConnection();
            String sql = "insert into contatos" +
                    " (nome, email, endereco, dataNascimento)" +
                    " values (?,?,?,?)";
            PreparedStatement stmt = null;
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "Caelum2");
            stmt.setString(2, "contato@caelum.com.br");
            stmt.setString(3, "R. Vergueiro, 3185 cj57");
            stmt.setDate(4, new java.sql.Date(
                    Calendar.getInstance().getTimeInMillis()));

            stmt.execute();
            stmt.close();

            System.out.println("Gravado!");
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.close();
        }
    }
}
