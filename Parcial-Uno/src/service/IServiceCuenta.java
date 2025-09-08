package service;

import java.util.List;

import domain.Cuenta;

public interface IServiceCuenta {
    List<Cuenta> obtenerCuentas();
    Cuenta obtenernumeroCuenta(String numeroCuenta);
    void crearCuenta(Cuenta cuenta);
    void retirarDinero(String numeroCuenta,double retiro);
    void ingresarDinero(String numeroCuenta,double ingreso);
}
