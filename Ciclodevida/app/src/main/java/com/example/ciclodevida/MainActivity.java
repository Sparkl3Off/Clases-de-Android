package com.example.ciclodevida;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  private EditText dato1;
  private TextView salida;
  private TextView salida2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toast.makeText(this, "Este es un Toast", Toast.LENGTH_SHORT).show();
    dato1 = (EditText)findViewById(R.id.editTextNumber);
    salida = (TextView)findViewById(R.id.textView2);
    salida2 = (TextView)findViewById(R.id.textView3);
  }

  public void mostrar(View muestra) {
    String datoSale = dato1.getText().toString();
    salida.setText(datoSale);
    String numero = dato1.getText().toString();
    int valor = Integer.parseInt(numero);
    valor = valor * 5;
    String datoSale2 = String.valueOf(valor);
    salida2.setText(datoSale2);
  }

  protected void onStart() {
    super.onStart();
    Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
  }

  protected void onResume() {
    super.onResume();
    Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
  }

  protected void onPause() {
    super.onPause();
    Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
  }

  protected void onStop(){
    super.onStop();
    Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
  }

  protected void onRestart(){
    super.onRestart();
    Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
  }

  protected void onDestroy(){
    super.onDestroy();
    Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
  }
}