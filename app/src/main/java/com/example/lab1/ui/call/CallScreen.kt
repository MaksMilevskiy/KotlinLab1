package com.example.lab1.ui.call

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.R
import com.example.lab1.model.User
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun CallScreen(user: User, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = user.avatar),
        contentDescription = "User Avatar",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(id = R.drawable.chevron_left),
            contentDescription = "Icon back",
            tint = Color.White,
            modifier = Modifier
                .padding(20.dp, 20.dp, 0.dp, 0.dp)
                .size(40.dp)
                .clip(RoundedCornerShape(15.dp))
                .border(1.dp, Color.White, RoundedCornerShape(15.dp))

        )
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(0.dp, 0.dp, 0.dp, 50.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.calling),
                color = Color.White
            )
            Text(
                text = user.name,
                color = Color.White,
                fontSize = 25.sp,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(0.dp, 15.dp, 0.dp, 25.dp)
            )
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.width(250.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.mic_off),
                    contentDescription = "Icon back",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)
                        .padding(10.dp)

                )
                Icon(
                    painter = painterResource(id = R.drawable.call_end),
                    contentDescription = "Icon back",
                    tint = Color.White,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.Red)
                        .padding(10.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.speaker_off),
                    contentDescription = "Icon back",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)
                        .padding(10.dp)

                )
            }
        }
    }
}

@Preview
@Composable
fun CallScreenPreview() {
    Lab1Theme {
        Surface {
            CallScreen(user = User.example2)
        }
    }
}