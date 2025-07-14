package com.vetias.java.workshop.tempdata.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;

public class OrganizationDao {
    public void createTable() throws SQLException{
    JdbcDataSource jdbcDataSource=new JdbcDataSource();
    jdbcDataSource.setUrl("jdbc:h2:mem:tempdataDB");
    jdbcDataSource.setUser("sa");
    try(Connection connection = jdbcDataSource.getConnection();
        Statement statement = connection.createStatement()) {
            statement.execute("""
                create table organization(
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100))
                     """);
            System.out.println("Table created successfully.");

        }
        catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }   
}

