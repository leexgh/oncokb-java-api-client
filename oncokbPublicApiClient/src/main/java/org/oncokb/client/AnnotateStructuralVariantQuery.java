/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.0.0
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
import org.oncokb.client.QueryGene;

/**
 * AnnotateStructuralVariantQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-19T16:53:14.717-05:00")
public class AnnotateStructuralVariantQuery {
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

  @SerializedName("functionalFusion")
  private Boolean functionalFusion = null;

  @SerializedName("geneA")
  private QueryGene geneA = null;

  @SerializedName("geneB")
  private QueryGene geneB = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets structuralVariantType
   */
  @JsonAdapter(StructuralVariantTypeEnum.Adapter.class)
  public enum StructuralVariantTypeEnum {
    DELETION("DELETION"),
    
    TRANSLOCATION("TRANSLOCATION"),
    
    DUPLICATION("DUPLICATION"),
    
    INSERTION("INSERTION"),
    
    INVERSION("INVERSION"),
    
    FUSION("FUSION"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StructuralVariantTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StructuralVariantTypeEnum fromValue(String text) {
      for (StructuralVariantTypeEnum b : StructuralVariantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StructuralVariantTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StructuralVariantTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StructuralVariantTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StructuralVariantTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("structuralVariantType")
  private StructuralVariantTypeEnum structuralVariantType = null;

  @SerializedName("tumorType")
  private String tumorType = null;

  public AnnotateStructuralVariantQuery evidenceTypes(List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

  public AnnotateStructuralVariantQuery addEvidenceTypesItem(EvidenceTypesEnum evidenceTypesItem) {
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

  public AnnotateStructuralVariantQuery functionalFusion(Boolean functionalFusion) {
    this.functionalFusion = functionalFusion;
    return this;
  }

   /**
   * Get functionalFusion
   * @return functionalFusion
  **/
  @ApiModelProperty(value = "")
  public Boolean isFunctionalFusion() {
    return functionalFusion;
  }

  public void setFunctionalFusion(Boolean functionalFusion) {
    this.functionalFusion = functionalFusion;
  }

  public AnnotateStructuralVariantQuery geneA(QueryGene geneA) {
    this.geneA = geneA;
    return this;
  }

   /**
   * Get geneA
   * @return geneA
  **/
  @ApiModelProperty(value = "")
  public QueryGene getGeneA() {
    return geneA;
  }

  public void setGeneA(QueryGene geneA) {
    this.geneA = geneA;
  }

  public AnnotateStructuralVariantQuery geneB(QueryGene geneB) {
    this.geneB = geneB;
    return this;
  }

   /**
   * Get geneB
   * @return geneB
  **/
  @ApiModelProperty(value = "")
  public QueryGene getGeneB() {
    return geneB;
  }

  public void setGeneB(QueryGene geneB) {
    this.geneB = geneB;
  }

  public AnnotateStructuralVariantQuery id(String id) {
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

  public AnnotateStructuralVariantQuery structuralVariantType(StructuralVariantTypeEnum structuralVariantType) {
    this.structuralVariantType = structuralVariantType;
    return this;
  }

   /**
   * Get structuralVariantType
   * @return structuralVariantType
  **/
  @ApiModelProperty(value = "")
  public StructuralVariantTypeEnum getStructuralVariantType() {
    return structuralVariantType;
  }

  public void setStructuralVariantType(StructuralVariantTypeEnum structuralVariantType) {
    this.structuralVariantType = structuralVariantType;
  }

  public AnnotateStructuralVariantQuery tumorType(String tumorType) {
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
    AnnotateStructuralVariantQuery annotateStructuralVariantQuery = (AnnotateStructuralVariantQuery) o;
    return Objects.equals(this.evidenceTypes, annotateStructuralVariantQuery.evidenceTypes) &&
        Objects.equals(this.functionalFusion, annotateStructuralVariantQuery.functionalFusion) &&
        Objects.equals(this.geneA, annotateStructuralVariantQuery.geneA) &&
        Objects.equals(this.geneB, annotateStructuralVariantQuery.geneB) &&
        Objects.equals(this.id, annotateStructuralVariantQuery.id) &&
        Objects.equals(this.structuralVariantType, annotateStructuralVariantQuery.structuralVariantType) &&
        Objects.equals(this.tumorType, annotateStructuralVariantQuery.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceTypes, functionalFusion, geneA, geneB, id, structuralVariantType, tumorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateStructuralVariantQuery {\n");
    
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    functionalFusion: ").append(toIndentedString(functionalFusion)).append("\n");
    sb.append("    geneA: ").append(toIndentedString(geneA)).append("\n");
    sb.append("    geneB: ").append(toIndentedString(geneB)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    structuralVariantType: ").append(toIndentedString(structuralVariantType)).append("\n");
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
