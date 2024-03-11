package ProxyDpattern.crud;

public class EmployeeImp implements EmployeDao{

    @Override
    public void create(String client, EmployeDao obj) throws Exception {
        System.out.println("data has been created");
    }

    @Override
    public void delete(String client, int Employeid) throws Exception {
        System.out.println("data has been deleted");
    }

    @Override
    public EmployeDao get(String client, int employeId) throws Exception {
        System.out.println("Data has been fetched sucessfully .");
        return new EmployeeImp();
    }
}
