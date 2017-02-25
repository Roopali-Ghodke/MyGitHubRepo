import { Component } from '@angular/core';

@Component ({
	selector : 'make-list',
	template : `
		<input #box
			(keyup.enter) = "list(box.value)"
			(blur) = "list(box.value)">
		
		<button (click) = "list(box.value)"> Add </button>
		
		<ul>
			<li *ngFor = "let list of lists"> 
			{{list}}
			</li>
		</ul>
	`
})

export class MakeListComponent {
		
	lists = ['Rupali','Ravi','Rahul','Aryan'];
	
	list(newlist : string){
		if(newlist){
			this.lists.push(newlist);
		}
	}
}