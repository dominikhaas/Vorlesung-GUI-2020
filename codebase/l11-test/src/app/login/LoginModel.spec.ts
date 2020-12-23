import {LoginModel} from "./LoginModel";
import {log} from "util";

describe('LoginModel', () => {
    let loginModel: LoginModel;

    beforeEach(() => {
      loginModel = new LoginModel();
    });

    it('should create', () => {
      expect(loginModel).toBeTruthy();
    });

    it('should clear all value on reset', () => {
      loginModel.user = 'user';
      loginModel.password = 'password';

      loginModel.resetData();

      expect(loginModel.user).toBeNull();
    })

});
