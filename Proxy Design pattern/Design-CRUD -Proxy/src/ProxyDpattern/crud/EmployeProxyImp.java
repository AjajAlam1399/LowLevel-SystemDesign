package ProxyDpattern.crud;

public class EmployeProxyImp implements EmployeDao{
    EmployeeImp employeeImp;
    public EmployeProxyImp(){
        employeeImp=new EmployeeImp();
    }
    @Override
    public void create(String client, EmployeDao obj) throws Exception {
        if(client.equals("ADMIN")){
            employeeImp.create(client,obj);
            return;
        }
        throw  new Exception("Acess Denied");
    }

    @Override
    public void delete(String client, int EmployeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeImp.delete(client,EmployeId);
            return;
        }
        throw  new Exception("Acess Denied");
    }

    @Override
    public EmployeDao get(String client, int employeId) throws Exception {
        if(client.equals("USER") || client.equals("ADMIN")){
            employeeImp.get(client,employeId);
        }
        throw  new Exception("Acess denied");
    }
}
