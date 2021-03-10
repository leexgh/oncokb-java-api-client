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

package org.oncokb.oncokb_transcript.client;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.oncokb.oncokb_transcript.client.TranscriptPairVM;
/**
 * MatchTranscriptVM
 */


public class MatchTranscriptVM {
  /**
   * Gets or Sets targetReferenceGenome
   */
  @JsonAdapter(TargetReferenceGenomeEnum.Adapter.class)
  public enum TargetReferenceGenomeEnum {
    GRCH37("GRCh37"),
    GRCH38("GRCh38");

    private String value;

    TargetReferenceGenomeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TargetReferenceGenomeEnum fromValue(String text) {
      for (TargetReferenceGenomeEnum b : TargetReferenceGenomeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TargetReferenceGenomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetReferenceGenomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetReferenceGenomeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TargetReferenceGenomeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("targetReferenceGenome")
  private TargetReferenceGenomeEnum targetReferenceGenome = null;

  @SerializedName("transcript")
  private TranscriptPairVM transcript = null;

  public MatchTranscriptVM targetReferenceGenome(TargetReferenceGenomeEnum targetReferenceGenome) {
    this.targetReferenceGenome = targetReferenceGenome;
    return this;
  }

   /**
   * Get targetReferenceGenome
   * @return targetReferenceGenome
  **/
  @Schema(description = "")
  public TargetReferenceGenomeEnum getTargetReferenceGenome() {
    return targetReferenceGenome;
  }

  public void setTargetReferenceGenome(TargetReferenceGenomeEnum targetReferenceGenome) {
    this.targetReferenceGenome = targetReferenceGenome;
  }

  public MatchTranscriptVM transcript(TranscriptPairVM transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  @Schema(description = "")
  public TranscriptPairVM getTranscript() {
    return transcript;
  }

  public void setTranscript(TranscriptPairVM transcript) {
    this.transcript = transcript;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTranscriptVM matchTranscriptVM = (MatchTranscriptVM) o;
    return Objects.equals(this.targetReferenceGenome, matchTranscriptVM.targetReferenceGenome) &&
        Objects.equals(this.transcript, matchTranscriptVM.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetReferenceGenome, transcript);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTranscriptVM {\n");
    
    sb.append("    targetReferenceGenome: ").append(toIndentedString(targetReferenceGenome)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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