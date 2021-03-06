package fr.unice.groupe4.flows.utils;

public class Endpoints {

    public static final String HANDLE_A_TRAVEL_SUBMIT = "activemq:handleTravelSubmit";

    public static final String TEST_INPUT = "file:camel/input";

    public static final String MAIL_INPUT = "file:camel/mail";
    public static final String ARCHIVE = "file:camel/archive/";

    public static final String COMPARE_TOTALPRICE_TO_CITY_PRICEDAY = "direct:comparePrice";
    public static final String GET_PRICE_BY_CITY = "direct:getPriceByCity";
    public static final String GENERATE_MAIL_REPORT_REFUND = "file:camel/refund";


    public static final String EXPENSE_TO_REFUND = "activemq:refund-report";
    public static final String EXPENSE_NOT_REFUND = "activemq:not-refund";
    public static final String TRAVEL_REQUEST_INPUT = "file:camel/input";

    public static final String HANDLE_HOTEL_ENDPOINT = "direct:handle-hotel";
    public static final String HANDLE_CAR_ENDPOINT = "direct:handle-car";
    public static final String HANDLE_FLIGHT_ENDPOINT = "direct:handle-flight";

    public static final String COMPARE_HOTEL_ENDPOINT = "activemq:compare-hotel";
    public static final String COMPARE_FLIGHT_ENDPOINT = "activemq:compare-flight";
    public static final String COMPARE_CAR_ENDPOINT = "activemq:compare-car";

    public static final String MIN_TIME_BETWEEN_RETRY = "60000";
    public static final String TIMER_ENDPOINT = "timer://foo?fixedRate=true&period=" + MIN_TIME_BETWEEN_RETRY;
    public static final String RETRY_MESSAGE_QUEUE = "activemq:retry";

    public static final String HOTEL_ENDPOINT = "http:our-hotels:8080/service-hotel-planner/HotelPlannerService";
    public static final String FLIGHT_ENDPOINT = "http:our-flights:8080/tcs-service-doc/flights";
    public static final String OTHER_FLIGHT_ENDPOINT = "http:other-flights:8080/flightreservation-service-document/registry";
    public static final String OTHER_HOTEL_ENDPOINT = "http:other-hotels:8080/tta-car-and-hotel/hotels";
    public static final String OTHER_CAR_ENDPOINT = "http:other-cars:9060/cars";
    public static final String CAR_ENDPOINT = "http:our-cars:8080/service-car-planner/CarPlannerService";
    public static final String TRAVEL_ENDPOINT = "http:travel-manager:8080/service-travel-manager/TravelPlannerService/request";
    public static final String TRAVEL_ENDPOINT2 = "http:travel-manager2:8080/service-travel-manager/TravelPlannerService/request";

    public static final String DEATH_POOL = "activemq:global:dead";
    public static final String BAD_INPUT_QUEUE = "activemq:badinput";

    public static final String RESULT_POOL = "activemq:result";

    public static final String HANDLE_REQUEST = "direct:handleRequest";
    public static final String COMPARE_OUR_FLIGHT = "direct:ourFlight";
    public static final String COMPARE_OTHER_FLIGHT = "direct:otherFlight";
    public static final String COMPARE_OUR_HOTEL = "direct:ourHotel";
    public static final String COMPARE_OTHER_HOTEL = "direct:otherHotel";
    public static final String COMPARE_OUR_CAR = "direct:ourCar";
    public static final String COMPARE_OTHER_CAR = "direct:otherCar";

    public static final String MANAGER1_ENDPOINT = "direct:manager1";
    public static final String MANAGER2_ENDPOINT = "direct:manager2";
    public static final String RETRY_ENDPOINT = "direct:retry";

//    public static final String HOTEL_ENDPOINT = "http:localhost:9090/service-hotel-planner/HotelPlannerService";
//    public static final String FLIGHT_ENDPOINT = "http:localhost:9080/tcs-service-doc/flights";
//    public static final String OTHER_FLIGHT_ENDPOINT = "http:localhost:9180/flightreservation-service-document/registry";
//    public static final String OTHER_HOTEL_ENDPOINT = "http:localhost:9380/tta-car-and-hotel/hotels";
//    public static final String OTHER_CAR_ENDPOINT = "http:localhost:9060/cars";
//    public static final String CAR_ENDPOINT = "http:localhost:9160/service-car-planner/CarPlannerService";
//    public static final String TRAVEL_ENDPOINT = "http:localhost:9070/service-travel-manager/TravelPlannerService/request";
//    public static final String TRAVEL_ENDPOINT2 = "http:localhost:9071/service-travel-manager/TravelPlannerService/request";
}
