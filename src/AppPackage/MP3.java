/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
/**
 *
 * @author MOHAMED
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author MOHAMED
 */
public class MP3 {
public static void main(String[] args)
    {
    }

/**
 * Wayne, K. (2005). How to Play an MP3 File in Java.
 * Available: http://introcs.cs.princeton.edu/faq/mp3/mp3.html.
 * Last accessed 10th Mar 2011.
 * @author temelm
 */
  private String filename;
  private Player player1;
  private Player player2;

  /**
   * MP3 constructor
   * @param filename name of input file
   */
  public MP3(String filename) {
    this.filename = filename;
  }

  /**
   * Creates a new Player
   */
  public void play() {
    try {
      FileInputStream fis = new FileInputStream(this.filename);
      BufferedInputStream bis = new BufferedInputStream(fis);

      this.player1 = new Player(bis);
      this.player2 = new Player(bis);
    } catch (Exception e) {
        System.err.printf("%s\n", e.getMessage());
    }

    new Thread() {
      @Override
      public void run() {
        try {
          player1.play();
        } catch (Exception e) {
            System.err.printf("%s\n", e.getMessage());
        }
        try {
          player2.play();
        } catch (Exception e) {
            System.err.printf("%s\n", e.getMessage());
        }
      }
    }.start();
  }

  /**
   * Closes the Player
   */
  public void close() {
    if (this.player1 != null) {
      this.player1.close();
    }
     if (this.player2 != null) {
      this.player2.close();
    }
  }

  /////////////////////////

  /**
   * Plays '01 Maenam.mp3' in an infinite loop
   */
  public static void playMaenam() {
    MP3 mp3 = new MP3("C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\JavaApplication3\\src\\javaapplication3\\musique\\clicksound.mp3");
    //MP3 mp = new MP3("C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\JavaApplication3\\src\\javaapplication3\\musique\\Pink Floyd - Marooned.mp3");

    mp3.play();
   // mp.play();
    while (true) {
      if (mp3.player1.isComplete()) {
        mp3.close();
        mp3.play();
      }
//      if (mp3.player1.isComplete()) {
//        mp.close();
//        mp.play();
//      }
    }
      
    }
  }
