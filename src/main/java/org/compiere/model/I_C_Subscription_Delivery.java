package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Subscription_Delivery
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Subscription_Delivery {

  /** TableName=C_Subscription_Delivery */
  public static final String Table_Name = "C_Subscription_Delivery";

  /** AD_Table_ID=667 */
  public static final int Table_ID = 667;

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

  /** Column name C_Subscription_Delivery_ID */
  public static final String COLUMNNAME_C_Subscription_Delivery_ID = "C_Subscription_Delivery_ID";

  /** Set Subscription Delivery. Optional Delivery Record for a Subscription */
  public void setC_Subscription_Delivery_ID(int C_Subscription_Delivery_ID);

  /** Get Subscription Delivery. Optional Delivery Record for a Subscription */
  public int getC_Subscription_Delivery_ID();

  /** Column name C_Subscription_Delivery_UU */
  public static final String COLUMNNAME_C_Subscription_Delivery_UU = "C_Subscription_Delivery_UU";

  /** Set C_Subscription_Delivery_UU */
  public void setC_Subscription_Delivery_UU(String C_Subscription_Delivery_UU);

  /** Get C_Subscription_Delivery_UU */
  public String getC_Subscription_Delivery_UU();

  /** Column name C_Subscription_ID */
  public static final String COLUMNNAME_C_Subscription_ID = "C_Subscription_ID";

  /** Set Subscription. Subscription of a Business Partner of a Product to renew */
  public void setC_Subscription_ID(int C_Subscription_ID);

  /** Get Subscription. Subscription of a Business Partner of a Product to renew */
  public int getC_Subscription_ID();

  public I_C_Subscription getC_Subscription() throws RuntimeException;

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
