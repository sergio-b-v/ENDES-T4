package Cuentas;

/*
 * Esta clase contiene métodos y atributos para calcular el saldo total de nuestra cuenta, resta el dinero que retiramos o suma 
 * el que ingresamos. El resultado lo muestra por pantalla
 * @author: Sergio B
 * @version: 18/03/2021/A
 */
public class CCuenta {
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
    /*
     * Método que define las variables
     * @param nombre define la variable nombre = nom
     * @param cuenta define la variable cuenta = cue
     * @param saldo define la variable saldo = sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    } // Cierre del método
    
    
    /*
     * Método setNombre empleando el encapsulamiento
     */
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    } // Cierre método setNombre
    
    /*
     * Método setCuenta empleando encapsulamiento
     */
    public void setCuenta(String cuenta) {
    	this.cuenta = cuenta;
    } // Cierre método setCuenta
    
    /*
     * Método setSaldo empleando encausulamiento
     */
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }// Cierre método setSaldo
    /*
     * Método setTipoInteres empleando encapsulamiento
     */
    public void setTipoInteres(double tipoInteres) {
    	this.tipoInteres = tipoInteres;
    } // Cierre método setTipoInteres
    
    /*
     * Método que devuelve el saldo (dinero total en la cuenta)
     * @return El saldo total de la cuenta
     */
    public double estado()
    {
        return saldo;
    } // Cierre del método estado()
    
    /*
     * Método que suma la cantidad que ingresemos a nuestro saldo y devuelve el saldo total
     * @param cantidad Es la cantidad que vamos a ingresar
     * @return El saldo total (sumando la cantidad a ingresar)
     * @throws lanza la excepción "No se puede ingresar una cantidad negativa" si la cantidad que se quiere ingresar es menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    } // Cierre del método ingresar()
    
    /*
     * Método que resta la cantidad que queremos retirar del saldo total
     * @param cantidad Define la cantidad que vamos a retirar
     * @throws Lanza la excepción "No se puede retirar una cantidad negativa" Si a cantidad que vamos a retirar es menor o igual a 0
     * @throws Lanza la excepción "No se hay suficiente saldo" si la cuenta tiene menos dinero del que vamos a retirar
     * @return Devuelve el saldo total (restando la cantidad que retiramos)
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }// Cierre del método retirar() 
    
    /*
     * El siguiente método engloba las sentencias de la clase Main que operan con el objeto  cuenta1
     * @param retirada hace referencia a retirar de la clase Main
     * @param ingreso Hace referencia a ingresar de la clase Main
     * @param cantidad Nuevo parámetro con Float
     * @throws Lanza la excepción si no se puede mostrar el total
     * @return Devuelve el total
     */
    
   public String operativa_cuenta(double retirada, double ingreso, float cantidad) throws Exception {
	   String total;
	   
	   try {
		   this.retirar(retirada);
		   this.ingresar(ingreso);
		   
		   total="Saldo actual: " + this.estado();
	   }catch(Exception e) {
		   throw new Exception("No se ha podido mostrar el total");
	   }
	return total;
   }// Cierre del método operativa_cuenta
    
}// Cierre de la clase CCuenta
