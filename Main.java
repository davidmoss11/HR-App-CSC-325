public class Main {
    public static void main(String[] args) {
        HardSkill programming = new HardSkill("Programming", 6);
        SoftSkill communication = new SoftSkill("Communication", 8);
        GiftSkill mercy = new GiftSkill("Mercy", 7);
        TalentSkill organization = new TalentSkill("Organization", 9);

        programming.identifySkill();
        communication.identifySkill();
        mercy.identifySkill();
        organization.identifySkill();
    }
}
