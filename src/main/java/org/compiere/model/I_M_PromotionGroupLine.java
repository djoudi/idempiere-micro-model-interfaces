package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionGroupLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionGroupLine {

  /** TableName=M_PromotionGroupLine */
  public static final String Table_Name = "M_PromotionGroupLine";

  /** AD_Table_ID=53177 */
  public static final int Table_ID = 53177;

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

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name M_Product_ID */
  public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

  /** Set Product. Product, Service, Item */
  public void setM_Product_ID(int M_Product_ID);

  /** Get Product. Product, Service, Item */
  public int getM_Product_ID();

  public I_M_Product getM_Product() throws RuntimeException;

  /** Column name M_PromotionGroup_ID */
  public static final String COLUMNNAME_M_PromotionGroup_ID = "M_PromotionGroup_ID";

  /** Set Promotion Group */
  public void setM_PromotionGroup_ID(int M_PromotionGroup_ID);

  /** Get Promotion Group */
  public int getM_PromotionGroup_ID();

  public I_M_PromotionGroup getM_PromotionGroup() throws RuntimeException;

  /** Column name M_PromotionGroupLine_ID */
  public static final String COLUMNNAME_M_PromotionGroupLine_ID = "M_PromotionGroupLine_ID";

  /** Set Promotion Group Line */
  public void setM_PromotionGroupLine_ID(int M_PromotionGroupLine_ID);

  /** Get Promotion Group Line */
  public int getM_PromotionGroupLine_ID();

  /** Column name M_PromotionGroupLine_UU */
  public static final String COLUMNNAME_M_PromotionGroupLine_UU = "M_PromotionGroupLine_UU";

  /** Set M_PromotionGroupLine_UU */
  public void setM_PromotionGroupLine_UU(String M_PromotionGroupLine_UU);

  /** Get M_PromotionGroupLine_UU */
  public String getM_PromotionGroupLine_UU();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
