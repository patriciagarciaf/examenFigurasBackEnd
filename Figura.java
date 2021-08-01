public abstract class Figura implements Pinta, Dibuja, IRectangle{

    private String color;
    private String backGroundColor;
    private Rectangle rectangle; //cada figura debe tener asociado un rectangle


    public String getNombre(){
        return this.getClass().getName();
    }

    public Rectangle getRectangle() {
        return this.rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public String getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(String backGroundColor) {
        this.backGroundColor = backGroundColor;
        System.out.println("La figura "+ this.getNombre() + " ha cambiado su fondo a color "+getBackGroundColor());
    }

    public void setColor(String color) {
        this.color=color;
        System.out.println("La figura "+ this.getNombre() + " ha cambiado su borde a color "+getColor());
    }

    public String getColor() {
        return color;
    }
    
}