package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Phase
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Phase {

  /** TableName=C_Phase */
  public static final String Table_Name = "C_Phase";

  /** AD_Table_ID=577 */
  public static final int Table_ID = 577;

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

  /** Column name C_Phase_ID */
  public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";

  /** Set Standard Phase. Standard Phase of the Project Type */
  public void setC_Phase_ID(int C_Phase_ID);

  /** Get Standard Phase. Standard Phase of the Project Type */
  public int getC_Phase_ID();

  /** Column name C_Phase_UU */
  public static final String COLUMNNAME_C_Phase_UU = "C_Phase_UU";

  /** Set C_Phase_UU */
  public void setC_Phase_UU(String C_Phase_UU);

  /** Get C_Phase_UU */
  public String getC_Phase_UU();

  /** Column name C_ProjectType_ID */
  public static final String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";

  /** Set Project Type. Type of the project */
  public void setC_ProjectType_ID(int C_ProjectType_ID);

  /** Get Project Type. Type of the project */
  public int getC_ProjectType_ID();

  public I_C_ProjectType getC_ProjectType() throws RuntimeException;

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

  /** Column name M_Product_ID */
  public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

  /** Set Product. Product, Service, Item */
  public void setM_Product_ID(int M_Product_ID);

  /** Get Product. Product, Service, Item */
  public int getM_Product_ID();

  public I_M_Product getM_Product() throws RuntimeException;

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name SeqNo */
  public static final String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  public void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  public int getSeqNo();

  /** Column name StandardQty */
  public static final String COLUMNNAME_StandardQty = "StandardQty";

  /** Set Standard Quantity. Standard Quantity */
  public void setStandardQty(BigDecimal StandardQty);

  /** Get Standard Quantity. Standard Quantity */
  public BigDecimal getStandardQty();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
