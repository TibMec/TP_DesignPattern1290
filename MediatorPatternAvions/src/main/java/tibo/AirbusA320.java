package tibo;

public class AirbusA320 extends Flight implements IPlane{


    @Override
    public void landing() {
        getMediator().landing();
    }

    @Override
    public void takeOff() {
        getMediator().takeOff();
    }
}
