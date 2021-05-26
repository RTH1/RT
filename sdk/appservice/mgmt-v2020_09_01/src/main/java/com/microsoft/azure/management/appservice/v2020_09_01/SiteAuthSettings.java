/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.SiteAuthSettingsInner;
import java.util.List;

/**
 * Type representing SiteAuthSettings.
 */
public interface SiteAuthSettings extends HasInner<SiteAuthSettingsInner>, HasManager<AppServiceManager> {
    /**
     * @return the aadClaimsAuthorization value.
     */
    String aadClaimsAuthorization();

    /**
     * @return the additionalLoginParams value.
     */
    List<String> additionalLoginParams();

    /**
     * @return the allowedAudiences value.
     */
    List<String> allowedAudiences();

    /**
     * @return the allowedExternalRedirectUrls value.
     */
    List<String> allowedExternalRedirectUrls();

    /**
     * @return the authFilePath value.
     */
    String authFilePath();

    /**
     * @return the clientId value.
     */
    String clientId();

    /**
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * @return the clientSecretCertificateThumbprint value.
     */
    String clientSecretCertificateThumbprint();

    /**
     * @return the clientSecretSettingName value.
     */
    String clientSecretSettingName();

    /**
     * @return the defaultProvider value.
     */
    BuiltInAuthenticationProvider defaultProvider();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the facebookAppId value.
     */
    String facebookAppId();

    /**
     * @return the facebookAppSecret value.
     */
    String facebookAppSecret();

    /**
     * @return the facebookAppSecretSettingName value.
     */
    String facebookAppSecretSettingName();

    /**
     * @return the facebookOAuthScopes value.
     */
    List<String> facebookOAuthScopes();

    /**
     * @return the gitHubClientId value.
     */
    String gitHubClientId();

    /**
     * @return the gitHubClientSecret value.
     */
    String gitHubClientSecret();

    /**
     * @return the gitHubClientSecretSettingName value.
     */
    String gitHubClientSecretSettingName();

    /**
     * @return the gitHubOAuthScopes value.
     */
    List<String> gitHubOAuthScopes();

    /**
     * @return the googleClientId value.
     */
    String googleClientId();

    /**
     * @return the googleClientSecret value.
     */
    String googleClientSecret();

    /**
     * @return the googleClientSecretSettingName value.
     */
    String googleClientSecretSettingName();

    /**
     * @return the googleOAuthScopes value.
     */
    List<String> googleOAuthScopes();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isAuthFromFile value.
     */
    String isAuthFromFile();

    /**
     * @return the issuer value.
     */
    String issuer();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the microsoftAccountClientId value.
     */
    String microsoftAccountClientId();

    /**
     * @return the microsoftAccountClientSecret value.
     */
    String microsoftAccountClientSecret();

    /**
     * @return the microsoftAccountClientSecretSettingName value.
     */
    String microsoftAccountClientSecretSettingName();

    /**
     * @return the microsoftAccountOAuthScopes value.
     */
    List<String> microsoftAccountOAuthScopes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the runtimeVersion value.
     */
    String runtimeVersion();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the tokenRefreshExtensionHours value.
     */
    Double tokenRefreshExtensionHours();

    /**
     * @return the tokenStoreEnabled value.
     */
    Boolean tokenStoreEnabled();

    /**
     * @return the twitterConsumerKey value.
     */
    String twitterConsumerKey();

    /**
     * @return the twitterConsumerSecret value.
     */
    String twitterConsumerSecret();

    /**
     * @return the twitterConsumerSecretSettingName value.
     */
    String twitterConsumerSecretSettingName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the unauthenticatedClientAction value.
     */
    UnauthenticatedClientAction unauthenticatedClientAction();

    /**
     * @return the validateIssuer value.
     */
    Boolean validateIssuer();

}
