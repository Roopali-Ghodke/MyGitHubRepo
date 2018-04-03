
/*	******************************************************************************************************************************************
	To create a random number use Math.random(), which creates a number between 0 and 1
	Math.floor() -> The floor() method rounds a number DOWNWARDS to the nearest integer, and returns the result.
	For Ex - Math.floor(1.6) - > Result - 1.
	Math.ceil() -> The ceil() method rounds a number UPWARDS to the nearest integer, and returns the result.
	For Ex - Math.ceil(1.6) - > Result - 2.
	In this Example consider,
	1) Math.random() = 0.5
	   So - Math.floor(Math.random() * 256) 
	   Result - Math.floor(0.5 * 256) => Math.floor(128) => 128.
	2) Math.random() = 0.6
	   So - Math.floor(Math.random() * 256) 
	   Result - Math.floor(0.6 * 256) => Math.floor(153.6) => 153.
			

var rgb_color = 'RGB(' + (Math.floor(Math.random() * 256)) + ', '
					+ (Math.floor(Math.random() * 256)) + ', '
					+ (Math.floor(Math.random() * 256)) + ') ';
***********************************************************************************************************************************************/


//The querySelectorAll() method returns all elements in the document that matches a specified CSS selector(s), as a static NodeList object.
var boxes = document.querySelectorAll(".box");
var box_value;
var rgb_color;

//Function to generate random RGB colors.
function myFunction(){
	for(i=0; i< boxes.length; i++){
		boxes[i].style.backgroundColor = 'RGB(' + (Math.floor(Math.random() * 256)) + ', '
						+ (Math.floor(Math.random() * 256)) + ', '
						+ (Math.floor(Math.random() * 256)) + ') ';
		console.log(boxes[i])
	}


	rgb_color = (Math.floor(Math.random() * 6))
	box_value = boxes[rgb_color].style.backgroundColor;
	document.getElementById('rgb-display').innerHTML = box_value.toUpperCase();
	console.log(box_value);

	document.getElementById("play-again").innerHTML = "New Colors !";
	document.getElementById("match").innerHTML = "";
}



//Check on Each box - Box 1
document.getElementById("box1").onclick = function(){ box1_match()}

function box1_match(){
	var colorMatch = boxes[0].style.backgroundColor;
			console.log('ColorMatch = ' + colorMatch);
	if(colorMatch === box_value){
		document.getElementById("match").innerHTML = "Correct";
		document.getElementById("play-again").innerHTML = "Play Again ?";
		for(i=0; i<boxes.length; i++){
			boxes[i].style.backgroundColor = box_value;
		}
	}
	else{
		document.getElementById("match").innerHTML = "Try Again !";
		document.getElementById("play-again").innerHTML = "New Colors !";
		boxes[0].style.backgroundColor = "black";
	}
}

//Check on Each box - Box 2
document.getElementById("box2").onclick = function(){ box2_match()}

function box2_match(){
	var colorMatch = boxes[1].style.backgroundColor;
			console.log('ColorMatch = ' + colorMatch);
	if(colorMatch === box_value){
		document.getElementById("match").innerHTML = "Correct";
		document.getElementById("play-again").innerHTML = "Play Again?";
		for(i=0; i<boxes.length; i++){
			boxes[i].style.backgroundColor = box_value;
		}
	}
	else{
		document.getElementById("match").innerHTML = "Try Again !";
		document.getElementById("play-again").innerHTML = "New Colors !";
		boxes[1].style.backgroundColor = "black";
	}
}

//Check on Each box - Box 3
document.getElementById("box3").onclick = function(){ box3_match()}

function box3_match(){
	var colorMatch = boxes[2].style.backgroundColor;
			console.log('ColorMatch = ' + colorMatch);
	if(colorMatch === box_value){
		document.getElementById("match").innerHTML = "Correct";
		document.getElementById("play-again").innerHTML = "Play Again?";
		for(i=0; i<boxes.length; i++){
				boxes[i].style.backgroundColor = box_value;
			}
	}
	else{
		document.getElementById("match").innerHTML = "Try Again !";
		document.getElementById("play-again").innerHTML = "New Colors !";
		boxes[2].style.backgroundColor = "black";
	}
}

//Check on Each box - Box 4
document.getElementById("box4").onclick = function(){ box4_match()}

function box4_match(){
	var colorMatch = boxes[3].style.backgroundColor;
			console.log('ColorMatch = ' + colorMatch);
	if(colorMatch === box_value){
		document.getElementById("match").innerHTML = "Correct";
		document.getElementById("play-again").innerHTML = "Play Again?";
		for(i=0; i<boxes.length; i++){
				boxes[i].style.backgroundColor = box_value;
			}
	}
	else{
		document.getElementById("match").innerHTML = "Try Again !";
		document.getElementById("play-again").innerHTML = "New Colors !";
		boxes[3].style.backgroundColor = "black";
	}
}

//Check on Each box - Box 5
document.getElementById("box5").onclick = function(){ box5_match()}

function box5_match(){
	var colorMatch = boxes[4].style.backgroundColor;
			console.log('ColorMatch = ' + colorMatch);
	if(colorMatch === box_value){
		document.getElementById("match").innerHTML = "Correct";
		document.getElementById("play-again").innerHTML = "Play Again?";
		for(i=0; i<boxes.length; i++){
				boxes[i].style.backgroundColor = box_value;
			}
	}
	else{
		document.getElementById("match").innerHTML = "Try Again !";
		document.getElementById("play-again").innerHTML = "New Colors !";
		boxes[4].style.backgroundColor = "black";
	}
}

//Check on Each box - Box 6
document.getElementById("box6").onclick = function(){ box6_match()}

function box6_match(){
	var colorMatch = boxes[5].style.backgroundColor;
			console.log('ColorMatch = ' + colorMatch);
	if(colorMatch === box_value){
		document.getElementById("match").innerHTML = "Correct";
		document.getElementById("play-again").innerHTML = "Play Again?";
		for(i=0; i<boxes.length; i++){
				boxes[i].style.backgroundColor = box_value;
			}
	}
	else{
		document.getElementById("match").innerHTML = "Try Again !";
		document.getElementById("play-again").innerHTML = "New Colors !";
		boxes[5].style.backgroundColor = "black";
	}
} 

