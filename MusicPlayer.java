/////////////////////////////////////////////
////    M U S I C   P L A Y E R          ////
/////////////////////////////////////////////

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class MusicPlayer implements Runnable{

	
	public MusicPlayer()
	{
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		//music
		 try {
	         // Open an audio input stream.
	         URL url = this.getClass().getClassLoader().getResource("unreal.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         //clip.start();
	         clip.loop(300);
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
	}

}
