# Shape-Drawer
An assignment for my technical writing class at Jacksonville State University. October 2018
## What Does it Do?
This program randomly generates 30 random shapes(rectnagles, circles, and triangles) and stores them in ArrayList<Shapes>. It then draws each object on a Jframe and tags each shape with it's area. 
## Getting Started
These instructions will allow you to download the program and get it up and running on your machine. After that, you will be able to test and edit the code to fit your needs. 
## Prerequisites 
For this program to work, you must select the right form of [JAVA SE](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for your operating system. 
## Installing 
1. Download the program to the location that you wish for the it to reside. 
2. Test whether the program works.
   * Click on the project folder.
   * Go into the dist folder.
   * Run the Lab_5D.jar and a frame should open with 30 random shapes (either rectangles, circles, or triangles) with their volumes tagged to them. 
## How to Manipulate the Code
  The program randomly generates 30 shapes randomly. If you want to change the number of shapes it generates, go to line 31 and change the value that i must be less than, in order for the program to iterate. 
  ```
  for (int i = 0; i < 30; ++i) {
  ```
  In order to have the program create specific shapes, comment out lines 36 through 74. Sample code is provided that generates a circle, square and triangle. Simply remove the comment annotations at the beggining and end of lines 25 and 27. 
 ```
 shapes.add(new Rectangle(100, 100, 0, 100, 100));
 shapes.add(new Circle(400, 100, 1, 50));
 shapes.add(new Triangle(250, 350, 2, 100, 100));
  ```
 The parameters used in the initialization of each object are as follows. For every shape its starts with the coordinates (x, y, z). Following the coordinates are initializers that are specific to the shaoe you are creating. For the Tirangle, the coordinates are followed by base and height. For the Circle, the coordinates are followed by the radius. Finally, for the Rectangle, the coordinates are followed by the length and width initializers.   
 ## Developed Using 
  This program was developed using [NetBeans 8.2](https://netbeans.org/downloads/).  
## Author
  This program was created by Nicholas Morrison
