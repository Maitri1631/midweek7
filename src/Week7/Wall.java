package Week7;

public class Wall {

    double height;
    double width,area;
    public Wall(double height, double width){
        this.height = height;
        this.width = width;
        if(width<0){
            width = 0;
        } if (height<0){
            height = 0;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
    //If the parameter is lessthan 0 it needs to set the width field value to 0.
    public void setWidth(double width){
        this.width = width;
        if (width<0){
            this.width = 0;
        }
    }

    public void  setHeight(double height){
        this.height = height;
        if(height<0){
            this.height=0;
        }
    }

    public double getArea(){
        return this.height*this.width;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (4, 5);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
