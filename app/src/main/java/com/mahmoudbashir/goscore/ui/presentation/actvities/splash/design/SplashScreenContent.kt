package com.mahmoudbashir.goscore.ui.presentation.actvities.splash.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension


@Preview
@Composable
fun SplashScreenContent() {

    val constraint = ConstraintSet() {
        val conA = createRefFor("logo_loading")
        constrain(conA) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.wrapContent
            height = Dimension.wrapContent
        }

    }

    ConstraintLayout(
        constraint,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = com.mahmoudbashir.common.R.color.mainColor))
    ) {
        Column(modifier = Modifier
            .layoutId("logo_loading")
            .fillMaxWidth()
            .wrapContentHeight()
            .background(colorResource(id =com.mahmoudbashir.common.R.color.mainColor)),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp),
                painter = painterResource(id = com.mahmoudbashir.goscore.R.drawable.ic_launcher_background),
                contentDescription = null)
            Spacer(modifier = Modifier.height(20.dp))
            LinearProgressIndicator(
                modifier = Modifier.width(150.dp),
                color = colorResource(id = com.mahmoudbashir.common.R.color.mainColor),
                backgroundColor = colorResource(id = com.mahmoudbashir.common.R.color.mainColor)
            )
        }
    }
}