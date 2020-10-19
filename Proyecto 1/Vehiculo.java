public class Vehiculo 
{
  public static Vehiculo[] vehiculos;
  public static int cantidad = 0;
  private String color;
  private String placa;
  private String marca;
  private int valorComercial;

  public Vehiculo()
  {
      
  }
  
  public Vehiculo(int cant)
  {
      this.vehiculos = new Vehiculo[cant];
  }
  
  public Vehiculo(String p, String m,String c )
  {
    this.placa=p;
    this.marca=m;
    this.color=c;
    this.valorComercial=30000000;
    cantidad++;
  }
  
  public Vehiculo(String p, String m, String c, int v )
  {
    this.placa=p;
    this.marca=m;
    this.color=c;
    this.valorComercial=v;
    cantidad++;
  }

  public String getPlaca()
  {
    return this.placa;
  }

  public String getMarca()
  {
    return this.marca;
  }

  public String getColor()
  {
    return this.color;
  }
  
  public int getValorComercial()
  {
    return this.valorComercial;
  }

  public void setPlaca(String p)
  {
    this.placa = p;
  }

   public void setMarca(String m)
  {
    this.marca = m;
  }

   public void setColor(String c)
  {
    this.color = c;
  }

   public void setValorComercial(int v)
  {
    this.valorComercial = v;
  }
  
  public String toString()
  {
    String cadena = " ";
    cadena ="\nPlaca: " +placa + "\nMarca: " + marca + "\nColor: " + color + "\nValor Comercial: " + valorComercial+"\n";
    return cadena;
  }
  
  public static String toStringVehiculos()
  { 
    String toSVanswer = "";
    for (int i = 0; i<vehiculos.length; i++)
    {
      if(vehiculos[i] != null)
      {
          toSVanswer += vehiculos[i].toString()+"\n";
      }
    }
    return toSVanswer;
  }
  
  public static int cantidadVehiculos()
  {
    return cantidad;
  }
  public static String Color(String color)
  {
     String elColor="";
     for(int c = 0; c < vehiculos.length;c++)
        {
            if(vehiculos[c] != null)
            {
            if(vehiculos[c].getColor().equalsIgnoreCase(color))
                {
                  elColor += vehiculos[c].toString();
                }
            }
      }  
      return elColor;
  }
  public static String ordenValor()
  {
    String ans = "";
    int contador = 0;
    Vehiculo[] aux = new Vehiculo[cantidad];
    Vehiculo[] temp = new Vehiculo[cantidad];
    for(int i = 0; i<vehiculos.length; i++){
      if(vehiculos[i] != null)
      { 
          //temp[contador] = vehiculos[i];
          aux[contador] = vehiculos[i];
          contador++;
      }   
    }
    for(int i = 1; i < cantidad ; i++)
      {           
       for(int j = 0; j < cantidad -1; j++)
         {
           if(aux[j].getValorComercial() > aux[j+1].getValorComercial()){
            temp[j] = aux[j];
                              
            aux[j] = aux[j+1]; 
                              
            aux[j+1] = temp[j];
                          
           }          
        }
      }
    for(int i = 0; i < cantidad; i++){
          ans = ans + aux[i].toString();
      }
    return ans;
  }
}
