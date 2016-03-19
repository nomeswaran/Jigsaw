<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>

<style>
.center {
    margin: auto;
    width: 60%;
    padding: 10px;
}
</style>

</head>
<body class="center">
<h1>
    <img src="<c:url value="/resources/images/logo.png" />" alt="Foo Co.: Where everyone can fizz the buzz" /> Welcome to Jigsaw Helpdesk
</h1>
<div id="box_form">
<form id="zFormer" method="POST" action="./createTicket_process" name="former">
    
   
    <p>
        Ticket Subject: <input type="text" name="sub"/>
    </p>
    
    <p>
        Ticket Detail: &nbsp;&nbsp;  <textarea name="detail"></textarea>
    </p>
    <p style="padding-left:100px">
       <input  class="btn btn-primary" type="submit" value="submit" id="submitter">
    </p>
</form>
</div>

</body>
</html>