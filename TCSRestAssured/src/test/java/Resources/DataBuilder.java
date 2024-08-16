package Resources;

import Pojo.Axes;
import Pojo.VehicleDetails;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataBuilder {

    public static VehicleDetails buildVehicleDetails(int axesNumber, int axesDistance, int weight1, int weight2, int totalWeight, int vehicleType, String plateNo, String plateLetters, long date,String Hashcode) {
        VehicleDetails vehicleDetails = new VehicleDetails();

        Axes axes = new Axes();
        axes.setNumber(axesNumber);
        axes.setDistance(axesDistance);
        vehicleDetails.setAxes(axes);

        vehicleDetails.setWeights(Arrays.asList(weight1, weight2));

        vehicleDetails.setTotalWeight(totalWeight);
        vehicleDetails.setVehicleType(vehicleType);

        vehicleDetails.setPlateNo(plateNo);
        vehicleDetails.setPlateLetters(plateLetters);
        vehicleDetails.setDate(date);
        vehicleDetails.setANBR_Image("");
        vehicleDetails.setHashcode(Hashcode);

        return vehicleDetails;
    }

}
