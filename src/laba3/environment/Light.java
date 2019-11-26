package laba3.environment;

public class Light {

    private int brigtness;
    private String name;
    private int coordinatex1;
    private int coordinatex2;
    private int coordinatey1;
    private int coordinatey2;
    public Light(String name, int bright, int x1, int x2, int y1, int y2) {
        this.name = name;
        this.brigtness = bright;
        this.coordinatex1 = x1;
        this.coordinatex2 = x2;
        this.coordinatey1 = y1;
        this.coordinatey2 = y2;
    }
    public String toString() {

        return "Light[имя = " + this.getName() + ", яркость = " + this.getBrigtness() + ", координата x1 = " + this.getCoordinatex1() + ", координата x2 = " + this.getCoordinatex2() + ", координата y1 = " + this.getCoordinatey1() + ", координата y2 = " + this.getCoordinatey2() + "]";
    }
    public int getBrigtness(){
        return brigtness;
    }
    public String getName() {
        return name;
    }

    public void setCoordinatex1(int coordinatex1) {
        this.coordinatex1 = coordinatex1;
    }

    public void setCoordinatex2(int coordinatex2) {
        this.coordinatex2 = coordinatex2;
    }

    public void setCoordinatey1(int coordinatey1) {
        this.coordinatey1 = coordinatey1;
    }

    public void setCoordinatey2(int coordinatey2) {
        this.coordinatey2 = coordinatey2;
    }

    public int getCoordinatex1() {
        return coordinatex1;
    }

    public int getCoordinatex2() {

        return coordinatex2;
    }

    public int getCoordinatey1() {

        return coordinatey1;
    }

    public int getCoordinatey2() {

        return coordinatey2;
    }
    @Override
    public int hashCode(){
        int result = 5;
        result = this.getName().hashCode() * 10 + result;
        return result;
    }
}

