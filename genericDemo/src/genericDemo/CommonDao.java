package genericDemo;

import java.util.List;

public interface CommonDao {
	public <T> void sava(T entity); //保存数据，无返回值；
	public <T> void remove(T entity); //删除数据    
	public <T> void update(T entity); //更新数据
    //通过id来查找某单个数据；  
	public <T> T findById(Class<T> entityClass, Integer id);
	//使用范型List<>，查询所有的数据    
	public <T> List<T> findAll(Class<T> entityclass);

}
