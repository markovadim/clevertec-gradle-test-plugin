package ru.clevertec.testplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TestReportPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getTasks().register("checkReport", TestReportTask.class).get().dependsOn("jacocoTestReport");
        target.getPlugins().apply("jacoco");
    }
}
