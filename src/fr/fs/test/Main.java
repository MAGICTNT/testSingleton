package fr.fs.test;

public class Main {

    public static void main(String args[])
    {
        // Instantiation Singleton class avec variable x
    	Singlton x = Singlton.getInstance();
  
        // Instantiation Singleton class avec variable y
    	Singlton y = Singlton.getInstance();
  
        // Instantiation Singleton class avec variable z
    	Singlton z = Singlton.getInstance();
  
        // récupération des variables pour montré leur code

        System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());
  
        if (x == y && y == z) {
  
            System.out.println(
                "3 object qui point la meme methode");
        }
  
        else {
            // Print statement
            System.out.println(
                "3 objet qui ne point pas le meme code mémoire ");
        }
    }
}