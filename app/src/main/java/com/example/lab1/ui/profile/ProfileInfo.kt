package com.example.lab1.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.lab1.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.model.User
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun ProfileInfo(
    user: User,
    modifier: Modifier = Modifier
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = user.avatar),
            contentDescription = "User avatar",
            modifier = Modifier
                .padding(0.dp, 100.dp, 0.dp, 60.dp)
                .size(150.dp)
                .clip(CircleShape))
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = user.name,
                fontSize = 30.sp,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier
                    .padding(30.dp, 0.dp, 10.dp, 0.dp)
            )
            Icon(painter = painterResource(
                id = R.drawable.icon_plus),
                contentDescription = "Icon add",
                modifier = Modifier.size(30.dp)
            )
        }
        Row {
            Text(text = user.city, fontSize = 16.sp)
            Text(text = ", ", fontSize = 16.sp)
            Text(text = user.country, fontSize = 16.sp)
        }
        Text(
            text = user.userDescription,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(0.dp, 60.dp, 0.dp, 60.dp)
                .width(300.dp)
        )
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.width(250.dp)
        ) {
            IconAndText(icon = R.drawable.icon1, number = user.numberOfPosts, text = stringResource(R.string.posts))
            IconAndText(icon = R.drawable.icon2, number = user.numberOfFolowers, text = stringResource(R.string.followers))
            IconAndText(icon = R.drawable.icon3, number = user.numberOfFolowed, text = stringResource(R.string.following))
        }
    }
}

@Preview
@Composable
fun ProfileInfoPreview() {
    Lab1Theme {
        Surface {
            ProfileInfo(user = User.example)
        }
    }
}