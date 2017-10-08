package carplanner.planner.service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-10-08T17:11:36.926+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "CarPlannerService",
                  wsdlLocation = "file:/home/afusco/IdeaProjects/lab1-travel-agency-fusco-suignard-balde-pastor/tests/acceptation/src/main/resources/CarPlannerService.wsdl",
                  targetNamespace = "http://service.planner/") 
public class CarPlannerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.planner/", "CarPlannerService");
    public final static QName CarPlannerPort = new QName("http://service.planner/", "CarPlannerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/afusco/IdeaProjects/lab1-travel-agency-fusco-suignard-balde-pastor/tests/acceptation/src/main/resources/CarPlannerService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CarPlannerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/afusco/IdeaProjects/lab1-travel-agency-fusco-suignard-balde-pastor/tests/acceptation/src/main/resources/CarPlannerService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CarPlannerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CarPlannerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CarPlannerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CarPlannerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CarPlannerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CarPlannerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CarPlanner
     */
    @WebEndpoint(name = "CarPlannerPort")
    public CarPlanner getCarPlannerPort() {
        return super.getPort(CarPlannerPort, CarPlanner.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CarPlanner
     */
    @WebEndpoint(name = "CarPlannerPort")
    public CarPlanner getCarPlannerPort(WebServiceFeature... features) {
        return super.getPort(CarPlannerPort, CarPlanner.class, features);
    }

}