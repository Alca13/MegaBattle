package Aplicacion;

public class Juego extends Personaje {
     //llama a la clase personaje para que se ejecute en Juego 
     
     //crea un cosntructor para manda acomodar el sistema del juego por medio de los strings que estan en Personaje
     
     public Personaje CrearPersonaje(String nom, String pod1, String pod2, String pod3) {
          //llama a personaje para darle atributos a recibir
          Personaje p = new Personaje();
          p.setNombre(nom);
          p.setPoder1(pod1);
          p.setPoder2(pod2);
          p.setPoder3(pod3);
          return p;
     }

}
