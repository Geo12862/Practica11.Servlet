package CalculadoraService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexiones {
	public static void registrarDB(String username, String password) throws ClassNotFoundException, SQLException{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica11?useSSL=false&allowPublicKeyRetrieval=true" , "daw", "password");
		Statement st = con.createStatement();
		String query = "INSERT INTO `users`(`nombre`, `contrasena`) VALUES ('"+username+"', '"+password+"')";
		st.executeUpdate(query);
		st.close();
		con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	public static String loginDB(String username, String password) {
		String resultat = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica11?useSSL=false&allowPublicKeyRetrieval=true" , "daw", "password");
			Statement st = con.createStatement();
			String query = "SELECT username FROM users WHERE username = '"+username+"' AND password = '"+password+"'";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				resultat = rs.getString("username");
			}
			st.executeUpdate(query);
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultat;
	}
}