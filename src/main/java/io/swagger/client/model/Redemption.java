/**
 * Tortoise Merchant API
 * Tortoise API for merchant to integrate with their existing systems 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: developer@tortoise.pro
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Plan;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Redemption {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("plan")
  private Plan plan = null;
  @SerializedName("requestRaisedOn")
  private Date requestRaisedOn = null;
  @SerializedName("requestProcessedOn")
  private Date requestProcessedOn = null;
  public enum StatusEnum {
     raised,  processing,  successful,  failed, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Unique identifier for the redemption request
   **/
  @ApiModelProperty(value = "Unique identifier for the redemption request")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Plan getPlan() {
    return plan;
  }
  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRequestRaisedOn() {
    return requestRaisedOn;
  }
  public void setRequestRaisedOn(Date requestRaisedOn) {
    this.requestRaisedOn = requestRaisedOn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRequestProcessedOn() {
    return requestProcessedOn;
  }
  public void setRequestProcessedOn(Date requestProcessedOn) {
    this.requestProcessedOn = requestProcessedOn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Redemption redemption = (Redemption) o;
    return (this.id == null ? redemption.id == null : this.id.equals(redemption.id)) &&
        (this.plan == null ? redemption.plan == null : this.plan.equals(redemption.plan)) &&
        (this.requestRaisedOn == null ? redemption.requestRaisedOn == null : this.requestRaisedOn.equals(redemption.requestRaisedOn)) &&
        (this.requestProcessedOn == null ? redemption.requestProcessedOn == null : this.requestProcessedOn.equals(redemption.requestProcessedOn)) &&
        (this.status == null ? redemption.status == null : this.status.equals(redemption.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.plan == null ? 0: this.plan.hashCode());
    result = 31 * result + (this.requestRaisedOn == null ? 0: this.requestRaisedOn.hashCode());
    result = 31 * result + (this.requestProcessedOn == null ? 0: this.requestProcessedOn.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Redemption {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  plan: ").append(plan).append("\n");
    sb.append("  requestRaisedOn: ").append(requestRaisedOn).append("\n");
    sb.append("  requestProcessedOn: ").append(requestProcessedOn).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
