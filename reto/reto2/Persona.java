package Salud;

import java.util.Scanner;

public class Persona 
{
    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;
    public float  peso, estatura, pesoActual;
   

    Scanner terminal = new Scanner(System.in);

    public void pedirDatos() 
    {
        System.out.println("Cual de estos es su tipo de documento: \n1: CC \n2: TI");
        tipoDoc=terminal.next();
        System.out.println("------------------");

        System.out.println("Ingrese el numero de su documendo de identidad: ");
        documento=terminal.nextInt();
        System.out.println("------------------");

        System.out.println("Ingrese su nombre: ");
        nombre=terminal.next();
        System.out.println("------------------");

        System.out.println("Ingrese su Apellido: ");
        apellido=terminal.next();
        System.out.println("------------------");

        System.out.println("Ingrese su peso en kg: ");
        peso=terminal.nextFloat();
        System.out.println("------------------");

        System.out.println("Ingrese su estatura en m: ");
        estatura=terminal.nextFloat();
        System.out.println("------------------");

        System.out.println("Ingrese su edad: ");
        edad=terminal.nextInt();
        System.out.println("------------------");

        System.out.println("Cual es su sexo: \n1: Femenino \n2: Masculino \n3: Otro");
        sexo=terminal.next();
        System.out.println("-------------------------------------------");
    }

    public void mostrarPersona () 
    {
        System.out.println("REVISE SI SUS DATOS SON CORRECTOS");
        System.out.println("-------------------------------------------");

        System.out.println("Su tipo de documento es :" + tipoDoc );
        System.out.println("------------------");

        System.out.println("Su numero de documento es: "+ documento);
        System.out.println("------------------");

        System.out.println("Su nombre es: " + nombre);
        System.out.println("------------------");

        System.out.println("Su Apellido es : " + apellido);
        System.out.println("------------------");

        System.out.println("Su peso en kg es: " + peso);
        System.out.println("------------------");

        System.out.println("Su estatura en m es : " + estatura);
        System.out.println("------------------");

        System.out.println("Su edad es : " + edad);
        System.out.println("------------------");

        System.out.println("Su sexo es: "  + sexo);
        System.out.println("-------------------------------------------");
    }

    public String calcularImc(Float peso, Float estatura) 
    {


        pesoActual=peso/(estatura*2);
        String solucion = "";

    
        if(pesoActual < 20)
        {
            solucion = "PESOBAJO";
        }
        else if(pesoActual >= 20 && pesoActual <=25)
        {
            solucion = "PESOIDEAL";
        }
        else if(pesoActual > 25)
        {
            solucion = "SOBREPESO";
        }
        System.out.println(solucion);       
        return solucion;
    }


}
