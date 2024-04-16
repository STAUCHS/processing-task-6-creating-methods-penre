import processing.core.PApplet;

/**
 * create bullseye and spongebob
 * @param bullX - the x coordinate of the bullseye
 * @param bullY - the x coordinate of the bullseye
 * @param spongeX - the x coordinate of the spongebob
 * @param spongeY - the x coordinate of the spongebob
 * @param size - the size of the image
 * @auther P.Z
 */

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
    //draw first row
    drawBullseye(150,150);
    drawBullseye(400,150);
    drawBullseye(650,150);
    //second row
    drawBullseye(150,400);
    drawBullseye(400,400);
    drawBullseye(650,400);
    //third row
    drawBullseye(150,650);
    drawBullseye(400,650);
    drawBullseye(650,650);
    //draw spongebob first row
    drawSpongebob(240,240); 
    drawSpongebob(490,240);
    //draw spongebob second row
    drawSpongebob(240,470); 
    drawSpongebob(490,470);

    

   
    
}
  private void drawBullseye(float bullX, float bullY){
    //draw the bullseye
    fill(250,0,0);
    ellipse(bullX,bullY,200, 200); 
    fill(255);
    ellipse(bullX, bullY, 150,  150);
    fill(0);
    ellipse(bullX, bullY, 100, 100);
    fill(255);
    ellipse(bullX,bullY, 50,50);
    fill(0);
    ellipse(bullX,bullY, 25,25);
    fill(250,0,0);
    ellipse(bullX,bullY, 10,10);
  
}
  private void drawSpongebob(float spongeX, float spongeY){
    //draw spongebob
    fill(250,250,0);
    rect(spongeX,spongeY,70,90);
    //draw spongebob face
    fill(255);
    ellipse(spongeX + 20,spongeY + 20, 30, 30);
    ellipse(spongeX + 50,spongeY + 20, 30, 30);
    fill(0);
    ellipse(spongeX + 20,spongeY + 20, 10, 10);
    ellipse(spongeX + 50,spongeY + 20, 10, 10);
    //draw spongebob mouth
    line(spongeX + 20,spongeY + 50, spongeX + 40, spongeY + 50);
    //draw spongebob teeth
    fill(255);
    rect(spongeX + 20,spongeY + 50, 10, 10);
    rect(spongeX + 40,spongeY + 50, 10, 10);
    //draw spongebob pants
    fill(165,42,42);
    rect(spongeX, spongeY + 70, 70, 20);

  }
}