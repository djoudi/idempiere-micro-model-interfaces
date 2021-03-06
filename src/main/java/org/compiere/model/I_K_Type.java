package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Type
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Type {

  /** TableName=K_Type */
  public static final String Table_Name = "K_Type";

  /** AD_Table_ID=606 */
  public static final int Table_ID = 606;

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

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name Help */
  public static final String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  public void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  public String getHelp();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsPublic */
  public static final String COLUMNNAME_IsPublic = "IsPublic";

  /** Set Public. Public can read entry */
  public void setIsPublic(boolean IsPublic);

  /** Get Public. Public can read entry */
  public boolean isPublic();

  /** Column name IsPublicWrite */
  public static final String COLUMNNAME_IsPublicWrite = "IsPublicWrite";

  /** Set Public Write. Public can write entries */
  public void setIsPublicWrite(boolean IsPublicWrite);

  /** Get Public Write. Public can write entries */
  public boolean isPublicWrite();

  /** Column name K_Type_ID */
  public static final String COLUMNNAME_K_Type_ID = "K_Type_ID";

  /** Set Knowledge Type. Knowledge Type */
  public void setK_Type_ID(int K_Type_ID);

  /** Get Knowledge Type. Knowledge Type */
  public int getK_Type_ID();

  /** Column name K_Type_UU */
  public static final String COLUMNNAME_K_Type_UU = "K_Type_UU";

  /** Set K_Type_UU */
  public void setK_Type_UU(String K_Type_UU);

  /** Get K_Type_UU */
  public String getK_Type_UU();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
