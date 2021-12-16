package Ch6.Labs.Phone;
public class Mobile {

    String brand, color;
    int camera;

    public Mobile(String brand, String color, int camera){
        this.brand=brand;
        this.color=color;
        this.camera=camera;
    }

    public int getCamera() {
        return camera;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        String result;
        result = "Brand: " + brand + "\n";
        result += "Color: " + color + "\n";
        result += "Camera: " + camera + "MP";

        return result;
    }
}
