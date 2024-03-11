import ProxyDpattern.crud.EmployeProxyImp;
import ProxyDpattern.crud.EmployeeImp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeProxyImp employeProxyImp=new EmployeProxyImp();
        EmployeeImp employeeImp=new EmployeeImp();
        try {
            employeProxyImp.create("ADMIN",employeeImp);
            employeProxyImp.delete("ADMIN",1);
            employeProxyImp.get("dfkfkdf",2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}