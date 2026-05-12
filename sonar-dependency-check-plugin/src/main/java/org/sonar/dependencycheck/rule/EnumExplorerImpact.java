package org.sonar.dependencycheck.rule;
import org.sonar.api.issue.impact.Severity;
public class EnumExplorerImpact {
    public static void main(String[] args) {
        for (Severity v : Severity.values()) {
            System.out.println(v.name());
        }
    }
}