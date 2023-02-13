package cuentas;

public class CCuenta {

    //Variables
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo actual de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Saldo actual de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Permite ingresar dinero en la cuenta.
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    public void operativa_cuenta(CCuenta cuenta1, float cantidad) {
    double saldoActual;

    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es"+ saldoActual );

    try {
        cuenta1.retirar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al retirar");
    }
    try {
        System.out.println("Ingreso en cuenta");
        cuenta1.ingresar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al ingresar");
    }
}
    //Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    
    
}
