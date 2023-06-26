public class Ring {
    Fighter firstFighter;
    Fighter secondFighter;
    Integer minWeight;
    Integer maxWeight;

    public Ring(Fighter firstFighter, Fighter secondFighter, Integer minWeight, Integer maxWeight) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public Fighter getFirstFighter() {
        return firstFighter;
    }

    public void setFirstFighter(Fighter firstFighter) {
        this.firstFighter = firstFighter;
    }

    public Fighter getSecondFighter() {
        return secondFighter;
    }

    public void setSecondFighter(Fighter secondFighter) {
        this.secondFighter = secondFighter;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (this.getFirstFighter().getHealt() > 0 && this.getSecondFighter().getHealt() > 0) {
                System.out.println("================ YENİ ROUND ================");
                this.getSecondFighter().setHealt(this.getFirstFighter().hit(this.getSecondFighter()));
                if (isWin()){
                    break;
                }
                this.getFirstFighter().setHealt(this.getSecondFighter().hit(this.getFirstFighter()));
                if (isWin()){
                    break;
                }
                printScore();
            }
        }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor!");
        }
    }

    public Boolean checkWeight() {
        return (this.getFirstFighter().getWeight() >= this.getMinWeight() &&
                this.getFirstFighter().getWeight() <= this.getMaxWeight()) &&
               (this.getSecondFighter().getWeight() >= this.getMinWeight() &&
                this.getSecondFighter().getWeight() <= this.getMaxWeight());
    }

    public Boolean isWin() {
        if (this.getFirstFighter().getHealt() == 0) {
            System.out.println("Maçı Kazanan: " + this.getSecondFighter().getName());
            return true;
        } else if (this.getSecondFighter().getHealt() == 0) {
            System.out.println("Maçı Kazanan: " + this.getFirstFighter().getName());
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("-----------------------------------");
        System.out.println(this.getFirstFighter().getName() + " Kalan Can:\t" + this.getFirstFighter().getHealt());
        System.out.println(this.getSecondFighter().getName() + " Kalan Can:\t" + this.getSecondFighter().getHealt());
    }
}
