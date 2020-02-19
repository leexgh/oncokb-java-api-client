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
 * AnnotateMutationByProteinChangeQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-19T16:53:14.717-05:00")
public class AnnotateMutationByProteinChangeQuery {
  @SerializedName("alteration")
  private String alteration = null;

  @SerializedName("consequence")
  private String consequence = null;

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

  @SerializedName("gene")
  private QueryGene gene = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("proteinEnd")
  private Integer proteinEnd = null;

  @SerializedName("proteinStart")
  private Integer proteinStart = null;

  @SerializedName("tumorType")
  private String tumorType = null;

  public AnnotateMutationByProteinChangeQuery alteration(String alteration) {
    this.alteration = alteration;
    return this;
  }

   /**
   * Get alteration
   * @return alteration
  **/
  @ApiModelProperty(value = "")
  public String getAlteration() {
    return alteration;
  }

  public void setAlteration(String alteration) {
    this.alteration = alteration;
  }

  public AnnotateMutationByProteinChangeQuery consequence(String consequence) {
    this.consequence = consequence;
    return this;
  }

   /**
   * Get consequence
   * @return consequence
  **/
  @ApiModelProperty(value = "")
  public String getConsequence() {
    return consequence;
  }

  public void setConsequence(String consequence) {
    this.consequence = consequence;
  }

  public AnnotateMutationByProteinChangeQuery evidenceTypes(List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

  public AnnotateMutationByProteinChangeQuery addEvidenceTypesItem(EvidenceTypesEnum evidenceTypesItem) {
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

  public AnnotateMutationByProteinChangeQuery gene(QueryGene gene) {
    this.gene = gene;
    return this;
  }

   /**
   * Get gene
   * @return gene
  **/
  @ApiModelProperty(value = "")
  public QueryGene getGene() {
    return gene;
  }

  public void setGene(QueryGene gene) {
    this.gene = gene;
  }

  public AnnotateMutationByProteinChangeQuery id(String id) {
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

  public AnnotateMutationByProteinChangeQuery proteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
    return this;
  }

   /**
   * Get proteinEnd
   * @return proteinEnd
  **/
  @ApiModelProperty(value = "")
  public Integer getProteinEnd() {
    return proteinEnd;
  }

  public void setProteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
  }

  public AnnotateMutationByProteinChangeQuery proteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
    return this;
  }

   /**
   * Get proteinStart
   * @return proteinStart
  **/
  @ApiModelProperty(value = "")
  public Integer getProteinStart() {
    return proteinStart;
  }

  public void setProteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
  }

  public AnnotateMutationByProteinChangeQuery tumorType(String tumorType) {
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
    AnnotateMutationByProteinChangeQuery annotateMutationByProteinChangeQuery = (AnnotateMutationByProteinChangeQuery) o;
    return Objects.equals(this.alteration, annotateMutationByProteinChangeQuery.alteration) &&
        Objects.equals(this.consequence, annotateMutationByProteinChangeQuery.consequence) &&
        Objects.equals(this.evidenceTypes, annotateMutationByProteinChangeQuery.evidenceTypes) &&
        Objects.equals(this.gene, annotateMutationByProteinChangeQuery.gene) &&
        Objects.equals(this.id, annotateMutationByProteinChangeQuery.id) &&
        Objects.equals(this.proteinEnd, annotateMutationByProteinChangeQuery.proteinEnd) &&
        Objects.equals(this.proteinStart, annotateMutationByProteinChangeQuery.proteinStart) &&
        Objects.equals(this.tumorType, annotateMutationByProteinChangeQuery.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alteration, consequence, evidenceTypes, gene, id, proteinEnd, proteinStart, tumorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateMutationByProteinChangeQuery {\n");
    
    sb.append("    alteration: ").append(toIndentedString(alteration)).append("\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
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

