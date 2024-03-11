package ProxyDpattern.crud;

public interface EmployeDao {
    public abstract  void create(String client,EmployeDao obj)throws Exception;
    public abstract void delete(String client,int EmployeId)throws Exception;
    public abstract EmployeDao get(String client,int employeId) throws Exception;
}
