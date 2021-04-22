/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
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
 * AnnotateMutationByGenomicChangeQuery
 */

public class AnnotateMutationByGenomicChangeQuery {
  /**
   * Gets or Sets evidenceTypes
   */
  @JsonAdapter(EvidenceTypesEnum.Adapter.class)
  public enum EvidenceTypesEnum {
    GENE_SUMMARY("GENE_SUMMARY"),
    
    MUTATION_SUMMARY("MUTATION_SUMMARY"),
    
    TUMOR_TYPE_SUMMARY("TUMOR_TYPE_SUMMARY"),
    
    GENE_TUMOR_TYPE_SUMMARY("GENE_TUMOR_TYPE_SUMMARY"),
    
    PROGNOSTIC_SUMMARY("PROGNOSTIC_SUMMARY"),
    
    DIAGNOSTIC_SUMMARY("DIAGNOSTIC_SUMMARY"),
    
    GENE_BACKGROUND("GENE_BACKGROUND"),
    
    ONCOGENIC("ONCOGENIC"),
    
    MUTATION_EFFECT("MUTATION_EFFECT"),
    
    VUS("VUS"),
    
    PROGNOSTIC_IMPLICATION("PROGNOSTIC_IMPLICATION"),
    
    DIAGNOSTIC_IMPLICATION("DIAGNOSTIC_IMPLICATION"),
    
    STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY("STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY"),
    
    STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE("STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE"),
    
    INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY("INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY"),
    
    INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE("INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE");

    private String value;

    EvidenceTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvidenceTypesEnum fromValue(String text) {
      for (EvidenceTypesEnum b : EvidenceTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EvidenceTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvidenceTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvidenceTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EvidenceTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("evidenceTypes")
  private List<EvidenceTypesEnum> evidenceTypes = null;

  @SerializedName("genomicLocation")
  private String genomicLocation = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets referenceGenome
   */
  @JsonAdapter(ReferenceGenomeEnum.Adapter.class)
  public enum ReferenceGenomeEnum {
    GRCH37("GRCh37"),
    
    GRCH38("GRCh38");

    private String value;

    ReferenceGenomeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceGenomeEnum fromValue(String text) {
      for (ReferenceGenomeEnum b : ReferenceGenomeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReferenceGenomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceGenomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceGenomeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReferenceGenomeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("referenceGenome")
  private ReferenceGenomeEnum referenceGenome = null;

  @SerializedName("tumorType")
  private String tumorType = null;

  public AnnotateMutationByGenomicChangeQuery evidenceTypes(List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

  public AnnotateMutationByGenomicChangeQuery addEvidenceTypesItem(EvidenceTypesEnum evidenceTypesItem) {
    if (this.evidenceTypes == null) {
      this.evidenceTypes = new ArrayList<EvidenceTypesEnum>();
    }
    this.evidenceTypes.add(evidenceTypesItem);
    return this;
  }

   /**
   * Get evidenceTypes
   * @return evidenceTypes
  **/
  @ApiModelProperty(value = "")
  public List<EvidenceTypesEnum> getEvidenceTypes() {
    return evidenceTypes;
  }

  public void setEvidenceTypes(List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
  }

  public AnnotateMutationByGenomicChangeQuery genomicLocation(String genomicLocation) {
    this.genomicLocation = genomicLocation;
    return this;
  }

   /**
   * Get genomicLocation
   * @return genomicLocation
  **/
  @ApiModelProperty(value = "")
  public String getGenomicLocation() {
    return genomicLocation;
  }

  public void setGenomicLocation(String genomicLocation) {
    this.genomicLocation = genomicLocation;
  }

  public AnnotateMutationByGenomicChangeQuery id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AnnotateMutationByGenomicChangeQuery referenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @ApiModelProperty(value = "")
  public ReferenceGenomeEnum getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
  }

  public AnnotateMutationByGenomicChangeQuery tumorType(String tumorType) {
    this.tumorType = tumorType;
    return this;
  }

   /**
   * Get tumorType
   * @return tumorType
  **/
  @ApiModelProperty(value = "")
  public String getTumorType() {
    return tumorType;
  }

  public void setTumorType(String tumorType) {
    this.tumorType = tumorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotateMutationByGenomicChangeQuery annotateMutationByGenomicChangeQuery = (AnnotateMutationByGenomicChangeQuery) o;
    return Objects.equals(this.evidenceTypes, annotateMutationByGenomicChangeQuery.evidenceTypes) &&
        Objects.equals(this.genomicLocation, annotateMutationByGenomicChangeQuery.genomicLocation) &&
        Objects.equals(this.id, annotateMutationByGenomicChangeQuery.id) &&
        Objects.equals(this.referenceGenome, annotateMutationByGenomicChangeQuery.referenceGenome) &&
        Objects.equals(this.tumorType, annotateMutationByGenomicChangeQuery.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceTypes, genomicLocation, id, referenceGenome, tumorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateMutationByGenomicChangeQuery {\n");
    
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    genomicLocation: ").append(toIndentedString(genomicLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
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

