package laba3.creatures;

import laba3.environment.ISpace;
import laba3.environment.Space;

public abstract class Character implements ISpace, ILiving {

    public enum Gender {MALE, FEMALE};
    public enum Direction {NORTH, SOUTH, EAST, WEST};
    public enum Color {GREY, YELLOW, RED, BLACK, WHITE, GREEN, BROWN};
    public enum TypeOfSkin {SHRIVELED, SMOOTH};

    private Gender smbdGender;
    private TypeOfSkin type;
    private Color col;
    private String name;
    private int age;
    private Direction dir;
    private int coordinatex;
    private int coordinatey;
//
    public Character(String name, int age, Gender smbdGender, Color col, TypeOfSkin type, int x, int y, Direction dir )
    //
    {
        this.name = name;
        this.age = age;
        this.smbdGender = smbdGender;
        this.col = col;
        this.type = type;
        this.coordinatex = x;
        this.coordinatey = y;
        //
        this.dir = dir;
        //
    }

    public Character(String name, int age, Gender smbdGender, Direction dir, int x, int y )
    {
        this.name = name;
        this.age = age;
        this.smbdGender = smbdGender;
        this.dir = dir;
        this.coordinatex = x;
        this.coordinatey = y;
    }

    public void setDir (Direction dir) {
        this.dir = dir;
        System.out.println("Персонаж " + this.getName() + " обернулся");
    }
    public int getAge() {
        return age;
    }
    public Gender getSmbdGender() {
        return smbdGender;
    }
    public Direction getDir(){
        return dir;
    }
    public String getName() {

        return name;
    }

    public final void watch (Character object2) {
        if (object2.dir==Direction.EAST && this.dir==Direction.WEST || object2.dir == Direction.WEST && this.dir == Direction.EAST || object2.dir == Direction.NORTH && this.dir == Direction.SOUTH || object2.dir == Direction.SOUTH && this.dir == Direction.NORTH) {
            System.out.println("Персонаж " + this.getName() + " посмотрел на персонажа " + object2.getName());
        }
        else {
            if (object2.dir == Direction.EAST) { this.setDir(Direction.WEST); this.watch(object2); }
            if (object2.dir == Direction.WEST) { this.setDir(Direction.EAST); this.watch(object2); }
            if (object2.dir == Direction.NORTH) { this.setDir(Direction.SOUTH); this.watch(object2); }
            if (object2.dir == Direction.SOUTH) { this.setDir(Direction.NORTH); this.watch(object2); }
        }
    }

    public final void go (Space centerOfRoom) {
        if (this.coordinatex == centerOfRoom.getCoordinatex()) {
            this.coordinatex = centerOfRoom.getCoordinatex();
            this.coordinatey = centerOfRoom.getCoordinatey();
            System.out.println(this.getName() + " движется вдоль стены");
        } else {
            this.coordinatex = centerOfRoom.getCoordinatex();
            this.coordinatey = centerOfRoom.getCoordinatey();
            System.out.println(this.getName() + " отделилась от стены");
        }
    }
    public Color getCol(){
        return col;
    }

    @Override
    public void setCoordinatex(int coordinatex) {
        this.coordinatex = coordinatex;
    }

    @Override
    public void setCoordinatey(int coordinatey) {
        this.coordinatey = coordinatey;
    }

    @Override
    public int getCoordinatex() {
        return coordinatex;
    }

    @Override
    public int getCoordinatey() {
        return coordinatey;
    }
}
