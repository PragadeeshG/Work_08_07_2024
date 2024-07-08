package com.test1;

public class RepositoryPushes {
	private Integer commitId;
	private String secretsScan;
	private String codeScan;
	private String progOptions;
	private String programAction;
	private boolean programDesc;
	private boolean options;
	private boolean vmOptions;
	private String commanders;
	private String requires;
	private Integer processId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RepositoryPushes() {

	}

	public RepositoryPushes(Integer commitId, String secretsScan, String codeScan, String progOptions,
			String programAction, boolean programDesc, boolean options, boolean vmOptions, String commanders,
			String requires, Integer processId, String creationDate, String modifiedDate, String entityState) {
		super();
		this.commitId = commitId;
		this.secretsScan = secretsScan;
		this.codeScan = codeScan;
		this.progOptions = progOptions;
		this.programAction = programAction;
		this.programDesc = programDesc;
		this.options = options;
		this.vmOptions = vmOptions;
		this.commanders = commanders;
		this.requires = requires;
		this.processId = processId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCommitId() {
		return commitId;
	}

	public void setCommitId(Integer commitId) {
		this.commitId = commitId;
	}

	public String getSecretsScan() {
		return secretsScan;
	}

	public void setSecretsScan(String secretsScan) {
		this.secretsScan = secretsScan;
	}

	public String getCodeScan() {
		return codeScan;
	}

	public void setCodeScan(String codeScan) {
		this.codeScan = codeScan;
	}

	public String getProgOptions() {
		return progOptions;
	}

	public void setProgOptions(String progOptions) {
		this.progOptions = progOptions;
	}

	public String getProgramAction() {
		return programAction;
	}

	public void setProgramAction(String programAction) {
		this.programAction = programAction;
	}

	public boolean isProgramDesc() {
		return programDesc;
	}

	public void setProgramDesc(boolean programDesc) {
		this.programDesc = programDesc;
	}

	public boolean isOptions() {
		return options;
	}

	public void setOptions(boolean options) {
		this.options = options;
	}

	public boolean isVmOptions() {
		return vmOptions;
	}

	public void setVmOptions(boolean vmOptions) {
		this.vmOptions = vmOptions;
	}

	public String getCommanders() {
		return commanders;
	}

	public void setCommanders(String commanders) {
		this.commanders = commanders;
	}

	public String getRequires() {
		return requires;
	}

	public void setRequires(String requires) {
		this.requires = requires;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
