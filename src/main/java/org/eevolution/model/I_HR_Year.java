package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for HR_Year
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Year {

  /** TableName=HR_Year */
  public static final String Table_Name = "HR_Year";

  /** AD_Table_ID=53095 */
  public static final int Table_ID = 53095;

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

  /** Column name C_Year_ID */
  public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";

  /** Set Year. Calendar Year */
  public void setC_Year_ID(int C_Year_ID);

  /** Get Year. Calendar Year */
  public int getC_Year_ID();

  public org.compiere.model.I_C_Year getC_Year() throws RuntimeException;

  /** Column name HR_Payroll_ID */
  public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";

  /** Set Payroll */
  public void setHR_Payroll_ID(int HR_Payroll_ID);

  /** Get Payroll */
  public int getHR_Payroll_ID();

  public org.eevolution.model.I_HR_Payroll getHR_Payroll() throws RuntimeException;

  /** Column name HR_Year_ID */
  public static final String COLUMNNAME_HR_Year_ID = "HR_Year_ID";

  /** Set Payroll Year */
  public void setHR_Year_ID(int HR_Year_ID);

  /** Get Payroll Year */
  public int getHR_Year_ID();

  /** Column name HR_Year_UU */
  public static final String COLUMNNAME_HR_Year_UU = "HR_Year_UU";

  /** Set HR_Year_UU */
  public void setHR_Year_UU(String HR_Year_UU);

  /** Get HR_Year_UU */
  public String getHR_Year_UU();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name NetDays */
  public static final String COLUMNNAME_NetDays = "NetDays";

  /** Set Net Days. Net Days in which payment is due */
  public void setNetDays(int NetDays);

  /** Get Net Days. Net Days in which payment is due */
  public int getNetDays();

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name Qty */
  public static final String COLUMNNAME_Qty = "Qty";

  /** Set Quantity. Quantity */
  public void setQty(int Qty);

  /** Get Quantity. Quantity */
  public int getQty();

  /** Column name StartDate */
  public static final String COLUMNNAME_StartDate = "StartDate";

  /** Set Start Date. First effective day (inclusive) */
  public void setStartDate(Timestamp StartDate);

  /** Get Start Date. First effective day (inclusive) */
  public Timestamp getStartDate();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
