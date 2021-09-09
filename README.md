# School
Christian Attermann
cph-ca299@cphbusiness.dk

// task 2
String a = "Christian";
int age = 22;
String H = "Happy";


//task 2.a
println(a);

// task 2.b
println(age);

// task 2.c
void draw() {
  int x = 1;
  if (x< 2);
  {
    println(H);
  }
}

// task 2.d
void draw() {
  int x = 1;
  if (x<2) {
    println("Hi, my name is");
    println(a);
    println("I am");
    println(age);
    println("years old");
  } else if (x>2) {
    String y =" don't";
    println("I");
    println(y);
    println("clap my hands");
  }
}


//task 3:
color red = #FF0303;
color yellow = #F6FA1E;
color green = #09933F;
color black = #050500;

// task 3.a
void setup() {
  size(200, 400);
}

void draw() {
  fill(black);
  rect(0, 0, 200, 400);
  fill(red);
  ellipse(100, 80, 100, 100);
  fill(yellow);
  ellipse(100, 200, 100, 100);
  fill(green);
  ellipse(100, 320, 100, 100);

  //task 3.b
  // makes the background grey if turned on
  int a = 100;
  if (a>10) {
    fill(125);
    rect(0, 0, 200, 400);

    //task 3.c
    // changes green/red on and of by different presses
    if (mousePressed) {
      fill(255);
      ellipse(100, 80, 100, 100);
    } else {
      fill(red);
      ellipse(100, 80, 100, 100);
    }
    if (keyPressed) {
      fill(255);
      ellipse(100, 320, 100, 100);
    } else {
      fill(green);
      ellipse(100, 320, 100, 100);
    }
  }
}


//task 4
// 4.a
int x = 0;
// task 4.a
for(x=0; x<21; x++)  {
println(x);
}

//task 4.b Even numbers
void draw() {
int n = 21;
for(x =0;x <n; x++)  {
if(x % 2 == 0)  {
  println(x+"");
}
}
}

// task 4.c While loop
  while(x<20)  {
  x=x+1;
  println(x);
}

// missing the value 0

// task five
void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
  
    String output = "i is greater than "+max+".";   
    println(output);
  }
  }

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
    // Print the name of the weekday here: 
   int num =3;
    switch(num)  {
      case 0:
      println("Monday");
      break;
      case 1:
      println("Tuesday");
      break;
      case 2:
      println("Wednesday");
      break;
      case 3:
      println("Thursday");
      break;
      case 4:
      println("Friday");
      break;
      case 5:
      println("Saturday");
      break;
      case 6:
      println("Sunday");
      break;
    }
  }
  else 
  {
    weekend = true;
  // Print if it is weekend here:
    println("Weekend");
  }
}


// task six
int a = 6;
int b = 4;
int x = 16;
int y = 11;
int z = 3;

// 6.a
if(a+b<=10)  {
  println("Success!");
}
else  {
println("Failure!");
}

// 6.b
if(x+y+z<=30)  {
  println("Success!");
}
else  {
  println("Failure!");
}

// task seven
int input = 20;
String a= "six";
String b= "Half!";

for (input = 0; input<21; input++) {
  input = input++;
  if (input==6) {
    println(a);
  }
  if (input==10) {
    println(b);
  }
  println(input);
}


// if input = 6
//println("six");
// if input = 10
// println("HALF!")
// 20+20*-1 ?


