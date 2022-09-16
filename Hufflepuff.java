package roganov.hogwarts;

public class Hufflepuff extends Hogwarts{

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerTransgress, int spellPower, int industriousness, int loyalty, int honesty) {
        super(name, powerTransgress, spellPower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String showStudent() {
        return super.showStudent() + ", faculty = Hufflepuff, " +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

    public String whoBetter(Hufflepuff student) {
        int sumThisStudent = this.industriousness + this.loyalty + this.honesty;
        int sumStundet2 = student.industriousness + student.loyalty + student.honesty;
        if (sumThisStudent > sumStundet2)
            return this.name+" лучший Пуфендуец чем "+student.name;
        else
            return student.name + " лучший Пуфендуец чем "+this.name;
    }
}
