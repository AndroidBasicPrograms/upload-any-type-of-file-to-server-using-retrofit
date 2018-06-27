<?php
	$fname=$_FILES['file']['name'];
	$result = array("success" => $_FILES["file"]["name"]);
	$filepath = 'upload/'.basename( $_FILES['file']['name']);
	if(move_uploaded_file($_FILES['file']['tmp_name'], $filepath)) {
		echo json_encode("okk");
	} else{
	  	echo json_encode("okkkkkkkkkkkkkkk");
	}
	
?>