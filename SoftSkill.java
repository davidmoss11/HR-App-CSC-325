public class SoftSkill extends Skill {
    public SoftSkill(String name, int skillLevel) {
        super(name, "Soft", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Soft Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}
