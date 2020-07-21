package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		/*!!!!!!!!!!!CONSULTA
		 * Connection connection = null; Statement statement = null; ResultSet resultSet
		 * = null;
		 * 
		 * 
		 * try {
		 * 
		 * connection = DB.getConnection();
		 * 
		 * statement = connection.createStatement(); resultSet =
		 * statement.executeQuery("SELECT * FROM department");
		 * 
		 * while (resultSet.next()) { System.out.println(resultSet.getInt("Id") + ", " +
		 * resultSet.getString("Name")); }
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * finally { DB.closeResultSet(resultSet); DB.closeStatement(statement);
		 * DB.closeConnection(); }
		 */

		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		/*!!!!!!!!!!!INSERIR
		 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 * Connection connection = null; PreparedStatement preparedStatement = null;
		 * 
		 * try { connection = DB.getConnection();
		 * 
		 * preparedStatement = connection.prepareStatement("INSERT INTO seller" +
		 * "(Name, Email, BirthDate, BaseSalary, DepartmentId)" + "VALUES" +
		 * "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
		 * preparedStatement.setString(1, "Carl Purple"); preparedStatement.setString(2,
		 * "carl@gmail.com"); preparedStatement.setDate(3, new
		 * java.sql.Date(simpleDateFormat.parse("22/04/1985").getTime()));
		 * preparedStatement.setDouble(4, 3000.0); preparedStatement.setInt(5, 4);
		 * 
		 * int rowsAffected = preparedStatement.executeUpdate();
		 * 
		 * if (rowsAffected > 0) { ResultSet resultSet =
		 * preparedStatement.getGeneratedKeys(); while (resultSet.next()) { int id =
		 * resultSet.getInt(1); System.out.println("Done! Id = " + id); } } else {
		 * System.out.println("No rows affected"); }
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); } catch (ParseException e) {
		 * e.printStackTrace(); }
		 * 
		 * finally { DB.closeStatement(preparedStatement); DB.closeConnection(); }
		 */
		
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		/*UPDATE
		 * Connection connection = null; PreparedStatement preparedStatement = null;
		 * 
		 * try { connection = DB.getConnection(); preparedStatement =
		 * connection.prepareStatement( "UPDATE seller " +
		 * "SET BaseSalary = BaseSalary + ? " + "WHERE" + "(DepartmentId = ?)");
		 * 
		 * preparedStatement.setDouble(1, 200); preparedStatement.setInt(2, 2);
		 * 
		 * int rowsAffected = preparedStatement.executeUpdate();
		 * 
		 * System.out.println("Done! Rows Affected: " + rowsAffected);
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); } finally {
		 * DB.closeStatement(preparedStatement); DB.closeConnection(); }
		 */
		
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		/* EXCLUSÃO DE DADOS
		 * Connection connection = null; PreparedStatement preparedStatement = null;
		 * 
		 * try { connection = DB.getConnection();
		 * 
		 * preparedStatement = connection.prepareStatement( "DELETE FROM department " +
		 * "WHERE " + "Id = ? "); preparedStatement.setInt(1, 2);
		 * 
		 * int rowsAffected = preparedStatement.executeUpdate();
		 * 
		 * System.out.println("Done! Rows Affected: " + rowsAffected);
		 * 
		 * } catch (SQLException e) { throw new DbIntegrityException(e.getMessage()); }
		 * finally { DB.closeStatement(preparedStatement); DB.closeConnection(); }
		 */
		
		
	}

}
