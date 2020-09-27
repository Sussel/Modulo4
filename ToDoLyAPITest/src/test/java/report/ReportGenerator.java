package reportHtml;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ReportGenerator {

    public static void main(String[] args) {
        String path = "C:\\Users\\smvil\\Desktop\\UCB - TESTEO\\MODULO 4 - AUTOMATIZACION II\\Tareas\\ToDoLyAPITest\\build\\reports\\cucumber\\";

        File reportOutPut = new File(path + "finalReport");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path + "report.json");

        Configuration configuration = new Configuration(reportOutPut, "UCB Diplomado");
        configuration.setBuildNumber("v50.0");
        configuration.addClassifications("SO", "Windows");
        configuration.addClassifications("Owner", "Sussel");
        configuration.addClassifications("Branch", "master");
        configuration.addClassifications("Type Report", "Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
