/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.2.2
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Drug
 */

public class Drug {
  @SerializedName("drugName")
  private String drugName = null;

  @SerializedName("ncitCode")
  private String ncitCode = null;

  @SerializedName("synonyms")
  private List<String> synonyms = null;

  @SerializedName("uuid")
  private String uuid = null;

  public Drug drugName(String drugName) {
    this.drugName = drugName;
    return this;
  }

   /**
   * Get drugName
   * @return drugName
  **/
  @ApiModelProperty(value = "")
  public String getDrugName() {
    return drugName;
  }

  public void setDrugName(String drugName) {
    this.drugName = drugName;
  }

  public Drug ncitCode(String ncitCode) {
    this.ncitCode = ncitCode;
    return this;
  }

   /**
   * Get ncitCode
   * @return ncitCode
  **/
  @ApiModelProperty(value = "")
  public String getNcitCode() {
    return ncitCode;
  }

  public void setNcitCode(String ncitCode) {
    this.ncitCode = ncitCode;
  }

  public Drug synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public Drug addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Get synonyms
   * @return synonyms
  **/
  @ApiModelProperty(value = "")
  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public Drug uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.drugName, drug.drugName) &&
        Objects.equals(this.ncitCode, drug.ncitCode) &&
        Objects.equals(this.synonyms, drug.synonyms) &&
        Objects.equals(this.uuid, drug.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drugName, ncitCode, synonyms, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    
    sb.append("    drugName: ").append(toIndentedString(drugName)).append("\n");
    sb.append("    ncitCode: ").append(toIndentedString(ncitCode)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

