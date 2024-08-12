public class CircusPerformer {
    private String name;
    private String act;
    private int experience;

    public CircusPerformer(String name, String act, int experience) {
        this.name = name;
        this.act = act;
        try {
            if (experience < 0 || experience > 50) {
                throw new InvalidExperienceException("Experience should be between 0 and 50 years");
            }
            this.experience = experience;
        } catch (InvalidExperienceException e) {
            System.out.println("Error: " + e.getMessage());
            this.experience = 0; // Значення за замовчуванням у разі помилки
        }
    }
    @RunImmediately(times =3)
    public void getInfo(){
        System.out.println("Name:"+name+", act: "+act +", experience:"+experience);
    }
}
