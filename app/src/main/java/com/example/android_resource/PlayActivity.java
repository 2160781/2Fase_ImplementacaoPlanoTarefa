package com.example.android_resource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PlayActivity extends AppCompatActivity {

    public static class Main {
        public static DadosApp dadosApp_;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Main.dadosApp_ = new DadosApp();

        Tarefas[] listaPassos = new Tarefas[4];
        listaPassos[0] = new Tarefas("1. Passo --> Preparação de ingredientes",
                false);
        listaPassos[1] = new Tarefas("2. Passo --> Mistura de ingredientes",
                false);

        listaPassos[2] = new Tarefas("3. Passo --> Coloque o bolo no forno",
                false);
        listaPassos[3] = new Tarefas("4. Passo --> Finalizar o bolo",
                false);

        Main.dadosApp_.adicionarPlano("Receita de bolo",listaPassos);
        Tarefas[] listaPassos1 = new Tarefas[4];
        listaPassos1[0] = new Tarefas("1. Passo --> Compra de terreno",
                false);

        listaPassos1[1] = new Tarefas("2. Passo --> Preparação de terreno",
                false);

        listaPassos1[2] = new Tarefas("3. Passo --> Plantar trigo",
                false);

        listaPassos1[3] = new Tarefas("4. Passo --> Obter colheita",
                false);

        Main.dadosApp_.adicionarPlano("Preparação de terreno de trigo",listaPassos1);

        Intent main = new Intent(this,MainActivity.class);
        startActivity(main);

    }
}