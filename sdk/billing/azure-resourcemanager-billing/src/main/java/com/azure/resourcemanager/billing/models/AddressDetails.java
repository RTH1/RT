// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Address details. */
@Fluent
public final class AddressDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddressDetails.class);

    /*
     * First name.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /*
     * Middle name.
     */
    @JsonProperty(value = "middleName")
    private String middleName;

    /*
     * Last name.
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /*
     * Company name.
     */
    @JsonProperty(value = "companyName")
    private String companyName;

    /*
     * Address line 1.
     */
    @JsonProperty(value = "addressLine1", required = true)
    private String addressLine1;

    /*
     * Address line 2.
     */
    @JsonProperty(value = "addressLine2")
    private String addressLine2;

    /*
     * Address line 3.
     */
    @JsonProperty(value = "addressLine3")
    private String addressLine3;

    /*
     * Address city.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * Address district.
     */
    @JsonProperty(value = "district")
    private String district;

    /*
     * Address region.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * Country code uses ISO2, 2-digit format.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /*
     * Postal code.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * Email address.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * Phone number.
     */
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    /**
     * Get the firstName property: First name.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     *
     * @param firstName the firstName value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the middleName property: Middle name.
     *
     * @return the middleName value.
     */
    public String middleName() {
        return this.middleName;
    }

    /**
     * Set the middleName property: Middle name.
     *
     * @param middleName the middleName value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     *
     * @param lastName the lastName value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the companyName property: Company name.
     *
     * @return the companyName value.
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set the companyName property: Company name.
     *
     * @param companyName the companyName value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get the addressLine1 property: Address line 1.
     *
     * @return the addressLine1 value.
     */
    public String addressLine1() {
        return this.addressLine1;
    }

    /**
     * Set the addressLine1 property: Address line 1.
     *
     * @param addressLine1 the addressLine1 value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get the addressLine2 property: Address line 2.
     *
     * @return the addressLine2 value.
     */
    public String addressLine2() {
        return this.addressLine2;
    }

    /**
     * Set the addressLine2 property: Address line 2.
     *
     * @param addressLine2 the addressLine2 value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get the addressLine3 property: Address line 3.
     *
     * @return the addressLine3 value.
     */
    public String addressLine3() {
        return this.addressLine3;
    }

    /**
     * Set the addressLine3 property: Address line 3.
     *
     * @param addressLine3 the addressLine3 value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Get the city property: Address city.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: Address city.
     *
     * @param city the city value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the district property: Address district.
     *
     * @return the district value.
     */
    public String district() {
        return this.district;
    }

    /**
     * Set the district property: Address district.
     *
     * @param district the district value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * Get the region property: Address region.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Address region.
     *
     * @param region the region value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the country property: Country code uses ISO2, 2-digit format.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country code uses ISO2, 2-digit format.
     *
     * @param country the country value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the postalCode property: Postal code.
     *
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: Postal code.
     *
     * @param postalCode the postalCode value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the email property: Email address.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address.
     *
     * @param email the email value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the phoneNumber property: Phone number.
     *
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: Phone number.
     *
     * @param phoneNumber the phoneNumber value to set.
     * @return the AddressDetails object itself.
     */
    public AddressDetails withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (addressLine1() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property addressLine1 in model AddressDetails"));
        }
        if (country() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property country in model AddressDetails"));
        }
    }
}
