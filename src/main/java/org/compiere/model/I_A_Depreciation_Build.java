package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Build
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Build {

  /** TableName=A_Depreciation_Build */
  public static final String Table_Name = "A_Depreciation_Build";

  /** AD_Table_ID=53129 */
  public static final int Table_ID = 53129;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Depreciation_Build_ID */
  public static final String COLUMNNAME_A_Depreciation_Build_ID = "A_Depreciation_Build_ID";

  /** Set Build Depreciation */
  public void setA_Depreciation_Build_ID(int A_Depreciation_Build_ID);

  /** Get Build Depreciation */
  public int getA_Depreciation_Build_ID();

  /** Column name A_Depreciation_Build_UU */
  public static final String COLUMNNAME_A_Depreciation_Build_UU = "A_Depreciation_Build_UU";

  /** Set A_Depreciation_Build_UU */
  public void setA_Depreciation_Build_UU(String A_Depreciation_Build_UU);

  /** Get A_Depreciation_Build_UU */
  public String getA_Depreciation_Build_UU();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name A_End_Asset_ID */
  public static final String COLUMNNAME_A_End_Asset_ID = "A_End_Asset_ID";

  /** Set To Asset */
  public void setA_End_Asset_ID(int A_End_Asset_ID);

  /** Get To Asset */
  public int getA_End_Asset_ID();

  public I_A_Asset getA_End_Asset() throws RuntimeException;

  /** Column name A_Start_Asset_ID */
  public static final String COLUMNNAME_A_Start_Asset_ID = "A_Start_Asset_ID";

  /** Set From Asset */
  public void setA_Start_Asset_ID(int A_Start_Asset_ID);

  /** Get From Asset */
  public int getA_Start_Asset_ID();

  public I_A_Asset getA_Start_Asset() throws RuntimeException;

  /** Column name C_Period_ID */
  public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

  /** Set Period. Period of the Calendar */
  public void setC_Period_ID(int C_Period_ID);

  /** Get Period. Period of the Calendar */
  public int getC_Period_ID();

  public I_C_Period getC_Period() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name DateAcct */
  public static final String COLUMNNAME_DateAcct = "DateAcct";

  /** Set Account Date. Accounting Date */
  public void setDateAcct(Timestamp DateAcct);

  /** Get Account Date. Accounting Date */
  public Timestamp getDateAcct();

  /** Column name DateDoc */
  public static final String COLUMNNAME_DateDoc = "DateDoc";

  /** Set Document Date. Date of the Document */
  public void setDateDoc(Timestamp DateDoc);

  /** Get Document Date. Date of the Document */
  public Timestamp getDateDoc();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name PeriodNo */
  public static final String COLUMNNAME_PeriodNo = "PeriodNo";

  /** Set Period No. Unique Period Number */
  public void setPeriodNo(int PeriodNo);

  /** Get Period No. Unique Period Number */
  public int getPeriodNo();

  /** Column name PostingType */
  public static final String COLUMNNAME_PostingType = "PostingType";

  /** Set PostingType. The type of posted amount for the transaction */
  public void setPostingType(String PostingType);

  /** Get PostingType. The type of posted amount for the transaction */
  public String getPostingType();

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

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
