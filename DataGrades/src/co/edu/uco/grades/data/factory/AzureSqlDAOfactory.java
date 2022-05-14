package co.edu.uco.grades.data.factory;

import java.sql.Connection;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.crosscutting.util.sql.UtilConnection;
import co.edu.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.dao.StudentDAO;
import co.edu.uco.grades.data.factory.DAOfactory;

public class AzureSqlDAOfactory  extends DAOfactory {
	
	private Connection connection;
	
	private AzureSqlDAOfactory() {
		openConnection();
	}
	
	@Override
	protected void openConnection() {
		if(! UtilObject.getUtilObject().isNull(connection)
			&& !UtilConnection.isClosed(connection)) {
		throw GradesException.buildTechnicalException("It's not possible open a connection because its already is open"); 	
		}
		
		String stringconnection = 
	}
	
	@Override
	public void getConnection() {
		//TODO Auto-generated method stub
	}
	
	

}
