package Base;

public abstract class Animal extends Living {
    private int baseSpeed;
    private int fat;

    public Animal(int weight,int protein,int nutrient,int fat,int baseSpeed){
        super(weight,protein,nutrient);
        this.setFat(fat);
        this.setBaseSpeed(baseSpeed);
    }

    public abstract void move(int dirX,int dirY);
    public abstract void eat(Living living);

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }
}
