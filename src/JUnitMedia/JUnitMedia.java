package JUnitMedia;

import java.util.Scanner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


import java.awt.Image;
import java.util.Scanner;
import javax.sound.sampled.TargetDataLine;
import javax.swing.text.html.ImageView;
import java.io.*;
import sun.audio.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;

public class JUnitMedia {
	
@Rule 
public TestName name = new TestName();

@Before
    public void init() {
//The common part that each case will need to do, like launching a browser, loading iheart.com..
        
    }

   
@Test
public void testHomeWork1() throws Exception
{   
System.out.println("test method:" +  name.getMethodName() );
//assertEquals(name.getMethodName(), "testHomeWork1 ");
//assertEquals(1, 2);  this will fail
assertEquals(1, 1);
//assertTrue();
//assertFalse();
//assertThat(actual, is(equalTo(expected)));
//if (music is not playing) 
// fail("HW needs more debugging!");
}

@Test
public void testHomeWork2() throws Exception
{   
System.out.println("test method:" +  name.getMethodName() );
//assertEquals(name.getMethodName(), "testHomeWork1 ");
assertEquals(1, 1);
//assertTrue();
//assertFalse();
//assertThat(actual, is(equalTo(expected)));
//if (music is not playing) 
// fail("HW needs more debugging!");
}


@Test
public void Lesson1() throws Exception
{
		Scanner scanner = new Scanner(System.in);
		
		// String input;
		
		System.out.print("Hey, who the hack are you? \n");
		
		
		// First way
		// input = scanner.nextLine();
		
		// if(input.equals("I am AJ")) {
				//	System.out.print("Well, hello, AJ!");
				//} else if(input.equals("AJ")) {
				//	System.out.print("Well, hello, ");
				//	System.out.print (input);
				//	System.out.print ("!");
				//} else {
				//	System.out.print("Doesn't work");
				//}
				
		// Second way	
		// String input1 = scanner.next();
		// String input2 = scanner.next();
		// String input3 = scanner.next();
			
		// if (input3.equals("AJ")) {
			// System.out.print("Well, hello, ");
			// System.out.print(input3);
			// System.out.print("!");
		//} else if(input1.equals("AJ")) {
		//	System.out.print("Well, hello, ");
		//	System.out.print(input1);
		//	System.out.print("!");
		//} else {
			//	System.out.print("Doesn't work");
		//	}

		
		String input = scanner.nextLine();
		
		// while(!scanner.next().isEmpty()) {
			
		String[] pieces = input.split("\\s+");
		// Parse the pieces
		String piece1 = pieces[0];
		String piece2 = pieces[1];
		String piece3 = pieces[2];
		
		if (piece3.equals("AJ")) {
			System.out.print("Well, hello, ");
			System.out.print(piece3);
			System.out.print("!");
		} else if(piece1.equals("AJ")) {
			System.out.print("Well, hello, ");
			System.out.print(piece1);
			System.out.print("!");
		} else {
			System.out.print("Doesn't work");
		}
		
		// }

}


//@Test
//public void Lesson2() throws Exception
//{
//	String bip = "Nicki_Minaj_Anaconda.mp3";
//	Media hit = new Media(bip);
//	MediaPlayer mediaPlayer = new MediaPlayer(hit);
//	mediaPlayer.play();
//}

//@Test
//public void Lesson3() throws Exception
//{
// def mediaSource = "Nicki_Minaj_Anaconda.mp3";

// def player = MediaPlayer {
//    media:Media{
//        source:mediaSource
//    }
// }

// player.play();
//}


@Test
public void Lesson3() throws Exception 
{

//String MEDIA_URL = "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";
	
//primaryStage.setTitle("Embedded Media Player");
//Group root = new Group();
//Scene scene = new Scene(root, 540, 241);

// create media player
//Media media = new Media (MEDIA_URL);
//MediaPlayer mediaPlayer = new MediaPlayer(media);
//mediaPlayer.setAutoPlay(true);
//MediaControl mediaControl = new MediaControl(mediaPlayer);
//scene.setRoot(mediaControl);

//primaryStage.setScene(scene);
//primaryStage.show();

	/**
	 * A simple Java sound file example (i.e., Java code to play a sound file).
	 * AudioStream and AudioPlayer code comes from a javaworld.com example.
	 * @author alvin alexander, devdaily.com.
	 */
	
	    // open the sound file as a Java input stream
	    String gongFile = "/Users/al/DevDaily/Projects/MeditationApp/resources/gong.au";
	    InputStream in = new FileInputStream(gongFile);
	 
	    // create an audiostream from the inputstream
	    // AudioInputStream audioStream = new AudioInputStream(in);
	    
	    // create an audiostream from the inputstream
	    AudioInputStream audioStream = new 
	    AudioInputStream((TargetDataLine) in);
	 
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream);
	 
	}
	

@Test
public void Lesson4() throws Exception 
{
		try
		{
		// get the sound file as a resource out of my jar file;
		// the sound file must be in the same directory as this class file.
		// the input stream portion of this recipe comes from a javaworld.com article.
		InputStream inputStream = getClass().getResourceAsStream("Nicki_Minaj_Anaconda.mp3");
		AudioStream audioStream = new AudioStream(inputStream);
		AudioPlayer.player.start(audioStream);
		}
		catch (Exception e)
		{
		// a special way i'm handling logging in this application
		if (debugFileWriter!=null) e.printStackTrace(debugFileWriter);
		}
}
  
  
  
@After
    public void tearDown() throws Exception{
    //closeBrowser;
//other cleanups
    }
}
