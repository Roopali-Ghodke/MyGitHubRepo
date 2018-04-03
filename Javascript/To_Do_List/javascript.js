function samsung(){
	document.getElementById('li1').style.textDecoration = 'line-through';
}
function apple(){
	document.getElementById('li2').style.textDecoration = 'line-through';
}
function laptop(){
	document.getElementById('li3').style.textDecoration = 'line-through';
}
function speaker(){
	document.getElementById('li4').style.textDecoration = 'line-through';
}

//MouserOver and MouseOut for 1st item in the list
document.getElementById('li1').onmouseover = function(){ mouseOver1()};
document.getElementById('li1').onmouseout = function(){ mouseOut1()};

function mouseOver1(){
	document.getElementById('li1').style.color = 'green';
}
function mouseOut1(){
	document.getElementById('li1').style.color = 'black';
}

//MouserOver and MouseOut for 1st item in the list
document.getElementById('li2').onmouseover = function(){ mouseOver2()};
document.getElementById('li2').onmouseout = function(){ mouseOut2()};

function mouseOver2(){
	document.getElementById('li2').style.color = "green";
}
function mouseOut2(){
	document.getElementById('li2').style.color = "black";
}

//MouserOver and MouseOut for 1st item in the list
document.getElementById('li3').onmouseover = function(){ mouseOver3()};
document.getElementById('li3').onmouseout = function(){ mouseOut3()};

function mouseOver3(){
	document.getElementById('li3').style.color = "green";
}
function mouseOut3(){
	document.getElementById('li3').style.color = "black";
}

//MouserOver and MouseOut for 1st item in the list
document.getElementById('li4').onmouseover = function(){ mouseOver4()};
document.getElementById('li4').onmouseout = function(){ mouseOut4()};

function mouseOver4(){
	document.getElementById('li4').style.color = "green";
}
function mouseOut4(){
	document.getElementById('li4').style.color = "black";
}