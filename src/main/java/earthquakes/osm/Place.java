package earthquakes.osm;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Place {
    private static Logger logger = LoggerFactory.getLogger(Place.class);

    public long place_id;
    public double lat;
    public double lon;

    /**
     * Create a FeatureCollection object from json representation
     * 
     * @param json String of json returned by API endpoint {@code /classes/search}
     * @return a new FeatureCollection object
     * @see <a href=
     *      "https://tools.ietf.org/html/rfc7946">https://tools.ietf.org/html/rfc7946</a>
     */
    
    public static List<Place> listFromJson(String json) {
	    try {
	    	ObjectMapper objectMapper = new ObjectMapper();
	    	List<Place> list = objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, Place.class));
	    	return list;
	    } catch (JsonProcessingException jpe) {
            	logger.error("JsonProcessingException:" + jpe);
            	return null;
            } catch (Exception e) {
            	logger.error("Exception:" + e);
            	return null;
            }
    }

}
