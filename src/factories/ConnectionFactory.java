package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			//variáveis para conexão com o banco de dados
			var host = "jdbc:postgresql://localhost:5435/bd_aula03";
			var user = "user_rafa";
			var pass = "Admin123";
			
			return DriverManager.getConnection(host, user, pass);				
		}
		catch (Exception e) {
			System.out.println("\nFALHA AO INSERIR PESSOA");
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
