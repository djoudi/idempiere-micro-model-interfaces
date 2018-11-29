package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperLabelsCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperLabelsCfg {

  /** TableName=M_ShipperLabelsCfg */
  public static final String Table_Name = "M_ShipperLabelsCfg";

  /** AD_Table_ID=200048 */
  public static final int Table_ID = 200048;

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

  /** Column name Height */
  public static final String COLUMNNAME_Height = "Height";

  /** Set Height */
  public void setHeight(BigDecimal Height);

  /** Get Height */
  public BigDecimal getHeight();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsDefault */
  public static final String COLUMNNAME_IsDefault = "IsDefault";

  /** Set Default. Default value */
  public void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  public boolean isDefault();

  /** Column name LabelPrintMethod */
  public static final String COLUMNNAME_LabelPrintMethod = "LabelPrintMethod";

  /** Set Label Print Method */
  public void setLabelPrintMethod(String LabelPrintMethod);

  /** Get Label Print Method */
  public String getLabelPrintMethod();

  /** Column name M_ShipperCfg_ID */
  public static final String COLUMNNAME_M_ShipperCfg_ID = "M_ShipperCfg_ID";

  /** Set Shipper Configuration */
  public void setM_ShipperCfg_ID(int M_ShipperCfg_ID);

  /** Get Shipper Configuration */
  public int getM_ShipperCfg_ID();

  public I_M_ShipperCfg getM_ShipperCfg() throws RuntimeException;

  /** Column name M_ShipperLabelsCfg_ID */
  public static final String COLUMNNAME_M_ShipperLabelsCfg_ID = "M_ShipperLabelsCfg_ID";

  /** Set Shipper Labels Configuration */
  public void setM_ShipperLabelsCfg_ID(int M_ShipperLabelsCfg_ID);

  /** Get Shipper Labels Configuration */
  public int getM_ShipperLabelsCfg_ID();

  /** Column name M_ShipperLabelsCfg_UU */
  public static final String COLUMNNAME_M_ShipperLabelsCfg_UU = "M_ShipperLabelsCfg_UU";

  /** Set M_ShipperLabelsCfg_UU */
  public void setM_ShipperLabelsCfg_UU(String M_ShipperLabelsCfg_UU);

  /** Get M_ShipperLabelsCfg_UU */
  public String getM_ShipperLabelsCfg_UU();

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

  /** Column name Value */
  public static final String COLUMNNAME_Value = "Value";

  /** Set Search Key. Search key for the record in the format required - must be unique */
  public void setValue(String Value);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  public String getValue();

  /** Column name Width */
  public static final String COLUMNNAME_Width = "Width";

  /** Set Width */
  public void setWidth(BigDecimal Width);

  /** Get Width */
  public BigDecimal getWidth();
}