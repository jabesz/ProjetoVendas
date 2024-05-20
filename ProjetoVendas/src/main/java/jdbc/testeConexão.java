/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jabes
 */
public class testeConexão {
    try{
        new ConnectionFactory().getConnection();
        JOptionPane.showMessageDialog(null, "Conectado" );
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "erro" );
    }
}
