package tibo;

public class ControlTower implements IMediator {
    private IPlane boeing = new Boeing747();
    private IPlane airbus = new AirbusA320();

    @Override
    public void landing() {
        this.communicate();
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void communicate(IPlane plane1, IPlane plane2) {

    }
}
