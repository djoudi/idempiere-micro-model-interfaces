package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Promotion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Promotion {

  /** TableName=M_Promotion */
  public static final String Table_Name = "M_Promotion";

  /** AD_Table_ID=53178 */
  public static final int Table_ID = 53178;

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

  /** Column name C_Campaign_ID */
  public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

  /** Set Campaign. Marketing Campaign */
  public void setC_Campaign_ID(int C_Campaign_ID);

  /** Get Campaign. Marketing Campaign */
  public int getC_Campaign_ID();

  public I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name M_Promotion_ID */
  public static final String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";

  /** Set Promotion */
  public void setM_Promotion_ID(int M_Promotion_ID);

  /** Get Promotion */
  public int getM_Promotion_ID();

  /** Column name M_Promotion_UU */
  public static final String COLUMNNAME_M_Promotion_UU = "M_Promotion_UU";

  /** Set M_Promotion_UU */
  public void setM_Promotion_UU(String M_Promotion_UU);

  /** Get M_Promotion_UU */
  public String getM_Promotion_UU();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name PromotionPriority */
  public static final String COLUMNNAME_PromotionPriority = "PromotionPriority";

  /** Set Relative Priority. Which promotion should be apply to a product */
  public void setPromotionPriority(int PromotionPriority);

  /** Get Relative Priority. Which promotion should be apply to a product */
  public int getPromotionPriority();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}