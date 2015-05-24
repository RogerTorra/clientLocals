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
			
			listA = new ArrayList<Accessibilitat>();
			
			for(int j=0; j < 4; j++){			
				accesMock = new Accessibilitat();
				accesMock.setCodiAccessibilitat(i);
				accesMock.setCodiLocal(i);
				accesMock.setValor(j);
				listA.add(accesMock);
			}
			
			dtoObject.setLocal(localMock);
			returnList.add(dtoObject);
			System.out.println("[DEBUG] "+localMock.getNomLocal()+" Added.");
			System.out.println("[DEBUG] Total "+returnList.size() +" new locals.");
			
		}
		
		
		return returnList;
	}
	
}
