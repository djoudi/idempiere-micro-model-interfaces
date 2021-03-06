package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeInstance {

  /** TableName=M_AttributeInstance */
  public static final String Table_Name = "M_AttributeInstance";

  /** AD_Table_ID=561 */
  public static final int Table_ID = 561;

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

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name M_Attribute_ID */
  public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";

  /** Set Attribute. Product Attribute */
  public void setMAttributeID(int M_Attribute_ID);

  /** Get Attribute. Product Attribute */
  public int getMAttribute_ID();

  public I_M_Attribute getMAttribute() throws RuntimeException;

  /** Column name M_AttributeInstance_UU */
  public static final String COLUMNNAME_M_AttributeInstance_UU = "M_AttributeInstance_UU";

  /** Set M_AttributeInstance_UU */
  public void setM_AttributeInstance_UU(String M_AttributeInstance_UU);

  /** Get M_AttributeInstance_UU */
  public String getMAttributeInstance_UU();

  /** Column name M_AttributeSetInstance_ID */
  public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  public void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  public int getMAttributeSetInstance_ID();

  public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Column name M_AttributeValue_ID */
  public static final String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";

  /** Set Attribute Value. Product Attribute Value */
  public void setM_AttributeValue_ID(int M_AttributeValue_ID);

  /** Get Attribute Value. Product Attribute Value */
  public int getMAttributeValue_ID();

  public I_M_AttributeValue getMAttributeValue() throws RuntimeException;

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

  /** Column name ValueNumber */
  public static final String COLUMNNAME_ValueNumber = "ValueNumber";

  /** Set Value. Numeric Value */
  public void setValueNumber(BigDecimal ValueNumber);

  /** Get Value. Numeric Value */
  public BigDecimal getValueNumber();
}
