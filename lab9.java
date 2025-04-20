import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String fileName; 
      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      
      fileName = scnr.nextLine();
      
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream); 
      
      while (inFS.hasNextLine()) {
         String photoName = inFS.nextLine();
         String infoName = photoName.replace("_photo.jpg", "_info.txt");
         System.out.println(infoName);
      }
      
      fileByteStream.close();
   }
}
