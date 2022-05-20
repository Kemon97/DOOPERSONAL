package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.grades.data.dao.SubjectDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.SubjectDTO;

public class SubjectAzureSqlDAO {



public class SubjectAzureSqlDAO extends ConnectionSQL implements SubjectDAO {

	private SubjectAzureSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static SubjectDAO build(Connection connection) {
		return new SubjecttAzureSqlDAO(connection);
	}

	@Override
	public void create(SubjectDTO subject) {
		String sql = "INSERT INTO Subject(id, name) VALUES(?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, subject.getId());
		}catch (SQLException exception){
			
			throw GradesException.buildTechnicalDataException("There was a problem trying to create a new subject registry on sql server", exception);
			
		}catch (Exception exception) {
			
			throw GradesException.buildTechnicalDataException("There was an unexpected problem trying to create a new subject registry on sql server", exception);
			
		}
		
	}

	@Override
	public void update(SubjectDTO subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(Subject subject) {
		// TODO Auto-generated method stub
		
	}

}


}
