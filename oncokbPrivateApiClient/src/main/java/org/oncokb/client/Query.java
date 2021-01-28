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
 * Query
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-28T15:48:42.155-05:00")
public class Query {
  @SerializedName("alteration")
  private String alteration = null;

  @SerializedName("alterationType")
  private String alterationType = null;

  @SerializedName("consequence")
  private String consequence = null;

  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("id")
  private String id = null;

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

  /**
   * Gets or Sets svType
   */
  @JsonAdapter(SvTypeEnum.Adapter.class)
  public enum SvTypeEnum {
    DELETION("DELETION"),
    
    TRANSLOCATION("TRANSLOCATION"),
    
    DUPLICATION("DUPLICATION"),
    
    INSERTION("INSERTION"),
    
    INVERSION("INVERSION"),
    
    FUSION("FUSION"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SvTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SvTypeEnum fromValue(String text) {
      for (SvTypeEnum b : SvTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SvTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SvTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SvTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SvTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("svType")
  private SvTypeEnum svType = null;

  @SerializedName("tumorType")
  private String tumorType = null;

  @SerializedName("type")
  private String type = null;

  public Query alteration(String alteration) {
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

  public Query alterationType(String alterationType) {
    this.alterationType = alterationType;
    return this;
  }

   /**
   * Get alterationType
   * @return alterationType
  **/
  @ApiModelProperty(value = "")
  public String getAlterationType() {
    return alterationType;
  }

  public void setAlterationType(String alterationType) {
    this.alterationType = alterationType;
  }

  public Query consequence(String consequence) {
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

  public Query entrezGeneId(Integer entrezGeneId) {
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

  public Query hgvs(String hgvs) {
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

  public Query hugoSymbol(String hugoSymbol) {
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

  public Query id(String id) {
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

  public Query proteinEnd(Integer proteinEnd) {
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

  public Query proteinStart(Integer proteinStart) {
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

  public Query referenceGenome(ReferenceGenomeEnum referenceGenome) {
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

  public Query svType(SvTypeEnum svType) {
    this.svType = svType;
    return this;
  }

   /**
   * Get svType
   * @return svType
  **/
  @ApiModelProperty(value = "")
  public SvTypeEnum getSvType() {
    return svType;
  }

  public void setSvType(SvTypeEnum svType) {
    this.svType = svType;
  }

  public Query tumorType(String tumorType) {
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

  public Query type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.alteration, query.alteration) &&
        Objects.equals(this.alterationType, query.alterationType) &&
        Objects.equals(this.consequence, query.consequence) &&
        Objects.equals(this.entrezGeneId, query.entrezGeneId) &&
        Objects.equals(this.hgvs, query.hgvs) &&
        Objects.equals(this.hugoSymbol, query.hugoSymbol) &&
        Objects.equals(this.id, query.id) &&
        Objects.equals(this.proteinEnd, query.proteinEnd) &&
        Objects.equals(this.proteinStart, query.proteinStart) &&
        Objects.equals(this.referenceGenome, query.referenceGenome) &&
        Objects.equals(this.svType, query.svType) &&
        Objects.equals(this.tumorType, query.tumorType) &&
        Objects.equals(this.type, query.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alteration, alterationType, consequence, entrezGeneId, hgvs, hugoSymbol, id, proteinEnd, proteinStart, referenceGenome, svType, tumorType, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    alteration: ").append(toIndentedString(alteration)).append("\n");
    sb.append("    alterationType: ").append(toIndentedString(alterationType)).append("\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    svType: ").append(toIndentedString(svType)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

