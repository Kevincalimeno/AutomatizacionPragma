  #Autor: KevinCalimeno

  @stories
  Feature: DemoBlaze new user registration
    As a new user, I can register on the DemoBlaze page.

    Background:
      Given that Kevin wants to open the page "https://www.demoblaze.com/"

    @scenario1
    Scenario Outline: Kevin makes a successful registration on the page
      When Kevin enters all teh data requested in the record
        | strUsername   | strPassword   |
        | <strUsername> | <strPassword> |
      Then Kevin completes the registration on the page
        | strFinalText   |
        | <strFinalText> |
      Examples:
        | strUsername | strPassword | strFinalText        |
        | Pragma345671 | pragmaTest1 | Sign up successful. |

    @scenario2
    Scenario Outline: Kevin makes a fail registration on the page
      When Kevin enters all teh data requested in the record
        | strUsername   | strPassword   |
        | <strUsername> | <strPassword> |
      Then Kevin fail the registration on the page
        | strFinalText   |
        | <strFinalText> |
      Examples:
        | strUsername | strPassword | strFinalText             |
        | Pragma345671 | pragmaTest1 | This user already exist. |

    @scenario3
    Scenario Outline: Kevin fails logs into the page
      When Kevin enters the login information
        | strUsername   | strPassword   |
        | <strUsername> | <strPassword> |
      Then Kevin fail Login
        | strFinalText   |
        | <strFinalText> |
      Examples:
        | strUsername     | strPassword | strFinalText         |
        | 3rr0rc0ntr0lad0 | pragmaTest1 | User does not exist. |

    @scenario4
    Scenario Outline: Kevin logs into the page
      When Kevin enters the login information
        | strUsername   | strPassword   |
        | <strUsername> | <strPassword> |
      Then Kevin successful Login
      Examples:
        | strUsername  | strPassword |
        | Pragma3456771 | pragmaTest1 |


    @scenario5
    Scenario Outline: Kevin adds products to cart
      When Kevin enters the login information
        | strUsername   | strPassword   |
        | <strUsername> | <strPassword> |
      Then Kevin successful Login
      When Select the products to add
      Then validate the shopping cart
        | strFinalText   |
        | <strFinalText> |
      Examples:
        | strUsername  | strPassword | strFinalText   |
        | Pragma3456771 | pragmaTest1 | Product added. |


    @scenario6
    Scenario Outline: Kevin adds products to cart and validates cart
      When Kevin enters the login information
        | strUsername   | strPassword   |
        | <strUsername> | <strPassword> |
      Then Kevin successful Login
      When Select the products to add
      Then validate the shopping cart
        | strFinalText   |
        | <strFinalText> |
      When Go to shopping cart page
      Then Validate product list
      Examples:
        | strUsername  | strPassword | strFinalText   |
        | Pragma3456771 | pragmaTest1 | Product added. |