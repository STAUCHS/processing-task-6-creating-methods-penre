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
    drawBullseye(200,200);
    drawBullseye(400,200);
    drawBullseye(600,200);
    

   
    
}
private void drawBullseye(float horseX, float horseY){
  fill(250,0,0);
  ellipse(horseX,horseY,200, 200); 
  fill(255);
  ellipse(horseX, horseY, 150,  150);
  fill(0);
  ellipse(horseX, horseY, 100, 100);
  fill(255);
  ellipse(horseX,horseY, 50,50);
  
}
}