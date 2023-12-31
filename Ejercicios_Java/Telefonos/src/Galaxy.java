public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Desbloqueando mediante patron";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.getVersion() +  " from " + this.getCarrier());
    }
}

