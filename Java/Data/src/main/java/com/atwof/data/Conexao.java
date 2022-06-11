package com.atwof.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fritzen.alisson
 */
public class Conexao
{
    public static Connection obterConexao()
    {
        String url = "jdbc:postgresql://localhost:5433/fritzen.alisson";
        String user = "postgres";
        String password = "Robot@mrdb";
        
        try
        {        
            return DriverManager.getConnection(url, user, password);
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getSQLState());
        }
        return null;
    }
    
    public static void fecharConexao(Connection conn)
    {
        try
        {
            if(conn != null)
            {
                conn.close();
            }
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
    
    public static void criarTabela()
    {
        Connection conn = Conexao.obterConexao();
        Statement stmt = null;
        
        String sql = "create table teste("
                   + "id serial not null primary key,"
                   + "name varchar(60) not null)";
        
        try
        {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Tabela criada com sucesso");
        }
        catch(Exception ex)
        {
            
        }
        finally
        {
            System.out.println("Conexão finalizada");
            Conexao.fecharConexao(conn);
        }
        
        
    }
}
