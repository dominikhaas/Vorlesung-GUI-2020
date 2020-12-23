import {EventModel} from "./EventModel";

describe('EventModel', () => {
  let model: EventModel;

  beforeEach(() => {
    model = new EventModel();
  })


  it('should reset all values', () => {
    model.id = "test";
    model.name = "test";
    model.date = new Date();
    model.start = 1;
    model.end = 2;
    model.participants = "test";
    model.private = true;
    model.street = "test";
    model.streetNumber = "test";
    model.zip = "test";
    model.city = "test";
    model.notes = "test";
    //....

    model.reset();

    expect(model.toString()).toEqual('{"id":null,"name":null,"date":null,"start":null,"end":null,"participants":null,"private":null,"street":null,"streetNumber":null,"zip":null,"city":null,"notes":null}')
  })
})
