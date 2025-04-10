package com.example.practica_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_3.ui.theme.Practica_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica_3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cuadro_de_bloques()
                }
            }
        }
    }
}

@Composable
fun cuadro_de_bloques() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            infoBloque(
                titulo = stringResource(R.string.first_title),
                descripcion = stringResource(R.string.first_description),
                colorFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            infoBloque(
                titulo = stringResource(R.string.second_title),
                descripcion = stringResource(R.string.second_description),
                colorFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            infoBloque(
                titulo = stringResource(R.string.third_title),
                descripcion = stringResource(R.string.third_description),
                colorFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            infoBloque(
                titulo = stringResource(R.string.fourth_title),
                descripcion = stringResource(R.string.fourth_description),
                colorFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun infoBloque(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Practica_3Preview() {
    Practica_3Theme {
        cuadro_de_bloques()
    }
}