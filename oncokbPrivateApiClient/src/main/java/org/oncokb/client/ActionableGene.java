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

/**
 * ActionableGene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-18T14:57:30.206-05:00")
public class ActionableGene {
  @SerializedName("abstracts")
  private String abstracts = null;

  @SerializedName("cancerType")
  private String cancerType = null;

  @SerializedName("drugs")
  private String drugs = null;

  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("gene")
  private String gene = null;

  @SerializedName("grch37Isoform")
  private String grch37Isoform = null;

  @SerializedName("grch37RefSeq")
  private String grch37RefSeq = null;

  @SerializedName("grch38Isoform")
  private String grch38Isoform = null;

  @SerializedName("grch38RefSeq")
  private String grch38RefSeq = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("pmids")
  private String pmids = null;

  @SerializedName("proteinChange")
  private String proteinChange = null;

  @SerializedName("referenceGenome")
  private String referenceGenome = null;

  @SerializedName("variant")
  private String variant = null;

  public ActionableGene abstracts(String abstracts) {
    this.abstracts = abstracts;
    return this;
  }

   /**
   * Get abstracts
   * @return abstracts
  **/
  @ApiModelProperty(value = "")
  public String getAbstracts() {
    return abstracts;
  }

  public void setAbstracts(String abstracts) {
    this.abstracts = abstracts;
  }

  public ActionableGene cancerType(String cancerType) {
    this.cancerType = cancerType;
    return this;
  }

   /**
   * Get cancerType
   * @return cancerType
  **/
  @ApiModelProperty(value = "")
  public String getCancerType() {
    return cancerType;
  }

  public void setCancerType(String cancerType) {
    this.cancerType = cancerType;
  }

  public ActionableGene drugs(String drugs) {
    this.drugs = drugs;
    return this;
  }

   /**
   * Get drugs
   * @return drugs
  **/
  @ApiModelProperty(value = "")
  public String getDrugs() {
    return drugs;
  }

  public void setDrugs(String drugs) {
    this.drugs = drugs;
  }

  public ActionableGene entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "")
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public ActionableGene gene(String gene) {
    this.gene = gene;
    return this;
  }

   /**
   * Get gene
   * @return gene
  **/
  @ApiModelProperty(value = "")
  public String getGene() {
    return gene;
  }

  public void setGene(String gene) {
    this.gene = gene;
  }

  public ActionableGene grch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
    return this;
  }

   /**
   * Get grch37Isoform
   * @return grch37Isoform
  **/
  @ApiModelProperty(value = "")
  public String getGrch37Isoform() {
    return grch37Isoform;
  }

  public void setGrch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
  }

  public ActionableGene grch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
    return this;
  }

   /**
   * Get grch37RefSeq
   * @return grch37RefSeq
  **/
  @ApiModelProperty(value = "")
  public String getGrch37RefSeq() {
    return grch37RefSeq;
  }

  public void setGrch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
  }

  public ActionableGene grch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
    return this;
  }

   /**
   * Get grch38Isoform
   * @return grch38Isoform
  **/
  @ApiModelProperty(value = "")
  public String getGrch38Isoform() {
    return grch38Isoform;
  }

  public void setGrch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
  }

  public ActionableGene grch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
    return this;
  }

   /**
   * Get grch38RefSeq
   * @return grch38RefSeq
  **/
  @ApiModelProperty(value = "")
  public String getGrch38RefSeq() {
    return grch38RefSeq;
  }

  public void setGrch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
  }

  public ActionableGene level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public ActionableGene pmids(String pmids) {
    this.pmids = pmids;
    return this;
  }

   /**
   * Get pmids
   * @return pmids
  **/
  @ApiModelProperty(value = "")
  public String getPmids() {
    return pmids;
  }

  public void setPmids(String pmids) {
    this.pmids = pmids;
  }

  public ActionableGene proteinChange(String proteinChange) {
    this.proteinChange = proteinChange;
    return this;
  }

   /**
   * Get proteinChange
   * @return proteinChange
  **/
  @ApiModelProperty(value = "")
  public String getProteinChange() {
    return proteinChange;
  }

  public void setProteinChange(String proteinChange) {
    this.proteinChange = proteinChange;
  }

  public ActionableGene referenceGenome(String referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @ApiModelProperty(value = "")
  public String getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(String referenceGenome) {
    this.referenceGenome = referenceGenome;
  }

  public ActionableGene variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @ApiModelProperty(value = "")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionableGene actionableGene = (ActionableGene) o;
    return Objects.equals(this.abstracts, actionableGene.abstracts) &&
        Objects.equals(this.cancerType, actionableGene.cancerType) &&
        Objects.equals(this.drugs, actionableGene.drugs) &&
        Objects.equals(this.entrezGeneId, actionableGene.entrezGeneId) &&
        Objects.equals(this.gene, actionableGene.gene) &&
        Objects.equals(this.grch37Isoform, actionableGene.grch37Isoform) &&
        Objects.equals(this.grch37RefSeq, actionableGene.grch37RefSeq) &&
        Objects.equals(this.grch38Isoform, actionableGene.grch38Isoform) &&
        Objects.equals(this.grch38RefSeq, actionableGene.grch38RefSeq) &&
        Objects.equals(this.level, actionableGene.level) &&
        Objects.equals(this.pmids, actionableGene.pmids) &&
        Objects.equals(this.proteinChange, actionableGene.proteinChange) &&
        Objects.equals(this.referenceGenome, actionableGene.referenceGenome) &&
        Objects.equals(this.variant, actionableGene.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstracts, cancerType, drugs, entrezGeneId, gene, grch37Isoform, grch37RefSeq, grch38Isoform, grch38RefSeq, level, pmids, proteinChange, referenceGenome, variant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionableGene {\n");
    
    sb.append("    abstracts: ").append(toIndentedString(abstracts)).append("\n");
    sb.append("    cancerType: ").append(toIndentedString(cancerType)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    grch37Isoform: ").append(toIndentedString(grch37Isoform)).append("\n");
    sb.append("    grch37RefSeq: ").append(toIndentedString(grch37RefSeq)).append("\n");
    sb.append("    grch38Isoform: ").append(toIndentedString(grch38Isoform)).append("\n");
    sb.append("    grch38RefSeq: ").append(toIndentedString(grch38RefSeq)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    pmids: ").append(toIndentedString(pmids)).append("\n");
    sb.append("    proteinChange: ").append(toIndentedString(proteinChange)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

