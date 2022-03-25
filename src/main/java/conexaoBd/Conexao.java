package conexaoBd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private final static String url = "jdbc:mysql://localhost:3306/agencia";
	private final static String user = "root";
	private final static String pass = "M@xsql2022";
	private static Connection conexao = null;
	
	
	
	private Conexao() {
		
	}

	private static void abrirConexao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			System.out.println("Sucesso!");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro!");
			
		}
		
	}
	
	public static Connection getConexao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		if(conexao == null) {
			abrirConexao();
		}
		return conexao;
	}
}
