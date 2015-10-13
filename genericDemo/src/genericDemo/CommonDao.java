package genericDemo;

import java.util.List;

public interface CommonDao {
	public <T> void sava(T entity); //�������ݣ��޷���ֵ��
	public <T> void remove(T entity); //ɾ������    
	public <T> void update(T entity); //��������
    //ͨ��id������ĳ�������ݣ�  
	public <T> T findById(Class<T> entityClass, Integer id);
	//ʹ�÷���List<>����ѯ���е�����    
	public <T> List<T> findAll(Class<T> entityclass);

}
