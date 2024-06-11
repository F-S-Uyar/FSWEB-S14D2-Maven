package org.example.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;

    public void createBedroom() {
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();
    }

    public Bedroom(Wall wall1, Wall wall2,
                   Wall wall3, Wall wall4,
                   Carpet carpet, Ceiling ceiling,
                   Lamp lamp, String name, Bed bed, Wardrobe wardrobe) {
        super(wall1, wall2, wall3, carpet, ceiling, wall4, lamp);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", room=" + super.toString() +
                '}';
    }
}
