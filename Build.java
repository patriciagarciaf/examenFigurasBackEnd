public class Build{
    
    public static Figura build(String figura){
        if(figura==enumFiguras.RAYO.name()){
            return new Rayo();
        }
        else if(figura==enumFiguras.CORAZON.name()){
            return new Corazon();
        }
        else if(figura==enumFiguras.ESTRELLA.name()){
            return new Estrella();
        }
        return null;
    }
}
