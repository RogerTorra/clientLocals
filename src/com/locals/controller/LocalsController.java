package com.locals.controller;

import java.util.ArrayList;
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

import com.locals.controller.wsdl.Accessibilitat;
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
        return new ModelAndView("ajax", "message", "LLISTAR LOCALS APP..");
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
        	result += "<tr><td><a onclick='list("+ llistaLocals.get(i).getLocal().getCodiLocal() + ")" + "'>"
        			+ "<span class='glyphicon glyphicon-search' aria-hidden='true'></span></a></td><td>" 
        			+ llistaLocals.get(i).getLocal().getNomVia()+ " " 
        			+ llistaLocals.get(i).getLocal().getNomCarrer() + ", " + llistaLocals.get(i).getLocal().getNumero()+"</td><td>" +
        			llistaLocals.get(i).getLocal().getNomLocal() + "</td></tr>";
        			
        }
        result += "</table>";
        
        System.out.println("[DEBUG]  Message from LocalsController Controller.. END");
        return result;
    }
    
    @RequestMapping(value = "/ajaxlist", method = RequestMethod.GET)
    public @ResponseBody
    String getList(@RequestParam String id) {
    	
    	List<LocalAccessibilitatDTO> llistaLocals;
    	List<Accessibilitat> llistaA;
    	
        	llistaLocals = serviceMock.getListLocals(id);
        
        String result = "<div id='access'>";
        System.out.println("[DEBUG] Creating table of "+llistaLocals.size()+ " locals");
 
       
        for (int i = 0; i < llistaLocals.size() ; i++){
        	
        	result += "<table class=''><tr><td>" 
        			+ llistaLocals.get(i).getLocal().getNomVia()+ " " 
        			+ llistaLocals.get(i).getLocal().getNomCarrer() + ", " + llistaLocals.get(i).getLocal().getNumero()+"</td></tr><tr><td><h3>" +
        			llistaLocals.get(i).getLocal().getNomLocal() + "</h3></td></tr>";
        	result +="</table><div class='form-group' id='result2'></div>";
        	
        		llistaA=llistaLocals.get(i).getLAccessibilitat();
        		for(int j=0;j<llistaA.size();j++){
        			String map ="";
        			map =  Integer.toString(llistaA.get(j).getCodiAccessibilitat()) + "-"
        					+ Integer.toString(llistaA.get(j).getCodiCaracteristica()) + "-";
        			if(llistaA.get(j).getCodiNivell()==1){
        				map += "1";
        			}else{
        				map += Integer.toString(llistaA.get(j).getCodiNivell()) + "-"+
        						Integer.toString(llistaA.get(j).getValor());
        			}
        			result += "<label class='arrayResult' style='display:none' value='"+ map + "'></label>";			
        		}
        			
        }
        
        result +="</div>";
        
        System.out.println("[DEBUG]  Message from LocalsController Controller.. END");
        return result;
    }
    
    
    @RequestMapping(value = "/alta")
    public @ResponseBody
    String setLocal(@RequestParam("nomLocal") String nomLocal,@RequestParam("nomVia") String via,
    	@RequestParam("nomCarrer") String carrer,@RequestParam("numero") String numero,
    	@RequestParam("observacions") String obs,
    	@RequestParam("ac") String ac) {
    	System.out.println("[DEBUG] Local name: "+ nomLocal);
    	System.out.println("[DEBUG] via: "+ via);
    	System.out.println("[DEBUG] carrer: "+ carrer)  	;
    	System.out.println("[DEBUG] "+ac);
    	LocalAccessibilitatDTO dtoObject = new LocalAccessibilitatDTO();
    	
    	Local local = new Local();
    	local.setNomLocal(nomLocal);
    	local.setNomVia(via);
    	local.setCodiCarrer(1);
    	local.setNumero(Integer.parseInt(numero));
    	local.setObservacions(obs);
    	local.setCodiTipoLocal(0);
    	
    	dtoObject.setLocal(local);
    	
    	setAcc(ac,dtoObject);
    	System.out.println("[DEBUG] LOCAL:"+dtoObject.toString());
    	return "OK";//service.altaLocal(dtoObject);
    }
    public void setAcc(String ac,LocalAccessibilitatDTO dto){
    		Accessibilitat acObject;
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
    				dto.getLAccessibilitat().add(acObject);    		
    			}
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
