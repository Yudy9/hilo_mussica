import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Hilo extends Thread{
	
    public void run(){
		
		int num_1 = 0;
		int num_2 = 0;
		int respuesta = 0;
  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");    
		num_1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		num_2 = scan.nextInt();
		
		respuesta = num_1 * num_2;
		System.out.println("La multiplicacion es " + num_1 + " * " + num_2 + " = " + respuesta);
    }
	
}