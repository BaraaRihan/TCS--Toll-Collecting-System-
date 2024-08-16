package Pojo;


import java.util.List;

public class VehicleDetails {
    private Axes axes;
    private List<Integer> weights;
    private String hashcode;
    private int totalWeight;
    private int vehicleType;
    private String plateNo;
    private String plateLetters;
    private long date;
    private String ANBR_Image;


    // Getters and setters
    public Axes getAxes() {
        return axes;
    }

    public void setAxes(Axes axes) {
        this.axes = axes;
    }

    public List<Integer> getWeights() {
        return weights;
    }

    public void setWeights(List<Integer> weights) {
        this.weights = weights;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getPlateLetters() {
        return plateLetters;
    }

    public void setPlateLetters(String plateLetters) {
        this.plateLetters = plateLetters;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getANBR_Image() {
        return ANBR_Image;
    }

    public void setANBR_Image(String ANBR_Image) {
        this.ANBR_Image = ANBR_Image;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }
}

