import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {EventModel} from "../EventModel";

@Component({
  selector: 'event-form',
  templateUrl: './event-form.component.html',
  styleUrls: ['./event-form.component.css']
})
export class EventFormComponent {

  @Output()
  public onSave: EventEmitter<EventModel> = new EventEmitter<EventModel>();

  public model: EventModel = new EventModel();

  public save(): void {
    this.onSave.emit(this.model);
  }
}
