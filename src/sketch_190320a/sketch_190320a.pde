void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(1000, 750);
  waldo.resize(1000,750);
  image(waldo, 0, 0);
  doh = minim.loadSample("doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("woohoo.wav");//drag and drop from project onto sketch
}

void draw() {
      // Use this print statement to find out the cordnets of where is waldo,406,207
      println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”
if(mousePressed){
System.out.println("You found Waldo");
  playWoohoo();
}  //mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 

}
void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;