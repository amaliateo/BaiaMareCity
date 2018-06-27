package com.example.iulia.baiamarecity;

public class Tourist {
    private int mHotelImage;
    private int mHotelName;
    private int mHotelDescription;
    private int mHotelLink;

    public Tourist(int HotelImage, int HotelName, int HotelDescription, int HotelLink) {
        mHotelImage = HotelImage;
        mHotelName = HotelName;
        mHotelDescription = HotelDescription;
        mHotelLink = HotelLink;
    }

    public int getHotelImage() {
        return mHotelImage;
    }

    public int getHotelName() {
        return mHotelName;
    }

    public int getHotelDescription() {
        return mHotelDescription;
    }

    public int getHotelLink() {
        return mHotelLink;
    }
}
