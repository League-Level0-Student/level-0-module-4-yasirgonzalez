void setup(){
  PImage face = loadImage("tommy.jpg");
size(309,463);
face.resize(width, height);
  background(face);
}
void draw(){
  fill(250,250,250);
ellipse(100,110,60,90);

ellipse(210,120,60,90);

fill(0,0,0);
ellipse(mouseX,mouseY,15,20);

ellipse(mouseX,mouseY,15,20);

if(mouseX<70){
  mouseX=70;
}
}