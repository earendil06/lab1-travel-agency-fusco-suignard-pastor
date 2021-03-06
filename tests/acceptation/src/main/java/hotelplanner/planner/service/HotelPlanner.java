package hotelplanner.planner.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-10-08T17:36:11.565+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://service.planner/", name = "HotelPlanner")
@XmlSeeAlso({ObjectFactory.class})
public interface HotelPlanner {

    @WebMethod
    @RequestWrapper(localName = "getHotelsForTravel", targetNamespace = "http://service.planner/", className = "planner.service.GetHotelsForTravel")
    @ResponseWrapper(localName = "getHotelsForTravelResponse", targetNamespace = "http://service.planner/", className = "planner.service.GetHotelsForTravelResponse")
    @WebResult(name = "hotel_planner_result", targetNamespace = "")
    public java.lang.String getHotelsForTravel(
        @WebParam(name = "place", targetNamespace = "")
        java.lang.String place,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "year", targetNamespace = "")
        int year
    );

    @WebMethod
    @RequestWrapper(localName = "getHotels", targetNamespace = "http://service.planner/", className = "planner.service.GetHotels")
    @ResponseWrapper(localName = "getHotelsResponse", targetNamespace = "http://service.planner/", className = "planner.service.GetHotelsResponse")
    @WebResult(name = "all_hotels_result", targetNamespace = "")
    public java.lang.String getHotels();
}
