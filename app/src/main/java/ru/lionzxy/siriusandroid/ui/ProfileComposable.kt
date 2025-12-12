package ru.lionzxy.siriusandroid.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.lionzxy.siriusandroid.R
import ru.lionzxy.siriusandroid.ui.theme.*

@Composable
fun EditProfileScreen(
    name: String = "Diana Chen",
    email: String = "dianachen@gmail.com",
    phone: String = "+1 800 000 000 000",
    jobTitle: String = "Chartered Accountant",
    experience: String = "5 Years",
    city: String = "Salt Lake City",
    state: String = "UT",
    onSubmit: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundGray)
    ) {
        // Top section with logo and title
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundGray)
                .padding(start = 24.dp, end = 24.dp, top = 48.dp, bottom = 16.dp)
        ) {
            // Logo
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "QuickHire Logo",
                modifier = Modifier
                    .width(150.dp)
                    .height(40.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Title
            Text(
                text = stringResource(id = R.string.edit_profile),
                style = MaterialTheme.typography.headlineMedium,
                color = TextPrimary
            )
        }

        // Scrollable content
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(bottom = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // Profile photo
            Box(
                modifier = Modifier.size(180.dp),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_photo),
                    contentDescription = "Profile Photo",
                    modifier = Modifier
                        .size(180.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                // Edit button
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(WhiteColor)
                        .offset(x = (-8).dp, y = (-8).dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_pencil),
                        contentDescription = "Edit Photo",
                        modifier = Modifier.size(20.dp),
                        tint = TextSecondary
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Input fields
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                InputFieldWithIcon(
                    value = name,
                    onValueChange = {},
                    icon = R.drawable.ic_user
                )

                InputFieldWithIcon(
                    value = email,
                    onValueChange = {},
                    icon = R.drawable.ic_envelope
                )

                InputFieldWithIcon(
                    value = phone,
                    onValueChange = {},
                    icon = R.drawable.ic_phone
                )

                InputFieldWithIcon(
                    value = jobTitle,
                    onValueChange = {},
                    icon = R.drawable.ic_briefcase
                )

                InputFieldWithIcon(
                    value = experience,
                    onValueChange = {},
                    icon = R.drawable.ic_briefcase
                )

                InputFieldWithIcon(
                    value = city,
                    onValueChange = {},
                    icon = R.drawable.ic_map
                )

                InputFieldWithIcon(
                    value = state,
                    onValueChange = {},
                    icon = R.drawable.ic_map
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Submit button
            Button(
                onClick = onSubmit,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = QuickHireOrange
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.submit),
                    style = MaterialTheme.typography.labelLarge,
                    color = WhiteColor
                )
            }
        }

        // Bottom navigation
        BottomNavigationBar()
    }
}

@Composable
fun InputFieldWithIcon(
    value: String,
    onValueChange: (String) -> Unit,
    icon: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(8.dp),
        color = WhiteColor
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = TextPrimary
                )
                Text(
                    text = value,
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextPrimary
                )
            }
        }
    }
}

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp),
        color = DarkBackground
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavItem(
                icon = R.drawable.ic_request,
                label = stringResource(id = R.string.request),
                onClick = {}
            )

            BottomNavItem(
                icon = R.drawable.ic_feedback,
                label = stringResource(id = R.string.feedback),
                onClick = {}
            )

            BottomNavItem(
                icon = R.drawable.ic_profile,
                label = stringResource(id = R.string.profile),
                onClick = {}
            )

            BottomNavItem(
                icon = R.drawable.ic_logout,
                label = stringResource(id = R.string.logout),
                onClick = {}
            )
        }
    }
}

@Composable
fun BottomNavItem(
    icon: Int,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = label,
            modifier = Modifier.size(24.dp),
            tint = WhiteColor
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall,
            color = WhiteColor,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true, widthDp = 440, heightDp = 956, showSystemUi = true)
@Composable
fun EditProfileScreenPreview() {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = QuickHireBlue,
            secondary = QuickHireOrange,
            background = BackgroundGray,
            surface = WhiteColor
        ),
        typography = Typography
    ) {
        EditProfileScreen()
    }
}