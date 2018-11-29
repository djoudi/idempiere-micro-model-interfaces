package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Convention
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Convention {

  /** TableName=A_Depreciation_Convention */
  public static final String Table_Name = "A_Depreciation_Convention";

  /** AD_Table_ID=53125 */
  public static final int Table_ID = 53125;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Depreciation_Convention_ID */
  public static final String COLUMNNAME_A_Depreciation_Convention_ID =
      "A_Depreciation_Convention_ID";

  /** Set Depreciation Convention */
  public void setA_Depreciation_Convention_ID(int A_Depreciation_Convention_ID);

  /** Get Depreciation Convention */
  public int getA_Depreciation_Convention_ID();

  /** Column name A_Depreciation_Convention_UU */
  public static final String COLUMNNAME_A_Depreciation_Convention_UU =
      "A_Depreciation_Convention_UU";

  /** Set A_Depreciation_Convention_UU */
  public void setA_Depreciation_Convention_UU(String A_Depreciation_Convention_UU);

  /** Get A_Depreciation_Convention_UU */
  public String getA_Depreciation_Convention_UU();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name ConventionType */
  public static final String COLUMNNAME_ConventionType = "ConventionType";

  /** Set ConventionType */
  public void setConventionType(String ConventionType);

  /** Get ConventionType */
  public String getConventionType();

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

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

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

  /** Column name TextMsg */
  public static final String COLUMNNAME_TextMsg = "TextMsg";

  /** Set Text Message. Text Message */
  public void setTextMsg(String TextMsg);

  /** Get Text Message. Text Message */
  public String getTextMsg();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}