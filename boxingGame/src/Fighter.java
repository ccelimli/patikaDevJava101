public class Fighter {
    String name;
    Integer damage;
    Integer healt;
    Integer weight;
    Double dodge;

    public Fighter(String name, Integer damage, Integer healt, Integer weight, Double dodge) {
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.weight = weight;
        this.dodge = dodge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealt() {
        return healt;
    }

    public void setHealt(Integer healt) {
        this.healt = healt;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getDodge() {
        return dodge;
    }

    public void setDodge(Double dodge) {
        this.dodge = dodge;
    }

    public Integer hit(Fighter fighter){
        System.out.println("-----------------------------");
        System.out.println(this.getName()+" => "+ fighter.getName()+" "+this.getDamage()+" hasar vurdu.");

        if (fighter.dodge()){
            System.out.println(fighter.getName()+" gelen hasarı savurdu.");
            return fighter.getHealt();
        }

        if (fighter.getHealt()-this.getDamage()<0){
            return 0;
        }

        return fighter.getHealt() - this.getDamage();
    }

    public Boolean dodge(){
        Double randomValue=Math.random()*100;
        return randomValue <=this.getDodge();
    }
}
