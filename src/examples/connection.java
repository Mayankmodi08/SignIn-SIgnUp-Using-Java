/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class connection {
   Connection c;
java.sql.Statement s;
connection(){
   try {
	  Class.forName("com.mysql.jdbc.Driver");
	  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
          s=c.createStatement();
	}catch(Exception e) {
		e.printStackTrace();
	}
}



    
}
