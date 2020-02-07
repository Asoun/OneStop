package io.swagger.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Model containing info about the seller
 */
@ApiModel(description = "Model containing info about the seller")
@Validated
@Entity
@Table(name="Seller_Details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T11:51:13.410Z[GMT]")
public class Seller   {
  @JsonProperty("SellerId")
  @Id
  private Long sellerId=0L;

  @JsonProperty("SellerName")
  private String sellerName = null;

  public Seller sellerId(Long sellerId) {
    this.sellerId = sellerId;
    return this;
  }

  /**
   * Get sellerId
   * @return sellerId
  **/
  @ApiModelProperty(example = "23456", value = "")
  
    public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }

  public Seller sellerName(String sellerName) {
    this.sellerName = sellerName;
    return this;
  }

  /**
   * Get sellerName
   * @return sellerName
  **/
  @ApiModelProperty(example = "Raju", value = "")
  
    public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seller seller = (Seller) o;
    return Objects.equals(this.sellerId, seller.sellerId) &&
        Objects.equals(this.sellerName, seller.sellerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, sellerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seller {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
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
