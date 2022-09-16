package roganov.hogwarts;

public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int lustForPower;

    public Slytherin(String name, int powerTransgress, int spellPower, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerTransgress, spellPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String showStudent() {
        return super.showStudent() + toString();
    }

    @Override
    public String toString() {
        return ", faculty = Slytherin, " +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }
    public String whoBetter(Slytherin student) {
        int sumThisStudent = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int sumStundet2 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;
        if (sumThisStudent > sumStundet2)
            return this.name + " лучший Слизереновец чем " + student.name;
        else
            return student.name + " лучший Слизереновец чем " + this.name;
    }
}
