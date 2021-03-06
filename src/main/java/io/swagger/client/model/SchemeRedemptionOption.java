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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SchemeRedemptionOption {
  
  @SerializedName("startMonth")
  private Integer startMonth = null;
  @SerializedName("startDate")
  private Integer startDate = null;

  /**
   * month after which the redemption can be applied
   **/
  @ApiModelProperty(value = "month after which the redemption can be applied")
  public Integer getStartMonth() {
    return startMonth;
  }
  public void setStartMonth(Integer startMonth) {
    this.startMonth = startMonth;
  }

  /**
   * date in the above month after which the redemption can be applied
   **/
  @ApiModelProperty(value = "date in the above month after which the redemption can be applied")
  public Integer getStartDate() {
    return startDate;
  }
  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemeRedemptionOption schemeRedemptionOption = (SchemeRedemptionOption) o;
    return (this.startMonth == null ? schemeRedemptionOption.startMonth == null : this.startMonth.equals(schemeRedemptionOption.startMonth)) &&
        (this.startDate == null ? schemeRedemptionOption.startDate == null : this.startDate.equals(schemeRedemptionOption.startDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startMonth == null ? 0: this.startMonth.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemeRedemptionOption {\n");
    
    sb.append("  startMonth: ").append(startMonth).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
