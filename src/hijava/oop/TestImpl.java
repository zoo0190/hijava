package hijava.oop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestImpl implements TestInterface {

	@Override
	public ResultSet select(String sql) throws SQLException {
		print(sql);
		return null;
	}

}
