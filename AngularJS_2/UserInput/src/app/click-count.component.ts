import { Component } from '@angular/core';

@Component ({
	selector : 'click-count',
	template : `
		<button (click) = "onClickMeCount($event)"> Click Me - To Count </button>
		{{clickCountMessage}}
	`
})

export class ClickCountComponent{
	clickCountMessage = '';
	countClicks = 1;
	
	onClickMeCount(event : any) {
		let evenMsg = event ? "Event target is " + event.target.tagName : ' ';
		this.clickCountMessage = (`Clicks #${this.countClicks++}.${evenMsg}`);
	}
	
}