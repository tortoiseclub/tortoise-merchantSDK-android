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

import io.swagger.client.model.PlanCustomer;
import io.swagger.client.model.PlanProduct;
import io.swagger.client.model.PlanScheme;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Plan {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("customer")
  private PlanCustomer customer = null;
  @SerializedName("product")
  private PlanProduct product = null;
  @SerializedName("scheme")
  private PlanScheme scheme = null;
  @SerializedName("enrolledOn")
  private Date enrolledOn = null;
  @SerializedName("planValue")
  private Integer planValue = null;
  @SerializedName("instalmentValue")
  private Integer instalmentValue = null;
  @SerializedName("totalPaidValue")
  private Integer totalPaidValue = null;
  @SerializedName("completedInstalments")
  private Integer completedInstalments = null;
  @SerializedName("nextInstalmentDate")
  private Date nextInstalmentDate = null;
  @SerializedName("planMaturityDate")
  private Date planMaturityDate = null;
  @SerializedName("totalExpectedRedemptionValue")
  private Integer totalExpectedRedemptionValue = null;
  @SerializedName("currentRedemptionValue")
  private Integer currentRedemptionValue = null;
  @SerializedName("currentCancellationValue")
  private Integer currentCancellationValue = null;
  @SerializedName("lastInstalmentPaidOn")
  private Date lastInstalmentPaidOn = null;

  /**
   * Unique identifier for the plan
   **/
  @ApiModelProperty(value = "Unique identifier for the plan")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PlanCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(PlanCustomer customer) {
    this.customer = customer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PlanProduct getProduct() {
    return product;
  }
  public void setProduct(PlanProduct product) {
    this.product = product;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PlanScheme getScheme() {
    return scheme;
  }
  public void setScheme(PlanScheme scheme) {
    this.scheme = scheme;
  }

  /**
   * Time when customer enrolled on the plan
   **/
  @ApiModelProperty(value = "Time when customer enrolled on the plan")
  public Date getEnrolledOn() {
    return enrolledOn;
  }
  public void setEnrolledOn(Date enrolledOn) {
    this.enrolledOn = enrolledOn;
  }

  /**
   * Total price of the plan, to be paid by the customer
   **/
  @ApiModelProperty(value = "Total price of the plan, to be paid by the customer")
  public Integer getPlanValue() {
    return planValue;
  }
  public void setPlanValue(Integer planValue) {
    this.planValue = planValue;
  }

  /**
   * Value of each instalment to be paid by the customer
   **/
  @ApiModelProperty(value = "Value of each instalment to be paid by the customer")
  public Integer getInstalmentValue() {
    return instalmentValue;
  }
  public void setInstalmentValue(Integer instalmentValue) {
    this.instalmentValue = instalmentValue;
  }

  /**
   * Total amount paid by the customer towards the plan till date
   **/
  @ApiModelProperty(value = "Total amount paid by the customer towards the plan till date")
  public Integer getTotalPaidValue() {
    return totalPaidValue;
  }
  public void setTotalPaidValue(Integer totalPaidValue) {
    this.totalPaidValue = totalPaidValue;
  }

  /**
   * Instalments paid by customer till date
   **/
  @ApiModelProperty(value = "Instalments paid by customer till date")
  public Integer getCompletedInstalments() {
    return completedInstalments;
  }
  public void setCompletedInstalments(Integer completedInstalments) {
    this.completedInstalments = completedInstalments;
  }

  /**
   * Due date for the upcoming instalment of the plan
   **/
  @ApiModelProperty(value = "Due date for the upcoming instalment of the plan")
  public Date getNextInstalmentDate() {
    return nextInstalmentDate;
  }
  public void setNextInstalmentDate(Date nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
  }

  /**
   * Date on which the plan is expected to mature
   **/
  @ApiModelProperty(value = "Date on which the plan is expected to mature")
  public Date getPlanMaturityDate() {
    return planMaturityDate;
  }
  public void setPlanMaturityDate(Date planMaturityDate) {
    this.planMaturityDate = planMaturityDate;
  }

  /**
   * Total amount expected to be redeemed by the customer at the end of the plan
   **/
  @ApiModelProperty(value = "Total amount expected to be redeemed by the customer at the end of the plan")
  public Integer getTotalExpectedRedemptionValue() {
    return totalExpectedRedemptionValue;
  }
  public void setTotalExpectedRedemptionValue(Integer totalExpectedRedemptionValue) {
    this.totalExpectedRedemptionValue = totalExpectedRedemptionValue;
  }

  /**
   * Total amount that can be redeemed by the customer by closing the plan today
   **/
  @ApiModelProperty(value = "Total amount that can be redeemed by the customer by closing the plan today")
  public Integer getCurrentRedemptionValue() {
    return currentRedemptionValue;
  }
  public void setCurrentRedemptionValue(Integer currentRedemptionValue) {
    this.currentRedemptionValue = currentRedemptionValue;
  }

  /**
   * Total amount that is paid back to customer if the plan is cancelled today
   **/
  @ApiModelProperty(value = "Total amount that is paid back to customer if the plan is cancelled today")
  public Integer getCurrentCancellationValue() {
    return currentCancellationValue;
  }
  public void setCurrentCancellationValue(Integer currentCancellationValue) {
    this.currentCancellationValue = currentCancellationValue;
  }

  /**
   * Timestamp of last paid instalment
   **/
  @ApiModelProperty(value = "Timestamp of last paid instalment")
  public Date getLastInstalmentPaidOn() {
    return lastInstalmentPaidOn;
  }
  public void setLastInstalmentPaidOn(Date lastInstalmentPaidOn) {
    this.lastInstalmentPaidOn = lastInstalmentPaidOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return (this.id == null ? plan.id == null : this.id.equals(plan.id)) &&
        (this.customer == null ? plan.customer == null : this.customer.equals(plan.customer)) &&
        (this.product == null ? plan.product == null : this.product.equals(plan.product)) &&
        (this.scheme == null ? plan.scheme == null : this.scheme.equals(plan.scheme)) &&
        (this.enrolledOn == null ? plan.enrolledOn == null : this.enrolledOn.equals(plan.enrolledOn)) &&
        (this.planValue == null ? plan.planValue == null : this.planValue.equals(plan.planValue)) &&
        (this.instalmentValue == null ? plan.instalmentValue == null : this.instalmentValue.equals(plan.instalmentValue)) &&
        (this.totalPaidValue == null ? plan.totalPaidValue == null : this.totalPaidValue.equals(plan.totalPaidValue)) &&
        (this.completedInstalments == null ? plan.completedInstalments == null : this.completedInstalments.equals(plan.completedInstalments)) &&
        (this.nextInstalmentDate == null ? plan.nextInstalmentDate == null : this.nextInstalmentDate.equals(plan.nextInstalmentDate)) &&
        (this.planMaturityDate == null ? plan.planMaturityDate == null : this.planMaturityDate.equals(plan.planMaturityDate)) &&
        (this.totalExpectedRedemptionValue == null ? plan.totalExpectedRedemptionValue == null : this.totalExpectedRedemptionValue.equals(plan.totalExpectedRedemptionValue)) &&
        (this.currentRedemptionValue == null ? plan.currentRedemptionValue == null : this.currentRedemptionValue.equals(plan.currentRedemptionValue)) &&
        (this.currentCancellationValue == null ? plan.currentCancellationValue == null : this.currentCancellationValue.equals(plan.currentCancellationValue)) &&
        (this.lastInstalmentPaidOn == null ? plan.lastInstalmentPaidOn == null : this.lastInstalmentPaidOn.equals(plan.lastInstalmentPaidOn));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.customer == null ? 0: this.customer.hashCode());
    result = 31 * result + (this.product == null ? 0: this.product.hashCode());
    result = 31 * result + (this.scheme == null ? 0: this.scheme.hashCode());
    result = 31 * result + (this.enrolledOn == null ? 0: this.enrolledOn.hashCode());
    result = 31 * result + (this.planValue == null ? 0: this.planValue.hashCode());
    result = 31 * result + (this.instalmentValue == null ? 0: this.instalmentValue.hashCode());
    result = 31 * result + (this.totalPaidValue == null ? 0: this.totalPaidValue.hashCode());
    result = 31 * result + (this.completedInstalments == null ? 0: this.completedInstalments.hashCode());
    result = 31 * result + (this.nextInstalmentDate == null ? 0: this.nextInstalmentDate.hashCode());
    result = 31 * result + (this.planMaturityDate == null ? 0: this.planMaturityDate.hashCode());
    result = 31 * result + (this.totalExpectedRedemptionValue == null ? 0: this.totalExpectedRedemptionValue.hashCode());
    result = 31 * result + (this.currentRedemptionValue == null ? 0: this.currentRedemptionValue.hashCode());
    result = 31 * result + (this.currentCancellationValue == null ? 0: this.currentCancellationValue.hashCode());
    result = 31 * result + (this.lastInstalmentPaidOn == null ? 0: this.lastInstalmentPaidOn.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("  scheme: ").append(scheme).append("\n");
    sb.append("  enrolledOn: ").append(enrolledOn).append("\n");
    sb.append("  planValue: ").append(planValue).append("\n");
    sb.append("  instalmentValue: ").append(instalmentValue).append("\n");
    sb.append("  totalPaidValue: ").append(totalPaidValue).append("\n");
    sb.append("  completedInstalments: ").append(completedInstalments).append("\n");
    sb.append("  nextInstalmentDate: ").append(nextInstalmentDate).append("\n");
    sb.append("  planMaturityDate: ").append(planMaturityDate).append("\n");
    sb.append("  totalExpectedRedemptionValue: ").append(totalExpectedRedemptionValue).append("\n");
    sb.append("  currentRedemptionValue: ").append(currentRedemptionValue).append("\n");
    sb.append("  currentCancellationValue: ").append(currentCancellationValue).append("\n");
    sb.append("  lastInstalmentPaidOn: ").append(lastInstalmentPaidOn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
