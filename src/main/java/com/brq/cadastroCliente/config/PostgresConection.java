package com.brq.cadastroCliente.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
public class PostgresConection {

    public Connection getConnectionPostgreSQL(){
        try{
            return DriverManager.getConnection(
                    "jdbc:postgesql://"
                    + "ec2-54-147-76-191.compute-1.amazonaws.com/"
                    + "d4v6u279r0r5ed",
                    "giyvmttuqgzrq",
                    "64eb69feccb370a9f756c4aba6dea537f4aceddde57b96f4c3879efeb337be2d");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
