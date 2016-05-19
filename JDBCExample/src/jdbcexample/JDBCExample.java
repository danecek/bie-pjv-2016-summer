/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import jdbcexample.data.PeopleDAO;
import jdbcexample.model.Person;
import org.apache.derby.jdbc.EmbeddedDataSource;

/**
 *
 * @author danecek
 */
public class JDBCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        EmbeddedDataSource eds = new EmbeddedDataSource();
        eds.setDatabaseName("/home/users/d/danecek/testDB");
        eds.setCreateDatabase("create");
        Connection con = eds.getConnection();
//        String ct = "CREATE TABLE PEOPLE  " + 
//	 "(PERSON_ID INT NOT NULL GENERATED ALWAYS AS IDENTITY, " +
//	 "NAME VARCHAR(26))";
//        Statement stm = con.createStatement();
//        //       stm.executeUpdate(ct);
//        stm.executeUpdate("INSERT INTO PEOPLE VALUES(DEFAULT, 'John')");
//        ResultSet rs = stm.executeQuery("SELECT * FROM PEOPLE");
//        while (rs.next()) {
//            System.out.printf("%d   %s\n", rs.getInt(1), rs.getString(2));
//        }
        PeopleDAO pdao = new PeopleDAO(con);
        List<Person> persons = pdao.all();
        System.out.println(persons);
        // TODO code application logic here
    }

}
