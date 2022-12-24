/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dessertclicker

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dessertclicker.ui.theme.DessertClickerTheme

// tag for logging
private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Called")

        setContent {
            DessertClickerTheme {
                DessertClickerApp()
            }
        }
    }


    @Composable
    fun DessertClickerApp() {
        Column() {
            Box(
                modifier = Modifier.fillMaxSize(),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bakery_back),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
              Column() {
                  Box(
                      modifier = Modifier
                          .size(200.dp)

                  ) {
                      Image(
                          painter = painterResource(id = R.drawable.cupcake),
                          contentDescription = null
                      )
                  }
              }

            }
            Spacer(modifier = Modifier.height(8.dp))
            DessertInfo()
        }
    }


    @Composable
    fun DessertInfo() {
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxSize(),

            ) {
            Column(

            ) {
                Text(
                    "Desserts Sold",
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Total Revenue")
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(

            ) {
                Text(
                    "0",
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "$0")
            }

        }
    }

}





