package Base;

public abstract class Herbivore extends Animal{

    public Herbivore(int weight,int protein,int nutrient,int fat,int baseSpeed){
        super(weight,protein,nutrient,fat,baseSpeed);
    }

    public void eat(Living living) {
        if (!(living instanceof Animal)) {
            this.setNutrient(this.getNutrient() + (living.getNutrient() / 2));
            this.setWeight(this.getWeight() + (living.getWeight() / 4));
            this.setProtein(this.getProtein() + (living.getProtein() / 2));
        }
    }

    public void move(int dirX, int dirY) {
        if (dirX < 0)
            dirX = -1;
        else if (dirX > 0)
            dirX = 1;
        if (dirY < 0)
            dirY = -1;
        else if (dirY > 0)
            dirY = 1;
        this.x = this.x + dirX * this.getBaseSpeed();
        this.y = this.y + dirY * this.getBaseSpeed();
    }

}
