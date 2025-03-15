public class Planet {

    private String name;
    private double mass;
    private double volume;
    private double density;
    private double radius;
    private boolean life;
    private double population;
    private boolean gasGiant;
    private double albedo;

    public Planet(String name, double mass, double volume, double density, double radius, boolean life, double population, boolean gasGiant, double albedo) {
        this.name = name;
        this.mass = mass;
        this.volume = volume;
        this.density = density;
        this.radius = radius;
        this.life = life;
        this.population = population;
        this.gasGiant = gasGiant;
        this.albedo = albedo;
    }

    public double calcoloAccelerazione() {
        if (radius <= 0) {
            return 0;
        } else {
            return 0.0000000000667430 * mass / (radius * radius);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public boolean isGasGiant() {
        return gasGiant;
    }

    public void setGasGiant(boolean gasGiant) {
        this.gasGiant = gasGiant;
    }

    public double getAlbedo() {
        return albedo;
    }

    public void setAlbedo(double albedo) {
        this.albedo = albedo;
    }

    @Override
    public String toString() {
        return "*********************************************************************************\n" +
                name + ", m=" + mass + ", V=" + volume + ", d=" + density + ", R=" + radius + ",\n"
                + "Life=" + life + ", Population=" + population + ", Gas Giant=" + gasGiant + ",\n"
                + "Albedo=" + albedo + " %" + ", accelerazione gravitazionale=" + String.format("%.6f", calcoloAccelerazione()) + "\n" +
                "*********************************************************************************\n";
    }
}
