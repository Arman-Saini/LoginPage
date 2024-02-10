package com.example.loginpage.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginpage.R
import com.example.loginpage.components.ButtonComponent
import com.example.loginpage.components.CheckboxComponent
import com.example.loginpage.components.DividerTextComponent
import com.example.loginpage.components.HeadingTextComponent
import com.example.loginpage.components.MyTextFieldComponent
import com.example.loginpage.components.NormalTextComponent
import com.example.loginpage.components.PasswordMyTextFieldComponent
import com.example.loginpage.navigation.PostOfficeAppRouter
import com.example.loginpage.navigation.Screen

@Composable
fun SignUpScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column (modifier = Modifier.fillMaxSize()){

            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name),
                painterResource(R.drawable.ic_action_name)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(R.drawable.ic_action_name)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(R.drawable.emaillogo)
            )
                PasswordMyTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(R.drawable.lock)
            )

            CheckboxComponent(value = stringResource(id = R.string.tAndC),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()
        }

    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}