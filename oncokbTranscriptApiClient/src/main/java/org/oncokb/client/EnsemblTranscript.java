/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.oncokb.client.Exon;
import org.oncokb.client.PfamDomainRange;
import org.oncokb.client.UntranslatedRegion;
/**
 * EnsemblTranscript
 */


public class EnsemblTranscript {
  @SerializedName("ccdsId")
  private String ccdsId = null;

  @SerializedName("exons")
  private List<Exon> exons = null;

  @SerializedName("geneId")
  private String geneId = null;

  @SerializedName("hugoSymbols")
  private List<String> hugoSymbols = null;

  @SerializedName("pfamDomains")
  private List<PfamDomainRange> pfamDomains = null;

  @SerializedName("proteinId")
  private String proteinId = null;

  @SerializedName("proteinLength")
  private Integer proteinLength = null;

  @SerializedName("refseqMrnaId")
  private String refseqMrnaId = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("utrs")
  private List<UntranslatedRegion> utrs = null;

  public EnsemblTranscript ccdsId(String ccdsId) {
    this.ccdsId = ccdsId;
    return this;
  }

   /**
   * Consensus CDS (CCDS) ID
   * @return ccdsId
  **/
  @Schema(description = "Consensus CDS (CCDS) ID")
  public String getCcdsId() {
    return ccdsId;
  }

  public void setCcdsId(String ccdsId) {
    this.ccdsId = ccdsId;
  }

  public EnsemblTranscript exons(List<Exon> exons) {
    this.exons = exons;
    return this;
  }

  public EnsemblTranscript addExonsItem(Exon exonsItem) {
    if (this.exons == null) {
      this.exons = new ArrayList<Exon>();
    }
    this.exons.add(exonsItem);
    return this;
  }

   /**
   * Exon information
   * @return exons
  **/
  @Schema(description = "Exon information")
  public List<Exon> getExons() {
    return exons;
  }

  public void setExons(List<Exon> exons) {
    this.exons = exons;
  }

  public EnsemblTranscript geneId(String geneId) {
    this.geneId = geneId;
    return this;
  }

   /**
   * Ensembl gene id
   * @return geneId
  **/
  @Schema(required = true, description = "Ensembl gene id")
  public String getGeneId() {
    return geneId;
  }

  public void setGeneId(String geneId) {
    this.geneId = geneId;
  }

  public EnsemblTranscript hugoSymbols(List<String> hugoSymbols) {
    this.hugoSymbols = hugoSymbols;
    return this;
  }

  public EnsemblTranscript addHugoSymbolsItem(String hugoSymbolsItem) {
    if (this.hugoSymbols == null) {
      this.hugoSymbols = new ArrayList<String>();
    }
    this.hugoSymbols.add(hugoSymbolsItem);
    return this;
  }

   /**
   * Hugo symbols
   * @return hugoSymbols
  **/
  @Schema(description = "Hugo symbols")
  public List<String> getHugoSymbols() {
    return hugoSymbols;
  }

  public void setHugoSymbols(List<String> hugoSymbols) {
    this.hugoSymbols = hugoSymbols;
  }

  public EnsemblTranscript pfamDomains(List<PfamDomainRange> pfamDomains) {
    this.pfamDomains = pfamDomains;
    return this;
  }

  public EnsemblTranscript addPfamDomainsItem(PfamDomainRange pfamDomainsItem) {
    if (this.pfamDomains == null) {
      this.pfamDomains = new ArrayList<PfamDomainRange>();
    }
    this.pfamDomains.add(pfamDomainsItem);
    return this;
  }

   /**
   * Pfam domains
   * @return pfamDomains
  **/
  @Schema(description = "Pfam domains")
  public List<PfamDomainRange> getPfamDomains() {
    return pfamDomains;
  }

  public void setPfamDomains(List<PfamDomainRange> pfamDomains) {
    this.pfamDomains = pfamDomains;
  }

  public EnsemblTranscript proteinId(String proteinId) {
    this.proteinId = proteinId;
    return this;
  }

