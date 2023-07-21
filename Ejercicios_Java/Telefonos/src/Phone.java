public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract void displayInfo();

    public void setVersion(String versionNumber) {
        this.versionNumber = versionNumber;
    }
    public String getVersion(){
        return versionNumber;
    }
    public void setBattery(Integer batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }
    public Integer getBattery(){
        return batteryPercentage;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public String getCarrier(){
        return carrier;
    }
    public void setRingTone(String ringTone){
        this.ringTone = ringTone;
    }
    public String getRingTone(){
        return ringTone;
    }
}

