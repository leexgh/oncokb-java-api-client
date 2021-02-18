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
 * VariantSearchQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-18T14:57:30.206-05:00")
public class VariantSearchQuery {
  @SerializedName("consequence")
  private String consequence = null;

  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("proteinEnd")
  private Integer proteinEnd = null;

  @SerializedName("proteinStart")
  private Integer proteinStart = null;

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

  @SerializedName("variant")
  private String variant = null;

  @SerializedName("variantType")
  private String variantType = null;

  public VariantSearchQuery consequence(String consequence) {
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

  public VariantSearchQuery entrezGeneId(Integer entrezGeneId) {
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

  public VariantSearchQuery hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * Get hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "")
  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }

  public VariantSearchQuery hugoSymbol(String hugoSymbol) {
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

  public VariantSearchQuery proteinEnd(Integer proteinEnd) {
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

  public VariantSearchQuery proteinStart(Integer proteinStart) {
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

  public VariantSearchQuery referenceGenome(ReferenceGenomeEnum referenceGenome) {
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

  public VariantSearchQuery variant(String variant) {
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

  public VariantSearchQuery variantType(String variantType) {
    this.variantType = variantType;
    return this;
  }

   /**
   * Get variantType
   * @return variantType
  **/
  @ApiModelProperty(value = "")
  public String getVariantType() {
    return variantType;
  }

  public void setVariantType(String variantType) {
    this.variantType = variantType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSearchQuery variantSearchQuery = (VariantSearchQuery) o;
    return Objects.equals(this.consequence, variantSearchQuery.consequence) &&
        Objects.equals(this.entrezGeneId, variantSearchQuery.entrezGeneId) &&
        Objects.equals(this.hgvs, variantSearchQuery.hgvs) &&
        Objects.equals(this.hugoSymbol, variantSearchQuery.hugoSymbol) &&
        Objects.equals(this.proteinEnd, variantSearchQuery.proteinEnd) &&
        Objects.equals(this.proteinStart, variantSearchQuery.proteinStart) &&
        Objects.equals(this.referenceGenome, variantSearchQuery.referenceGenome) &&
        Objects.equals(this.variant, variantSearchQuery.variant) &&
        Objects.equals(this.variantType, variantSearchQuery.variantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consequence, entrezGeneId, hgvs, hugoSymbol, proteinEnd, proteinStart, referenceGenome, variant, variantType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSearchQuery {\n");
    
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    variantType: ").append(toIndentedString(variantType)).append("\n");
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

