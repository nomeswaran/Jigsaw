<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/t/dt/dt-1.10.11/datatables.min.css"/>

<style>
.center {
    margin: auto;
    width: 60%;
    padding: 10px;
}
</style>


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-beta1/jquery.min.js"></script>

 
<script type="text/javascript" src="https://cdn.datatables.net/t/dt/dt-1.10.11/datatables.min.js"></script>

<script>
$(document).ready(function() {
	  $('#example').dataTable( {
		
		  "ajax": {
	            "url": "./tickets",
	            "dataSrc": ""
	        },
		        "columns": [
		            { "data": "ticketId" },
		            { "data": "ticketDesc" },
		            { "data": "ticketDetail" },
		            { "data": "ticketStatus" }
		          ]
		    } );
} );

$(document).foundation();
</script>
</head>
<body class="center">
<h1>
    <img src="<c:url value="/resources/images/logo.png" />" alt="Foo Co.: Where everyone can fizz the buzz" /> Welcome to Jigsaw Helpdesk
</h1>

<div class="row medium-8 large-7 columns">
<h2><a class="btn btn-primary" href="${pageContext.request.contextPath}/createTicket">Create New Ticket</a></h2>

<p>
Ticket Details
</p>

<table id="example" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Ticket ID</th>
                <th>Subject </th>
                <th>Detail</th>
                <th>Status</th>
            
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Ticket ID</th>
                <th>Subject </th>
                <th>Detail</th>
                <th>Status</th>
               
            </tr>
        </tfoot>
    </table>
</div>
</body>

</html>