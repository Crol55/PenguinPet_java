
package penguinpet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

public class ExpresionRegular {
  
   static int contador;
   public static String vector[]=new String[100];
    public static int vector2[]=new int[100];
   static boolean x,xx;
   public static boolean aceptacion2,inicial=true;
   public double resultado;
   public String variable3[];
   public String qt;
   public static String rt;
   Interfaz inicio= new Interfaz();
   public String [] y;
   public int expresion=0;
double resultadofinal[]= new double[10];
String cambio[];
public static int conta=1;
Interfaz i= new Interfaz();
 public int reconocimiento(String cadena){
      
       
         String frase;  
         
     // while(true){
             // System.out.println("ingrese cadena ");
              frase= cadena;
     
            y=frase.split(" ");
            contador=y.length;
          
            //System.out.println("el tamano de y esta en :"+contador); 
        if((contador>2)||(contador==0)){

           System.out.println("Error de Sintaxis");
        }else if(contador==1){
              // System.out.println("entre aqui lo que hay en la cadena 0 es :"+y[0]);
               Pattern patron5= Pattern.compile("DarAmor");
               Matcher coincidencia5= patron5.matcher(y[0]);
               Pattern patron6 = Pattern.compile("(SerPapa|SerSuperPinguin|SerGoku|SerMaestroRushi|SerBatman)");
               Matcher coincidencia6= patron6.matcher(frase);
               Pattern patron11=Pattern.compile("\\[kill-p\\]");
               Matcher coincidencia11=patron11.matcher(frase);
               x=coincidencia5.find();
              
               
               boolean xy=coincidencia6.find();
               boolean xyz=coincidencia11.find();
            if(x==true){
              
                System.out.println("accepto cadena amor   ");
                expresion=1;
                
            }else if(xy==true){
                System.out.println("Se acepto la cadena de Ser alguien");
                expresion=2;
                
               
            }else if(xyz==true){
                System.out.println("se puede asesinar al pinguino");
                expresion=11;
            }else{
                expresion=20;
                System.out.println("Error");
                vector[conta]=cadena;
                vector2[conta]=i.conteo;
                conta++;
          }
                 
        }else{
      
            
            
            Pattern patron= Pattern.compile("DarComida?");
            Pattern patron2=Pattern.compile("(Donas|Filete|Hamburguesa|Pizza)");
            Pattern patron3= Pattern.compile("DarLatigo");
            Pattern patron4=Pattern.compile("(Duro|Suave)");
            Pattern patron7=Pattern.compile("Hacer(Suma|Resta|Div|Prod)");
            Pattern patron8=Pattern.compile("[0-9]+.?[0-9]*,[0-9]+.?[0-9]*");
            Pattern patron9=Pattern.compile("(HacerConcat|HacerConcatInv)");
            Pattern patron10=Pattern.compile("\\([a-zA-Z]+[,][a-zA-Z]+\\)");
            Matcher coincidencia9=patron9.matcher(y[0]);
            Matcher coincidencia10=patron10.matcher(y[1]);
            Matcher coincidencia8=patron8.matcher(y[1]);
            Matcher coincidencia7=patron7.matcher(y[0]);
            Matcher concidencia= patron.matcher(y[0]);            
            Matcher coincidencia2=patron2.matcher(y[1]);
            Matcher coincidencia3=patron3.matcher(y[0]);
            Matcher coincidencia4=patron4.matcher(y[1]);
            
            
              boolean si=concidencia.find();
              boolean aceptacion2=coincidencia2.find();
             
             //  System.out.println("la segunda cadena verificada es "+aceptacion2);
              if((si==true)&&(aceptacion2==true) ){
                  System.out.println("Acepto dar comida ");
                  expresion=3;
                  
            }else if((coincidencia3.find()==true)&&(coincidencia4.find()==true)){
                  System.out.println("La cadena dar latigo suave o duro fue aceptada ");
                  expresion=4;
            }else if((coincidencia7.find()==true)&&(coincidencia8.find()==true)){
                 cambio=y[1].split(",");
                  for (int i = 0; i < cambio.length; i++) {
                     resultadofinal[i]=Double.parseDouble(cambio[i]);
                      System.out.println(resultadofinal[i]);
                  } if(cambio.length>2){
                    expresion=20;
                    System.out.println("Error en la cadena");  
                  }else{
                    switch(y[0]){
                        case "HacerSuma":{
                          resultado=resultadofinal[0]+resultadofinal[1];
                            System.out.println("El resultado de Hacer Suma es : "+resultado);
                            expresion=5;
                        }break;
                        case "HacerResta":{
                            resultado=resultadofinal[0]-resultadofinal[1];
                         System.out.println("El resultado de Hacer Resta es: "+resultado);
                           expresion=6;
                        }break;
                        case "HacerProd":{
                          resultado=resultadofinal[0]*resultadofinal[1];
                            System.out.println("El resultado de Hacer Producto es: "+resultado);
                            expresion=7;
                        }break;
                        case "HacerDiv":{
                            if(resultadofinal[1]==0){
                                System.out.println("No se puede dividir entre 0");
                            }else{
                            resultado=resultadofinal[0]/resultadofinal[1];
                            System.out.println("El resultado de Hacer Division es: "+resultado);
                            expresion=8;}
                        }break;
                    }
                  }
                 
            }else if((coincidencia9.find()==true)&&(coincidencia10.find()==true)){
                String variable =y[1].replace("(","");
                String variable2=variable.replace(")","");
                 variable3=variable2.split(",");
                 switch(y[0]){
                     case "HacerConcat":{
                   //  System.out.println("El Resultado de la Concatenacion es :"+variable3[0]+" "+variable3[1]);
                     qt=variable3[0]+" "+variable3[1]; 
                         System.out.println("la cadena es "+qt);
                     expresion=9;
                     }break;
                     case "HacerConcatInv":{
                         String aux;
                        
                         aux=variable3[1];
                         variable3[1]=variable3[0];
                         variable3[0]=aux;
                   rt=variable3[0]+""+variable3[1];
                 //  System.out.println("la cadena es sapbeee "+rt);
                          expresion=10;
                     }break;
                 }
                  //System.out.println("El Resultado de la Concatenacion es :"+variable3[0]+" "+variable3[1]);
            }
                   else{
                       expresion=21;
                vector[conta]=cadena;
                vector2[conta]=i.conteo;
                conta++;  
            }
                
           }
            //inicial=true;
      //  }
    return expresion;
    
    }
 
 
    // public static void main(String args[]){
    //   ExpresionRegular e= new ExpresionRegular();
    //   e.reconocimiento("HacerConcatInv (hola,mundo)");
       //e.reconocimiento("HacerConcatInv (DeByron,pusa))");
   //  }
}
