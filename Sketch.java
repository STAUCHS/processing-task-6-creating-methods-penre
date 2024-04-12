import processing.core.PApplet;

public class Sketch extends PApplet {
	
   /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(800, 800);
  }
  
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }
  
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {  
    drawHorse(200,200);
   
    
}
private void drawHorse(float horseX, float horseY){
  fill(150,75,0);
  ellipse((horseX),(horseY),(horseX - 600),(horseY - 725)); 
  rect((horseX),(horseY),(horseX),(horseY));
  rect((horseX),(horseY),(horseX),(horseY));
  rect((horseX),(horseY),(horseX),(horseY));
  rect((horseX),(horseY),(horseX),(horseY));
  rect((horseX),(horseY),(horseX),(horseY));
  line((horseX),(horseY),(horseX),(horseY));
  fill(255);
  ellipse((horseX), (horseY), (horseX), (horseY));
  fill(0);
  ellipse((horseX), (horseY), (horseX-20), (horseY-20));
  line((horseX),(horseY),(horseX),(horseY));
  line((horseX),(horseY),(horseX),(horseY));
  line((horseX),(horseY),(horseX),(horseY));
  line((horseX),(horseY),(horseX),(horseY));
  line((horseX),(horseY),(horseX),(horseY));
  
}
}