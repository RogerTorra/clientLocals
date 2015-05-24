<html>
<head>
<TITLE>Locals Accessibles </TITLE>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
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
    	 var data = {"nomLocal":"testName"};
    	 $.ajax({
             url : 'alta.html',
             data: data,
	           success : function(data) {
	             	alert(data);
	             }
         });

    	
    };
    function altaLocal2(){
    	$.post('alta.html', { nomLocal: "test"}, 
    		    function(returnedData){
    		         alert(returnedData);
    		});
    };
    function altaLocal3(){
    	 var data = {"nomLocal":"testName"};
    	 $.ajax({
    	        url: "alta.html",
    	        data: JSON.stringify(data),
    	        type: "POST",
    	         
    	        beforeSend: function(xhr) {
    	            xhr.setRequestHeader("Accept", "application/json");
    	            xhr.setRequestHeader("Content-Type", "application/json");
    	        },
    	        success: function(data) {
    	             alert(data);
    	        }
    	    });
    	      
    }
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
        	<button class="col-md-8 btn btn-primary btn-lg btn-block" type="submit" onclick="crunchifyAjax();">List "Locals"</button>
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
        	<button class="col-md-4 btn btn-primary btn-lg btn-block" type="submit" onclick="altaLocal();">Alta</button>
       		<div class="col-md-4" ></div>
       		<div class="row">
			<div class="col-md-4" ></div>
        	<button class="col-md-4 btn btn-primary btn-lg btn-block" type="submit" onclick="altaLocal3();">Alta</button>
       		<div class="col-md-4" ></div>
       </div>
        </div>
    </div>
    
</body>
</html>