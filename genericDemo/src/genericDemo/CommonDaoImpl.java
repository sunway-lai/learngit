package genericDemo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommonDaoImpl implements CommonDao {

	@Override
	public <T> void sava(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void remove(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void update(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T findById(Class<T> entityClass, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findAll(Class<T> entityclass) {
		String sql = "select * from " + entityclass.getName();
		ArrayList<T> resultList = new ArrayList<T>();
		ResultSet rs = DbHelper.executeQuery(sql);
		try {
			while (rs.next()) {
				T po = entityclass.newInstance();
				ResultSetMetaData rsm = rs.getMetaData();
				int colNum = 0;
				colNum = rsm.getColumnCount();
				for (int i = 1; i <= colNum; i++) {
					String columnName = rsm.getColumnName(i);
					try {
						entityclass.getMethod("set" + columnName, new String[] {}.getClass());
					} catch (NoSuchMethodException | SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				resultList.add(po);
			}
		} catch (InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultList;
	}

}
