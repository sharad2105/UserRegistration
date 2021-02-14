package com.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void firstNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void firstNameIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void lastNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void lastNameIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void emailIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void emailIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void mobileNumberIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void mobileNumberIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValidSecond() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValidSecond() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate();
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate();
        Assertions.assertFalse(result);
    }
}
