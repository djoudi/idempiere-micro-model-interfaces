package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DiscountSchema
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DiscountSchema {

  /** TableName=M_DiscountSchema */
  public static final String Table_Name = "M_DiscountSchema";

  /** AD_Table_ID=475 */
  public static final int Table_ID = 475;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name CumulativeLevel */
  public static final String COLUMNNAME_CumulativeLevel = "CumulativeLevel";

  /** Set Accumulation Level. Level for accumulative calculations */
  public void setCumulativeLevel(String CumulativeLevel);

  /** Get Accumulation Level. Level for accumulative calculations */
  public String getCumulativeLevel();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name DiscountType */
  public static final String COLUMNNAME_DiscountType = "DiscountType";

  /** Set Discount Type. Type of trade discount calculation */
  public void setDiscountType(String DiscountType);

  /** Get Discount Type. Type of trade discount calculation */
  public String getDiscountType();

  /** Column name FlatDiscount */
  public static final String COLUMNNAME_FlatDiscount = "FlatDiscount";

  /** Set Flat Discount %. Flat discount percentage */
  public void setFlatDiscount(BigDecimal FlatDiscount);

  /** Get Flat Discount %. Flat discount percentage */
  public BigDecimal getFlatDiscount();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsBPartnerFlatDiscount */
  public static final String COLUMNNAME_IsBPartnerFlatDiscount = "IsBPartnerFlatDiscount";

  /** Set B.Partner Flat Discount. Use flat discount defined on Business Partner Level */
  public void setIsBPartnerFlatDiscount(boolean IsBPartnerFlatDiscount);

  /** Get B.Partner Flat Discount. Use flat discount defined on Business Partner Level */
  public boolean isBPartnerFlatDiscount();

  /** Column name IsQuantityBased */
  public static final String COLUMNNAME_IsQuantityBased = "IsQuantityBased";

  /** Set Quantity based. Trade discount break level based on Quantity (not value) */
  public void setIsQuantityBased(boolean IsQuantityBased);

  /** Get Quantity based. Trade discount break level based on Quantity (not value) */
  public boolean isQuantityBased();

  /** Column name M_DiscountSchema_ID */
  public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";

  /** Set Discount Schema. Schema to calculate the trade discount percentage */
  public void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

  /** Get Discount Schema. Schema to calculate the trade discount percentage */
  public int getM_DiscountSchema_ID();

  /** Column name M_DiscountSchema_UU */
  public static final String COLUMNNAME_M_DiscountSchema_UU = "M_DiscountSchema_UU";

  /** Set M_DiscountSchema_UU */
  public void setM_DiscountSchema_UU(String M_DiscountSchema_UU);

  /** Get M_DiscountSchema_UU */
  public String getM_DiscountSchema_UU();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name Script */
  public static final String COLUMNNAME_Script = "Script";

  /** Set Script. Dynamic Java Language Script to calculate result */
  public void setScript(String Script);

  /** Get Script. Dynamic Java Language Script to calculate result */
  public String getScript();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name ValidFrom */
  public static final String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Valid from. Valid from including this date (first day) */
  public void setValidFrom(Timestamp ValidFrom);

  /** Get Valid from. Valid from including this date (first day) */
  public Timestamp getValidFrom();
}