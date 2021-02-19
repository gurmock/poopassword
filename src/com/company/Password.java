package com.company;
/*Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Los constructores serán los siguiente:
Un constructor por defecto.
Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
Los métodos que implementa serán:
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
generarPassword():  genera la contraseña del objeto con la longitud que tenga.
Método get para contraseña y longitud.
Método set para longitud.*/

public class Password {
    //declaro los atributos
    private int longitud;
    private String contrasenia = "";

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public void generarPassword(){
        int tipoChar;
        //Creo un numero aletario para indicar que tipo de dato va en cada posicion
        for (int i = 0;i < this.longitud;i++) {
            tipoChar = (int) (Math.random() * 3 +1);
            //Creo la contraseña para indicar si es un numero o letra genero numeros aleatorios
            //y decido el rango de los numeros por el codigo numero de los caracteres
            if (tipoChar == 1) {
                char minuscula = (char)((int)Math.floor(Math.random() * (123 - 97) + 97));
                this.contrasenia += minuscula;
            } else if (tipoChar == 2) {
                char mayuscula = (char)((int)Math.floor(Math.random() * (91 - 65) + 65));
                this.contrasenia += mayuscula;
            } else {
                char numeros = (char)((int)Math.floor(Math.random() * (58 - 48) + 48));
                this.contrasenia += numeros;
            }
        }
    }
    public boolean esFuerte(){
        //Creo contadores para los ditintos tipos de comprobaciones
            int minusculas= 0;
            int mayusculas= 0;
            int numeros = 0;
            String contraseniaCompara = this.contrasenia;
            //Recorro el String buscando los comprobando tipo de dato y sumando al contador
           for (int i = 0; i < contraseniaCompara.length();i++){
               if (contraseniaCompara.charAt(i) <= 58){
                   numeros ++;
               }
               if(contraseniaCompara.charAt(i)< 58 && contraseniaCompara.charAt(i)<= 65){
                   mayusculas ++;
               }
               if(contraseniaCompara.charAt(i)< 91){
                   minusculas ++;
               }
           }
           //Creo la condicion para la contraseña segura si cumple las condiciones es segura.
           if (minusculas >= 1 && mayusculas >=2 && numeros >= 5){

               return true;
           }else {

               return false;
           }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }



    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}
