package laba3.creatures;

import laba3.environment.Space;
import laba3.environment.Light;

public class Rat extends Character {
//
    public Rat(String name, int age, Gender smbdGender, Color col, TypeOfSkin type, int x, int y, Direction dir){
        //
        super(name, age, smbdGender, col, type, x , y, dir);
        //
    }
    @Override
    public String toString() {
        return "Rat [имя = " + this.getName() + ", возраст = " + this.getAge() + ", пол = " + this.getSmbdGender() + ", смотрит на  " + this.getDir()+ ", цвет = "+ this.getCol() + ", координата x= " + this.getCoordinatex() + ", координата y= " + this.getCoordinatey() + "]";
    }
    @Override
    public int hashCode(){
        int result = 5;
        result = this.getName().hashCode() * 10 + result;
        return result;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Rat rat = (Rat) o;
        return this.getCoordinatex() == rat.getCoordinatex() &&
                this.getCoordinatey() == rat.getCoordinatey() &&
                this.getName().equals(rat.getName());
    }
    public final void gooo (Space place){
        this.setCoordinatex(place.getCoordinatex());
        this.setCoordinatey(place.getCoordinatey());
        System.out.println(this.getName() + " движется и шаркает");
    }

    public final void watchEvil (Character... smbd){
        for (Character i: smbd) {
            System.out.println(this.getName() + " злобно посмотрела на " + i.getName());
        }
    }

    public final void blink (Light ray) {
        if (ray.getCoordinatex1() <= this.getCoordinatex() && this.getCoordinatex() <= ray.getCoordinatex2() && ray.getCoordinatey1() <= this.getCoordinatey() && this.getCoordinatey() <= ray.getCoordinatey2()) {
            System.out.println(this.getName() + " моргает от " + ray.getName());
        }
    }

        public final void shake ()
        {
            System.out.println(this.getName() + " трясет усами");
        }

}