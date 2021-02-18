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
 * CancerGene
 */

public class CancerGene {
  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("foundation")
  private Boolean foundation = null;

  @SerializedName("foundationHeme")
  private Boolean foundationHeme = null;

  @SerializedName("grch37Isoform")
  private String grch37Isoform = null;

  @SerializedName("grch37RefSeq")
  private String grch37RefSeq = null;

  @SerializedName("grch38Isoform")
  private String grch38Isoform = null;

  @SerializedName("grch38RefSeq")
  private String grch38RefSeq = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("mSKHeme")
  private Boolean mSKHeme = null;

  @SerializedName("mSKImpact")
  private Boolean mSKImpact = null;

  @SerializedName("occurrenceCount")
  private Integer occurrenceCount = null;

  @SerializedName("oncogene")
  private Boolean oncogene = null;

  @SerializedName("oncokbAnnotated")
  private Boolean oncokbAnnotated = null;

  @SerializedName("sangerCGC")
  private Boolean sangerCGC = null;

  @SerializedName("tsg")
  private Boolean tsg = null;

  @SerializedName("vogelstein")
  private Boolean vogelstein = null;

  public CancerGene entrezGeneId(Integer entrezGeneId) {
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

  public CancerGene foundation(Boolean foundation) {
    this.foundation = foundation;
    return this;
  }

   /**
   * Get foundation
   * @return foundation
  **/
  @ApiModelProperty(value = "")
  public Boolean isFoundation() {
    return foundation;
  }

  public void setFoundation(Boolean foundation) {
    this.foundation = foundation;
  }

  public CancerGene foundationHeme(Boolean foundationHeme) {
    this.foundationHeme = foundationHeme;
    return this;
  }

   /**
   * Get foundationHeme
   * @return foundationHeme
  **/
  @ApiModelProperty(value = "")
  public Boolean isFoundationHeme() {
    return foundationHeme;
  }

  public void setFoundationHeme(Boolean foundationHeme) {
    this.foundationHeme = foundationHeme;
  }

  public CancerGene grch37Isoform(String grch37Isoform) {
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

  public CancerGene grch37RefSeq(String grch37RefSeq) {
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

  public CancerGene grch38Isoform(String grch38Isoform) {
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

  public CancerGene grch38RefSeq(String grch38RefSeq) {
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

  public CancerGene hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public CancerGene mSKHeme(Boolean mSKHeme) {
    this.mSKHeme = mSKHeme;
    return this;
  }

   /**
   * Get mSKHeme
   * @return mSKHeme
  **/
  @ApiModelProperty(value = "")
  public Boolean isMSKHeme() {
    return mSKHeme;
  }

  public void setMSKHeme(Boolean mSKHeme) {
    this.mSKHeme = mSKHeme;
  }

  public CancerGene mSKImpact(Boolean mSKImpact) {
    this.mSKImpact = mSKImpact;
    return this;
  }

   /**
   * Get mSKImpact
   * @return mSKImpact
  **/
  @ApiModelProperty(value = "")
  public Boolean isMSKImpact() {
    return mSKImpact;
  }

  public void setMSKImpact(Boolean mSKImpact) {
    this.mSKImpact = mSKImpact;
  }

  public CancerGene occurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

   /**
   * Get occurrenceCount
   * @return occurrenceCount
  **/
  @ApiModelProperty(value = "")
  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }

  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  public CancerGene oncogene(Boolean oncogene) {
    this.oncogene = oncogene;
    return this;
  }

   /**
   * Get oncogene
   * @return oncogene
  **/
  @ApiModelProperty(value = "")
  public Boolean isOncogene() {
    return oncogene;
  }

  public void setOncogene(Boolean oncogene) {
    this.oncogene = oncogene;
  }

  public CancerGene oncokbAnnotated(Boolean oncokbAnnotated) {
    this.oncokbAnnotated = oncokbAnnotated;
    return this;
  }

   /**
   * Get oncokbAnnotated
   * @return oncokbAnnotated
  **/
  @ApiModelProperty(value = "")
  public Boolean isOncokbAnnotated() {
    return oncokbAnnotated;
  }

  public void setOncokbAnnotated(Boolean oncokbAnnotated) {
    this.oncokbAnnotated = oncokbAnnotated;
  }

  public CancerGene sangerCGC(Boolean sangerCGC) {
    this.sangerCGC = sangerCGC;
    return this;
  }

   /**
   * Get sangerCGC
   * @return sangerCGC
  **/
  @ApiModelProperty(value = "")
  public Boolean isSangerCGC() {
    return sangerCGC;
  }

  public void setSangerCGC(Boolean sangerCGC) {
    this.sangerCGC = sangerCGC;
  }

  public CancerGene tsg(Boolean tsg) {
    this.tsg = tsg;
    return this;
  }

   /**
   * Get tsg
   * @return tsg
  **/
  @ApiModelProperty(value = "")
  public Boolean isTsg() {
    return tsg;
  }

  public void setTsg(Boolean tsg) {
    this.tsg = tsg;
  }

  public CancerGene vogelstein(Boolean vogelstein) {
    this.vogelstein = vogelstein;
    return this;
  }

   /**
   * Get vogelstein
   * @return vogelstein
  **/
  @ApiModelProperty(value = "")
  public Boolean isVogelstein() {
    return vogelstein;
  }

  public void setVogelstein(Boolean vogelstein) {
    this.vogelstein = vogelstein;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancerGene cancerGene = (CancerGene) o;
    return Objects.equals(this.entrezGeneId, cancerGene.entrezGeneId) &&
        Objects.equals(this.foundation, cancerGene.foundation) &&
        Objects.equals(this.foundationHeme, cancerGene.foundationHeme) &&
        Objects.equals(this.grch37Isoform, cancerGene.grch37Isoform) &&
        Objects.equals(this.grch37RefSeq, cancerGene.grch37RefSeq) &&
        Objects.equals(this.grch38Isoform, cancerGene.grch38Isoform) &&
        Objects.equals(this.grch38RefSeq, cancerGene.grch38RefSeq) &&
        Objects.equals(this.hugoSymbol, cancerGene.hugoSymbol) &&
        Objects.equals(this.mSKHeme, cancerGene.mSKHeme) &&
        Objects.equals(this.mSKImpact, cancerGene.mSKImpact) &&
        Objects.equals(this.occurrenceCount, cancerGene.occurrenceCount) &&
        Objects.equals(this.oncogene, cancerGene.oncogene) &&
        Objects.equals(this.oncokbAnnotated, cancerGene.oncokbAnnotated) &&
        Objects.equals(this.sangerCGC, cancerGene.sangerCGC) &&
        Objects.equals(this.tsg, cancerGene.tsg) &&
        Objects.equals(this.vogelstein, cancerGene.vogelstein);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, foundation, foundationHeme, grch37Isoform, grch37RefSeq, grch38Isoform, grch38RefSeq, hugoSymbol, mSKHeme, mSKImpact, occurrenceCount, oncogene, oncokbAnnotated, sangerCGC, tsg, vogelstein);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancerGene {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    foundation: ").append(toIndentedString(foundation)).append("\n");
    sb.append("    foundationHeme: ").append(toIndentedString(foundationHeme)).append("\n");
    sb.append("    grch37Isoform: ").append(toIndentedString(grch37Isoform)).append("\n");
    sb.append("    grch37RefSeq: ").append(toIndentedString(grch37RefSeq)).append("\n");
    sb.append("    grch38Isoform: ").append(toIndentedString(grch38Isoform)).append("\n");
    sb.append("    grch38RefSeq: ").append(toIndentedString(grch38RefSeq)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    mSKHeme: ").append(toIndentedString(mSKHeme)).append("\n");
    sb.append("    mSKImpact: ").append(toIndentedString(mSKImpact)).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(occurrenceCount)).append("\n");
    sb.append("    oncogene: ").append(toIndentedString(oncogene)).append("\n");
    sb.append("    oncokbAnnotated: ").append(toIndentedString(oncokbAnnotated)).append("\n");
    sb.append("    sangerCGC: ").append(toIndentedString(sangerCGC)).append("\n");
    sb.append("    tsg: ").append(toIndentedString(tsg)).append("\n");
    sb.append("    vogelstein: ").append(toIndentedString(vogelstein)).append("\n");
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

