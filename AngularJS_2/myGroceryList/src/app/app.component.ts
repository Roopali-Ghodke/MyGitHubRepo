import { Component } from '@angular/core';
import { Grocery } from './grocery';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  template : `
	<h1> {{title}} </h1>
	<h2> My primary grocery is : {{myGroceryName.name}} </h2>
	<p> Grocery : </p>
		<ul>
			<li *ngFor = "let grocery of grocerys"> 
				{{ grocery.name }}
			</li>
		</ul>
		count = {{grocery.length}}
	<p *ngIf = "grocerys.length > 3"> Total number of grocery are -  count</p>
  `
})
export class AppComponent {
  title = 'List of Grocerys ';
  grocerys = [
	new Grocery( 1, 'Milk' ),
	new Grocery( 12, 'Bread', ),
	new Grocery( 15, 'Apple' ),
	new Grocery( 2, 'Bannana' ),
	new Grocery( 5, 'Tomatoes' ),
	new Grocery( 20, 'Strawberry' ),
	new Grocery( 6, 'Tortilla Flour' )
	
	];
  myGroceryName = this.grocerys[0];
  
}
