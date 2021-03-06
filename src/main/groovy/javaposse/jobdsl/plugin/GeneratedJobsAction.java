package javaposse.jobdsl.plugin;

import hudson.model.Action;
import java.util.Set;

import com.google.common.collect.Sets;

import javaposse.jobdsl.dsl.GeneratedJob;


public class GeneratedJobsAction implements Action {
    Set<GeneratedJob> modifiedJobs;

    public GeneratedJobsAction(Set<GeneratedJob> modifiedJobs) {
        this.modifiedJobs = Sets.newHashSet(modifiedJobs);
    }

    public GeneratedJobsAction() {
        this.modifiedJobs = Sets.newHashSet();
    }

    public String getIconFileName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public String getUrlName() {
        return "generatedFiles";
    }

    public Set<GeneratedJob> getGeneratedJobs() {
        return modifiedJobs;
    }
}
