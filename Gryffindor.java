package roganov.hogwarts;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    @Override
    public String showStudent() {
        return super.showStudent() + ", faculty = Gryffindor, " +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery;
    }

    public Gryffindor(String name, int powerTransgress, int spellPower, int nobility, int honour, int bravery) {
        super(name, powerTransgress, spellPower);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public String whoBetter(Gryffindor student) {
        int sumThisStudent = this.bravery + this.honour + this.nobility;
        int sumStundet2 = student.bravery + student.honour + student.nobility;
        if (sumThisStudent > sumStundet2)
            return this.name+" лучший Грифендороевец чем "+student.name;
        else
            return student.name + " лучший Грифендороевец чем "+this.name;
    }
}