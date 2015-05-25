<html>
<head>
<TITLE>Locals Accessibles </TITLE>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<style type="text/css">
body {
    background-image:
        url('http://cdn3.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>

<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
    function crunchifyAjax() {
    	$(".progress").addClass("active");
        $.ajax({
            url : 'ajaxtest.html',
            success : function(data) {
            	$(".progress-bar").attr("style","width:100%");
                launchBar();
                $('#result').html(data);
            }
        });
    };
    function launchBar(){
    	setTimeout(function() {
    				  $(".progress").hide();
    	 }, 2000);
    };
    function altaLocal(){
    	 var data = {"nomLocal":typeof $("#name").val() == 'undefined'?"caca":$("#name").val(),
    			 "nomVia":typeof $("#via option:selected").val() == 'undefined'?"av":$("#via option:selected").val(),
    			 "nomCarrer":typeof $("#carrer").val() == 'undefined'?"caca":$("#carrer").val(),	
    			 "numero":typeof $("#numero").val() == 'undefined'?"caca":$("#numero").val(),
    			 "observacions":typeof $("#observacions").val() == 'undefined'?"caca":$("#observacions").val(),
    	 };
    	 console.log("[DEBUG] alta:",data);
    	 $.ajax({
             url : 'alta.html',
             data: data,
	           success : function(data) {
	             	alert(data);
	             }
         });

    	
    };

</script>


 
<script type="text/javascript">

</script>
</head>
 
<body>
    <div align="center">
     <div class="container-fluid">
       	<div class="row">
      		  ${message} 
      	</div>
      	<div class="row">
	      	<div class="col-md-2" ></div>
	        <div class="progress col-md-8">
			  <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%">
			    <span class="sr-only">100% Complete</span>
			  </div>
			</div>
			<div class="col-md-2" ></div>
		</div>
		<div class="row">
			<div class="col-md-2" ></div>
        	<button class="col-md-8 btn btn-primary btn-lg btn-block" type="submit" onclick="crunchifyAjax();">Llistar</button>
       		<div class="col-md-2" ></div>
       </div>
     </div>
       <div class="container-fluid">
       		<div class="row">
       		<div class="col-md-2" ></div>
        	<div class="col-md-8" id="result"></div>
        	<div class="col-md-2" ></div>
      		</div>
      		<div class="row">
			<div class="col-md-4" ></div>
        	<button class="btn btn-primary btn-lg btn-block"  type="button" data-toggle="collapse" data-target="#formDiv" aria-expanded="false">Alta</button>
       		<div class="col-md-4" ></div>	
            </div>
           <div id="formDiv" class="collapse">
           <div class="col-md-4"></div>
           <div class="col-md-4">
                <form id="contact-form"> 
                  <div class="form-group" >
                    <label for="exampleInputEmail1">Nom:</label>
                    <input type="text" class="form-control" id="name" placeholder="Introdueix el nom del local">
                  </div>
                  <div class="form-inline" style="margin-bottom:15px!important;">
                      <div class="form-group">
                       <select id="inputNomVia" id="via" class="form-control">
                          <option value="AV">AV.</option>
                          <option value="C">C.</option>
                          <option value="AV">3</option>
                          <option value="AV">4</option>
                          <option value="AV">5</option>
                        </select>
                      </div>
                      <div class="form-group">
                        <input type="text" class="form-control"  id="carrer" placeholder="Nom del carrer">
                      </div>
                      <div class="form-group">
                        <label for="exampleInputEmail1">,</label>
                        <input type="number" class="form-control" id="numero" style="width:55px;" min="0" id="inputName" placeholder="">
                        </div>
                    </div>
					<div class="form-group">
					<textarea class="form-control" rows="3" id="observacions" placeholder="Observacions...."></textarea>			
					</div>
                  <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingOne">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
					          Accesibilitat1
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
					      <div class="panel-body">
					      	<div class="form-group">
						      	<label>Abcde efgh ij klmnopq </label>
						      	<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
								</label>
								      	<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 4
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 5
								</label>
						      	</div>
						      <div class="form-group">
						      	<label>Abcde efgh ij klmnopq 2</label>
						      	<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
								</label>
								      	<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 4
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 5
								</label>
						      	</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingTwo">
					      <h4 class="panel-title">
					        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
					          Accesibilitat2
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
					      <div class="panel-body">A</div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingThree">
					      <h4 class="panel-title">
					        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
					          Accesibilitat3
					        </a>
					      </h4>
					    </div>
					    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
					      <div class="panel-body">AAA</div>
					    </div>
					  </div>
					</div>
                  <button type="button" onclick="altaLocal()" class="btn btn-default">Submit</button>
                </form>
                </div>
           <div class="col-md-4"></div>
           </div>
        </div>
    </div>

</body>
</html>