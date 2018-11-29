package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Scheduler
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Scheduler {

  /** TableName=AD_Scheduler */
  public static final String Table_Name = "AD_Scheduler";

  /** AD_Table_ID=688 */
  public static final int Table_ID = 688;

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

  /** Column name AD_Process_ID */
  public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";

  /** Set Process. Process or Report */
  public void setAD_Process_ID(int AD_Process_ID);

  /** Get Process. Process or Report */
  public int getAD_Process_ID();

  public I_AD_Process getAD_Process() throws RuntimeException;

  /** Column name AD_Schedule_ID */
  public static final String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";

  /** Set Schedule */
  public void setAD_Schedule_ID(int AD_Schedule_ID);

  /** Get Schedule */
  public int getAD_Schedule_ID();

  public I_AD_Schedule getAD_Schedule() throws RuntimeException;

  /** Column name AD_Scheduler_ID */
  public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";

  /** Set Scheduler. Schedule Processes */
  public void setAD_Scheduler_ID(int AD_Scheduler_ID);

  /** Get Scheduler. Schedule Processes */
  public int getAD_Scheduler_ID();

  /** Column name AD_Scheduler_UU */
  public static final String COLUMNNAME_AD_Scheduler_UU = "AD_Scheduler_UU";

  /** Set AD_Scheduler_UU */
  public void setAD_Scheduler_UU(String AD_Scheduler_UU);

  /** Get AD_Scheduler_UU */
  public String getAD_Scheduler_UU();

  /** Column name AD_Table_ID */
  public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  public void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  public int getAD_Table_ID();

  public I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name DateLastRun */
  public static final String COLUMNNAME_DateLastRun = "DateLastRun";

  /** Set Date last run. Date the process was last run. */
  public void setDateLastRun(Timestamp DateLastRun);

  /** Get Date last run. Date the process was last run. */
  public Timestamp getDateLastRun();

  /** Column name DateNextRun */
  public static final String COLUMNNAME_DateNextRun = "DateNextRun";

  /** Set Date next run. Date the process will run next */
  public void setDateNextRun(Timestamp DateNextRun);

  /** Get Date next run. Date the process will run next */
  public Timestamp getDateNextRun();

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

  /** Column name KeepLogDays */
  public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";

  /** Set Days to keep Log. Number of days to keep the log entries */
  public void setKeepLogDays(int KeepLogDays);

  /** Get Days to keep Log. Number of days to keep the log entries */
  public int getKeepLogDays();

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

  /** Column name Record_ID */
  public static final String COLUMNNAME_Record_ID = "Record_ID";

  /** Set Record ID. Direct internal record ID */
  public void setRecord_ID(int Record_ID);

  /** Get Record ID. Direct internal record ID */
  public int getRecord_ID();

  /** Column name R_MailText_ID */
  public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";

  /** Set Mail Template. Text templates for mailings */
  public void setR_MailText_ID(int R_MailText_ID);

  /** Get Mail Template. Text templates for mailings */
  public int getR_MailText_ID();

  public I_R_MailText getR_MailText() throws RuntimeException;

  /** Column name Supervisor_ID */
  public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

  /** Set Supervisor. Supervisor for this user/organization - used for escalation and approval */
  public void setSupervisor_ID(int Supervisor_ID);

  /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  public int getSupervisor_ID();

  public I_AD_User getSupervisor() throws RuntimeException;

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}