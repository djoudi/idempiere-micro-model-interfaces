package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ReplicationDocument
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ReplicationDocument {

  /** TableName=AD_ReplicationDocument */
  public static final String Table_Name = "AD_ReplicationDocument";

  /** AD_Table_ID=53071 */
  public static final int Table_ID = 53071;

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

  /** Column name AD_ReplicationDocument_ID */
  public static final String COLUMNNAME_AD_ReplicationDocument_ID = "AD_ReplicationDocument_ID";

  /** Set Replication Document */
  public void setAD_ReplicationDocument_ID(int AD_ReplicationDocument_ID);

  /** Get Replication Document */
  public int getAD_ReplicationDocument_ID();

  /** Column name AD_ReplicationDocument_UU */
  public static final String COLUMNNAME_AD_ReplicationDocument_UU = "AD_ReplicationDocument_UU";

  /** Set AD_ReplicationDocument_UU */
  public void setAD_ReplicationDocument_UU(String AD_ReplicationDocument_UU);

  /** Get AD_ReplicationDocument_UU */
  public String getAD_ReplicationDocument_UU();

  /** Column name AD_ReplicationStrategy_ID */
  public static final String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";

  /** Set Replication Strategy. Data Replication Strategy */
  public void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  /** Get Replication Strategy. Data Replication Strategy */
  public int getADReplicationStrategyID();

  /** Column name AD_Table_ID */
  public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  public void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  public int getAD_Table_ID();

  public I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name C_DocType_ID */
  public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

  /** Set Document Type. Document type or rules */
  public void setC_DocType_ID(int C_DocType_ID);

  /** Get Document Type. Document type or rules */
  public int getC_DocType_ID();

  public I_C_DocType getC_DocType() throws RuntimeException;

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

  /** Column name ReplicationType */
  public static final String COLUMNNAME_ReplicationType = "ReplicationType";

  /** Set Replication Type. Type of Data Replication */
  public void setReplicationType(String ReplicationType);

  /** Get Replication Type. Type of Data Replication */
  public String getReplicationType();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}