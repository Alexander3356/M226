public class Star {
    private String name;
    private double luminosity;
    private double mass;
    private double volume;
    private double age;

    public Star(String name, double luminosity, double mass, double volume, double age) {
        this.name = name;
        this.luminosity = luminosity;
        this.mass = mass;
        this.volume = volume;
        this.age = age;
    }

    public Star() {
        this.name = "sconosciuto";
        this.luminosity = 0;
        this.mass = 0;
        this.volume = 0;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(long luminosity) {
        this.luminosity = luminosity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public double getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "*********************************************************************************\n" +
                name + ", cd=" + luminosity + ", m=" + mass + ", V=" + volume  + ", Age:" + age + "\n" +
               "*********************************************************************************\n";

    }
}
