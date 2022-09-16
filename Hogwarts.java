package roganov.hogwarts;

public class Hogwarts {
    String name;
    private int powerTransgress;
    private int spellPower;

    public Hogwarts(String name, int powerTransgress, int spellPower) {
        this.name = name;
        this.powerTransgress = powerTransgress;
        this.spellPower = spellPower;
    }


    public String showStudent() {
        return  "name='" + name + '\'' +
                ", powerTransgress=" + powerTransgress +
                ", spellPower=" + spellPower;
    }

    public String whoBetter(Hogwarts student) {
        int sumThisStudent = this.powerTransgress + this.spellPower;
        int sumStundet2 = student.powerTransgress + student.spellPower;
        if (sumThisStudent > sumStundet2)
            return this.name+" обладает бОльшей мощностью магии, чем "+student.name;
        else
            return student.name + " обладает бОльшей мощностью магии, чем "+this.name;
    }
}
