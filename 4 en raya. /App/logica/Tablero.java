package app.logica;
puclic class Tablero{
  private Ficha tableroJuego[][]=new Ficha [3] [3];
  public void llenar (){
    for( int i =0; i<3; i++){
      for(int j=0; j<3; j++){
        tableroJuego[i][j]= new Ficha();
        tableroJuego[i][j].setForma("☺"); 
      }
    }
  }
  public void  ver(){
    for (int i=0; i<3; i++){
      for(int j=0;j<3;j++){
        System.out.print(tableroJuego[i][j].getforma()+" ");
      }
      System.out.println("");
    }
  }
}