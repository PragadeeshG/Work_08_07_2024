package com.test1;

public class PullRequests {
	private Integer testCaseId;
	private String prCommit1;
	private String prCommitMessage1;
	private String prCommit2;
	private String prCommitMessage2;
	private String prCommit3;
	private String prCommitMessage3;
	private String pullRequsetSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PullRequests() {

	}

	public PullRequests(Integer testCaseId, String prCommit1, String prCommitMessage1, String prCommit2,
			String prCommitMessage2, String prCommit3, String prCommitMessage3, String pullRequsetSystem,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.testCaseId = testCaseId;
		this.prCommit1 = prCommit1;
		this.prCommitMessage1 = prCommitMessage1;
		this.prCommit2 = prCommit2;
		this.prCommitMessage2 = prCommitMessage2;
		this.prCommit3 = prCommit3;
		this.prCommitMessage3 = prCommitMessage3;
		this.pullRequsetSystem = pullRequsetSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(Integer testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getPrCommit1() {
		return prCommit1;
	}

	public void setPrCommit1(String prCommit1) {
		this.prCommit1 = prCommit1;
	}

	public String getPrCommitMessage1() {
		return prCommitMessage1;
	}

	public void setPrCommitMessage1(String prCommitMessage1) {
		this.prCommitMessage1 = prCommitMessage1;
	}

	public String getPrCommit2() {
		return prCommit2;
	}

	public void setPrCommit2(String prCommit2) {
		this.prCommit2 = prCommit2;
	}

	public String getPrCommitMessage2() {
		return prCommitMessage2;
	}

	public void setPrCommitMessage2(String prCommitMessage2) {
		this.prCommitMessage2 = prCommitMessage2;
	}

	public String getPrCommit3() {
		return prCommit3;
	}

	public void setPrCommit3(String prCommit3) {
		this.prCommit3 = prCommit3;
	}

	public String getPrCommitMessage3() {
		return prCommitMessage3;
	}

	public void setPrCommitMessage3(String prCommitMessage3) {
		this.prCommitMessage3 = prCommitMessage3;
	}

	public String getPullRequsetSystem() {
		return pullRequsetSystem;
	}

	public void setPullRequsetSystem(String pullRequsetSystem) {
		this.pullRequsetSystem = pullRequsetSystem;
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
