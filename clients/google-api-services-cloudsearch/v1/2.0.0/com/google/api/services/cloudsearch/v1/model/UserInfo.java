/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudsearch.v1.model;

/**
 * Contains info regarding the updater of an Activity Feed item. Next Id: 7
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserInfo extends com.google.api.client.json.GenericJson {

  /**
   * Describes how updater_count_to_show should be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updaterCountDisplayType;

  /**
   * The number of updaters for clients to show depending on UpdaterCountDisplayType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer updaterCountToShow;

  /**
   * The email of the updater for clients to show used for Gmail items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updaterToShowEmail;

  /**
   * The gaia id of the updater for clients to show used for Gmail items. If the updater is an
   * external user, the email field below should be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long updaterToShowGaiaId;

  /**
   * The display name of the updater for clients to show used for Gmail items. This (along with the
   * updater fields above) will be populated in the thread pipeline (http://shortn/_rPS0GCp94Y) when
   * converting Activity Feed message attributes into client-renderable Activity Feed items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updaterToShowName;

  /**
   * The updater for clients to show used for Dynamite Chat items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserId updaterToShowUserId;

  /**
   * Describes how updater_count_to_show should be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdaterCountDisplayType() {
    return updaterCountDisplayType;
  }

  /**
   * Describes how updater_count_to_show should be used.
   * @param updaterCountDisplayType updaterCountDisplayType or {@code null} for none
   */
  public UserInfo setUpdaterCountDisplayType(java.lang.String updaterCountDisplayType) {
    this.updaterCountDisplayType = updaterCountDisplayType;
    return this;
  }

  /**
   * The number of updaters for clients to show depending on UpdaterCountDisplayType.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUpdaterCountToShow() {
    return updaterCountToShow;
  }

  /**
   * The number of updaters for clients to show depending on UpdaterCountDisplayType.
   * @param updaterCountToShow updaterCountToShow or {@code null} for none
   */
  public UserInfo setUpdaterCountToShow(java.lang.Integer updaterCountToShow) {
    this.updaterCountToShow = updaterCountToShow;
    return this;
  }

  /**
   * The email of the updater for clients to show used for Gmail items.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdaterToShowEmail() {
    return updaterToShowEmail;
  }

  /**
   * The email of the updater for clients to show used for Gmail items.
   * @param updaterToShowEmail updaterToShowEmail or {@code null} for none
   */
  public UserInfo setUpdaterToShowEmail(java.lang.String updaterToShowEmail) {
    this.updaterToShowEmail = updaterToShowEmail;
    return this;
  }

  /**
   * The gaia id of the updater for clients to show used for Gmail items. If the updater is an
   * external user, the email field below should be populated.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUpdaterToShowGaiaId() {
    return updaterToShowGaiaId;
  }

  /**
   * The gaia id of the updater for clients to show used for Gmail items. If the updater is an
   * external user, the email field below should be populated.
   * @param updaterToShowGaiaId updaterToShowGaiaId or {@code null} for none
   */
  public UserInfo setUpdaterToShowGaiaId(java.lang.Long updaterToShowGaiaId) {
    this.updaterToShowGaiaId = updaterToShowGaiaId;
    return this;
  }

  /**
   * The display name of the updater for clients to show used for Gmail items. This (along with the
   * updater fields above) will be populated in the thread pipeline (http://shortn/_rPS0GCp94Y) when
   * converting Activity Feed message attributes into client-renderable Activity Feed items.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdaterToShowName() {
    return updaterToShowName;
  }

  /**
   * The display name of the updater for clients to show used for Gmail items. This (along with the
   * updater fields above) will be populated in the thread pipeline (http://shortn/_rPS0GCp94Y) when
   * converting Activity Feed message attributes into client-renderable Activity Feed items.
   * @param updaterToShowName updaterToShowName or {@code null} for none
   */
  public UserInfo setUpdaterToShowName(java.lang.String updaterToShowName) {
    this.updaterToShowName = updaterToShowName;
    return this;
  }

  /**
   * The updater for clients to show used for Dynamite Chat items.
   * @return value or {@code null} for none
   */
  public UserId getUpdaterToShowUserId() {
    return updaterToShowUserId;
  }

  /**
   * The updater for clients to show used for Dynamite Chat items.
   * @param updaterToShowUserId updaterToShowUserId or {@code null} for none
   */
  public UserInfo setUpdaterToShowUserId(UserId updaterToShowUserId) {
    this.updaterToShowUserId = updaterToShowUserId;
    return this;
  }

  @Override
  public UserInfo set(String fieldName, Object value) {
    return (UserInfo) super.set(fieldName, value);
  }

  @Override
  public UserInfo clone() {
    return (UserInfo) super.clone();
  }

}
