package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_MRP_CRP
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_T_MRP_CRP {

  /** TableName=T_MRP_CRP */
  public static final String Table_Name = "T_MRP_CRP";

  /** AD_Table_ID=53044 */
  public static final int Table_ID = 53044;

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

  /** Column name AD_PInstance_ID */
  public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

  /** Set Process Instance. Instance of the process */
  public void setAD_PInstance_ID(int AD_PInstance_ID);

  /** Get Process Instance. Instance of the process */
  public int getAD_PInstance_ID();

  public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException;

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

  /** Column name SeqNo */
  public static final String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  public void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  public int getSeqNo();

  /** Column name T_MRP_CRP_ID */
  public static final String COLUMNNAME_T_MRP_CRP_ID = "T_MRP_CRP_ID";

  /** Set Temporal MRP & CRP */
  public void setT_MRP_CRP_ID(int T_MRP_CRP_ID);

  /** Get Temporal MRP & CRP */
  public int getT_MRP_CRP_ID();

  /** Column name T_MRP_CRP_UU */
  public static final String COLUMNNAME_T_MRP_CRP_UU = "T_MRP_CRP_UU";

  /** Set T_MRP_CRP_UU */
  public void setT_MRP_CRP_UU(String T_MRP_CRP_UU);

  /** Get T_MRP_CRP_UU */
  public String getT_MRP_CRP_UU();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
