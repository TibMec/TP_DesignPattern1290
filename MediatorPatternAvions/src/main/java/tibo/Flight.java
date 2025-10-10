package tibo;

public abstract class Flight implements IPlane {
    private IMediator mediator;
    private String company;
    private String model;
    private String flightNo;
    private String flightPath;
    private String flightRoute;

    public Flight(IMediator mediator, String company, String model, String flightNo, String flightPath, String flightRoute) {
        this.mediator = mediator;
        this.company = company;
        this.model = model;
        this.flightNo = flightNo;
        this.flightPath = flightPath;
        this.flightRoute = flightRoute;
    }

    public Flight() {
    }

    public IMediator getMediator() {
        return mediator;
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightPath() {
        return flightPath;
    }

    public void setFlightPath(String flightPath) {
        this.flightPath = flightPath;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }
}
