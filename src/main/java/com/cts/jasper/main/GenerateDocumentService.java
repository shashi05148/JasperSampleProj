package com.cts.jasper.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class GenerateDocumentService {
	
	public void createDocument(Map<String, Object> inputMap) throws FileNotFoundException, JRException {
		JasperReport jaspercompileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/jasper/transfer-letter.jrxml"));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jaspercompileReport, inputMap, new JREmptyDataSource());
		JasperExportManager.exportReportToPdfFile(jasperPrint, "./output/pdf/"+ inputMap.get("tiaaContractNo")+".pdf");
	}
	
}
