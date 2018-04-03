var count = 0;
var count_2 = 0;
var maxNumber = 0;

document.getElementById('playeronebutton').onclick = playeronebutton;
document.getElementById('playertwobutton').onclick = playertwobutton;

function playeronebutton(){
	maxNumber = document.getElementById('numbercount').value;
	count++;
	
	
	if(!(count_2 > maxNumber) && (count <= maxNumber)){
		document.getElementById('player1').innerHTML = count;
		
		console.log('count ' + count);
		console.log('count_2 ' + count_2);
	}
}

function playertwobutton(){
	maxNumber = document.getElementById('numbercount').value;
	count_2++;
	if(!(count > maxNumber) && (count_2 <= maxNumber)){
		document.getElementById('player2').innerHTML = count_2;
		
		console.log('count ' + count);
		console.log('count_2' + count_2);
	}
}

document.getElementById('reset').onclick = reset;

function reset(){
	if(count != 0){
		count = 0;
	}
	if(count_2 != 0){
		count_2 = 0;
	}
	document.getElementById('player1').innerHTML = 0;
	document.getElementById('player2').innerHTML = 0;
	document.getElementById('numbercount').value = 0;
}
