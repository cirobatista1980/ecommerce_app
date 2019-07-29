package br.com.meadme.ecommerce;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;
    private Button btnCriar;
    private EditText edUsuario;
    private EditText edSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void carregarControles() {
        btnEntrar = findViewById(R.id.btn_entrar);
        btnCriar = findViewById(R.id.btn_criar);
        edUsuario = findViewById(R.id.edUsuario);
        edSenha = findViewById(R.id.edSenha);
    }

    private void carregaEventos() {
        btnEntrar.setOnClickListener(view -> autenticarUsuario());
        btnCriar.setOnClickListener(view -> criarUsuario());
    }

    private void criarUsuario() {
    }

    private void autenticarUsuario() {
    }
}
