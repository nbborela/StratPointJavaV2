<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>StratPoint Java</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/datatables/datatables.css"/>
</head>
<body>
	<div id="profileMainDiv" style="width: 80%;" class="container">
		<div id="profileHeadingDiv" style="width: 90%;" class="well well-sm">
			<h2>StratPoint Java</h2>
		</div>
		<div id="profileContentDiv" style="width: 90%;" class="well">
			<div id="profileTableDiv">
				<jsp:include page="/pages/profileList.jsp"></jsp:include>
			</div>
			<div id="profileInfoDiv">
				<h4> Profile Information</h4>
				<jsp:include page="/pages/profileInfo.jsp"></jsp:include>
			</div>
		</div>
	</div>
	
	<script src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/datatables/datatables.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){
			var contextPath = "${pageContext.request.contextPath}";
			var profileTable;
			init();
			
            function inittable(data) {
            	profileTable = $('#profileTableGrid').DataTable( {
            		"bLengthChange": false,
            		"aaData": data,
        			"columnDefs": [ {
	        				"targets": 0,
	    					"visible": false
        				},{
	        	        	"targets": 3,
	        	            "render": function ( data, type, full, meta ){
	        	            		return data ? '<input type="checkbox" disabled checked/>' : '<input type="checkbox" disabled/>'
        	            		}
        	       		},{
        	       			"targets": 4,
            	            "render": function ( data, type, full, meta ){
            	            		return data ? '<input type="checkbox" disabled checked/>' : '<input type="checkbox" disabled/>'
            	            	}
        	       		}
        	       	]
        		} );
        	}
            
            function init(){
            	$("#profileInfoDiv").hide();
            	var arrayReturn = [];
            	$.ajax({
                    url: contextPath + "/api/profiles/",
                    async: false,
                    dataType: "json",
                    success: function (data) {
    					for (var i = 0, len = data.length; i < len; i++) {
    						var profName = data[i].name.first + " " + data[i].name.middle + " " + data[i].name.last;
    						arrayReturn.push([data[i].id, profName, data[i].age, data[i].active, data[i].blocked]);
    					}
    				inittable(arrayReturn);	
                    }
                });
            }
            
            $('#profileTableGrid tbody').on('click', 'tr', function () {
        	    var data = profileTable.row( this ).data();
        	    //alert( 'You clicked on '+data[0]+'\'s row' );
        	    getProfile(data[0]);
        	    $("#profileTableDiv").hide();
        	   	$("#profileInfoDiv").show();
        	});
        	
            $("#btnBack").click(function(){
        		$("#profileTableDiv").show();
        		$("#profileInfoDiv").hide();
        	});
            
        	function getProfile(profId){
            	$.ajax({
                    url: contextPath + "/api/profiles/" + profId,
                    async: false,
                    dataType: "json",
                    success: function (data) {
                    	setProfileInfo(data);
                    }
                });
            }
            
            function setProfileInfo(prof){
            	var profName = prof.name.first + " " + prof.name.middle + " " + prof.name.last;
            	$("#profName").html(profName);
            	$("#profImg").attr("src",prof.picture);
            	$("#profId").html(prof.id);
            	$("#fullProf").html(prof.profile);
            	$("#profEmail").html(prof.email);
            	$("#profPhone").html(prof.phone);
            	$("#profAddress").html(prof.address);
            	$("#profAge").html(prof.age);
            	$("#profBalace").html(prof.balance);
            }
		});
	</script>
</body>
</html>