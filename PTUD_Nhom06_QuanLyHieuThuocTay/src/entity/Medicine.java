package entity;

public class Medicine extends Product {
    private String activeIngredient;
    private String conversionUnit;

    private AdministrationRoute administrationRoute;

    public Medicine() {
    }

    public Medicine(String activeIngredient, String conversionUnit, AdministrationRoute administrationRoute) {
        setActiveIngredient(activeIngredient);
        setConversionUnit(conversionUnit);
        this.administrationRoute = administrationRoute;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        if (activeIngredient == null || activeIngredient.trim().isEmpty()) {
            throw new IllegalArgumentException("Hoạt chất không được rỗng");
        }
        this.activeIngredient = activeIngredient;
    }

    public String getConversionUnit() {
        return conversionUnit;
    }

    public void setConversionUnit(String conversionUnit) {
        if (conversionUnit == null || conversionUnit.trim().isEmpty()) {
            throw new IllegalArgumentException("Đơn vị quy đổi không được rỗng");
        }
        this.conversionUnit = conversionUnit;
    }

    public AdministrationRoute getAdministrationRoute() {
        return administrationRoute;
    }

    public void setAdministrationRoute(AdministrationRoute administrationRoute) {
        this.administrationRoute = administrationRoute;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "activeIngredient='" + activeIngredient + '\'' +
                ", conversionUnit='" + conversionUnit + '\'' +
                ", administrationRoute=" + administrationRoute +
                "} " + super.toString();
    }
}
