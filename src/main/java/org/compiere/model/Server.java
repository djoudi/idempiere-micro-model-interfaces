package org.compiere.model;

import java.util.Properties;

/** Interface for adempiere/Server. */
public interface Server {
  /**
   * Post Immediate
   *
   * @param ctx Client Context
   * @param AD_Client_ID Client ID of Document
   * @param AD_Table_ID Table ID of Document
   * @param Record_ID Record ID of this document
   * @param force force posting
   * @return null, if success or error message
   */
  public String postImmediate(
      Properties ctx, int AD_Client_ID, int AD_Table_ID, int Record_ID, boolean force);

  /**
   * Process Remote
   *
   * @param ctx Context
   * @param pi Process Info
   * @return resulting Process Info
   */
  public IProcessInfo process(Properties ctx, IProcessInfo pi);

  /**
   * Run Workflow (and wait) on Server
   *
   * @param ctx Context
   * @param pi Process Info
   * @param AD_Workflow_ID id
   * @return process info
   */
  public IProcessInfo workflow(Properties ctx, IProcessInfo pi, int AD_Workflow_ID);

  /**
   * Send EMail from Server
   *
   * @param ctx Context
   * @param email
   * @return message return from email server
   */
  public String sendEMail(Properties ctx, IEMail email);

  /**
   * Execute task on server
   *
   * @param ctx Context
   * @param AD_Task_ID task
   * @return execution trace
   */
  public String executeTask(Properties ctx, int AD_Task_ID);

  /**
   * Cash Reset
   *
   * @param ctx Context
   * @param tableName table name
   * @param Record_ID record or 0 for all
   * @return number of records reset
   */
  public int cacheReset(Properties ctx, String tableName, int Record_ID);

  /**
   * Execute db proces on server
   *
   * @param ctx Context
   * @param processInfo
   * @param procedureName
   * @return ProcessInfo
   */
  public IProcessInfo dbProcess(Properties ctx, IProcessInfo processInfo, String procedureName);
}
