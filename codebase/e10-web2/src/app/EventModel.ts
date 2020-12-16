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


  toString(): string {
    return JSON.stringify(this);
  }
}
