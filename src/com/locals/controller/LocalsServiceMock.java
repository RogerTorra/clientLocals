package com.locals.controller;

import java.util.ArrayList;
import java.util.List;

import com.locals.controller.wsdl.Accessibilitat;
import com.locals.controller.wsdl.LlistarLocals;
import com.locals.controller.wsdl.LlistarLocalsResponse;
import com.locals.controller.wsdl.Local;
import com.locals.controller.wsdl.LocalAccessibilitatDTO;
import com.locals.controller.wsdl.ObjectFactory;

public class LocalsServiceMock {
	
	private Local localMock;
	private Accessibilitat accesMock;
	private List<LocalAccessibilitatDTO> returnList;
	private LocalAccessibilitatDTO dtoObject;
	
	public List<LocalAccessibilitatDTO> getListLocals(){
		
		returnList = new ArrayList<LocalAccessibilitatDTO>();
		
		for(int i=0; i < 10 ; i++){
			List<Accessibilitat> listA;
			localMock = new Local();
			dtoObject = new LocalAccessibilitatDTO();
			localMock.setCodiCarrer(i);
			localMock.setCodiLocal(i);
			localMock.setCodiTipoLocal(1);
			localMock.setNomCarrer("Carrer "+i);
			localMock.setNomLocal("Local "+i);
			localMock.setNomVia("AV.");
			localMock.setObservacions("Observacions mock del local "+i);
			localMock.setVerificat(true);
					
			String ac="0-0-1,0-1-1,1-5-2-4,1-7-1,";
			Accessibilitat acObject;
			
			dtoObject.setLocal(localMock);
			
	    		String[] myArray = ac.split(",");
	    		for(String obj:myArray){
	    			System.out.println("[DEBUG] split accessibility:"+obj);
	    			String[] values = obj.split("-");
	    			acObject = new Accessibilitat();
	    				acObject.setCodiAccessibilitat(Integer.parseInt(values[0]));
	    				acObject.setCodiCaracteristica(Integer.parseInt(values[1]));
	    				acObject.setCodiNivell(Integer.parseInt(values[2]));
	    				if(values[2].equals("1")){
	    					acObject.setValor(1);
	    				}else{
	    					acObject.setValor(Integer.parseInt(values[3]));
	    				}
	    				dtoObject.getLAccessibilitat().add(acObject);    		
	    			}
			
			
			returnList.add(dtoObject);
			System.out.println("[DEBUG] "+localMock.getNomLocal()+" Added.");
			System.out.println("[DEBUG] Total "+returnList.size() +" new locals.");
			
		}
		
		
		return returnList;
	}
	
	public List<LocalAccessibilitatDTO> getListLocals(String id){
		System.out.println("[DEBUG] INIT GET ONE LOCAL");
		returnList = new ArrayList<LocalAccessibilitatDTO>();
		
		for(int i=Integer.parseInt(id); i <= Integer.parseInt(id) ; i++){
			List<Accessibilitat> listA;
			localMock = new Local();
			dtoObject = new LocalAccessibilitatDTO();
			localMock.setCodiCarrer(i);
			localMock.setCodiLocal(i);
			localMock.setCodiTipoLocal(1);
			localMock.setNomCarrer("Carrer "+i);
			localMock.setNomLocal("Local "+i);
			localMock.setNomVia("AV.");
			localMock.setObservacions("Observacions mock del local "+i);
			localMock.setVerificat(true);
					
			String ac="0-0-1,0-1-1,1-5-2-4,1-7-1,";
			Accessibilitat acObject;
			
			dtoObject.setLocal(localMock);
			
	    		String[] myArray = ac.split(",");
	    		for(String obj:myArray){
	    			System.out.println("[DEBUG] split accessibility:"+obj);
	    			String[] values = obj.split("-");
	    			acObject = new Accessibilitat();
	    				System.out.println("[DEBUG] set Accessibilitat:"+values[0]);
	    				acObject.setCodiAccessibilitat(Integer.parseInt(values[0]));
	    				System.out.println("[DEBUG] set Caracteristica:"+values[1]);
	    				acObject.setCodiCaracteristica(Integer.parseInt(values[1]));
	    				System.out.println("[DEBUG] set Nivell:"+values[2]);
	    				acObject.setCodiNivell(Integer.parseInt(values[2]));
	    				if(values[2].equals("1")){
	    					acObject.setValor(1);
	    				}else{
	    					acObject.setValor(Integer.parseInt(values[3]));
	    				}
	    				dtoObject.getLAccessibilitat().add(acObject);    		
	    			}
			
			
			returnList.add(dtoObject);
			System.out.println("[DEBUG] "+localMock.getNomLocal()+" Added.");
			System.out.println("[DEBUG] Total "+returnList.size() +" new locals.");
			
		}
		
		
		return returnList;
	}
}
