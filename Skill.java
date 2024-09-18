public abstract class Skill {
    private String name;
    private String type;
    private int skillLevel;

    // Constructor to initialize attributes
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    // Abstract method
    public abstract void identifySkill();
}
