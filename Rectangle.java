public class Rectangle {
    public final int left;
    public final int right;
    public final int top;
    public final int bottom;
    
    Rectangle(Point start, Point end){
        this.left=start.x;
        this.right=end.x;
        this.top=start.y;
        this.bottom=end.y;

    }

    public boolean buscar(Point random){
        
        if((random.x>=left) && (random.x<=right) && (random.y>=top) && (random.y<=bottom)){
            return true;
        }
        return false;
    }
    
}
