package com.cts.jasper.main;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;

public class GenerateDocument {
	
	
	
	public static void main(String[] args) {
		GenerateDocument generateDocument = new GenerateDocument();
		Map<String, Object> inputMap = generateDocument.populateInputMap();
		
		GenerateDocumentService generateDocumentService = new GenerateDocumentService();
		try {
			generateDocumentService.createDocument(inputMap);
		} catch (FileNotFoundException | JRException e) {
			e.printStackTrace();
		}
	}
	
	private Map<String, Object> populateInputMap(){
		Map<String, Object> inputMap = new HashMap<>();
		inputMap.put("name" ,"MS KELLI PANNAMARIA");
		inputMap.put("pin" ,"3713741");
		inputMap.put("tiaaContractNo" ,"Y1387284");
		inputMap.put("crefContractNo" ,"Z142101-6");
		inputMap.put("firstAnnuitant" ,"KELLI C PANNAMARIA");
		inputMap.put("secondAnnuitant" ,"None");
		inputMap.put("beneficiary" ,"John Smith");
		inputMap.put("incomeStartDate" ,"January 1, 2022");
		inputMap.put("paymentFrequency" ,"Monthly");
		inputMap.put("tiaaGrossSettlementAmount" ,"$8,400.00");
		inputMap.put("crefGrossSettlementAmount" ,"$8,438.25");
		inputMap.put("saGrossSettlementAmount" ,"$9,438.75");

		return inputMap;
	}
}
