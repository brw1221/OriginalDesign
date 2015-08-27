PImage pikachu;
	
void setup()
{
size(500, 500);
pikachu = loadImage("http://img2.wikia.nocookie.net/__cb20140214155630/adventuretimewithfinnandjake/images/thumb/a/a7/Pikachu-5948-1920x1080.jpg/640px-Pikachu-5948-1920x1080.jpg");
background(0,0,0);
}
void draw()
{	
	if(mousePressed == true)
	{	
		background(255);
		imageMode(CENTER);
		image(pikachu,250,250,500,500);
		
	}
	else
	{	
		background(0);
		outsidePokeball();
		insidePokeball();
	}
}
void outsidePokeball()
{	stroke(0,0,0);
	strokeWeight(3);
	fill(255,0,0);
	arc(250, 250, 200, 200, PI, TWO_PI);
	fill(255,255,255);
	arc(250,250,200,200, 0,PI);
}
void insidePokeball()
{
	fill(255,255,255);
	stroke(0,0,0);
	strokeWeight(3);
	ellipse(250, 250, 70, 70);
	ellipse(250, 250, 40, 40);
	fill(0,0,0);
	line(150, 250, 215, 250);
	line(285, 250, 350, 250);
}
