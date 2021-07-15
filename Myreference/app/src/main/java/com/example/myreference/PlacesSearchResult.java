package com.example.myreference;

import android.provider.ContactsContract;

import java.io.Serializable;
import java.net.URL;
import java.util.Arrays;


/**
 * A single result in the search results returned from the Google Places API Web Service.
 *
 * <p>Please see <a
 * href="https://developers.google.com/places/web-service/search#PlaceSearchResults">Place Search
 * Results</a> for more detail.
 */
public class PlacesSearchResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The human-readable address of this place. */
    public String formattedAddress;

    /**
     * Geometry information about the result, generally including the location (geocode) of the place
     * and (optionally) the viewport identifying its general area of coverage.
     */
    public Geometry geometry;

    /**
     * The human-readable name for the returned result. For establishment results, this is usually the
     * business name.
     */
    public String name;

    /**
     * The URL of a recommended icon which may be displayed to the user when indicating this result.
     */
    public URL icon;

    /** A textual identifier that uniquely identifies a place. */
    public String placeId;

    /** The scope of the placeId. */
    @Deprecated public PlaceIdScope scope;

    /** The place's rating, from 1.0 to 5.0, based on aggregated user reviews. */
    public float rating;

    /** Feature types describing the given result. */
    public String types[];

    /** Information on when the place is open. */
    public OpeningHours openingHours;

    /** Photo objects associated with this place, each containing a reference to an image. */
    public ContactsContract.CommonDataKinds.Photo photos[];

    /** A feature name of a nearby location. */
    public String vicinity;

    /** Indicates that the place has permanently shut down. */
    public boolean permanentlyClosed;

    /** The number of user reviews for this place */
    public int userRatingsTotal;

    /** The status of the business (i.e. operational, temporarily closed, etc.). */
    public String businessStatus;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[PlacesSearchResult: ");
        sb.append("\"").append(name).append("\"");
        sb.append(", \"").append(formattedAddress).append("\"");
        sb.append(", geometry=").append(geometry);
        sb.append(", placeId=").append(placeId);
        if (vicinity != null) {
            sb.append(", vicinity=").append(vicinity);
        }
        if (types != null && types.length > 0) {
            sb.append(", types=").append(Arrays.toString(types));
        }
        sb.append(", rating=").append(rating);
        if (icon != null) {
            sb.append(", icon");
        }
        if (openingHours != null) {
            sb.append(", openingHours");
        }
        if (photos != null && photos.length > 0) {
            sb.append(", ").append(photos.length).append(" photos");
        }
        if (permanentlyClosed) {
            sb.append(", permanentlyClosed");
        }
        if (userRatingsTotal > 0) {
            sb.append(", userRatingsTotal=").append(userRatingsTotal);
        }
        if (businessStatus != null) {
            sb.append(", businessStatus=").append(businessStatus);
        }
        sb.append("]");
        return sb.toString();
    }
}


