/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object providing additional metadata describing color attributes.
 */
public class ColorInfo {
    /**
     * Possible dominant foreground color.
     */
    @JsonProperty(value = "dominantColorForeground")
    private String dominantColorForeground;

    /**
     * Possible dominant background color.
     */
    @JsonProperty(value = "dominantColorBackground")
    private String dominantColorBackground;

    /**
     * An array of possible dominant colors.
     */
    @JsonProperty(value = "dominantColors")
    private List<String> dominantColors;

    /**
     * Possible accent color.
     */
    @JsonProperty(value = "accentColor")
    private String accentColor;

    /**
     * A value indicating if the image is black and white.
     */
    @JsonProperty(value = "isBWImg")
    private Boolean isBWImg;

    /**
     * Get the dominantColorForeground value.
     *
     * @return the dominantColorForeground value
     */
    public String dominantColorForeground() {
        return this.dominantColorForeground;
    }

    /**
     * Set the dominantColorForeground value.
     *
     * @param dominantColorForeground the dominantColorForeground value to set
     * @return the ColorInfo object itself.
     */
    public ColorInfo withDominantColorForeground(String dominantColorForeground) {
        this.dominantColorForeground = dominantColorForeground;
        return this;
    }

    /**
     * Get the dominantColorBackground value.
     *
     * @return the dominantColorBackground value
     */
    public String dominantColorBackground() {
        return this.dominantColorBackground;
    }

    /**
     * Set the dominantColorBackground value.
     *
     * @param dominantColorBackground the dominantColorBackground value to set
     * @return the ColorInfo object itself.
     */
    public ColorInfo withDominantColorBackground(String dominantColorBackground) {
        this.dominantColorBackground = dominantColorBackground;
        return this;
    }

    /**
     * Get the dominantColors value.
     *
     * @return the dominantColors value
     */
    public List<String> dominantColors() {
        return this.dominantColors;
    }

    /**
     * Set the dominantColors value.
     *
     * @param dominantColors the dominantColors value to set
     * @return the ColorInfo object itself.
     */
    public ColorInfo withDominantColors(List<String> dominantColors) {
        this.dominantColors = dominantColors;
        return this;
    }

    /**
     * Get the accentColor value.
     *
     * @return the accentColor value
     */
    public String accentColor() {
        return this.accentColor;
    }

    /**
     * Set the accentColor value.
     *
     * @param accentColor the accentColor value to set
     * @return the ColorInfo object itself.
     */
    public ColorInfo withAccentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    /**
     * Get the isBWImg value.
     *
     * @return the isBWImg value
     */
    public Boolean isBWImg() {
        return this.isBWImg;
    }

    /**
     * Set the isBWImg value.
     *
     * @param isBWImg the isBWImg value to set
     * @return the ColorInfo object itself.
     */
    public ColorInfo withIsBWImg(Boolean isBWImg) {
        this.isBWImg = isBWImg;
        return this;
    }

}
