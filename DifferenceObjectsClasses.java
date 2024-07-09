public class DifferenceObjectsClasses
{
    // Animal class definition (template)
    // It defines the structure and behabior(attributes and methods) that all Animal objects will have.
    static class Animal
{
    // Instance variables (attributes)
    // These define the properties tht each Animal object will have.
    private String species;
    private String habitat;
    private int lifespan;

    // Constructor to initialize the animal objects
    // Used to create instances (objects) of the Animal class.
    public Animal(String species, String habitat, int lifeSpan)
    {
        this.species = species;
        this.habitat = habitat;
        this.lifespan = lifeSpan;
    }

    // Getter methods to access the instance variables
    // Allows retrieval of the values of the attributes of an Animal object.
    public String getSpecies()
    {
        return species;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public int getLifespan()
    {
        return lifespan;
    }

    // Setter methods to update the instance variables
    // Allows modification of the values of the attributes of an Animal object.
    public void setSpecies(String species)
    {
        this.species = species;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public void setLifespan(int lifespan)
    {
        this.lifespan = lifespan;
    }

    // Method to display the details of an Animal object.
    public void displayAnimal()
    {
        System.out.println("The species " + species + " lives in the " + habitat + " and has an average lifespan of " + lifespan + " years.");
    }
}

public static void main(String[] args)
{
    // Creating objects (instances) of the Animal class
    Animal penguin = new Animal("Penguin", "Arctic", 20);
    Animal africanPenguin = new Animal("African Penguin", "Africa", 10);

    // Display the details of the Animal objects
    penguin.displayAnimal();
    africanPenguin.displayAnimal();

    // Modifies the attributes of the penguin object using the setter methods.
    penguin.setSpecies("Emperor Penguin");
    penguin.setHabitat("Antartica");
    penguin.setLifespan(15);

    // Displays the penguin object showing the attributes have been changed.
    penguin.displayAnimal();
    // Displays the africanPenguin object showing the attributes have stayed the same.
    africanPenguin.displayAnimal();

}
}