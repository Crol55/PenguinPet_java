
package penguinpet;
import java.io.FileWriter;
import java.io.IOException;


public class Errores {
 
       public void Errores(){
     ExpresionRegular e= new ExpresionRegular();
     Interfaz i = new Interfaz();
    
 
       
    try{
FileWriter fw = new FileWriter("C:\\Users\\carlos\\Documents\\NetBeansProjects\\PenguinPet\\reporte2.html");
            fw.write("<meta http-equiv=\"Content-Type\"  content=\"text/html; charset=UTF-8\" />" + "\n"  + "\n");
            fw.write("<HTML><HEAD><TITLE>Listado de Errores en la terminal</TITLE></HEAD>" + "\n" + "\n");
            fw.write("<HR>" + "\n" + "\n");
            fw.write("<BR><CENTER><TABLE BORDER=1>\n");
            fw.write("	<TR>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>NO.palabra</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>Error</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>No.linea</B></FONT></TD>\n");
           // fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>palabra Reser.</B></FONT></TD>\n");
            fw.write("	</TR>\n");
                    
                    for(int numero=1; numero<e.conta;numero++){
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"RED\">" +e.conta+ "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" +e.vector[numero]+ "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" +i.linea[numero] + "</FONT></TD>\n");
                  
                   // fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "No.columna"  + "</FONT></TD>\n");
                  
                    
                    
                    fw.write("	</TR>\n");
                        }
                    fw.write("</TABLE>" + "\n");
                    fw.flush();
                fw.close();

            }catch(IOException er){
                
                System.out.println(er);
            }
     
   }
    

  }   
  