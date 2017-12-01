/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penguinpet;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author carlos
 */
public class reporte {
     public void reporteExpresion(){
     Interfaz i = new Interfaz();
   
    
 
       
    try{
FileWriter fw = new FileWriter("C:\\Users\\carlos\\Documents\\NetBeansProjects\\PenguinPet\\reporte.html");
            fw.write("<meta http-equiv=\"Content-Type\"  content=\"text/html; charset=UTF-8\" />" + "\n"  + "\n");
            fw.write("<HTML><HEAD><TITLE>Listado de Tokens ingresados en el programa</TITLE></HEAD>" + "\n" + "\n");
            fw.write("<HR>" + "\n" + "\n");
            fw.write("<BR><CENTER><TABLE BORDER=1>\n");
            fw.write("	<TR>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>NO.palabra</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>Token</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>Lexema</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>No.linea</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>palabra Reser.</B></FONT></TD>\n");
           // fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>palabra Reser.</B></FONT></TD>\n");
            fw.write("	</TR>\n");
                    
                    for(int numero=1; numero<i.contadorespecial;numero++){
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"RED\">" +numero+ "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\">" +i.token[numero]+ "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\">" + i.lexema[numero] + "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\">" + i.linea[numero] + "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\">" + i.palabrareservada[numero]  + "</FONT></TD>\n");
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
