/**
 * Created by dominik.haas on 21.06.18.
 */
export class EventModel {

  public id: string;
  public name: string;
  public date: Date;
  public start: number;
  public end: number;
  public participants: string;
  public private: boolean;
  public street: string;
  public streetNumber: string;
  public zip: string;
  public city: string;
  public notes: string;

  public reset(): void {
    this.id = null;
    this.name = null;
    this.date = null;
    this.start = null;
    this.end = null;
    this.participants = null;
    this.private = null;
    this.street = null;
    this.streetNumber = null;
    this.zip = null;
    this.city = null;
    this.notes = null;
  }

  toString(): string {
    return JSON.stringify(this);
  }
}
