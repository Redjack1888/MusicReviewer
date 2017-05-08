package com.example.android.musicreviewer;

/**
 * {@link Item} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Item {

    /**
     * String resource ID for the default translation of the word
     */
    private int mSubTitleId;

    /**
     * String resource ID for the Miwok translation of the word
     */
    private int mTitleId;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param subTitleId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param titleId   is the string resource Id for the word in the Miwok language
     *
     */
    public Item(int subTitleId, int titleId) {
        mSubTitleId = subTitleId;
        mTitleId = titleId;

    }

    /**
     * Create a new Word object.
     *
     * @param subTitleId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param titleId   is the string resource Id for the word in the Miwok language
     * @param imageResourceId      is the drawable resource ID for the image associated with the word
     */
    public Item(int subTitleId, int titleId, int imageResourceId) {
        mSubTitleId = subTitleId;
        mTitleId = titleId;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getSubTitleId() {
        return mSubTitleId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}