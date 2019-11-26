package laba3.creatures;

public class Mumintroll extends Character {


    public Mumintroll(String name, int age, Gender smbdGender, Direction dir, int x, int y){
        super(name, age, smbdGender, dir, x, y );
    }
    @Override
    public String toString() {
        return "Mimutrooll[имя = " + this.getName() + ", возраст = " + this.getAge() + ", пол = " + this.getSmbdGender() + ", смотрит на  " + this.getDir() + ", координата x= " + this.getCoordinatex() + ", координата y= " + this.getCoordinatey() + "]";
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
        Mumintroll mumintroll = (Mumintroll) o;
        return this.getCoordinatex() == mumintroll.getCoordinatex() &&
                this.getCoordinatey() == mumintroll.getCoordinatey() &&
                this.getName().equals(mumintroll.getName());
    }
}
