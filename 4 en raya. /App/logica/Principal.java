package app;
import app.logica.*;
public class Principal{

private Tablero juego= new Tablero();
public static void main (String args []){
  Principal inicio=new Principal();
  inicio.juego.llenar();
  inicio.juego.ver();
}
}