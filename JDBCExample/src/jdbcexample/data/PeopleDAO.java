/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbcexample.model.Person;

/**
 *
 * @author danecek
 */
public class PeopleDAO {

    PreparedStatement allPS;
    Connection conn;

    public PeopleDAO(Connection conn) throws SQLException {
        allPS = conn.prepareStatement("SELECT * FROM PEOPLE");

    }

    public List<Person> all() {
        ArrayList<Person> persons = new ArrayList<>();
        try {
            ResultSet rs = allPS.executeQuery();
            while (rs.next()) {
                persons.add(new Person(rs.getInt(1), rs.getString(2)));

            }
            return persons;
        } catch (SQLException ex) {
            Logger.getLogger(PeopleDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }

    }
    
    public void addPerson(String name) {
        
    }
}
