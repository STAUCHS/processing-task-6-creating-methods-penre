import processing.core.PApplet;

public class Sketch extends PApplet {
	
   /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(500, 500);
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
   
    
  //ear
  fill(150,75,0);
  triangle((float)(width*0.45),(float)(height*0.7),(float)(width*0.475),(float)(height*0.6),(float)(width*0.5),(float)(height*0.7));
  
  
  
  
  // Horse head
  fill(150,75,0);
  ellipse((float)(width*0.4),(float)(height*0.7),(float)(width*0.2),(float)(height*0.075)); 
     
  
  
  // horse body
  fill(150,75,0);
  rect((float)(width*0.47),(float)(height*0.73),(float)(width*0.4),(float)(height*0.075)); 
  
  // horse legs
  
  rect((float)(width*0.47),(float)(height*0.8),(float)(width*0.06),(float)(height*0.1));
  rect((float)(width*0.57),(float)(height*0.8),(float)(width*0.06),(float)(height*0.1));
  rect((float)(width*0.73),(float)(height*0.8),(float)(width*0.06),(float)(height*0.1));
  rect((float)(width*0.811),(float)(height*0.8),(float)(width*0.06),(float)(height*0.1));
  
  
  
  //grass
  fill(0,255,0);
  rect((float)(width*0),(float)(height*0.9),(float)(width*1),(float)(height*0.1));
  
  //eyes
  fill(255);
  ellipse((float)(width*0.45), (float)(height*0.68), (float)(width*0.03), (float)(height*0.02));
  fill(0);
  ellipse((float)(width*0.45), (float)(height*0.68), (float)(width*0.01), (float)(height*0.01));
  
  //mouth
  line((float)(width*0.3),(float)(height*0.7),(float)(width*0.35),(float)(height*0.7));
  
  //tail
  line((float)(width*0.87),(float)(height*0.77),(float)(width*0.9),(float)(height*0.82));
  line((float)(width*0.87),(float)(height*0.77),(float)(width*0.9),(float)(height*0.83));
  line((float)(width*0.87),(float)(height*0.77),(float)(width*0.9),(float)(height*0.84));
  line((float)(width*0.87),(float)(height*0.77),(float)(width*0.9),(float)(height*0.85));
  line((float)(width*0.87),(float)(height*0.77),(float)(width*0.9),(float)(height*0.86));
  
  //sun
  fill(255,255,0);
  ellipse((float)(width*0.075),(float)(height*0.075),(float)(width*0.2),(float)(height*0.2));

  }
 // private void ellipse(int ellipseX, int ellipseY){
    //for(int i = ellipseX; i >= ellipseY; i++ ){
      
   // }
  //}
}