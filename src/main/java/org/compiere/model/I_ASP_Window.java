package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Window
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Window {

  /** TableName=ASP_Window */
  public static final String Table_Name = "ASP_Window";

  /** AD_Table_ID=53046 */
  public static final int Table_ID = 53046;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name AD_Window_ID */
  public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";

  /** Set Window. Data entry or display window */
  public void setAD_Window_ID(int AD_Window_ID);

  /** Get Window. Data entry or display window */
  public int getAD_Window_ID();

  public I_AD_Window getAD_Window() throws RuntimeException;

  /** Column name ASP_Level_ID */
  public static final String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";

  /** Set ASP Level */
  public void setASP_Level_ID(int ASP_Level_ID);

  /** Get ASP Level */
  public int getASP_Level_ID();

  public I_ASP_Level getASP_Level() throws RuntimeException;

  /** Column name ASP_Status */
  public static final String COLUMNNAME_ASP_Status = "ASP_Status";

  /** Set ASP Status */
  public void setASP_Status(String ASP_Status);

  /** Get ASP Status */
  public String getASP_Status();

  /** Column name ASP_Window_ID */
  public static final String COLUMNNAME_ASP_Window_ID = "ASP_Window_ID";

  /** Set ASP Window */
  public void setASP_Window_ID(int ASP_Window_ID);

  /** Get ASP Window */
  public int getASP_Window_ID();

  /** Column name ASP_Window_UU */
  public static final String COLUMNNAME_ASP_Window_UU = "ASP_Window_UU";

  /** Set ASP_Window_UU */
  public void setASP_Window_UU(String ASP_Window_UU);

  /** Get ASP_Window_UU */
  public String getASP_Window_UU();

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

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}