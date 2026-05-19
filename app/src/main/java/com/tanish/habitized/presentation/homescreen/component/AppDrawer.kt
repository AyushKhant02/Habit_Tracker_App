package com.tanish.habitized.presentation.homescreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanish.habitized.R
import com.tanish.habitized.ui.theme.instrumentSerif
import com.tanish.habitized.ui.theme.regular
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun AppDrawer(
    modifier: Modifier = Modifier,
    secondSectionItems : List<DrawerItem>,
    state : DrawerState,
    onFollowClick : () -> Unit = {},
    onGithubClick : () -> Unit = {},
    content : @Composable () -> Unit
){
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = state,
        gesturesEnabled = state.currentValue == DrawerValue.Open,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = MaterialTheme.colorScheme.surfaceContainerLowest
            ) {
                Box(modifier = Modifier.fillMaxSize()){
                    //main content
                    Column(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(horizontal = 16.dp, vertical = 24.dp),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Top
                    ) {
                        //heading
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(modifier = Modifier.size(40.dp)) {
                                Image(
                                    painter = painterResource(R.drawable.app_logo),
                                    contentDescription = "logo",
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentScale = ContentScale.Fit
                                )
                            }
                            Text(
                                text = "habitized",
                                style = TextStyle(
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    fontFamily = instrumentSerif,
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Italic,
                                    fontSize = 24.sp
                                )
                            )
                        }
                        Text(
                            text = "Made for students and professionals \uD83C\uDFAF",
                            style = TextStyle(
                                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
                                fontFamily = regular,
                                fontWeight = FontWeight.Light,
                                fontSize = 14.sp
                            )
                        )
                        Spacer(Modifier.height(16.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(MaterialTheme.colorScheme.surfaceBright)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ){
                                secondSectionItems.forEach {
                                    NavigationDrawerItem(
                                        label = {
                                            Text(
                                                text =it.text,
                                                style = TextStyle(
                                                    color = MaterialTheme.colorScheme.onPrimary,
                                                    fontFamily = regular,
                                                    fontWeight = FontWeight.Normal,
                                                    fontSize = 16.sp
                                                )
                                            )
                                        },
                                        icon = {
                                            Icon(
                                                painter = painterResource(it.icon),
                                                contentDescription = it.text,
                                                tint = MaterialTheme.colorScheme.onPrimary
                                            )
                                        },
                                        selected = false,
                                        onClick = {
                                            scope.launch{
                                                state.close()
                                                delay(300)
                                                it.onclick()
                                            }
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    ) {
        content()
    }
}
