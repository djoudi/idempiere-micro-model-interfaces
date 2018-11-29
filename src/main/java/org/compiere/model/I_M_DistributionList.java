package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DistributionList
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DistributionList {

  /** TableName=M_DistributionList */
  public static final String Table_Name = "M_DistributionList";

  /** AD_Table_ID=666 */
  public static final int Table_ID = 666;

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

  /** Column name M_DistributionList_ID */
  public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";

  /**
   * Set Distribution List. Distribution Lists allow to distribute products to a selected list of
   * partners
   */
  public void setM_DistributionList_ID(int M_DistributionList_ID);

  /**
   * Get Distribution List. Distribution Lists allow to distribute products to a selected list of
   * partners
   */
  public int getM_DistributionList_ID();

  /** Column name M_DistributionList_UU */
  public static final String COLUMNNAME_M_DistributionList_UU = "M_DistributionList_UU";

  /** Set M_DistributionList_UU */
  public void setM_DistributionList_UU(String M_DistributionList_UU);

  /** Get M_DistributionList_UU */
  public String getM_DistributionList_UU();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name RatioTotal */
  public static final String COLUMNNAME_RatioTotal = "RatioTotal";

  /** Set Total Ratio. Total of relative weight in a distribution */
  public void setRatioTotal(BigDecimal RatioTotal);

  /** Get Total Ratio. Total of relative weight in a distribution */
  public BigDecimal getRatioTotal();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}