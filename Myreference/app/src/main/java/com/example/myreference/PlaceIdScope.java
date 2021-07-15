package com.example.myreference;
/** The scope of a Place ID returned from the Google Places API Web Service. */
@Deprecated
public enum PlaceIdScope {
    /**
     * Indicates the place ID is recognised by your application only. This is because your application
     * added the place, and the place has not yet passed the moderation process.
     */
    APP,
    /** Indicates the place ID is available to other applications and on Google Maps. */
    GOOGLE
}

