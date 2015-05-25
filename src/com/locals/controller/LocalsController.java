package com.locals.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.locals.controller.wsdl.Local;
import com.locals.controller.wsdl.LocalAccessibilitatDTO;
import com.locals.controller.wsdl.LocalsService;

@Controller
public class LocalsController {
	
	//ApplicationContext context = new ClassPathXmlApplicationContext("localsAccesibles-servlet.xml");
	LocalsService service =new LocalsService();//context.getBean(LocalsService.class);
	
	LocalsServiceMock serviceMock = new LocalsServiceMock();
	List<LocalAccessibilitatDTO> llistaLocals;
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Locals Accesibles </h3>Seleccioni un local a visualitzar</div><br><br>";
		return new ModelAndView("ajax", "message", message);
	}

    @RequestMapping("/ajax")
    public ModelAndView helloAjaxTest() {
        return new ModelAndView("ajax", "message", "Crunchify Spring MVC with Ajax and JQuery Demo..");
    }
 
    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody
    String getTime() {
    	List<LocalAccessibilitatDTO> llistaLocals;
        try{
        	llistaLocals = service.getListLocals();
        	if(llistaLocals == null){
        		llistaLocals = serviceMock.getListLocals();
        	}
        }catch(Exception exception){
        	llistaLocals = serviceMock.getListLocals();
        }
        
        String result = "<table class='table table-hover table-striped'>";
        System.out.println("[DEBUG] Creating table of "+llistaLocals.size()+ " locals");
       /* Iterator<LocalAccessibilitatDTO> localIter =  llistaLocals.iterator();
        while(localIter.hasNext()){
        	
        	result += "<tr><td>" + localIter.next().getLocal().getNomVia()+ " " 
        			+ localIter.next().getLocal().getNomCarrer() + ", " + localIter.next().getLocal().getNumero()+"</td><td>" +
        			localIter.next().getLocal().getNomLocal() + "</td></tr>";
        }*/
        
        for (int i = 0; i < llistaLocals.size() ; i++){
        	System.out.println("[DEBUG] "+i);
        	System.out.println("[DEBUG] "+llistaLocals.get(i).toString());
        	result += "<tr><td><a href=''><span class='glyphicon glyphicon-search' aria-hidden='true'></span></a></td><td>" 
        			+ llistaLocals.get(i).getLocal().getNomVia()+ " " 
        			+ llistaLocals.get(i).getLocal().getNomCarrer() + ", " + llistaLocals.get(i).getLocal().getNumero()+"</td><td>" +
        			llistaLocals.get(i).getLocal().getNomLocal() + "</td></tr>";
        			
        }
        result += "</table>";
        
        System.out.println("[DEBUG]  Message from LocalsController Controller.. END");
        return result;
    }
    
    @RequestMapping(value = "/alta")
    public @ResponseBody
    String setLocal(@RequestParam("nomLocal") String nomLocal,@RequestParam("nomVia") String via,
    	@RequestParam("nomCarrer") String carrer,@RequestParam("numero") String numero,
    	@RequestParam("observacions") String obs) {
    	System.out.println("[DEBUG] Local name: "+ nomLocal);
    	System.out.println("[DEBUG] via: "+ via);
    	System.out.println("[DEBUG] carrer: "+ carrer)  	;
    	LocalAccessibilitatDTO dtoObject = new LocalAccessibilitatDTO();
    	
    	Local local = new Local();
    	local.setNomLocal(nomLocal);
    	dtoObject.setLocal(local);
    	
    	return "OK";//service.altaLocal(dtoObject);
    }
    
    @RequestMapping(value = "/verificar")
    public @ResponseBody
    String verificar(@RequestParam("nomLocal") String nomLocal,@RequestParam("nomVia") String via,
    		@RequestParam("nomCarrer") String carrer) {
    	System.out.println("[DEBUG] Local name: "+ nomLocal);
    	System.out.println("[DEBUG] via: "+ via);
    	System.out.println("[DEBUG] carrer: "+ carrer);
    	Local local = new Local();
    	local.setNomLocal(nomLocal);
    	
    	return "OK";//service.verificar(local);
    }
    
    
}
