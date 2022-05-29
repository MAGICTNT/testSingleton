package fr.fs.test;

public class Singlton {
    // variable Static reference de single_instance
    // of type Singleton
    private static Singlton single_instance = null;
  
    // Declation de la  variable de type String
    public String s;
  
    // Constructor
    // Ici nous créons un constructeur privée 
    // avec une restriction a sa propre class
    private Singlton()
    {
        s = "Hello I am a string part of Singleton class";
    }
  
    // Methode static
    // Methode static pour créé une instance de la class singlton
    public static Singlton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singlton();
  
        return single_instance;
    }
}