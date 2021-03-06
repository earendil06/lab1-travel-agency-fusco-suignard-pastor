package manager.data;

import com.mongodb.MongoClient;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import org.json.JSONArray;

import java.util.Iterator;

public class StorageValidated {

    public static void create(TravelRequest travelRequest) {
        MongoCollection travels = getValidatedRequests();
        travels.insert(travelRequest);
    }

    public static JSONArray getRequestByField(String type, String field) {
        MongoCollection pendings = getValidatedRequests();
        MongoCursor<TravelRequest> all =
                pendings.find("{ " + type + " : # }", field).as(TravelRequest.class);

        JSONArray jArray = new JSONArray();
        String uri = "/service-travel-manager/TravelAcceptationService/validatedRequest/uid/";
        for (TravelRequest f : all) {
            jArray.put(uri + f.getUuidRequest());
        }
        return jArray;
    }

    public static JSONArray getRequestByEmail(String owner) {
        return getRequestByField("email", owner);
    }

    public static JSONArray findAll() {
        MongoCollection validated = getValidatedRequests();
        Iterator<TravelRequest> iter = validated.find().as(TravelRequest.class).iterator();
        JSONArray jsonArray = new JSONArray();
        String uri = "/service-travel-manager/TravelAcceptationService/validatedRequest/uid/";
        while (iter.hasNext()) {
            jsonArray.put(uri + iter.next().getUuidRequest());
        }
        return jsonArray;
    }


    private static MongoCollection getValidatedRequests() {
        MongoClient client = new MongoClient(Network.HOST, Network.PORT);
        return new Jongo(client.getDB(Network.DATABASE_VALIDATED)).getCollection(Network.COLLECTION);
    }

    public static void purge() {
        getValidatedRequests().drop();
    }

    public static TravelRequest getRequestByUid(String uid) {
        MongoCollection pendings = getValidatedRequests();
        MongoCursor<TravelRequest> all =
                pendings.find("{ uuidRequest : # }", uid).as(TravelRequest.class);
        if (all == null) return null;
        return all.next();
    }

/*
    static {
        create(new TravelRequest("Adrien", Arrays.asList("ibis", "toto"), Arrays.asList("volvol", "tutu", "trtr")));
        create(new TravelRequest("steven", Arrays.asList("Etienne", "Etienne"), Arrays.asList("Etienne", "Etienne")));
        create(new TravelRequest("gnh", Arrays.asList("ibis", "zfezef"), Arrays.asList("zefzef", "tutu", "zefze")));
    }
*/

}
