package io.swagger.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Model containing order info
 */
@ApiModel(description = "Model containing order info")
@Validated
@Entity
@Table(name="Order_details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T11:51:13.410Z[GMT]")
public class Order   {

  @JsonProperty("OrderId")
  @Id
  private Long orderId=0L;

  @JsonProperty("UserName")
  private String userName =null;

  @JsonProperty("ProductId")
  private Long productId=0L;

  @JsonProperty("ShippingDate")
  private LocalDate shippingDate;

  @JsonProperty("PaymentId")
  private Long paymentId=0L;

  public Order orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(example = "2345", value = "")
  
    public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Order userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "Ahana", value = "")
  
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Order productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "1234", value = "")
  
    public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Order shippingDate(LocalDate shippingDate) {
    this.shippingDate = shippingDate;
    return this;
  }

  /**
   * Get shippingDate
   * @return shippingDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(LocalDate shippingDate) {
    this.shippingDate = shippingDate;
  }

  public Order paymentId(Long paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(example = "1123", value = "")
  
    public Long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Long paymentId) {
    this.paymentId = paymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.userName, order.userName) &&
        Objects.equals(this.productId, order.productId) &&
        Objects.equals(this.shippingDate, order.shippingDate) &&
        Objects.equals(this.paymentId, order.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userName, productId, shippingDate, paymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    shippingDate: ").append(toIndentedString(shippingDate)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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
