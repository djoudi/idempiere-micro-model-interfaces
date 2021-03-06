package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_IssueUser
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_IssueUser {

  /** TableName=R_IssueUser */
  public static final String Table_Name = "R_IssueUser";

  /** AD_Table_ID=841 */
  public static final int Table_ID = 841;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

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

  /** Column name R_IssueUser_ID */
  public static final String COLUMNNAME_R_IssueUser_ID = "R_IssueUser_ID";

  /** Set IssueUser. User who reported issues */
  public void setR_IssueUser_ID(int R_IssueUser_ID);

  /** Get IssueUser. User who reported issues */
  public int getR_IssueUser_ID();

  /** Column name R_IssueUser_UU */
  public static final String COLUMNNAME_R_IssueUser_UU = "R_IssueUser_UU";

  /** Set R_IssueUser_UU */
  public void setR_IssueUser_UU(String R_IssueUser_UU);

  /** Get R_IssueUser_UU */
  public String getR_IssueUser_UU();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name UserName */
  public static final String COLUMNNAME_UserName = "UserName";

  /** Set User Name */
  public void setUserName(String UserName);

  /** Get User Name */
  public String getUserName();
}
