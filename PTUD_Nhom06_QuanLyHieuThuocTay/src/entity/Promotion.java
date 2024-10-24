package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Promotion extends PromotionType {
    private String promotionID;
    private String promotionName;
    private LocalDate startDate;
    private LocalDate endDate;

    private PromotionType promotionType;

    public Promotion() {
    }

    public Promotion(String promotionID) {
        setPromotionID(promotionID);
    }

    public Promotion(String promotionID, String promotionName, LocalDate startDate, LocalDate endDate, PromotionType promotionType) {
        setPromotionID(promotionID);
        setPromotionName(promotionName);
        setStartDate(startDate);
        setEndDate(endDate);
        this.promotionType = promotionType;
    }

    public String getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(String promotionID) {
        if (promotionID == null || promotionID.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã khuyến mãi không được rỗng");
        }
        this.promotionID = promotionID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        if (promotionName == null || promotionName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên khuyến mãi không được rỗng");
        }
        this.promotionName = promotionName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    //TODO: Điều kiện của ngày này là gì nek, bổ sung sau nha.
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    //TODO: Điều kiện của ngày này là gì nek, bổ sung sau nha.
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Promotion other = (Promotion) obj;
        return Objects.equals(this.promotionID, other.promotionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), promotionID);
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotionID='" + promotionID + '\'' +
                ", promotionName='" + promotionName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", promotionType=" + promotionType +
                '}';
    }
}
