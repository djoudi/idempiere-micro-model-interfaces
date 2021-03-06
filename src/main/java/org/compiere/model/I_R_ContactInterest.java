package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_ContactInterest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_ContactInterest {

  /** TableName=R_ContactInterest */
  public static final String Table_Name = "R_ContactInterest";

  /** AD_Table_ID=528 */
  public static final int Table_ID = 528;

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

  /** Column name AD_User_ID */
  public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  public void setAD_User_ID(int AD_User_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  public int getAD_User_ID();

  public I_AD_User getAD_User() throws RuntimeException;

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

  /** Column name OptOutDate */
  public static final String COLUMNNAME_OptOutDate = "OptOutDate";

  /** Set Opt-out Date. Date the contact opted out */
  public void setOptOutDate(Timestamp OptOutDate);

  /** Get Opt-out Date. Date the contact opted out */
  public Timestamp getOptOutDate();

  /** Column name R_ContactInterest_UU */
  public static final String COLUMNNAME_R_ContactInterest_UU = "R_ContactInterest_UU";

  /** Set R_ContactInterest_UU */
  public void setR_ContactInterest_UU(String R_ContactInterest_UU);

  /** Get R_ContactInterest_UU */
  public String getR_ContactInterest_UU();

  /** Column name R_InterestArea_ID */
  public static final String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";

  /** Set Interest Area. Interest Area or Topic */
  public void setR_InterestArea_ID(int R_InterestArea_ID);

  /** Get Interest Area. Interest Area or Topic */
  public int getR_InterestArea_ID();

  public I_R_InterestArea getR_InterestArea() throws RuntimeException;

  /** Column name SubscribeDate */
  public static final String COLUMNNAME_SubscribeDate = "SubscribeDate";

  /** Set Subscribe Date. Date the contact actively subscribed */
  public void setSubscribeDate(Timestamp SubscribeDate);

  /** Get Subscribe Date. Date the contact actively subscribed */
  public Timestamp getSubscribeDate();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
