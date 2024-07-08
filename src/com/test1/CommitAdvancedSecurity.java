package com.test1;

public class CommitAdvancedSecurity {
	private Integer id;
	private String dependencyManager;
	private String dependencyScan;
	private String devOpsServer;
	private Integer domainUrl;
	private boolean codeQIBundler;
	private boolean orgSettions;
	private String activeCommitters;
	private String devMode;
	private String pipelineMode;
	private String pushProtections;
	private String srcFiles;
	private String srcFiesTolgnore;
	private String entityState;

	public CommitAdvancedSecurity() {

	}

	public CommitAdvancedSecurity(Integer id, String dependencyManager, String dependencyScan, String devOpsServer,
			Integer domainUrl, boolean codeQIBundler, boolean orgSettions, String activeCommitters, String devMode,
			String pipelineMode, String pushProtections, String srcFiles, String srcFiesTolgnore, String entityState) {
		super();
		this.id = id;
		this.dependencyManager = dependencyManager;
		this.dependencyScan = dependencyScan;
		this.devOpsServer = devOpsServer;
		this.domainUrl = domainUrl;
		this.codeQIBundler = codeQIBundler;
		this.orgSettions = orgSettions;
		this.activeCommitters = activeCommitters;
		this.devMode = devMode;
		this.pipelineMode = pipelineMode;
		this.pushProtections = pushProtections;
		this.srcFiles = srcFiles;
		this.srcFiesTolgnore = srcFiesTolgnore;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDependencyManager() {
		return dependencyManager;
	}

	public void setDependencyManager(String dependencyManager) {
		this.dependencyManager = dependencyManager;
	}

	public String getDependencyScan() {
		return dependencyScan;
	}

	public void setDependencyScan(String dependencyScan) {
		this.dependencyScan = dependencyScan;
	}

	public String getDevOpsServer() {
		return devOpsServer;
	}

	public void setDevOpsServer(String devOpsServer) {
		this.devOpsServer = devOpsServer;
	}

	public Integer getDomainUrl() {
		return domainUrl;
	}

	public void setDomainUrl(Integer domainUrl) {
		this.domainUrl = domainUrl;
	}

	public boolean isCodeQIBundler() {
		return codeQIBundler;
	}

	public void setCodeQIBundler(boolean codeQIBundler) {
		this.codeQIBundler = codeQIBundler;
	}

	public boolean isOrgSettions() {
		return orgSettions;
	}

	public void setOrgSettions(boolean orgSettions) {
		this.orgSettions = orgSettions;
	}

	public String getActiveCommitters() {
		return activeCommitters;
	}

	public void setActiveCommitters(String activeCommitters) {
		this.activeCommitters = activeCommitters;
	}

	public String getDevMode() {
		return devMode;
	}

	public void setDevMode(String devMode) {
		this.devMode = devMode;
	}

	public String getPipelineMode() {
		return pipelineMode;
	}

	public void setPipelineMode(String pipelineMode) {
		this.pipelineMode = pipelineMode;
	}

	public String getPushProtections() {
		return pushProtections;
	}

	public void setPushProtections(String pushProtections) {
		this.pushProtections = pushProtections;
	}

	public String getSrcFiles() {
		return srcFiles;
	}

	public void setSrcFiles(String srcFiles) {
		this.srcFiles = srcFiles;
	}

	public String getSrcFiesTolgnore() {
		return srcFiesTolgnore;
	}

	public void setSrcFiesTolgnore(String srcFiesTolgnore) {
		this.srcFiesTolgnore = srcFiesTolgnore;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
