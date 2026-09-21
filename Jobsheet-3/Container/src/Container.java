public class Container {
    private String trackingNumber, ownerName;
    private int maximumCapacity, currentCapacity = 0;

    Container(String trackingNumber, String ownerName, int maximumCapacity) {
        this.trackingNumber = trackingNumber;
        this.ownerName = ownerName;
        this.maximumCapacity = maximumCapacity;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getCurrectCapacity() {
        return currentCapacity;
    }

    void addLoad(int load) {
        if(currentCapacity + load < maximumCapacity) {
            currentCapacity += load;
        } else {
            System.out.println("Sorry, capacity is over the container's maximum capacity");
        }
    }

    void unload(int load) {
        if(load > (currentCapacity*0.5)) {
            System.out.println("Sorry, for safety reasons, a single cargo unloading operation cannot exceed 50% of the current load!");
        } else {
            currentCapacity -= load;
        }
    }
}
