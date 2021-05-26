// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Image scaling mode. */
@Fluent
public final class ImageScale {
    /*
     * Describes the image scaling mode to be applied. Default mode is 'pad'.
     */
    @JsonProperty(value = "mode")
    private ImageScaleMode mode;

    /*
     * The desired output image width.
     */
    @JsonProperty(value = "width")
    private String width;

    /*
     * The desired output image height.
     */
    @JsonProperty(value = "height")
    private String height;

    /**
     * Get the mode property: Describes the image scaling mode to be applied. Default mode is 'pad'.
     *
     * @return the mode value.
     */
    public ImageScaleMode getMode() {
        return this.mode;
    }

    /**
     * Set the mode property: Describes the image scaling mode to be applied. Default mode is 'pad'.
     *
     * @param mode the mode value to set.
     * @return the ImageScale object itself.
     */
    public ImageScale setMode(ImageScaleMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the width property: The desired output image width.
     *
     * @return the width value.
     */
    public String getWidth() {
        return this.width;
    }

    /**
     * Set the width property: The desired output image width.
     *
     * @param width the width value to set.
     * @return the ImageScale object itself.
     */
    public ImageScale setWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height property: The desired output image height.
     *
     * @return the height value.
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * Set the height property: The desired output image height.
     *
     * @param height the height value to set.
     * @return the ImageScale object itself.
     */
    public ImageScale setHeight(String height) {
        this.height = height;
        return this;
    }
}
