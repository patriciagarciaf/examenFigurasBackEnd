import java.util.ArrayList;
import java.util.List;

public class Lienzo{ 

    List<Figura> listaFiguras=new ArrayList<Figura>();
    Figura figura;


    public void addFigura(Figura figura, Rectangle rectangle){ 
        figura.setRectangle(rectangle);
        listaFiguras.add(figura);
        figura.draw();
        figura.setColor("negro");
        figura.setBackGroundColor("blanco");
        System.out.println("Soy un "+figura.getNombre()+" con borde "+figura.getBackGroundColor()+" y fondo "+figura.getColor());
    }

    public void show(){
        System.out.println("\n En el lienzo hay:");
        for(int i=0; i<listaFiguras.size(); i++){  
            System.out.println(listaFiguras.get(i).getNombre()+" con borde "+listaFiguras.get(i).getColor()+" y fondo "+listaFiguras.get(i).getBackGroundColor());
        }
    }

    public String getSelected(Point randomPoint){
        for(int i=0; i<listaFiguras.size(); i++){  

            if(listaFiguras.get(i).getRectangle().buscar(randomPoint)==true){
                System.out.println("Aquí está la figura "+listaFiguras.get(i).getNombre());
                break;
            }
        }
        return "Aquí no hay ninguna figura";
        
    }

    public static void main(String[] args) {

        Lienzo lienzo= new Lienzo();

        Figura corazon= Build.build("CORAZON");
        Figura estrella=Build.build("ESTRELLA");
        Figura rayo=Build.build("RAYO");
        lienzo.addFigura(corazon, new Rectangle(new Point(3,1), new Point(9,6)));
        corazon.setBackGroundColor("rojo");

        lienzo.addFigura(rayo, new Rectangle(new Point(-2, -9), new Point(1,0)));
        rayo.setBackGroundColor("amarillo");

        lienzo.addFigura(estrella, new Rectangle(new Point(1,2), new Point(5,7)));
        estrella.setColor("amarillo");
        

        
        Point random= new Point(5,1);
        lienzo.getSelected(random);

        lienzo.show();

    }
}

