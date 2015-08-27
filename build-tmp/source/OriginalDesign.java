import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

PImage pikachu;
PImage charizard;
PImage squirtle;
int numPic = ((int)(Math.random()*4));
public void setup()
{
size(500, 500);
pikachu = loadImage("http://img2.wikia.nocookie.net/__cb20140214155630/adventuretimewithfinnandjake/images/thumb/a/a7/Pikachu-5948-1920x1080.jpg/640px-Pikachu-5948-1920x1080.jpg");
charizard = loadImage("http://vignette2.wikia.nocookie.net/p__/images/9/95/Charizard.png/revision/latest?cb=20140203022724&path-prefix=protagonist");
squirtle = loadImage("http://img4.wikia.nocookie.net/__cb20140916184418/pokemon/images/1/15/007Squirtle_XY_anime.png");
background(0,0,0);
}
public void draw()
{	
	if(mousePressed == true)
	{	
		
		if(numPic==3)
			{
			background(255);
			imageMode(CENTER);
			image(pikachu,250,250,500,500);
			}
		if(numPic==2)
			{
			background(255);
			imageMode(CENTER);
			image(charizard,250,250,500,500);
			}
		else
			{
			background(255);
			imageMode(CENTER);
			image(squirtle,250,250,500,500);
			}
		


		
	}
	else
	{	
		background(0);
		outsidePokeball();
		insidePokeball();
	}
}
public void outsidePokeball()
{	stroke(0,0,0);
	strokeWeight(3);
	fill(255,0,0);
	arc(250, 250, 200, 200, PI, TWO_PI);
	fill(255,255,255);
	arc(250,250,200,200, 0,PI);
}
public void insidePokeball()
{
	fill(255,255,255);
	stroke(0,0,0);
	strokeWeight(3);
	ellipse(250, 250, 70, 70);
	ellipse(250, 250, 40, 40);
	fill(0,0,0);
	line(150, 249, 215, 250);
	line(285, 250, 350, 250);
}
public void mousePressed()
{
	numPic = ((int)(Math.random()*4));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
