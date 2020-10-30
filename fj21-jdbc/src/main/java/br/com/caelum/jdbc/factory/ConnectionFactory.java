package br.com.caelum.jdbc.factory;

import br.com.caelum.jdbc.dao.DAOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class    ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/fj21", "root", "devmysql");
        } catch (SQLException e) {
            throw new DAOException("Deu ruim.");
        }
    }
}
