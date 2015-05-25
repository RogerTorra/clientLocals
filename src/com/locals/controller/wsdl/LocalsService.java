package com.locals.controller.wsdl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class LocalsService {
	@Autowired
    private WebServiceTemplate webServiceTemplate;
	//http://myshittycode.com/2013/10/01/using-spring-web-services-and-jaxb-to-invoke-web-service-based-on-wsdl/
	
	public List<LocalAccessibilitatDTO> getListLocals(){
		LlistarLocals getList = new ObjectFactory().createLlistarLocals();
		LlistarLocalsResponse response = (LlistarLocalsResponse)webServiceTemplate.marshalSendAndReceive(getList);
		return response.getReturn();
	}
	
	public String altaLocal(LocalAccessibilitatDTO objectDTO){
		
		AltaLocal alta = new ObjectFactory().createAltaLocal();
		alta.setArg0(objectDTO);
		AltaLocalResponse response = (AltaLocalResponse)webServiceTemplate.marshalSendAndReceive(alta);		
		return response.toString();	
	}
	/*
	public String verificar(Local object){
		VerificarLocal verificar = new ObjectFactory().createVerificarLocal();
		verificar.setArg0(object);
		VerificarLocalResponse response = (VerificarLocalResponse)webServiceTemplate.marshalSendAndReceive(verificar);
		return response.toString();
	}*/

}
