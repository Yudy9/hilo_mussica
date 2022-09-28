import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import javax.sound.sampled.*;
import java.applet.AudioClip;


public class HiloMusic extends Thread{
	
    public void run(){
		
		Scanner sca = new Scanner(System.in);
		
		AudioClip Sound;
		Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Cancion.wav"));
		Sound.play();
		
    }
}
