package roganov.hogwarts;

public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int powerTransgress, int spellPower, int smart, int wise, int witty, int creativity) {
        super(name, powerTransgress, spellPower);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String showStudent() {
        return super.showStudent() + toString();
    }

    @Override
    public String toString() {
        return ", faculty = Ravenclaw, " +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity;
    }

    public String whoBetter(Ravenclaw student) {
        int sumThisStudent = this.smart + this.wise + this.witty + this.creativity;
        int sumStundet2 = student.smart + student.wise + student.witty + student.creativity;
        if (sumThisStudent > sumStundet2)
            return this.name + " лучший Когтеврановец чем " + student.name;
        else
            return student.name + " лучший Когтеврановец чем " + this.name;
    }
}
