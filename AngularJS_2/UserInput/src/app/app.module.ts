import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { ClickMeComponent } from './click-me.component';
import { ClickCountComponent } from './click-count.component';
import { KeyUpComponent } from './keyUp.component';
import { LoopBackComponent } from './loop-back.component';
import { KeyUpEnterComponent } from './keyup-enter.component';
import { MakeListComponent } from './make-list.component';

@NgModule({
  declarations: [
    AppComponent,
	ClickMeComponent,
	ClickCountComponent,
	KeyUpComponent,
	LoopBackComponent,
	KeyUpEnterComponent,
	MakeListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
