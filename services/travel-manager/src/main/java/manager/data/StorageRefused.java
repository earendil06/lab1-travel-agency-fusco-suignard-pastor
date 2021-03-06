package manager.data;

import com.mongodb.MongoClient;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import org.json.JSONArray;

import java.util.Iterator;

public class StorageRefused {

    public static void create(TravelRequest travelRequest) {
        MongoCollection travels = getRefusedRequests();
        travels.insert(travelRequest);
    }

    public static JSONArray getRequestByField(String type, String field) {
        MongoCollection pendings = getRefusedRequests();
        MongoCursor<TravelRequest> all =
                pendings.find("{ " + type + " : # }", field).as(TravelRequest.class);

        JSONArray jArray = new JSONArray();
        String uri = "/service-travel-manager/TravelAcceptationService/refusedRequest/uid/";
        for (TravelRequest f : all) {
            jArray.put(uri + f.getUuidRequest());
        }
        return jArray;
    }

    public static JSONArray getRequestByEmail(String owner) {
        return getRequestByField("email", owner);
    }

    public static TravelRequest getRequestByUid(String uid) {
        MongoCollection pendings = getRefusedRequests();
        MongoCursor<TravelRequest> all =
                pendings.find("{ uuidRequest : # }", uid).as(TravelRequest.class);
        if (all == null) return null;
        return all.next();
    }

    public static JSONArray findAll() {
        MongoCollection validated = getRefusedRequests();
        Iterator<TravelRequest> iter = validated.find().as(TravelRequest.class).iterator();
        JSONArray jsonArray = new JSONArray();
        String uri = "/service-travel-manager/TravelAcceptationService/refusedRequest/uid/";
        while (iter.hasNext()) {
            jsonArray.put(uri + iter.next().getUuidRequest());
        }
        return jsonArray;
    }

    private static MongoCollection getRefusedRequests() {
        MongoClient client = new MongoClient(Network.HOST, Network.PORT);
        return new Jongo(client.getDB(Network.DATABASE_REFUSED)).getCollection(Network.COLLECTION);
    }

    public static void purge() {
        getRefusedRequests().drop();
    }


/*    static {
        create(new TravelRequest("Adrien", Arrays.asList("Adrien", "Adrien"), Arrays.asList("Adrien", "Adrien", "Adrien")));
    }*/


}
