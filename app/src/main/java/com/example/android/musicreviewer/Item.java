package com.example.android.musicreviewer;

/**
 * {@link Item} represents an Item (Label, Genre, Album, Review...) in this structural design case.
 * It contains resource IDs for the default Main Title, Sub Title, and/or
 * optional audio or image file for that Item.
 */
public class Item {

    /**
     * String resource ID for the sub Title (
     */
    private int mSubTitleId;

    /**
     * String resource ID for the Item Main Title
     */
    private int mTitleId;

    /**
     * Image resource ID for the Item if available
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this item
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Item object.
     *
     * @param subTitleId is the string resource ID for the sub title
     * @param titleId   is the string resource Id for the main title
     *
     */
    public Item(int subTitleId, int titleId) {
        mSubTitleId = subTitleId;
        mTitleId = titleId;

    }

    /**
     * Create a new Item object.
     *
     * @param subTitleId is the string resource ID for the sub title
     * @param titleId   is the string resource Id for the main title
     * @param imageResourceId      is the drawable resource ID for the image associated with the item
     */
    public Item(int subTitleId, int titleId, int imageResourceId) {
        mSubTitleId = subTitleId;
        mTitleId = titleId;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the sub title.
     */
    public int getSubTitleId() {
        return mSubTitleId;
    }

    /**
     * Get the string resource ID for the main title.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Return the image resource ID of the item.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Item.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}