/*
Assignment 4

Goal:

Write a volume calculator program for various geometric shapes. 
You must use a function for each shape calculation as well as for printing the “menu”. 
The program should give the user a choice of calculating volume for each of the following shapes:

1) Cube
- Inputs: 1 Side Length
-Volume: side_length**3

2) Rectangular Prism
- Inputs: 3 Side Lenghts
- Volume: Side1 * Side2 * Side3

3) Cylinder
- Inputs: 1 Base Radius and Length of Height
- Volume: Radius**2 * pi * height

4) Pyramid
- Inputs: 1 Base Width, 1 Base Length, 1 Height
- Volume: (1/3) * base * width * height

5) Cone
- Inputs:  1 Base Radius, 1 Height Legth
- Volume: (1/3) * radius**2 * pi * height

6) Sphere
- Inputs: 1 Center Radius
- Volume: (4/3) * radius**3 * pi

<Some exit hotkey like ‘q’ or ‘0’>


HINT: Ideally, you’ll have the following functions: 1. cube_volume( ) 2. rectangular_prism_volume( ) 3. cylinder_volume( ) 4. pyramid_volume( ) 5. cone_volume( ) 6. sphere_volume( ) and 7.  print_menu( )

HINT2: You can use a while(True) loops to keep printing the main menu and asking for user input

HINT3: You can ask for custom input in each function as well as print the area in each. Use the main while loop to just see which function to refer to.


 */
package assignment4;

    import java.util.Scanner;

public class Assignment4 {

    
    public static void main(String[] args) {
        System.out.println("Welcome to my Geometric Shape Calculator!\n");
        int x = 1;
       while (x >= 1){
        System.out.println("\nPlease select a shape:\n\n1) Cube\n2) Rectangle Prism"
               + "\n3) Cylinder\n4) Pyramid\n5) Cone\n6) Sphere\n\nEnter your selection now:");
       Scanner scan = new Scanner (System.in);
       String shape;
       shape = scan.nextLine();
              //System.out.println(shape);  a test to make sure it is working proper
           //  testing the volume
           //  pyramid_volume();
           //cone_volume();
           //sphere_volume();
           switch (shape) {
               case "1":
               case "1)":
               case "1.":
                   // if you don't put the (1) in the cube_volume it wont run.
                   // I first tried cube_volume();
                   System.out.println("\nYou selected Cube!\n");
                   cube_volume(1);
                   //cube_volume was done as a float funtion so requires the println
                   break;
               case "2":
               case "2)":
               case "2.":
                   // not done as static void so require the println
                   System.out.println("\nYou selected Rectangular Prisim!\n");
                   System.out.println(rectangular_prism_volume()+ " Meters cubed");
                   break;
               case "3":
               case "3)":
               case "3.":
                   System.out.println("\nYou selected Cylinder!\n");
                   cylinder_volume();
                   break;
               case "4":
               case "4)":
               case "4.":
                   System.out.println("\nYou selected Pyramid!\n");
                    pyramid_volume();
                    break;
               case "5":
               case "5)":
               case "5.":
                   System.out.println("\nYou selected Cone!\n");
                    cone_volume();
                    break;
               case "6":
               case "6)":
               case "6.":
                    System.out.println("\nYou selected Sphere!\n");
                    sphere_volume();
                    break;
               case "q":
               case "Q":
                   x=0;
                   
               default:
                   System.out.println("Invalid response. Please try again!\n");
                   break;
           }
           }
    }
    
    
    public static void cube_volume(float side_length){
        System.out.println("Please enter your side length in Meters?");
        Scanner input = new Scanner(System.in);
        side_length = input.nextInt();  
       
        System.out.println(Math.pow(side_length,3) + " Meters cubed");
    }
    
    public static float rectangular_prism_volume(){
        System.out.println("Enter the lenght of side #1:");
        
        Scanner input = new Scanner (System.in);
        float side_lengtha = input.nextFloat();
        
        System.out.println("Enter the lenght of side #2:");
        float side_length2 = input.nextFloat();
        
        System.out.println("Enter the lenght of side #3:");
        float side_length3 = input.nextFloat();
               
        return (side_lengtha * side_length2 * side_length3);
    }
    
    public static void cylinder_volume(){
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter the Radius in Meters");        
        float radius = input.nextFloat();
        
        System.out.println("Please enter the Height in Meters");
        float height = input.nextFloat();
        
        System.out.println((Math.pow(radius,2)) * Math.PI * height + " Meters cubed");
    }
    
    public static void pyramid_volume(){
        Scanner p = new Scanner (System.in);
        
        System.out.println("Enter the Width in Meters:");
        float width = p.nextFloat();
        System.out.println("Please enter the Length in Meters:");
        float length = p.nextFloat();
        
        System.out.println("Please enter the Height in meters:");
        float height = p.nextFloat();
        // if you don't do 1/3 you just get the result of zero, can be fixed by fixed by changing void to a float!
        System.out.println((width * length * height * 1/3 ) + " Meters cubed");
}
    
    public static void cone_volume(){
        Scanner cone = new Scanner (System.in);
        
        System.out.println("Please enter the radius in Meters:");
        float radius = cone.nextFloat();
        
        System.out.println("Please enter the Height in Meters:");
        float height = cone.nextFloat();
        
        System.out.println(Math.pow(radius, 2) * Math.PI * height * (1.0/3.0) + " Meters cubed");
    }
    
    public static void sphere_volume(){
        Scanner sphere = new Scanner (System.in);
        
        System.out.println("Please enter your radius in Meters");
        float radius = sphere.nextFloat();
        
        System.out.println((Math.pow(radius, 3)) * Math.PI * (4.0/3.0) + " Meters cubed");
    }
    
}
