import java.util.List;

import domain.Ahorro;
import domain.Corriente;
import domain.Cuenta;
import service.ServiceCuenta;

public class App {
    public static void main(String[] args) throws Exception {
        ServiceCuenta serviceCuenta=new ServiceCuenta();
        List<Cuenta> cuentas=serviceCuenta.obtenerCuentas();

        for (Cuenta cuenta:cuentas){
            if(cuenta instanceof Ahorro){
                Cuenta ahorro = cuenta;
                System.out.println(ahorro.toString());
            }
            else if(cuenta instanceof Corriente){
                Cuenta corriente=cuenta;
                System.out.println(corriente.toString());
            }
            //System.out.println(cuenta.toString());            
        }
    }
}
