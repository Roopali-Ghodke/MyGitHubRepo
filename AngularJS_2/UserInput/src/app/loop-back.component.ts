import { Component } from '@angular/core';

@Component({
	selector : 'loop-back',
	template :`
		<input #box (keyup) = "onKey(box.value)">
		{{values}}
	`
})

export class LoopBackComponent {
	values = '';
	
	onKey(value : String){
		this.values += value + '|';
	}
}