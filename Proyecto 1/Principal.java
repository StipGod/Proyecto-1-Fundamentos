import java.util.Scanner;
public class Principal
{
      public static void mostrarMenu()
      {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Cual es la cantidad de espacios en el parqueadero?");
        int cantidad = Scan.nextInt();
       
        
        new Vehiculo(cantidad);
        new Sensor(cantidad,false);

        System.out.println("Ingrese un numero del 0 al 9 para seguir:");
        System.out.println("Ingrese 1 para imprimir los sensores desocupados");
        System.out.println("Ingrese 2 para solicitar el espacio donde se quiera parquear (no recuerda valor comercial)");
        System.out.println("Ingrese 3 para solicitar el espacio donde se quiera parquear");
        System.out.println("Ingrese 4 para mostrar la informacion de todos los vehiculos almacenados");
        System.out.println("Ingrese 5 para mostrar el historial de la cantidad de vehiculos creados hasta el momento");
        System.out.println("Ingrese 6 para verificar el estado de un espacio");
        System.out.println("Ingrese 7 para mostrar el estado de todos los sensores");
        System.out.println("Ingrese 8 para buscar carros por color");
        System.out.println("Ingrese 9 para ordenar los carros por precio");
        System.out.println("Ingrese 0 para terminar la ejecucion");

        int i = 1;
        while(i!=0){
          int num = Scan.nextInt();
          i=num;
          switch(num){
            case 0 :
              System.out.println("Fin del programa");
            break;
            case 1 :
              System.out.println(Sensor.sensorLibre());
                
            break;
            case 2 :
              System.out.println("Espacio que desea ocupar");
              int espacio = Scan.nextInt() - 1;
              if(Sensor.sensores[espacio] == null  || Sensor.sensores[espacio].getEstado() == 0 )
              {
                
                  System.out.println("Ingrese la placa:");
                  String placa = Scan.next();
                  System.out.println("Ingrese la marca:");
                  String marca = Scan.next();
                  System.out.println("Ingrese el color:");
                  String color = Scan.next();
                  
                  Vehiculo.vehiculos[espacio] = new Vehiculo(placa,marca,color); 
                  Sensor.sensores[espacio] = new Sensor(1);
                  System.out.println(Vehiculo.vehiculos[espacio].toString());
                }else{
                    System.out.println("No se puede realizar esta accion");
                }  
                
              
            break;
            case 3 :
            System.out.println("Espacio que desea ocupar");
               espacio = Scan.nextInt() - 1;
              if(Sensor.sensores[espacio] == null || Sensor.sensores[espacio].getEstado() == 0)
              {
    
                 System.out.println("Ingrese la placa:");
                 String placa = Scan.next();
                 System.out.println("Ingrese la marca:");
                 String marca = Scan.next();
                 System.out.println("Ingrese el color:");
                 String color = Scan.next();
                 System.out.println("Ingrese el valor:");
                 int valor = Scan.nextInt();
                 Vehiculo.vehiculos[espacio] = new Vehiculo(placa,marca,color,valor) ;
                 Sensor.sensores[espacio] = new Sensor(1);
                 System.out.println(Vehiculo.vehiculos[espacio].toString());
              }else{
                    System.out.println("No se puede realizar esta accion");
              }
                
            break;
            case 4 :
                System.out.println(Vehiculo.toStringVehiculos());        
            break;
            case 5 :
              System.out.println(Vehiculo.cantidadVehiculos());
            break;
            case 6 :
              System.out.println("Espacio que desea ocupar");
              int espacioSensor = Scan.nextInt();
              if(Sensor.sensores[espacioSensor] == null || Sensor.sensores[espacioSensor].getEstado() == 0)
              {
                      System.out.println("Esta libre");
               }else{
                      System.out.println("Esta ocupado");
               }
              
            break;
            case 7 :
             System.out.println(Sensor.sensoresEstado());
            break;
            case 8 :
              System.out.println("ingrese un color");
              System.out.println(Vehiculo.Color(Scan.next()));
            break;
            case 9 :
              System.out.println(Vehiculo.ordenValor());
            break;
            default:
              System.out.println("Comando Incorrecto");
            break;
        }
      }
        
    }   
    
  }

