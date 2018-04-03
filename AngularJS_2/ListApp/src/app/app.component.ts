import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "Item's List";
  items = ["Angular 2", "React JS", "CSS3"];
  newItem = "";

  addItem = function(){
    if(this.newItem != ""){
      this.items.push(this.newItem);
      this.newItem = "";
    }
  }

  onRemove = function(index){
    this.items.splice(index,1);
  }
}