   /**
   * Ensembl protein id
   * @return proteinId
  **/
  @Schema(required = true, description = "Ensembl protein id")
  public String getProteinId() {
    return proteinId;
  }

  public void setProteinId(String proteinId) {
    this.proteinId = proteinId;
  }

  public EnsemblTranscript proteinLength(Integer proteinLength) {
    this.proteinLength = proteinLength;
    return this;
  }

   /**
   * Length of protein
   * @return proteinLength
  **/
  @Schema(description = "Length of protein")
  public Integer getProteinLength() {
    return proteinLength;
  }

  public void setProteinLength(Integer proteinLength) {
    this.proteinLength = proteinLength;
  }

  public EnsemblTranscript refseqMrnaId(String refseqMrnaId) {
    this.refseqMrnaId = refseqMrnaId;
    return this;
  }

   /**
   * RefSeq mRNA ID
   * @return refseqMrnaId
  **/
  @Schema(description = "RefSeq mRNA ID")
  public String getRefseqMrnaId() {
    return refseqMrnaId;
  }

  public void setRefseqMrnaId(String refseqMrnaId) {
    this.refseqMrnaId = refseqMrnaId;
  }

  public EnsemblTranscript transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Ensembl transcript id
   * @return transcriptId
  **/
  @Schema(required = true, description = "Ensembl transcript id")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }

  public EnsemblTranscript utrs(List<UntranslatedRegion> utrs) {
    this.utrs = utrs;
    return this;
  }

  public EnsemblTranscript addUtrsItem(UntranslatedRegion utrsItem) {
    if (this.utrs == null) {
      this.utrs = new ArrayList<UntranslatedRegion>();
    }
    this.utrs.add(utrsItem);
    return this;
  }

   /**
   * UTR information
   * @return utrs
  **/
  @Schema(description = "UTR information")
  public List<UntranslatedRegion> getUtrs() {
    return utrs;
  }

  public void setUtrs(List<UntranslatedRegion> utrs) {
    this.utrs = utrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnsemblTranscript ensemblTranscript = (EnsemblTranscript) o;
    return Objects.equals(this.ccdsId, ensemblTranscript.ccdsId) &&
        Objects.equals(this.exons, ensemblTranscript.exons) &&
        Objects.equals(this.geneId, ensemblTranscript.geneId) &&
        Objects.equals(this.hugoSymbols, ensemblTranscript.hugoSymbols) &&
        Objects.equals(this.pfamDomains, ensemblTranscript.pfamDomains) &&
        Objects.equals(this.proteinId, ensemblTranscript.proteinId) &&
        Objects.equals(this.proteinLength, ensemblTranscript.proteinLength) &&
        Objects.equals(this.refseqMrnaId, ensemblTranscript.refseqMrnaId) &&
        Objects.equals(this.transcriptId, ensemblTranscript.transcriptId) &&
        Objects.equals(this.utrs, ensemblTranscript.utrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccdsId, exons, geneId, hugoSymbols, pfamDomains, proteinId, proteinLength, refseqMrnaId, transcriptId, utrs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnsemblTranscript {\n");
    
    sb.append("    ccdsId: ").append(toIndentedString(ccdsId)).append("\n");
    sb.append("    exons: ").append(toIndentedString(exons)).append("\n");
    sb.append("    geneId: ").append(toIndentedString(geneId)).append("\n");
    sb.append("    hugoSymbols: ").append(toIndentedString(hugoSymbols)).append("\n");
    sb.append("    pfamDomains: ").append(toIndentedString(pfamDomains)).append("\n");
    sb.append("    proteinId: ").append(toIndentedString(proteinId)).append("\n");
    sb.append("    proteinLength: ").append(toIndentedString(proteinLength)).append("\n");
    sb.append("    refseqMrnaId: ").append(toIndentedString(refseqMrnaId)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    utrs: ").append(toIndentedString(utrs)).append("\n");
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