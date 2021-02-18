/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * OpenAPI spec version: v1.2.1
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
import org.oncokb.client.TreatmentDrug;

/**
 * Treatment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-18T14:57:30.206-05:00")
public class Treatment {
  @SerializedName("approvedIndications")
  private List<String> approvedIndications = null;

  @SerializedName("drugs")
  private List<TreatmentDrug> drugs = null;

  @SerializedName("priority")
  private Integer priority = null;

  public Treatment approvedIndications(List<String> approvedIndications) {
    this.approvedIndications = approvedIndications;
    return this;
  }

  public Treatment addApprovedIndicationsItem(String approvedIndicationsItem) {
    if (this.approvedIndications == null) {
      this.approvedIndications = new ArrayList<String>();
    }
    this.approvedIndications.add(approvedIndicationsItem);
    return this;
  }

   /**
   * Get approvedIndications
   * @return approvedIndications
  **/
  @ApiModelProperty(value = "")
  public List<String> getApprovedIndications() {
    return approvedIndications;
  }

  public void setApprovedIndications(List<String> approvedIndications) {
    this.approvedIndications = approvedIndications;
  }

  public Treatment drugs(List<TreatmentDrug> drugs) {
    this.drugs = drugs;
    return this;
  }

  public Treatment addDrugsItem(TreatmentDrug drugsItem) {
    if (this.drugs == null) {
      this.drugs = new ArrayList<TreatmentDrug>();
    }
    this.drugs.add(drugsItem);
    return this;
  }

   /**
   * Get drugs
   * @return drugs
  **/
  @ApiModelProperty(value = "")
  public List<TreatmentDrug> getDrugs() {
    return drugs;
  }

  public void setDrugs(List<TreatmentDrug> drugs) {
    this.drugs = drugs;
  }

  public Treatment priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Treatment treatment = (Treatment) o;
    return Objects.equals(this.approvedIndications, treatment.approvedIndications) &&
        Objects.equals(this.drugs, treatment.drugs) &&
        Objects.equals(this.priority, treatment.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedIndications, drugs, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Treatment {\n");
    
    sb.append("    approvedIndications: ").append(toIndentedString(approvedIndications)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

