package Base;

public abstract class Carnivore extends Animal {

    public Carnivore(int weight,int protein,int nutrient,int fat,int baseSpeed){
        super(weight,protein,nutrient,fat,baseSpeed);
    }

    public void eat(Living living) {
        if (living instanceof Animal) {
            this.setNutrient(this.getNutrient() + living.getNutrient());
            this.setWeight(this.getWeight() + (living.getWeight() / 10));
            this.setWeight(this.getFat() + (((Animal) living).getFat() / 10));
            this.setProtein(this.getProtein() + living.getProtein());
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
        this.x = this.x + ( 2 * dirX * this.getBaseSpeed() );
        this.y = this.y + ( 2 * dirY * this.getBaseSpeed() );
    }
}
