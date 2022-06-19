package com.example.registerformtest

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test


class RegisterUITest{
    @Rule
    @JvmField
    var composeTestRule: ComposeContentTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun leaving_Nothing(){
        composeTestRule.onNodeWithText("Sign Up").performClick()
       composeTestRule.onNodeWithText("Please enter your name!").assertTextEquals("Please enter your name!")
    }

    @Test
    fun write_One(){
        composeTestRule.onNodeWithText("Name").performTextInput("Nameless")
        composeTestRule.onNodeWithText("Sign Up").performClick()
        composeTestRule.onNodeWithText("Please enter the email address!").assertTextEquals("Please enter the email address!")
    }

    @Test
    fun write_Two(){
        composeTestRule.onNodeWithText("Name").performTextInput("Nameless")
        composeTestRule.onNodeWithText("Email Address").performTextInput("nameless@example.com")
        composeTestRule.onNodeWithText("Sign Up").performClick()
        composeTestRule.onNodeWithText("Please enter the phone number!").assertTextEquals("Please enter the phone number!")
    }

    @Test
    fun write_Three(){
        composeTestRule.onNodeWithText("Name").performTextInput("Nameless")
        composeTestRule.onNodeWithText("Email Address").performTextInput("nameless@example.com")
        composeTestRule.onNodeWithText("Phone Number").performTextInput("8677777777")
        composeTestRule.onNodeWithText("Sign Up").performClick()
        composeTestRule.onNodeWithText("Please enter password!").assertTextEquals("Please enter password!")
    }

    @Test
    fun write_Four(){
        composeTestRule.onNodeWithText("Name").performTextInput("Nameless")
        composeTestRule.onNodeWithText("Email Address").performTextInput("nameless@example.com")
        composeTestRule.onNodeWithText("Phone Number").performTextInput("8677777777")
        composeTestRule.onNodeWithText("Password").performTextInput("123456")
        composeTestRule.onNodeWithText("Sign Up").performClick()
        composeTestRule.onNodeWithText("Please enter confirm password!").assertTextEquals("Please enter confirm password!")
    }

    @Test
    fun write_Five(){
        composeTestRule.onNodeWithText("Name").performTextInput("Nameless")
        composeTestRule.onNodeWithText("Email Address").performTextInput("nameless@example.com")
        composeTestRule.onNodeWithText("Phone Number").performTextInput("8677777777")
        composeTestRule.onNodeWithText("Password").performTextInput("123456")
        composeTestRule.onNodeWithText("Confirm Password").performTextInput("123456")
        composeTestRule.onNodeWithText("Sign Up").performClick()
        composeTestRule.onNodeWithText("Successfully Registered!").assertTextEquals("Successfully Registered!")
    }


}