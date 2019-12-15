package Base;

public abstract class Living {
    protected int weight, protein, nutrient;
    protected int x, y;

    public Living(int weight,int protein,int nutrient){
        this.setWeight(weight);
        this.setProtein(protein);
        this.setNutrient(nutrient);
    }
    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getNutrient() {
        return nutrient;
    }

    public void setNutrient(int nutrient) {
        this.nutrient = nutrient;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
