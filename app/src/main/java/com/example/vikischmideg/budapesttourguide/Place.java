package com.example.vikischmideg.budapesttourguide;


class Place {

    private final int mPlaceName;
    private final int mDescription;
    private final int mPlaceLocation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Place(int placeName, int description, int imageResourceId, int placeLocation) {
        mPlaceName = placeName;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mPlaceLocation = placeLocation;

    }

    public int getPlaceName() { return mPlaceName; }

    public int getDescription() {
        return mDescription;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public int getPlaceLocation() {return mPlaceLocation;}
}
