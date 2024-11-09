package com.careerit.practice.day8;

import java.util.Scanner;

public class ReportService {
    public static void showreport(ReportType type) {
        switch (type) {
            case PDF:
                pdfReport();
                break;
            case EXCEL:
                excelReport();
                break;
            case CSV:
                csvReport();
                break;
            case JSON:
                jsonReport();
                break;
            case HTML:
                htmlReport();
                break;
            default:
                System.out.println("Invalid report type");
        }
    }

    private static void pdfReport() {
        System.out.println("Generating PDF report");
    }
    private static void excelReport() {
        System.out.println("Generating Excel report");
    }
    private static void csvReport() {
        System.out.println("Generating CSV report");
    }
    private static void jsonReport() {
        System.out.println("Generating JSON report");
    }
    private static void htmlReport() {
        System.out.println("Generating HTML report");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the report type :");
        String type = sc.nextLine();
        showreport(ReportType.valueOf(type));

    }
}
