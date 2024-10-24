package entity;

public class FunctionalFood extends Product{
    private String mainNutrients;
    private String supplementaryIngredients;

    public FunctionalFood() {
    }

    public FunctionalFood(String mainNutrients, String supplementaryIngredients) {
        setMainNutrients(mainNutrients);
        setSupplementaryIngredients(supplementaryIngredients);
    }

    public String getMainNutrients() {
        return mainNutrients;
    }

    public void setMainNutrients(String mainNutrients) {
        if(mainNutrients == null || mainNutrients.trim().isEmpty()){
            throw new IllegalArgumentException("Dưỡng chất chính không được rỗng");
        }
        this.mainNutrients = mainNutrients;
    }

    public String getSupplementaryIngredients() {
        return supplementaryIngredients;
    }

    public void setSupplementaryIngredients(String supplementaryIngredients) {
        this.supplementaryIngredients = supplementaryIngredients;
    }

    @Override
    public String toString() {
        return "FunctionalFood{" +
                "mainNutrients='" + mainNutrients + '\'' +
                ", supplementaryIngredients='" + supplementaryIngredients + '\'' +
                "} " + super.toString();
    }
}
