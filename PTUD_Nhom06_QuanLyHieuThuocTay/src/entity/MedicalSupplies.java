package entity;

public class MedicalSupplies extends Product{
    private String medicalSupplyType;

    public MedicalSupplies() {
    }

    public MedicalSupplies(String medicalSupplyType) {
        setMedicalSupplyType(medicalSupplyType);
    }

    public String getMedicalSupplyType() {
        return medicalSupplyType;
    }

    public void setMedicalSupplyType(String medicalSupplyType) {
        if(medicalSupplyType == null || medicalSupplyType.trim().isEmpty()){
            throw new IllegalArgumentException("Loại vật tư y tế không được rỗng");
        }
        this.medicalSupplyType = medicalSupplyType;
    }

    @Override
    public String toString() {
        return "MedicalSupplies{" +
                "medicalSupplyType='" + medicalSupplyType + '\'' +
                "} " + super.toString();
    }
}
