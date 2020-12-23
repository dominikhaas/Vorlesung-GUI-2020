import { Component } from '@angular/core';
import {EventModel} from "./EventModel";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public onSave(event: EventModel): void {
    console.log("AppComponent.onSave: "+ event);
  }
}

