package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Exp
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Exp {

  /** TableName=AD_Package_Exp */
  public static final String Table_Name = "AD_Package_Exp";

  /** AD_Table_ID=50005 */
  public static final int Table_ID = 50005;

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

  /** Column name AD_Package_Exp_ID */
  public static final String COLUMNNAME_AD_Package_Exp_ID = "AD_Package_Exp_ID";

  /** Set Package Exp. */
  public void setAD_Package_Exp_ID(int AD_Package_Exp_ID);

  /** Get Package Exp. */
  public int getAD_Package_Exp_ID();

  /** Column name AD_Package_Exp_UU */
  public static final String COLUMNNAME_AD_Package_Exp_UU = "AD_Package_Exp_UU";

  /** Set AD_Package_Exp_UU */
  public void setAD_Package_Exp_UU(String AD_Package_Exp_UU);

  /** Get AD_Package_Exp_UU */
  public String getAD_Package_Exp_UU();

  /** Column name AD_Package_Type */
  public static final String COLUMNNAME_AD_Package_Type = "AD_Package_Type";

  /** Set Package Type */
  public void setAD_Package_Type(String AD_Package_Type);

  /** Get Package Type */
  public String getAD_Package_Type();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name DateFrom */
  public static final String COLUMNNAME_DateFrom = "DateFrom";

  /** Set Date From. Starting date for a range */
  public void setDateFrom(Timestamp DateFrom);

  /** Get Date From. Starting date for a range */
  public Timestamp getDateFrom();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name EMail */
  public static final String COLUMNNAME_EMail = "EMail";

  /** Set EMail Address. Electronic Mail Address */
  public void setEMail(String EMail);

  /** Get EMail Address. Electronic Mail Address */
  public String getEMail();

  /** Column name File_Directory */
  public static final String COLUMNNAME_File_Directory = "File_Directory";

  /** Set File_Directory */
  public void setFile_Directory(String File_Directory);

  /** Get File_Directory */
  public String getFile_Directory();

  /** Column name Instructions */
  public static final String COLUMNNAME_Instructions = "Instructions";

  /** Set Instructions */
  public void setInstructions(String Instructions);

  /** Get Instructions */
  public String getInstructions();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsExportDictionaryEntity */
  public static final String COLUMNNAME_IsExportDictionaryEntity = "IsExportDictionaryEntity";

  /** Set Export Dictionary Entity */
  public void setIsExportDictionaryEntity(boolean IsExportDictionaryEntity);

  /** Get Export Dictionary Entity */
  public boolean isExportDictionaryEntity();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name PK_Version */
  public static final String COLUMNNAME_PK_Version = "PK_Version";

  /** Set Package Version */
  public void setPK_Version(String PK_Version);

  /** Get Package Version */
  public String getPK_Version();

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

  /** Column name ReleaseNo */
  public static final String COLUMNNAME_ReleaseNo = "ReleaseNo";

  /** Set Release No. Internal Release Number */
  public void setReleaseNo(String ReleaseNo);

  /** Get Release No. Internal Release Number */
  public String getReleaseNo();

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

  /** Column name Version */
  public static final String COLUMNNAME_Version = "Version";

  /** Set Version. Version of the table definition */
  public void setVersion(String Version);

  /** Get Version. Version of the table definition */
  public String getVersion();
}
