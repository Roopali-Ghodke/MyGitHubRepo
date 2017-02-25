import { Component } from '@angular/core';

@Component ({
	selector : 'keyup-enter',
	template : /* 
		<input #box (keyup.enter) = "onEnter(box.value)">
		*/
	`		
		<input #box
			(keyup.enter) = "update(box.value)"
			(blur) = "update(box.value)">
		{{value}}
	`
})

export class KeyUpEnterComponent {
	value = '';
	/*
	onEnter(value : string){
		this.value = value;
	}
	*/
	update(value : string){
		this.value = value;
	}
}